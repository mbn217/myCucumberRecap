package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {
	private static WebDriver driver;
	
	
	 public static WebDriver get(String driverType) {
	        if (driver == null) {
	            String browser = driverType;
	            System.out.println("browser = " + browser);
	            switch (browser) {
	                case "chrome":
	                    WebDriverManager.chromedriver().setup();	            
	                    driver = new ChromeDriver();
	                    break;
	                case "chromeHeadless":
	                    WebDriverManager.chromedriver().setup();
	                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
	                    break;

	                case "firefox":
	                    WebDriverManager.firefoxdriver().setup();
	                    driver = new FirefoxDriver();
	                    break;
	                case "firefoxHeadless":
	                    WebDriverManager.firefoxdriver().setup();
	                    driver = new FirefoxDriver(new FirefoxOptions().setHeadless(true));
	                    break;
	            }
	        }

	        return driver;
	    }

	    public static void closeDriver() {
	        if (driver != null) {
	            driver.quit();
	            driver = null;
	        }
	    }
}
