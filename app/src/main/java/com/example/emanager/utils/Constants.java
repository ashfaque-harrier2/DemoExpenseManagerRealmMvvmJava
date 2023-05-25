package com.example.emanager.utils;

import com.example.emanager.R;
import com.example.emanager.models.Category;

import java.util.ArrayList;
import java.util.List;

public class Constants {
	public static final String INCOME = "INCOME";
	public static final String EXPENSE = "EXPENSE";

	public static List<Category> categoryList;

	public static final int DAILY = 0;
	public static final int MONTHLY = 1;

	public static int selectedTab = 0;

	public static void setCategories() {
		categoryList = new ArrayList<>();
		categoryList.add(new Category("Salary", R.drawable.ic_salary, R.color.category1));
		categoryList.add(new Category("Business", R.drawable.ic_business, R.color.category2));
		categoryList.add(new Category("Investment", R.drawable.ic_investment, R.color.category3));
		categoryList.add(new Category("Loan", R.drawable.ic_loan, R.color.category4));
		categoryList.add(new Category("Rent", R.drawable.ic_rent, R.color.category5));
		categoryList.add(new Category("Other", R.drawable.ic_other, R.color.category6));
	}

	public static Category getCategoryDetails(String categoryName) {
		for (Category cat :
				categoryList) {
			if (cat.getCategoryName().equals(categoryName)) {
				return cat;
			}
		}
		return null;
	}

	public static int getAccountsColor(String accountName) {
		switch (accountName) {
			case "Bank":
				return R.color.bank_color;
			case "Cash":
				return R.color.cash_color;
			case "Card":
				return R.color.card_color;
			default:
				return R.color.default_color;
		}
	}

}
