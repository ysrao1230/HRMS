package com.onpassive.Ostaff.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.onpassive.Ostaff.BasePages.Basepage;

public class HomePage extends Basepage {

	WebDriver driver;

	@FindBy(xpath = "//i[@class='fa fa-angle-down']")
	WebElement logoutmenu;

	@FindBy(xpath = "//a[normalize-space()='Log Out']")
	WebElement logout;

	@FindBy(xpath = "//*[@id='sideMenuBar']/app-side-nav/div/div/mat-nav-list[1]/a/div/img")
	WebElement dashboard;

	@FindBy(xpath = "//*[@id=\"sideMenuBar\"]/app-side-nav/div/div/mat-nav-list[2]/a/div/div[3]/p")
	WebElement hroperation;

	@FindBy(xpath = "//p[normalize-space()='Timing Schedule']")
	WebElement TimeSchedule;

	@FindBy(xpath = "//i[@class='fa fa-plus action_ico']")
	WebElement addingTimeschedule;

	@FindBy(css = "#location > div:nth-child(1) > p")
	WebElement Location;

	@FindBy(xpath = "//p[normalize-space()='Company']")
	WebElement Company;

	@FindBy(xpath = "//p[normalize-space()='Department']")
	WebElement Department;

	@FindBy(xpath = "//a[@id='designation']//div[@class='side-navicon']")
	WebElement Designation;

	@FindBy(xpath = "//p[normalize-space()='Leave Plan']")
	WebElement LeavePlan;

	@FindBy(xpath = "//p[normalize-space()='Notification']")
	WebElement Notification;

	@FindBy(xpath = "//p[normalize-space()='Project']")
	WebElement Project;

	@FindBy(xpath = "//p[normalize-space()='Holiday List']")
	WebElement Holidayslist;

	@FindBy(xpath = "//p[normalize-space()='Jobs']")
	WebElement jobs;

	@FindBy(xpath = "//a[@id='skills']//div[@class='mat-list-item-content']")
	WebElement skils;

	@FindBy(xpath = "//p[normalize-space()='Policy']")
	WebElement policy;

	@FindBy(xpath = "//p[normalize-space()='Assets']")
	WebElement Assets;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void logoutoption() throws InterruptedException {
		logoutmenu.click();
		Thread.sleep(3000);
		logout.click();
	}

	public void dashboardclick() {
		dashboard.click();
	}

	public void Hroperationmove() {
		Actions action = new Actions(driver);
		action.moveToElement(hroperation).perform();
	}

	public void Hroperationaction() {
		Actions action = new Actions(driver);
		action.moveToElement(hroperation).click().perform();
	}

	public void TimeSchedule() {
		Actions action = new Actions(driver);
		action.moveToElement(TimeSchedule).click().perform();
	}

	public void addingtimeScheduling() {
		addingTimeschedule.click();
		addingTimeschedule.click();
	}

	public void selectLocation() {
		Actions action = new Actions(driver);
		action.moveToElement(Location).click().perform();
	}

	public void SelectCompany() throws Exception {
		Actions action = new Actions(driver);
		action.moveToElement(Company).click().perform();
	}

}
