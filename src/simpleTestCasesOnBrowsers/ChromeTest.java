package simpleTestCasesOnBrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/gursimransingh/Downloads/chromedriver");
		
		driver = new ChromeDriver();
		
		String baseURL = "http://www.google.com";
		
		driver.get(baseURL);

		
	}

}
