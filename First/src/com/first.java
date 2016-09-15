package com;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class first {
	public WebDriver driver;
  @Test
  public void main() {
	  
		// Find the element that's ID attribute is 'account'(My Account)
	 
	      //driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[3]/div[1]/input")).sendKeys("Continuous Delivery");
  }
	 
	  @BeforeMethod
	 
	  public void beforeMethod() {
	 
		  // Create a new instance of the Firefox driver
		  System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver_win32//chromedriver.exe");
	        WebDriver driver = new ChromeDriver();      
	        ChromeOptions options =new ChromeOptions();
	        options.addArguments("no-sandbox");
	        //driver.get("http://www.google.com");
	      //driver = new FirefoxDriver();
	 
	      //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
	 
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	      //Launch the Online Store Website
	 
	      driver.get("https://www.amazon.co.uk");
	 
	  }
	 
	  //@AfterMethod
	 
	  //public void afterMethod() {
	 
		  // Close the driver
	 
	      //driver.quit();
	 
	  //}
}
