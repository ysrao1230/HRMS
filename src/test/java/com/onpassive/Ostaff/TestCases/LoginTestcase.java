package com.onpassive.Ostaff.TestCases;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.onpassive.Ostaff.BasePages.Basepage;
import com.onpassive.Ostaff.Pages.LoginPage;

import Log4j.Log4jdemo;

public class LoginTestcase extends Basepage {

	LoginPage login;
	static Logger logger = LogManager.getLogger(Log4jdemo.class);

	@Test(priority = 0, groups = { "smoke" })
	public void logintoApplication() throws Exception {
		logger.info("page loading info");
		login = new LoginPage(driver);
		logger.info("Trying to login to the application without any errors");
		String uname = fl.getCellData(LOGIN_EXCEL, "Sheet1", 2, 0);
		login.uname(uname);
		String pwd = fl.getCellData(LOGIN_EXCEL, "Sheet1", 2, 1);
		login.pasword(pwd);
		Thread.sleep(2000);
		login.showpsd();
		System.out.println("THe execution starts for the: " + cl.getCurrentDateTime());
		login.login();
		String str = cl.getPageTitle();
		System.out.println("Current Page title is: " + str);
		// assertEquals("OnPassive HRMS", str);
		assertEquals("OStaff", str);
		logger.info("Logged in to allpication successfully");
		Assert.assertFalse(false, "Assert false test message");
		fl.writeDataToExcel(LOGIN_EXCEL, "Sheet1", 2, 3, "Fail");
		Assert.assertTrue(true, hm.dashBoard());
		fl.writeDataToExcel(LOGIN_EXCEL, "Sheet1", 2, 3, "Pass");
		System.out.println("Writting Done");

	}

	@Test(groups = { "smoke" }, priority = 15, enabled = true, dependsOnMethods = "logintoApplication")
	public void logout() throws InterruptedException {
		hm.logoutoption();
		logger.info("Logged out of the application successfully");
	}

	@Test(priority = 1, enabled = true, dependsOnMethods = "logintoApplication")
	public void dashboardOperations() throws InterruptedException {
		hm.dashboardclick();
		Thread.sleep(2000);
		logger.info("Clicking dashboard option");
	}

	@Test(priority = 2, enabled = true, dependsOnMethods = "logintoApplication")
	public void HroperationsTimeschedule() throws Exception {
		hm.Hroperationaction();
		logger.info("Performing the HR operations");
		hm.TimeSchedule();
		logger.info("Performing the Time scheduling");
		hm.addingtimeScheduling();
		logger.info("Adding the time scheduling");
		Thread.sleep(2000);
		ts.companyDropdownSelection();
		logger.info("Company drop down selection");
		ts.companydropdownlistselection();
		logger.info("Company info Selected");
		ts.branchSelection();
		logger.info("branch drop down selection");
		ts.branchlistselection();
		logger.info("Branch selected from  list");
	}

	@Test(priority = 3, enabled = true, dependsOnMethods = "logintoApplication")
	public void hrOperationLocation() throws Exception {
		hm.Hroperationmove();
		hm.selectLocation();
		logger.info("Performing the HR operations for location");

	}

	@Test(priority = 4, enabled = true, dependsOnMethods = "logintoApplication")
	public void hrOperationCompany() throws Exception {
		hm.Hroperationmove();
		hm.SelectCompany();
		logger.info("Performing the HR operations for company");

	}

	@Test(priority = 14, enabled = true, dependsOnMethods = "logintoApplication")
	public void hrOperationAsset() throws Exception {
		hm.Hroperationmove();
		hm.SelectAssets();
		logger.info("Performing the HR operations for assets");

	}

	@Test(priority = 5, enabled = true, dependsOnMethods = "logintoApplication")
	public void hrOperationDepartment() throws Exception {
		hm.Hroperationmove();
		hm.SelectDepartment();
		logger.info("Performing the HR operations for Department");

	}

	@Test(priority = 6, enabled = true, dependsOnMethods = "logintoApplication")
	public void hrOperationDesignation() throws Exception {
		hm.Hroperationmove();
		hm.SelectDesignation();
		logger.info("Performing the HR operations for designation");

	}

	@Test(priority = 8, enabled = true, dependsOnMethods = "logintoApplication")
	public void hrOperationnotification() throws Exception {
		hm.Hroperationmove();
		hm.SelectNotfication();
		logger.info("Performing the HR operations for notification");

	}

	@Test(priority = 9, enabled = true, dependsOnMethods = "logintoApplication")
	public void hrOperationProject() throws Exception {
		hm.Hroperationmove();
		hm.SelectProject();
		logger.info("Performing the HR operations for project");

	}

	@Test(priority = 10, enabled = true, dependsOnMethods = "logintoApplication")
	public void hrOperationHolidaysList() throws Exception {
		hm.Hroperationmove();
		hm.SelectHolidays();
		logger.info("Performing the HR operations for holidays");

	}

	@Test(priority = 11, enabled = true, dependsOnMethods = "logintoApplication")
	public void hrOperationjobs() throws Exception {
		hm.Hroperationmove();
		hm.SelectJobs();
		logger.info("Performing the HR operations for jobs");

	}

	@Test(priority = 13, enabled = true, dependsOnMethods = "logintoApplication")
	public void hrOperationpolicy() throws Exception {
		hm.Hroperationmove();
		hm.SelectPolicy();
		logger.info("Performing the HR operations for policy");

	}

	@Test(priority = 7, enabled = true, dependsOnMethods = "logintoApplication")
	public void hrOperationLeavePlan() throws Exception {
		hm.Hroperationmove();
		hm.SelectLeaveplan();
		logger.info("Performing the HR operations for leave plan");

	}

	@Test(priority = 12, enabled = true, dependsOnMethods = "logintoApplication")
	public void hrOperationSkils() throws Exception {
		hm.Hroperationmove();
		hm.SelectSkills();
		logger.info("Performing the HR operations for skills");

	}
}
