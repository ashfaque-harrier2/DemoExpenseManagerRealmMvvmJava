package com.example.emanager.views.activites;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.emanager.R;
import com.example.emanager.adapters.TransactionsAdapter;
import com.example.emanager.databinding.ActivityMainBinding;
import com.example.emanager.utils.Constants;
import com.example.emanager.utils.Helper;
import com.example.emanager.viewmodels.MainViewModel;
import com.example.emanager.views.fragments.AddTransactionFragment;
import com.google.android.material.tabs.TabLayout;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

	ActivityMainBinding binding;

	Calendar calendar;

	public MainViewModel viewModel;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		binding = ActivityMainBinding.inflate(getLayoutInflater());
		setContentView(binding.getRoot());

		viewModel = new ViewModelProvider(this).get(MainViewModel.class);


		setSupportActionBar(binding.toolBar);
		getSupportActionBar().setTitle("Transactions");


		Constants.setCategories();

		calendar = Calendar.getInstance();
		updateDate();

		binding.nextDateBtn.setOnClickListener(c -> {
			if (Constants.selectedTab == Constants.DAILY) {
				calendar.add(Calendar.DATE, 1);
			} else if (Constants.selectedTab == Constants.MONTHLY) {
				calendar.add(Calendar.MONTH, 1);
			}
			updateDate();
		});

		binding.previousDateBtn.setOnClickListener(c -> {
			if (Constants.selectedTab == Constants.DAILY) {
				calendar.add(Calendar.DATE, -1);
			} else if (Constants.selectedTab == Constants.MONTHLY) {
				calendar.add(Calendar.MONTH, -1);
			}
			updateDate();
		});


		binding.floatingActionButton.setOnClickListener(c -> new AddTransactionFragment().show(getSupportFragmentManager(), null));


		binding.tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
			@Override
			public void onTabSelected(TabLayout.Tab tab) {
				if (tab.getText().equals("Monthly")) {
					Constants.selectedTab = 1;
					updateDate();
				} else if (tab.getText().equals("Daily")) {
					Constants.selectedTab = 0;
					updateDate();
				}
			}

			@Override
			public void onTabUnselected(TabLayout.Tab tab) {
				//Tab

			}

			@Override
			public void onTabReselected(TabLayout.Tab tab) {
			}
		});


		binding.transactionsList.setLayoutManager(new LinearLayoutManager(this));

		viewModel.transactions.observe(this, transactions -> {
			TransactionsAdapter transactionsAdapter = new TransactionsAdapter(MainActivity.this, transactions);
			binding.transactionsList.setAdapter(transactionsAdapter);
			if (!transactions.isEmpty()) {
				binding.emptyState.setVisibility(View.GONE);
			} else {
				binding.emptyState.setVisibility(View.VISIBLE);
			}
		});

		viewModel.totalIncome.observe(this, aDouble -> binding.incomeLbl.setText(String.valueOf(aDouble)));

		viewModel.totalExpense.observe(this, aDouble -> binding.expenseLbl.setText(String.valueOf(aDouble)));

		viewModel.totalAmount.observe(this, aDouble -> binding.totalLbl.setText(String.valueOf(aDouble)));
		viewModel.getTransactions(calendar);


	}

	public void getTransactions() {
		viewModel.getTransactions(calendar);
	}


	void updateDate() {
		if (Constants.selectedTab == Constants.DAILY) {
			binding.currentDate.setText(Helper.formatDate(calendar.getTime()));
		} else if (Constants.selectedTab == Constants.MONTHLY) {
			binding.currentDate.setText(Helper.formatDateByMonth(calendar.getTime()));
		}
		viewModel.getTransactions(calendar);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.top_menu, menu);
		return super.onCreateOptionsMenu(menu);
	}
}