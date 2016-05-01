package com.valentine;

import org.openqa.selenium.WebElement;

public class MainPage {
	Elements elemObj;
	
	public MainPage(Elements elemObj) {
		this.elemObj = elemObj;
	}
	
	public WebElement addToCart() {
		WebElement addToCartButton = elemObj.findElementCss("a.add-to-cart.et-shop-item");
		return addToCartButton;
	}
	
	public void clickAddToCartButton(WebElement addToCartButton) {
		addToCartButton.click();
	}
	
	
}
