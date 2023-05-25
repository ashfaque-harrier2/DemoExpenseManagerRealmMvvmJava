package com.example.emanager.models;

public class Category {
	private final String categoryName;
	private final int categoryImage;
	private final int categoryColor;
	public Category(String categoryName, int categoryImage, int categoryColor) {
		this.categoryName = categoryName;
		this.categoryImage = categoryImage;
		this.categoryColor = categoryColor;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public int getCategoryImage() {
		return categoryImage;
	}
	public int getCategoryColor() {
		return categoryColor;
	}

}
