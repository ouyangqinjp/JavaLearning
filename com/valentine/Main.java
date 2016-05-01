package com.valentine;

import org.openqa.selenium.WebElement;

public class Main {

	public static void main(String[] args) {	
		
		Elements elemObj = new Elements();
		AllPages allPagesObj = new AllPages(elemObj);
		
		allPagesObj.goToUrl("http://awful-valentine.com/");
		
		WebElement addToCartButton = allPagesObj.mainPageObj.addToCart();
		allPagesObj.mainPageObj.clickAddToCartButton(addToCartButton);
		
		
		String price = allPagesObj.addToCartPageObj.getPrice();
		System.out.println(price);
		
	}

}
