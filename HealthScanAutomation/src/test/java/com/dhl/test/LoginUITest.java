package com.dhl.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;



public class LoginUITest {

	WebDriver driver;
	
	@BeforeMethod
	public void start(){
		
		driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
        driver.get("http://demo.openemr.io/b/openemr/");
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	@Test
	public void verifyTitleTest(){
		
		
        String actualTitle=driver.getTitle();
        
       Assert.assertEquals(actualTitle, "OpenEMR Login");
		
	}
	
//	@Test
//	public void applicationDescriptionTest() {
//		WebDriver driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//	
//        driver.get("http://demo.openemr.io/b/openemr/");
//        String actualDesc=driver.findElement(By.xpath("//p[contains(text(),'most')]")).getText();
//        Assert.assertEquals(actualDesc, "The most popular open-source Electronic Health Record and Medical Practice Management solution.");
//	}
}
