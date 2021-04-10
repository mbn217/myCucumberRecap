package StepDefinitionAmazon;

import org.openqa.selenium.WebDriver;

import PageObjects.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Driver;

public class SearchForTV {
	
	HomePage myHomePage ;
	
	@Given("^user is on the amazon home page$")
	public void user_is_on_the_amazon_home_page() {	
		myHomePage = new HomePage();

	}

	@When("^user search for a Tv Mount$")
	public void user_search_for_a_Tv_Mount() {
		
		myHomePage.searchBox.sendKeys("Tv Mount");
		myHomePage.searchButton.click();
	}

	@Then("^the result page should be displayed$")
	public void the_result_page_should_be_displayed() {
		
	}
	
	
}
