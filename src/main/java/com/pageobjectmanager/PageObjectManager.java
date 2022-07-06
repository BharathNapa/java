package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.pom.HotelLocation;
import com.pom.HotelSelection;
import com.pom.LoginPage;

public class PageObjectManager {
	
	public WebDriver driver;
	
	private LoginPage lp;
	
	private HotelLocation hp;
	
	public PageObjectManager(WebDriver driver2) {

       this.driver = driver2;
	}

	public LoginPage getInstanceLogin() {
		
		if(lp==null) {
		
		lp = new LoginPage(driver);
		}
		return lp;
	}  
	
	public HotelLocation getInstanceLogin1() {
		
		if(hp==null) {
			
			 hp = new HotelLocation(driver);
		}
		
		return hp;
	}

}


