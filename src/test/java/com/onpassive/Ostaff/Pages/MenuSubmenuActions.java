package com.onpassive.Ostaff.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MenuSubmenuActions {

	static WebDriver driver;
	static WebElement categories, subMenu, course;
	public static String driverPath = "C:/Automation/chromedriver_win32/chromedriver.exe";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://edureka.co");

		categories = driver.findElement(By.xpath("//a[@class='dropdown-toggle hidden-xs hidden-sm ga_browse_top_cat']"));
		Thread.sleep(3000);
		subMenu = driver.findElement(
				By.xpath("//a[@class='dropdown-toggle ga_top_category'][normalize-space()='Cloud Computing']"));
		course = driver.findElement(By.xpath("//a[@class='ga_top_categories_course'][normalize-space()='Cloud Architect Masters Program']"));

		Actions action = new Actions(driver);
		action.moveToElement(categories).perform();
		action.moveToElement(subMenu).perform();
		action.moveToElement(course).click().perform();
		Thread.sleep(3000);

		driver.close();
	}

}
