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

public class webElements {
	
	WebDriver driver;
	String baseUrl;
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/gursimransingh/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseUrl = "http://us.makemytrip.com/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
		System.out.println("hello");
	}

	@Test
	public void test() throws InterruptedException {
		List<WebElement> elements = driver.findElements(By.xpath("//p[@id = 'trip_type']//label"));
		//System.out.println(e);	
		System.out.println(elements.size());
		//elements.get(2).click();
		
		for(int i=0;i<elements.size();i++){
			
			boolean ischecked;
			ischecked = elements.get(i).isSelected();
			
			if(ischecked==false){
			elements.get(i).click();
			Thread.sleep(2000);
			}
		}
	
	}
	
	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	

}
