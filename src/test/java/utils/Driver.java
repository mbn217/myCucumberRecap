package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {
	public static WebDriver driver;
	
	public static WebDriver getDriver() {
		
		if(driver==null) {
			String browserType = ConfigurationReader.get("browser");
			if (browserType.equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				return driver;//rf1265412
				
			}else if  (browserType.equals("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				return driver;
			
			}else if  (browserType.equals("ffheadless")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				return driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
			
			}
		}
		
		return driver;
		
	}
	
	public static void closeDriver() {
		driver.quit();
		driver=null;
	}
	
	
	
	
	
	
	
	
	
	
//	 public static WebDriver get(String driverType) {
//	        if (driver == null) {
//	            String browser = driverType;
//	            System.out.println("browser = " + browser);
//	            switch (browser) {
//	                case "chrome":
//	                    WebDriverManager.chromedriver().setup();	            
//	                    driver = new ChromeDriver();
//	                    break;
//	                case "chromeHeadless":
//	                    WebDriverManager.chromedriver().setup();
//	                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
//	                    break;
//
//	                case "firefox":
//	                    WebDriverManager.firefoxdriver().setup();
//	                    driver = new FirefoxDriver();
//	                    break;
//	                case "firefoxHeadless":
//	                    WebDriverManager.firefoxdriver().setup();
//	                    driver = new FirefoxDriver(new FirefoxOptions().setHeadless(true));
//	                    break;
//	            }
//	        }
//
//	        return driver;
//	    }
//
//	    public static void closeDriver() {
//	        if (driver != null) {
//	            driver.quit();
//	            driver = null;
//	        }
//	    }
}
