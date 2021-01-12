package com.onpassive.Ostaff.BasePages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.onpassive.Ostaff.Utility.FileLibrary;

public class B extends Basepage {

	public static void main(String[] args) throws Exception {
		
		List<WebElement> allelement = driver.findElements(By.xpath("//*[@class='mat-option mat-focus-indicator ng-tns-c392-626 ng-star-inserted']"));
		for(WebElement ele:allelement) {
			if(ele.getText().equalsIgnoreCase("onp")) {
				ele.click();
			}
		}
	}

}
