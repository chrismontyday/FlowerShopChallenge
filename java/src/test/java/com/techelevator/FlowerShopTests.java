package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FlowerShopTests {
	
	Module1CodingAssessment program = new Module1CodingAssessment();
	String type = "Bouquet Type";
	
	@Test
	public void zipCode10001ReturnsZero() {
		
		Double answer = program.deliveryTotal(true, "10001");
		Double correctAnswer = 0.0;
		assertEquals(correctAnswer, answer);
		
	}
	
	@Test
	public void zipCode10001StillReturnsZero() {
		
		Double answer = program.deliveryTotal(false, "10001");
		Double correctAnswer = 0.0;
		assertEquals(correctAnswer, answer);
		
	}
	
	@Test
	public void zipCode20001ReturnsFour() {
		
		Double answer = program.deliveryTotal(false, "20001");
		Double correctAnswer = 3.99;
		assertEquals(correctAnswer, answer);
		
	}
	
	@Test
	public void zipCode20001ReturnsSix() {
		
		Double answer = program.deliveryTotal(true, "20001");
		Double correctAnswer = 5.99;
		assertEquals(correctAnswer, answer);
		
	}
	
	@Test
	public void zipCode30001ReturnsFive() {
		
		Double answer = program.deliveryTotal(false, "30001");
		Double correctAnswer = 4.99;
		assertEquals(correctAnswer, answer);
		
	}
	
	@Test
	public void zipCode30001ReturnsSix() {
		
		Double answer = program.deliveryTotal(true, "30001");
		Double correctAnswer = 5.99;
		assertEquals(correctAnswer, answer);
		
	}

	@Test
	public void badZipCodeReturnsTwenty() {
		
		Double answer = program.deliveryTotal(true, "73422");
		Double correctAnswer = 19.99;
		assertEquals(correctAnswer, answer);
		
	}
	@Test
	public void badZipCodeStillReturnsTwenty() {
		
		Double answer = program.deliveryTotal(false, "43422");
		Double correctAnswer = 19.99;
		assertEquals(correctAnswer, answer);
		
	}
	
	@Test
	public void subtotalZero() {
		FlowerShopOrder order = new FlowerShopOrder(type, 0);
		Double answer = order.getSubtotal();
		Double correctAnswer = 0.0;
		assertEquals(correctAnswer, answer);
		
	}
	@Test
	public void subtotalThree() {
		FlowerShopOrder order = new FlowerShopOrder(type, 1);
		Double answer = order.getSubtotal();
		Double correctAnswer = 2.99;
		assertEquals(correctAnswer, answer);
		
	}
	@Test
	public void subtotalSix() {
		FlowerShopOrder order = new FlowerShopOrder(type, 2);
		Double answer = order.getSubtotal();
		Double correctAnswer = 1399.32;
		assertEquals(correctAnswer, answer);
		
	}
	@Test
	public void subtotalThirteenHundred() {
		FlowerShopOrder order = new FlowerShopOrder(type, 468);
		Double answer = order.getSubtotal();
		Double correctAnswer = 1399.32;
		assertEquals(correctAnswer, answer);
		
	}
	@Test
	public void subtotalFortyEight() {
		FlowerShopOrder order = new FlowerShopOrder(type, 48);
		Double answer = order.getSubtotal();
		Double correctAnswer = 143.52;
		assertEquals(correctAnswer, answer);
		
	}

}
