package com.dhl.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.dhl.base.WebDriverKeywords;

public class LoginPage extends WebDriverKeywords{
	
	private By usernameLocator=By.name("username");
	private By passwordLocator=By.name("password");
	private By loginLocator=By.xpath("//button[text()=' Login ']");
	private By errorLocator=By.xpath("//div[@role='alert']");
	
	
	

	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void enterUsername(String userName) {
		//driver.findElement(usernameLocator).sendKeys(userName);
		super.typeOnElement(usernameLocator, userName);
	}

	public void enterPassword(String password) {
		//driver.findElement(passwordLocator).sendKeys(password);
		super.typeOnElement(passwordLocator, password);
	}

	public void clickOnLogin() {
		//driver.findElement(loginLocator).click();
		super.clickOnElement(loginLocator);
	}

	public String getInvalidError() {
		//return driver.findElement(errorLocator).getText();
		return super.getTextfromElement(errorLocator);
	}

	public String getUsernamePlaceholder() {
		//return driver.findElement(usernameLocator).getAttribute("placeholder");
		return super.getAttributefromElement(usernameLocator,"placeholder");
	}

	public String getpasswordPlaceholder() {
		//return driver.findElement(passwordLocator).getAttribute("placeholder");
		return super.getAttributefromElement(passwordLocator,"placeholder");
	}
}
