package com.onpassive.Ostaff.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Department {

	WebDriver driver;
	
	public Department(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
