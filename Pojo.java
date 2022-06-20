package com.generic;

import org.openqa.selenium.WebDriver;

public class Pojo {

private WebDriver driver;
	
	private String baseURL;
	private int implicitWait = 0;
	private Utilities objUtilities;
	private SeleniumWrapperFunction objSeleniumWrapperFunction;
	
	public Utilities getObjUtilities() {
		return objUtilities;
	}
	public void setObjUtilities(Utilities objUtilities) {
		this.objUtilities = objUtilities;
	}
	public SeleniumWrapperFunction getObjSeleniumWrapperFunction() {
		return objSeleniumWrapperFunction;
	}
	public void setObjSeleniumWrapperFunction(SeleniumWrapperFunction objSeleniumWrapperFunction) {
		this.objSeleniumWrapperFunction = objSeleniumWrapperFunction;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	public String getBaseURL() {
		return baseURL;
	}
	public void setBaseURL(String baseURL) {
		this.baseURL = baseURL;
	}
	public int getImplicitWait() {
		return implicitWait;
	}
	public void setImplicitWait(int implicitWait) {
		this.implicitWait = implicitWait;
	}
}
