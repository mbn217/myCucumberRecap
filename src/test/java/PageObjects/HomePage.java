package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "twotabsearchtextbox")
	public WebElement searchBox;
	
	@FindBy (id = "nav-search-submit-text")
	public WebElement searchButton;
	
	
	
	//------------ Methods --------------------------
	
	
	public void enterSearchValue (String valueToSearchFor) {
		searchBox.sendKeys(valueToSearchFor);
	}
	
	public void clickSearchButton() {
		searchButton.click();
	}
	
	
	

}
