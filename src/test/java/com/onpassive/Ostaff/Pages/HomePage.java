package com.onpassive.Ostaff.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.onpassive.Ostaff.BasePages.Basepage;
import com.onpassive.Ostaff.Utility.CommonLibrary;

public class HomePage extends Basepage {

	WebDriver driver;

	// common library object creation
	CommonLibrary cli = new CommonLibrary();

	// Webelement of logout menu
	@FindBy(xpath = "//i[@class='fa fa-angle-down']")
	WebElement logoutmenu;

	// Webelement of logout
	@FindBy(xpath = "//a[normalize-space()='Log Out']")
	WebElement logout;

	// Webelement of dashboard
	@FindBy(xpath = "//*[@id='sideMenuBar']/app-side-nav/div/div/mat-nav-list[1]/a/div/img")
	WebElement dashboard;

	// Webelement of HR operation
	@FindBy(xpath = "//*[@id=\"sideMenuBar\"]/app-side-nav/div/div/mat-nav-list[2]/a/div/div[3]/p")
	WebElement hroperation;

	// Webelement of time schedule
	@FindBy(xpath = "//p[normalize-space()='Timing Schedule']")
	WebElement TimeSchedule;

	// Webelement of adding time schedule
	@FindBy(xpath = "//i[@class='fa fa-plus action_ico']")
	WebElement addingTimeschedule;

	// Webelement of Location
	@FindBy(css = "#location > div:nth-child(1) > p")
	WebElement Location;

	// Webelement of Company
	@FindBy(xpath = "//p[normalize-space()='Company']")
	WebElement Company;

	// Webelement of Department
	@FindBy(xpath = "//p[normalize-space()='Department']")
	WebElement Department;

	// Webelement of designation
	@FindBy(xpath = "//a[@id='designation']//div[@class='side-navicon']")
	WebElement Designation;

	// Webelement of leave plan
	@FindBy(xpath = "//p[normalize-space()='Leave Plan']")
	WebElement LeavePlan;

	// Webelement of notification
	@FindBy(xpath = "//p[normalize-space()='Notification']")
	WebElement Notification;

	// Webelement of project
	@FindBy(xpath = "//p[normalize-space()='Project']")
	WebElement Project;

	// Webelement of holidays
	@FindBy(xpath = "//p[normalize-space()='Holiday List']")
	WebElement Holidayslist;

	// Webelement of jobs
	@FindBy(xpath = "//p[normalize-space()='Jobs']")
	WebElement jobs;

	// Webelement of skills
	@FindBy(xpath = "//a[@id='skills']//div[@class='mat-list-item-content']")
	WebElement skills;

	// Webelement of policy
	@FindBy(xpath = "//p[normalize-space()='Policy']")
	WebElement policy;

	// Webelement of assets
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
		cli.clickAction(hroperation);
	}

	public void TimeSchedule()  {
		cli.clickAction(TimeSchedule);
	}

	public void addingtimeScheduling() {
		addingTimeschedule.click();
		// addingTimeschedule.click();
	}

	public void selectLocation() {
		cli.clickAction(Location);
	}

	public void SelectCompany() {
		cli.clickAction(Company);
	}

	public void SelectDepartment()  {
		cli.clickAction(Department);
	}

	public void SelectDesignation() {
		cli.clickAction(Designation);
	}

	public void SelectLeaveplan() {
		cli.clickAction(LeavePlan);
	}

	public void SelectNotfication()  {
		cli.clickAction(Notification);
	}

	public void SelectProject()  {
		cli.clickAction(Project);
	}

	public void SelectHolidays()  {
		cli.clickAction(Holidayslist);
	}

	public void SelectJobs(){
		cli.clickAction(jobs);
	}

	public void SelectSkills()  {
		cli.clickAction(skills);
	}

	public void SelectPolicy()  {
		cli.clickAction(policy);
	}

	public void SelectAssets() {
		cli.clickAction(Assets);
	}

}
