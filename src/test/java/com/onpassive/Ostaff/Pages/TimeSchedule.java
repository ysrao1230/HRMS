package com.onpassive.Ostaff.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.onpassive.Ostaff.BasePages.Basepage;

public class TimeSchedule extends Basepage {

	WebDriver driver;

	// Compnay Drop down
	@FindBy(xpath = "/html/body/app-root/app-user-layout/div/div[2]/div/div[1]/app-attendance-li"
			+ "st/div/div/div/form/div[1]/div[2]/div/mat-form-field/div/div[1]/div/mat-select/div/div[2]/div")
	WebElement companyDropDown;

	public void companyDropdownSelection() {
		companyDropDown.click();
	}

	// Compnay Dropdown
	//@FindBy(xpath = "//span[normalize-space()='XEROX']")
	@FindBy(xpath = "//span[normalize-space()='ONPASSIVE']")
	WebElement CompanyDropdownSelection;

	public void companydropdownlistselection() {
		CompanyDropdownSelection.click();
	}

	@FindBy(xpath = "/html/body/app-root/app-user-layout/div/div[2]/div/div[1]/"
			+ "app-attendance-list/div/div/div/form/div[1]/div[3]/div/mat-form-field/div/div[1]/div/mat-select/div/div[2]/div")

	WebElement branchselection;

	public void branchSelection() {
		branchselection.click();
	}
	
	//@FindBy(xpath = "//span[normalize-space()='Bangalure']")
	@FindBy(xpath = "//span[normalize-space()='Koti']")
	WebElement branchlistselection;
	
	public void branchlistselection() {
		branchlistselection.click();
	}

	public TimeSchedule(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
