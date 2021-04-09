package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemInfoPage {
	
	WebDriver driver;
	
	
	public ItemInfoPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "buy-now-button")
	public WebElement buyNowButton;
	

	//------------ Methods --------------------------
	
	

	public void clickOnBuyNowButton() {
		buyNowButton.click();
	}

}
