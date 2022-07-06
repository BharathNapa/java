package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import MavenProject.Maven.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\featurefile\\data.feature" , glue = "com.stepdefinition" , 

plugin = { "json:target/cucumber-report/cucumber.json","html:target/cucumber-report/cucumber.html",
		
       "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})


public class TestRunner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {

	driver = BaseClass.webBrowser("chrome");
}
	
	//"html:target/cucumber-report/cucumber.html",
	



}
