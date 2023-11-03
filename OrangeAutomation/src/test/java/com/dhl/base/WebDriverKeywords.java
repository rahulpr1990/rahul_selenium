package com.dhl.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebDriverKeywords {
	
	private WebDriver driver;
	
	public WebDriverKeywords(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickOnElement(By locator) {
		
		driver.findElement(locator).click();
		
	}
	
	public void typeOnElement(By locator,String text) {
		driver.findElement(locator).sendKeys(text);
	}

	
	public String getTextfromElement(By locator) {
		return driver.findElement(locator).getText();
	}
	
	//get attribute value
	public String getAttributefromElement(By locator,String placeholder) {
		return  driver.findElement(locator).getAttribute(placeholder);
		
	}
}
