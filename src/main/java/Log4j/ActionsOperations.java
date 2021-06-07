package Log4j;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsOperations {

	public static void main(String[] args) {

		// Intializing URL
		String baseUrl = "http://demo.guru99.com/test/newtours/";

		// Browser Properties
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");

		// Browser Intiation
		WebDriver driver = new FirefoxDriver();

		// URL calling
		driver.get(baseUrl);

		WebElement link_Home = driver.findElement(By.linkText("Home"));

		WebElement td_Home = driver.findElement(By.xpath("//html/body/div" + "/table/tbody/tr/td" + "/table/tbody/tr/td"
				+ "/table/tbody/tr/td" + "/table/tbody/tr"));

		// Action class calling
		Actions builder = new Actions(driver);
		// Mouse over home
		Action mouseOverHome = builder.moveToElement(link_Home).build();

		// Before action color
		String bgColor = td_Home.getCssValue("background-color");
		System.out.println("Before hover: " + bgColor);
		mouseOverHome.perform();

		// After mouse over color
		bgColor = td_Home.getCssValue("background-color");
		System.out.println("After hover: " + bgColor);
		
		System.out.println("Current Page title" +driver.getTitle());

		// closing the bowser
		driver.close();
	}
}
