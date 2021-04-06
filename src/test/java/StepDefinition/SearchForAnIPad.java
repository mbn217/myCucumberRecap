package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchForAnIPad {
	WebDriver driver;
	@Given("user is on the amazon home page2")
	public void user_is_on_the_amazon_home_page2() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
	}

	@When("user search for an IPad")
	public void user_search_for_an_i_pad() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("IPad");
		driver.findElement(By.id("nav-search-submit-text")).click();
	}

	@Then("the result page should be displayed2")
	public void the_result_page_should_be_displayed2() {
		driver.getCurrentUrl();

		
	}
	@And("user should be able to see the total count")
	public void user_should_be_able_to_see_the_total_count() {
		String total = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
		System.out.println(total);
	}
	
}
