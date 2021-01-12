package com.onpassive.Ostaff.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.onpassive.Ostaff.Utility.CommonLibrary;

public class Company {

	private WebDriver driver;
	CommonLibrary comnlib = new CommonLibrary();

	// Webelement of Company
	@FindBy(xpath = "//p[normalize-space()='Company']")
	WebElement Company;

	public void SelectCompany() throws Exception {
		comnlib.sidebarscrolling(Company);
		comnlib.clickAction(Company);
	}

	public Company(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
