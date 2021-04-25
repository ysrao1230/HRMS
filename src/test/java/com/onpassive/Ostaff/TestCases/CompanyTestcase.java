package com.onpassive.Ostaff.TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.onpassive.Ostaff.BasePages.Basepage;

import Log4j.Log4jdemo;

public class CompanyTestcase extends Basepage {

	
	static Logger logger = LogManager.getLogger(Log4jdemo.class);

	@Test()
	public void hrOperationCompany() throws Exception {
		System.out.println("Moving to company operations");
		//comp.Hroperationaction();
		comp.SelectCompany();
		System.out.println(comp.getText());
		logger.info("Performing the HR operations for company");
		comp.addingNewCompany();
		comp.SetCompanyName("Onpassive");
		Thread.sleep(30000);

	}

}
