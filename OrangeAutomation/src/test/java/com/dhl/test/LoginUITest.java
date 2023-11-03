package com.dhl.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.dhl.base.AutomationWrapper;
import com.dhl.pages.LoginPage;

public class LoginUITest extends AutomationWrapper {

	@Test
	public void verifyTitleTest() {

		String actualTitle = driver.getTitle();
test.info("Actual titel"+actualTitle);
		Assert.assertEquals(actualTitle, "OrangeHRM");

	}

	@Test
	public void placeholderTest() {

		LoginPage loginpage = new LoginPage(driver);
		Assert.assertEquals(loginpage.getUsernamePlaceholder(), "Username");
		Assert.assertEquals(loginpage.getpasswordPlaceholder(), "Password");
	}

}
