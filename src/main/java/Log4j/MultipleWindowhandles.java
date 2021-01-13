package Log4j;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowhandles {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		{

			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://toolsqa.com/automation-practice-switch-windows/");
			String parentWindowHandle = driver.getWindowHandle();
			System.out.println("Parent window's handle -> " + parentWindowHandle);
			WebElement clickElement = driver.findElement(By.xpath("//button[normalize-space()='New Window']"));

			for (int i = 0; i < 3; i++) {
				clickElement.click();
				Thread.sleep(3000);
			}

			Set<String> allWindowHandles = driver.getWindowHandles();

			for (String handle : allWindowHandles) {
				System.out.println("Switching to window - > " + handle);
				System.out.println("Navigating to google.com");
				driver.switchTo().window(handle); // Switch to the desired window first and then execute commands using
													// driver
				driver.get("https://google.com");
				driver.close();
			}

		}

	}
}
