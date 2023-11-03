package com.dhl.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2Login {


	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.xpath("//input[@aria-label='Email address or phone number'])")).sendKeys("abc@gmail.com");
		
		
		
		driver.findElement(By.id("pass")).sendKeys("12133");
		
		driver.findElement(By.name("login")).click();

	}

}
