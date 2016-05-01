package com.valentine;

import org.openqa.selenium.WebElement;

public class AddToCartPage {

	private Elements elemObj;
	public AddToCartPage(Elements elemObj) {
		this.elemObj = elemObj;
	}
	
	public String getPrice() {
		return elemObj.findElementCss("span.Cart66Price").getText();
	}
	
}
