package StepDefinitionAmazon;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.HomePage;
import PageObjects.ItemInfoPage;
import PageObjects.ResultPage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCart {
	WebDriver driver;
	HomePage myHomePage;
	ResultPage resultPage;
	ItemInfoPage itemInfoPage;
	
	@Given("^user is on the result page$")
	public void user_is_on_the_result_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();//Ref1245
		myHomePage = new HomePage(driver);
		resultPage = new ResultPage(driver);
		itemInfoPage = new ItemInfoPage(driver);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
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
