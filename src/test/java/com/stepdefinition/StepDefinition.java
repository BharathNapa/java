package com.stepdefinition;

import java.io.IOException;

import com.pageobjectmanager.PageObjectManager;

import MavenProject.Maven.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import properties.FileReaderManager;



public class StepDefinition extends BaseClass {
	
	public static PageObjectManager pom = new PageObjectManager(driver); 

	
	@Before
	
	public void beforeHooks(Scenario s) {
		
		String name = s.getName();
		
		System.out.println("Scenario name : " +name);
	}

	@After
	
	public void afterHooks(Scenario s) throws IOException {
		
	      Status status = s.getStatus();
		
		System.out.println("scenario status :" + status);
		
		if(s.isFailed()) {
			
			screenshotMethod("C:\\Users\\lenovo\\Cucumberframeworks\\MavenProject\\ss\\pic1.png");
		}
	}
	
	
	@Given("^user must launch URL$")
	public void user_must_launch_URL() throws Throwable {
		String url = FileReaderManager.getInstanceFRM().getInstanceCR().getUrl();

		getUrl(url);
	}

	@When("^User enter the \"([^\"]*)\" in the username field$")
	public void user_enter_the_in_the_username_field(String username) throws Throwable {
	        
			passValue(pom.getInstanceLogin().getUsername(), username);
	}

	@When("^user enter the \"([^\"]*)\" in the password field$")
	public void user_enter_the_in_the_password_field(String password) throws Throwable {
		passValue(pom.getInstanceLogin().getPassword(), password);

	}

	@Then("^user click the login button an it navigates to the search hotel page$")
	public void user_click_the_login_button_an_it_navigates_to_the_search_hotel_page() throws Throwable {
		clickOnElement(pom.getInstanceLogin().getBtn());
	}

	@When("^user select the locaion \"([^\"]*)\" in location$")
	public void user_select_the_locaion_in_location(String location) throws Throwable {
		value(pom.getInstanceLogin1().getLocation(), location);
	}

 

}
