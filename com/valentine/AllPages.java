package com.valentine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllPages {
	Elements elemObj;
	MainPage mainPageObj;
	AddToCartPage addToCartPageObj;
	
	public AllPages(Elements elemObj) {
		this.elemObj = elemObj;
		
		mainPageObj = new MainPage(this.elemObj);	
		addToCartPageObj = new AddToCartPage(this.elemObj);
	}
	
	public void goToUrl(String url) {
		elemObj.getUrl(url);
	}
	
	
	
	
	
	
}
