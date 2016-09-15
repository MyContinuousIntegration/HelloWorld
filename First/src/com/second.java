package com;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.*;
import org.testng.annotations.*;

public class second {
	WebDriver driver;
	String baseurl,nodeurl;
	
	@BeforeTest
	
	public void setup() throws MalformedURLException{
		baseurl = "https://www.amazon.com";
		nodeurl = "http://10.163.39.110:5555/wd/hub";
	DesiredCapabilities capability = new DesiredCapabilities();
	capability.setBrowserName("firefox");
	capability.setPlatform(Platform.VISTA);
	driver = new RemoteWebDriver(new URL(nodeurl),capability);
			
	}
	
	@AfterTest
	public void aftertest(){
		driver.quit();
	}
	
	@Test
	private void Test() {
		driver.get(baseurl);
		String title = driver.getTitle();
		System.out.println(title);

	}

	}
