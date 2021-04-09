package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage {
	WebDriver driver;
	
	
	public ResultPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//div[@data-asin='B07MR4GRQP']//img")
	public WebElement firstItem;
	

	//------------ Methods --------------------------
	
	

	public void clickFirstResultItem() {
		firstItem.click();
	}
	
	
}
