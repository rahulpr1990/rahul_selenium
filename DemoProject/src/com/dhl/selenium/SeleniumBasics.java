package com.dhl.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics {

	public static void main(String[] args) {
		
		String browser="ch";
	
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);

	}

}
