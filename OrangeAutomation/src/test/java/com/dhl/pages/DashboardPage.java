package com.dhl.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	private WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getDashboardHeader() {
		return driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();

	}

}
