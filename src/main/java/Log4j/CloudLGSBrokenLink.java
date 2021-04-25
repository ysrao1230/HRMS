package Log4j;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloudLGSBrokenLink {

	public static void main(String args[]) throws MalformedURLException, IOException {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://cloudlgs.com");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("Number of links on webpage: " + links.size());

		List<WebElement> img = driver.findElements(By.tagName("img"));

		System.out.println("Image count is: " + img.size());

		List<WebElement> btn = driver.findElements(By.tagName("Button"));

		System.out.println("Btn count is: " + btn.size());

		List<WebElement> input = driver.findElements(By.tagName("input"));
		System.out.println("input count is: " + input.size());

		HttpURLConnection conn = null;

		for (WebElement elm : links) {
			String url = elm.getAttribute("href");

			System.out.println();
			if (url != null && !url.contains("javascript")) {
				conn = (HttpURLConnection) new URL(url).openConnection();
				conn.setConnectTimeout(3000);
				if (conn.getResponseCode() >= 400) {
					String strs = url + " - "+conn.getResponseCode()+" " + conn.getResponseMessage() + " Link is not working";
					System.out.println(strs);
					// listNotWorkingUrls.add(strs);
					// sm.outPut(linkUrl + " - " + httpURLConnect.getResponseMessage() + "Link is
					// not working");
				}

				// Fetching and Printing the response code obtained
				else {
					String str2 = url + " - "+conn.getResponseCode()+" "  + conn.getResponseMessage();
					System.out.println(str2);
					// sm.outPut(linkUrl + " - " + httpURLConnect.getResponseMessage());

					// listWorkingUrls.add(str);

				}

			}
		}
		
		driver.quit();

	}
}
