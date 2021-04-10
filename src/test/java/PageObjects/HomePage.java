package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class HomePage {
	WebDriver driver = Driver.getDriver();
	
	
	public HomePage(){
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
