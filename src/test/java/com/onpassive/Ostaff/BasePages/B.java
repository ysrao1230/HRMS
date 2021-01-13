package com.onpassive.Ostaff.BasePages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.onpassive.Ostaff.Utility.FileLibrary;

public class B {

	public static void main(String[] args) throws Exception {

		/*
		 * List<WebElement> allelement = driver.findElements(By.
		 * xpath("//*[@class='mat-option mat-focus-indicator ng-tns-c392-626 ng-star-inserted']"
		 * )); for(WebElement ele:allelement) {
		 * if(ele.getText().equalsIgnoreCase("onp")) { ele.click(); } }
		 */

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://ostaffuiuat.onpassive.com/");

		driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("sathish");
		driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys("admin@123");
		driver.findElement(By.xpath("//*[text()='visibility_off']")).click();
		driver.findElement(By.xpath("//*[text()='Login Here']")).click();

		Thread.sleep(3000);

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("Number of links on webpage: " + links.size());

		for (WebElement elm : links) {
			System.out.println(elm.getAttribute("href"));
		}

		Thread.sleep(5000);
		driver.quit();
	}

}
