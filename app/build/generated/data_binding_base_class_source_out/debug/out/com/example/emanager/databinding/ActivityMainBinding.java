// Generated by view binder compiler. Do not edit!
package com.example.emanager.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.emanager.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final BottomNavigationView bottomNavigationView;

  @NonNull
  public final TextView currentDate;

  @NonNull
  public final ImageView emptyState;

  @NonNull
  public final TextView expenseLbl;

  @NonNull
  public final FloatingActionButton floatingActionButton;

  @NonNull
  public final TextView incomeLbl;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final LinearLayout linearLayout2;

  @NonNull
  public final ImageView nextDateBtn;

  @NonNull
  public final ImageView previousDateBtn;

  @NonNull
  public final TabLayout tabLayout;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView textView8;

  @NonNull
  public final MaterialToolbar toolBar;

  @NonNull
  public final TextView totalLbl;

  @NonNull
  public final RecyclerView transactionsList;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView,
      @NonNull BottomNavigationView bottomNavigationView, @NonNull TextView currentDate,
      @NonNull ImageView emptyState, @NonNull TextView expenseLbl,
      @NonNull FloatingActionButton floatingActionButton, @NonNull TextView incomeLbl,
      @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2,
      @NonNull ImageView nextDateBtn, @NonNull ImageView previousDateBtn,
      @NonNull TabLayout tabLayout, @NonNull TextView textView3, @NonNull TextView textView6,
      @NonNull TextView textView8, @NonNull MaterialToolbar toolBar, @NonNull TextView totalLbl,
      @NonNull RecyclerView transactionsList) {
    this.rootView = rootView;
    this.bottomNavigationView = bottomNavigationView;
    this.currentDate = currentDate;
    this.emptyState = emptyState;
    this.expenseLbl = expenseLbl;
    this.floatingActionButton = floatingActionButton;
    this.incomeLbl = incomeLbl;
    this.linearLayout = linearLayout;
    this.linearLayout2 = linearLayout2;
    this.nextDateBtn = nextDateBtn;
    this.previousDateBtn = previousDateBtn;
    this.tabLayout = tabLayout;
    this.textView3 = textView3;
    this.textView6 = textView6;
    this.textView8 = textView8;
    this.toolBar = toolBar;
    this.totalLbl = totalLbl;
    this.transactionsList = transactionsList;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bottomNavigationView;
      BottomNavigationView bottomNavigationView = ViewBindings.findChildViewById(rootView, id);
      if (bottomNavigationView == null) {
        break missingId;
      }

      id = R.id.currentDate;
      TextView currentDate = ViewBindings.findChildViewById(rootView, id);
      if (currentDate == null) {
        break missingId;
      }

      id = R.id.emptyState;
      ImageView emptyState = ViewBindings.findChildViewById(rootView, id);
      if (emptyState == null) {
        break missingId;
      }

      id = R.id.expenseLbl;
      TextView expenseLbl = ViewBindings.findChildViewById(rootView, id);
      if (expenseLbl == null) {
        break missingId;
      }

      id = R.id.floatingActionButton;
      FloatingActionButton floatingActionButton = ViewBindings.findChildViewById(rootView, id);
      if (floatingActionButton == null) {
        break missingId;
      }

      id = R.id.incomeLbl;
      TextView incomeLbl = ViewBindings.findChildViewById(rootView, id);
      if (incomeLbl == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.linearLayout2;
      LinearLayout linearLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout2 == null) {
        break missingId;
      }

      id = R.id.nextDateBtn;
      ImageView nextDateBtn = ViewBindings.findChildViewById(rootView, id);
      if (nextDateBtn == null) {
        break missingId;
      }

      id = R.id.previousDateBtn;
      ImageView previousDateBtn = ViewBindings.findChildViewById(rootView, id);
      if (previousDateBtn == null) {
        break missingId;
      }

      id = R.id.tabLayout;
      TabLayout tabLayout = ViewBindings.findChildViewById(rootView, id);
      if (tabLayout == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = ViewBindings.findChildViewById(rootView, id);
      if (textView6 == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = ViewBindings.findChildViewById(rootView, id);
      if (textView8 == null) {
        break missingId;
      }

      id = R.id.toolBar;
      MaterialToolbar toolBar = ViewBindings.findChildViewById(rootView, id);
      if (toolBar == null) {
        break missingId;
      }

      id = R.id.totalLbl;
      TextView totalLbl = ViewBindings.findChildViewById(rootView, id);
      if (totalLbl == null) {
        break missingId;
      }

      id = R.id.transactionsList;
      RecyclerView transactionsList = ViewBindings.findChildViewById(rootView, id);
      if (transactionsList == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, bottomNavigationView, currentDate,
          emptyState, expenseLbl, floatingActionButton, incomeLbl, linearLayout, linearLayout2,
          nextDateBtn, previousDateBtn, tabLayout, textView3, textView6, textView8, toolBar,
          totalLbl, transactionsList);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
