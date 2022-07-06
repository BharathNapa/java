package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelSelection {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@id = 'radiobutton_0']")
	
	private WebElement btn3;
	
     @FindBy(xpath = "//input[@id = 'continue']")
	
	private WebElement btn4;

    
    
	
	public HotelSelection(WebDriver driver2) {

     this.driver =  driver2;
     
     PageFactory.initElements(driver, this);
	}

	public WebElement getBtn3() {
		return btn3;
	}

	public WebElement getBtn4() {
		return btn4;
	}

	
	
	

}
