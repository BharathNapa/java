package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelLocation {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//select[@id = 'location']")
	
	private WebElement location;
	
    @FindBy(xpath = "//select[@id = 'hotels']")
	
	private WebElement hotel;


    @FindBy(xpath = "//select[@id = 'room_type']")

     private WebElement room;


     @FindBy(xpath = "(//select[@class = 'search_combobox'])[4]")

     private WebElement nos;


     @FindBy(xpath = "//select[@id = 'adult_room']")

     private WebElement adultRoom;

    @FindBy(xpath = "//select[@id = 'child_room']")

    private WebElement childRoom ;


    @FindBy(xpath = "//input[@id = 'Submit']")

    private WebElement btn2 ;
	
   
	


public HotelLocation(WebDriver driver2) {
	
	this.driver = driver2;
	
	PageFactory.initElements(driver, this);
	}


public WebElement getLocation() {
		return location;
	}


	public WebElement getHotel() {
		return hotel;
	}


	public WebElement getRoom() {
		return room;
	}


	public WebElement getNos() {
		return nos;
	}


	public WebElement getAdultRoom() {
		return adultRoom;
	}


	public WebElement getChildRoom() {
		return childRoom;
	}


	public WebElement getBtn2() {
		return btn2;
	}


   
	

}
