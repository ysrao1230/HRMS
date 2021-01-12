package com.onpassive.Ostaff.TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.onpassive.Ostaff.BasePages.Basepage;
import com.onpassive.Ostaff.Pages.Company;
import com.onpassive.Ostaff.Pages.HomePage;

import Log4j.Log4jdemo;

public class CompanyTestcase extends Basepage {

	Company comp;
	static Logger logger = LogManager.getLogger(Log4jdemo.class);

	@Test(priority = 0, enabled = true)
	public void hrOperationCompany() throws Exception {
		System.out.println("Moving to company operations");
		//hm.Hroperationmove();
		comp = new Company(driver);
		comp.SelectCompany();
		logger.info("Performing the HR operations for company");

	}

}
