package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Module1CodingAssessment {

	public String type;
	public int number;
	

	public static void main(String args[])  {
		
		List<FlowerShopOrder> orders = new ArrayList<>();
		Scanner input;

		try {
			input = new Scanner(new File("data-files/FlowerInput.csv"));
			while (input.hasNextLine()) {
				String line = input.nextLine();
				String[] orderInfo = line.split(",");
				String type = orderInfo[0];
				Integer number = Integer.valueOf(orderInfo[1]);
				FlowerShopOrder order = new FlowerShopOrder(type, number);
				orders.add(order);
				System.out.println("ORDER - " + order.getBouquetType() + " - " + order.getNumberOfRoses() + " roses - $" + order.getSubtotal() + " ");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public Double deliveryTotal(boolean sameDayDelivery, String zipCode) {
		
		Double deliveryFee = 19.99;
		Integer zip = Integer.parseInt(zipCode);
		
		if(zip>=10000&&zip<=19999) {
			deliveryFee = 0.0;
			
		} else if(zip>=20000&&zip<=29999) {
			if(sameDayDelivery==true) {
				deliveryFee = 5.99;
			} else {
				deliveryFee = 3.99;
			}
			
		} else if(zip>=30000&&zip<=39999) {
			if(sameDayDelivery==true) {
				deliveryFee = 5.99;
			} else {
				deliveryFee = 4.99;
			}
		}
		
		return deliveryFee;
		
	}


}
