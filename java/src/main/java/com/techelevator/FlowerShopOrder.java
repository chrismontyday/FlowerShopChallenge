package com.techelevator;

public class FlowerShopOrder {
	private String bouquetType;
	private int numberOfRoses;
    private Double subtotal;
    
	public double getSubtotal() {
		subtotal = this.numberOfRoses*2.99;
		return Math.round(subtotal * 100.0) / 100.0;
	}

	public String getBouquetType() {
		return bouquetType;
	}

	public void setBouquetType(String bouquetType) {
		this.bouquetType = bouquetType;
	}

	public int getNumberOfRoses() {
		return numberOfRoses;
	}

	public void setNumberOfRoses(int numberOfRoses) {
		this.numberOfRoses = numberOfRoses;
	}

	public FlowerShopOrder(String bouquetType, int numberOfRoses) {
		super();
		this.bouquetType = bouquetType;
		this.numberOfRoses = numberOfRoses;
	}
}
