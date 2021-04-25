package Log4j;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SampleCollections {

	WebDriver Driver;

	@Test(priority = 0)
	public void invokeBrowser() {
		/* Setting property of a system variable used by chrome driver */
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver1.exe");

		Driver = new ChromeDriver();

		String url = "http://www.ebay.com";

		// To maximise the browser
		Driver.manage().window().maximize();

		// Driver.manage().deleteAllCookies();

		Driver.get(url);

	}

	@Test(priority = 2)
	public void searchProduct(String product, String category) {

		Driver.findElement(By.id("gh-ac")).sendKeys(product);

		WebElement dropElement = Driver.findElement(By.id("gh-cat"));

		Select dropdown = new Select(dropElement);

		dropdown.selectByVisibleText("Watches");

		Driver.findElement(By.id("gh-btn")).click();

		String result = Driver.findElement(By.className("listingscnt")).getText();

		System.out.println("Result is : " + result);
	}

	@Test(priority = 1)
	public void searchAllProduct() {
		List<WebElement> allProduct = Driver.findElements(By.xpath("//ul[@id='ListViewInner']/li"));

		for (WebElement product : allProduct) {

			System.out.println(product.getText());

			System.out.println("*********************************************************************");
		}
	}
}