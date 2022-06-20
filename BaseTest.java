package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest extends Pojo{

	 private WebDriver driver;
	    private String strBaseURL;
	    private Utilities objUtilities;
	    private SeleniumWrapperFunction objWrapperFunction;
		
		public void initilizeOfWebDriver() {
			
		    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/Driver/chromedriver.exe");
			driver = new ChromeDriver();
			strBaseURL =("http://demo.automationtesting.in/Index.html");
			this.setBaseURL(strBaseURL);		
			driver.get(this.getBaseURL());
			this.setDriver(driver);
			objUtilities = new Utilities();
			this.setObjUtilities(objUtilities);
			objWrapperFunction = new SeleniumWrapperFunction(this);
			this.setObjSeleniumWrapperFunction(objWrapperFunction);     
			driver.manage().window().maximize();		
		}
		
		public void tearDown() {
			driver.quit();
		}
	}

