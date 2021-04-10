package StepDefinitionAmazon;

import PageObjects.HomePage;
import PageObjects.ItemInfoPage;
import PageObjects.ResultPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCart {
	HomePage myHomePage = new HomePage();
	ResultPage resultPage = new ResultPage();
	ItemInfoPage itemInfoPage = new ItemInfoPage();

	
	
	@Given("^user is on the result page$")
	public void user_is_on_the_result_page() {
		myHomePage.enterSearchValue("Tv Mount");
		myHomePage.clickSearchButton();
	}

	@When("^user  click on the first result$")
	public void user_click_on_the_first_result() throws InterruptedException {
		resultPage.clickFirstResultItem();
		Thread.sleep(2000);
		
	}

	@Then("^user can click on the buy now button$")
	public void user_can_click_on_the_buy_now_button() {
		itemInfoPage.clickOnBuyNowButton();
	}




	
	
	
	
	
	
}
