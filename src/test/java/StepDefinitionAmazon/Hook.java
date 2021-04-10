package StepDefinitionAmazon;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.Driver;

public class Hook {
	
	WebDriver driver;
	
	
	@Before
	public void setup() {
		System.out.println("Im running in the before from hook class");
		driver = Driver.getDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
	}
	
	@After
	public void tearDown() {
		System.out.println("Im running in the tearDown from hook class");
		Driver.closeDriver();
		
	}
	
}
