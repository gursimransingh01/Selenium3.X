package JUnit;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectandDropdown {
	
	WebDriver driver;
	String baseUrl;
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/gursimransingh/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseUrl = "https://www.expedia.ca/?rfrr=Redirect.From.www.expedia.com%2F";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
		System.out.println("hello");
	}

	@Test
	public void test() throws InterruptedException {
		
		Select sel = new Select (driver.findElement(By.id("hotel-1-adults")));
		sel.selectByValue("6");
		
	}
	
	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	

}
