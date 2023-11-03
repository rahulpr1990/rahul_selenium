package com.dhl.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.dhl.base.AutomationWrapper;
import com.dhl.pages.DashboardPage;
import com.dhl.pages.LoginPage;
import com.dhl.utils.DataUtils;

public class LoginTest extends AutomationWrapper {

	@Test(dataProvider ="commonDataProvider",dataProviderClass = DataUtils.class)
	public void validLoginTest(String username,String password,String expectedError)  {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		loginPage.clickOnLogin();

		DashboardPage dashboardPage = new DashboardPage(driver);

		String actualLoginText = dashboardPage.getDashboardHeader();
		Assert.assertEquals(actualLoginText, expectedError);

	}
	
	

	@Test(dataProvider ="commonDataProvider",dataProviderClass = DataUtils.class)
	public void invalidLoginTest(String username,String password,String expectedError) {

		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		loginPage.clickOnLogin();

		String actualError = loginPage.getInvalidError();
		Assert.assertTrue(actualError.contains(expectedError));
		System.out.println("Invalid Login for "+username);
	}

}
