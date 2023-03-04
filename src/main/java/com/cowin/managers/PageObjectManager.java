package com.cowin.managers;

import org.openqa.selenium.WebDriver;

import com.cowin.pageObjects.HomePage;



public class PageObjectManager {
	private WebDriver driver = null;
	private HomePage obj;

	public PageObjectManager(WebDriver driver) {
		
		this.driver = driver;
		
	}


	public HomePage getHomePage() {

		if (obj == null) {
			obj = new HomePage(driver);
		}
		return obj;
	}

}
