package com.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.generic.Pojo;

public class HomePage {

	private Pojo objPojo;
	
	public HomePage(Pojo pojo) {
		this.objPojo=pojo;
	}
	
	
	By Loc_inpEnterEmailIdForHomePage= By.xpath("//input[@id='email']");
	By Loc_butClickOnImage= By.xpath("//img[@id='enterimg']");

	
	public void setHomePage(String strValue) {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunction().setText(Loc_inpEnterEmailIdForHomePage, strValue));
	//	objPojo.getDriver().findElement(Loc_inpEnterEmailIdForHomePage).sendKeys("XYZ@gmail.com");
		
	}
	public void click() {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunction().click(Loc_butClickOnImage));
	//	objPojo.getDriver().findElement(Loc_butClickOnImage).click();;

	}    
	
}


/*	public void enterURL(WebDriver driver, String testData) {
driver.get(testData);
}

public void type(WebDriver driver,  String ObjectName, String LocatorType, String testData) {
driver.findElement(this.getObject(ObjectName,LocatorType).sendKeys(testData));
}   */
