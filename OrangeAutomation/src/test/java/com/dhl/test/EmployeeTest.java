package com.dhl.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.dhl.base.AutomationWrapper;
import com.dhl.pages.AddEmployeePage;
import com.dhl.pages.LoginPage;
import com.dhl.pages.MainPage;
import com.dhl.pages.PIMPage;
import com.dhl.utils.DataUtils;

public class EmployeeTest extends AutomationWrapper {
	
	private By pimLocator=By.xpath("//a[@href='/web/index.php/pim/viewPimModule']");
	private By addEmployeeLocator=By.xpath("//a[text()='Add Employee']");
	private By firstNameLocator=By.name("firstName");
	private By lastNameLocator=By.name("lastName");
	String firstname="Rahul";
	String lastName="pr";
			
	@Test(dataProvider ="commonDataProvider",dataProviderClass = DataUtils.class)
	public void addValidEmployee(String username,String password) {
	LoginPage loginPage = new LoginPage(driver);

	loginPage.enterUsername(username);
	loginPage.enterPassword(password);
	loginPage.clickOnLogin();
	
	MainPage mainPage=new MainPage(driver);
	mainPage.clickOnElement(pimLocator);
	
	PIMPage pimPage=new PIMPage(driver);
	pimPage.clickOnElement(addEmployeeLocator);
	
	AddEmployeePage addEmployee=new AddEmployeePage(driver);
	
	addEmployee.typeOnElement(firstNameLocator,firstname);
	addEmployee.typeOnElement(lastNameLocator,lastName);
	
	}

}
