package com.onpassive.Ostaff.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.onpassive.Ostaff.BasePages.Basepage;
import com.onpassive.Ostaff.Utility.CommonLibrary;

public class Company extends Basepage {

	
	CommonLibrary comnlib = new CommonLibrary();

	// Webelement of Company
	@FindBy(xpath = "//p[normalize-space()='Company']")
	WebElement Company;
	
	//Add company
	@FindBy(xpath = "//i[@class='fa fa-plus action_ico']")
	WebElement addCompany;
	
	//Compnay Name
	@FindBy(xpath="//input[@id='mat-input-15']")
	WebElement CompanyName;
	
	//CompanyContact
	@FindBy(xpath="//input[@id='mat-input-16']")
	WebElement CompanyContact;
	
	//Company Emial
	@FindBy(xpath="//input[@id='mat-input-16']")
	WebElement CompanyEmail;
	
	@FindBy(xpath="//input[@id='mat-input-18']")
	WebElement CompanyWebsite;

	public void SelectCompany() throws Exception {
		comnlib.sidebarscrolling(Company);
		comnlib.clickAction(Company);
	}

	public Company(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
