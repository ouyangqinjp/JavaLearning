package com.valentine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Elements {

	public WebDriver driver;
	
	public Elements() {
		driver = new FirefoxDriver();
	}
	
	public void getUrl(String url) {
		driver.get(url);
	}
	
	public WebElement findElementCss(String css) {
		WebElement element = driver.findElement(By.cssSelector(css));
		return element;
	}
	
	
	
	
}
