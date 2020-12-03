package com.onpassive.Ostaff.TestCases;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.onpassive.Ostaff.BasePages.Basepage;
import com.onpassive.Ostaff.Pages.LoginPage;

import Log4j.Log4jdemo;

public class LoginTestcase extends Basepage {

	LoginPage login;
	static Logger logger = LogManager.getLogger(Log4jdemo.class);

	@Test(priority = 0)
	public void logintoApplication() throws Exception {
		logger.info("page loading info");
		login = new LoginPage(driver);
		logger.info("Trying to login to the application without any errors");
		String uname = fl.getCellData(LOGIN_EXCEL, "Sheet1", 0, 0);
		login.uname(uname);
		String pwd = fl.getCellData(LOGIN_EXCEL, "Sheet1", 0, 1);
		login.pasword(pwd);
		Thread.sleep(1000);
		login.showpsd();
		login.login();
		String str = cl.getPageTitle();
		System.out.println("Current Page title is: " + str);
		assertEquals("OnPassive HRMS", str);
		logger.info("Logged in to allpication successfully");

	}

	@Test(priority = 6, enabled = true, dependsOnMethods = "logintoApplication")
	public void logout() throws InterruptedException {
		hm.logoutoption();
		logger.info("Logged out of the application successfully");
	}

	@Test(priority = 1, enabled = true, dependsOnMethods = "logintoApplication")
	public void dashboardOperations() throws InterruptedException {
		hm.dashboardclick();
		Thread.sleep(1000);
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
	}

	@Test(priority = 3, dependsOnMethods = "logintoApplication")
	public void hrOperationLocation() throws Exception {
		hm.Hroperationmove();
		hm.selectLocation();
		logger.info("Performing the HR operations for location");
		Thread.sleep(1000);
	}

	@Test(priority = 4, dependsOnMethods = "logintoApplication")
	public void hrOperationCompany() throws Exception {
		hm.Hroperationmove();
		hm.SelectCompany();
		logger.info("Performing the HR operations for company");
		Thread.sleep(1000);
	}

	@Test(priority = 5, dependsOnMethods = "logintoApplication")
	public void hrOperationAsset() throws Exception {
		hm.Hroperationmove();
		hm.SelectAssets();
		logger.info("Performing the HR operations for assets");
		Thread.sleep(4000);
	}
}
