package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelBooking {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@id = 'first_name']")
	
	private WebElement firstName;
	
@FindBy(xpath = "//input[@id = 'last_name']")
	
	private WebElement lastName ;
	

@FindBy(xpath = "//textarea[@id = 'address']" )

private WebElement address;

@FindBy(xpath = "//input[@id = 'cc_num']")

private WebElement card ;

@FindBy(xpath = "//Select[@id = 'cc_type']")

private WebElement ctype;


@FindBy(xpath = "//Select[@id = 'cc_exp_month']")

private WebElement month ;

@FindBy(xpath = "//Select[@id = 'cc_exp_year']")

private WebElement year;


@FindBy(xpath = "//input[@id= 'cc_cvv']")

private WebElement cvv;


@FindBy(xpath = "//input[@id= 'book_now']")

private WebElement btn6;

	
	



public HotelBooking(WebDriver driver2) {

	this.driver = driver2;
	
	  PageFactory.initElements(driver, this);
}


public WebElement getFirstName() {
		return firstName;
	}


	public WebElement getLastName() {
		return lastName;
	}


	public WebElement getAddress() {
		return address;
	}


	public WebElement getCard() {
		return card;
	}


	public WebElement getCtype() {
		return ctype;
	}


	public WebElement getMonth() {
		return month;
	}


	public WebElement getYear() {
		return year;
	}


	public WebElement getCvv() {
		return cvv;
	}


	public WebElement getBtn6() {
		return btn6;
	}



}
