package com.dhl.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demo1Steps {

	
	@Given("I have browser with OrangeHRM application")
	public void i_have_browser_with_orange_hrm_application() 
	{
	    System.out.println("Launch browser");
	}
	@When("I enter username as {string}")
	public void i_enter_username_as(String username) 
	{
		System.out.println(username);
	
	}
	@When("I enter password as {string}")
	public void i_enter_password_as(String password) {
		System.out.println(password);
		}
	@When("I click on login")
	public void i_click_on_login() {
	System.out.println("Login success");
	}
	@Then("I should get access to dashboard with header {string}")
	public void i_should_get_access_to_dashboard_with_header(String exppage) 
	{
	System.out.println(exppage);
	}
}
