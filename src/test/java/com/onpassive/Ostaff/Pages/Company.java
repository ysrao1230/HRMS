package com.onpassive.Ostaff.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Company {

	WebDriver driver;
	
	public Company(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
}
