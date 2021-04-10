package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class ResultPage {
	WebDriver driver = Driver.getDriver();
	
	
	public ResultPage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//div[@data-asin='B07MR4GRQP']//img")
	public WebElement firstItem;
	

	//------------ Methods --------------------------
	
	

	public void clickFirstResultItem() {
		firstItem.click();
	}
	
	
}
