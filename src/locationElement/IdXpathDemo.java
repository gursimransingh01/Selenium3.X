package locationElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdXpathDemo {

	public static void main(String[] args) {
		// XPath .//*[@id='tsf']/div[2]/div[3]/center/input[1]
		// Id gs_htif0
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "/Users/gursimransingh/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		String baseURL = "http://www.google.com";
		
		driver.get(baseURL);
		
		driver.findElement(By.id("gs_htif0")).sendKeys("facebook");
		driver.findElement(By.xpath(".//*[@id='_fZl']")).click();
		
		
		

	}

}
