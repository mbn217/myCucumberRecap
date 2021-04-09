package StepDefinitionAmazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchForTV {
	WebDriver driver;
	HomePage myHomePage;
	
	@Given("^user is on the amazon home page$")
	public void user_is_on_the_amazon_home_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();//REF6666
		myHomePage = new HomePage(driver);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
	}

	@When("^user search for a Tv Mount$")
	public void user_search_for_a_Tv_Mount() {
		
		myHomePage.enterSearchValue("Tv Mount");
		myHomePage.clickSearchButton();
	}

	@Then("^the result page should be displayed$")
	public void the_result_page_should_be_displayed() {
		System.out.println(driver.getCurrentUrl());
	}
	
	
}
