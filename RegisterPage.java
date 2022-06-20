package com.pageFactory;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.generic.BaseTest;
import com.generic.Pojo;

public class RegisterPage extends BaseTest{

    private Pojo objPojo;
	
	public RegisterPage(Pojo pojo) {
		this.objPojo = pojo;
	}

	By Loc_inpFirstName = By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required']");
	   By Loc_inpLastNme = By.xpath("//input[@ng-model='LastName']");
	   By Loc_inpAddress = By.xpath("//textarea[@ng-model='Adress']");
	   By Loc_inpEmailId = By.xpath("//input[@type='email']");           
	   By Loc_inpMobileNumber = By.xpath("//input[@type='tel']");   
	   By Loc_selectGender = By.xpath("//input[@value='Male']");    
	   By Loc_butHobbies = By.xpath("//label[text()='Hockey']");     
	   By Loc_inpLanguage = By.xpath("//div[@id='msdd']");        
//	   By Loc_butSkils = By.xpath("//label[text()='Skills']");    
	   By Loc_selectSkils = By.xpath("//select[@id='Skills']");
	   By Loc_selectCountry = By.xpath("//select[@id='countries']");
	   By Loc_selectSearchCountry = By.xpath("//span[@id='select2-country-container']");
//	   By Loc_selectSearchCountry = By.xpath("//ul[@class='select2-results__options']//li[text()='India']");
//	   By Loc_searchCountry = By.xpath("//input[@type='search']");
	   By Loc_selectYear = By.xpath("//select[@id='yearbox']");
	   By Loc_selectMonth = By.xpath("//select[@ng-model='monthbox']");
	   By Loc_selectDay = By.xpath("//select[@id='daybox']");
	   By Loc_inpPassword = By.xpath("//input[@id='firstpassword']");
	   By Loc_inpConfirmPassword = By.xpath("//input[@id='secondpassword']");
	   By Loc_butnSubmit = By.xpath("//button[@id='submitbtn']");

	 //ul[@class='select2-results__options']//li[text()='India']
	   public void setRegistrationForFirstName(String strFirstName) {
		  Assert.assertTrue(objPojo.getObjSeleniumWrapperFunction().setText(Loc_inpFirstName,strFirstName)); 
	   }
	   
	   public void setRegistrationForLastname(String strLastName) {
			  Assert.assertTrue(objPojo.getObjSeleniumWrapperFunction().setText(Loc_inpLastNme,strLastName)); 
	  }
	   
	   public void setRegistrationForAddress(String strAddress) {
			  Assert.assertTrue(objPojo.getObjSeleniumWrapperFunction().setText(Loc_inpAddress,strAddress)); 
	  }
	   
	   public void setRegistrationForEmailId(String strEmailId) {
			  Assert.assertTrue(objPojo.getObjSeleniumWrapperFunction().setText(Loc_inpEmailId,strEmailId)); 
	  }
	   public void setRegistrationForMobileNumber(String strMobileNumber) {
			  Assert.assertTrue(objPojo.getObjSeleniumWrapperFunction().setText(Loc_inpMobileNumber,strMobileNumber)); 
	  }
	   public void selectGender(String strGender) {
			  Assert.assertTrue(objPojo.getObjSeleniumWrapperFunction().click(Loc_selectGender));
	  }
	   public void setRegistrationForHobbies() {
			  Assert.assertTrue(objPojo.getObjSeleniumWrapperFunction().selectCheckBox(Loc_butHobbies));
	  }
	   public void setRegistrationForLanguage(String strLanguage) {
			  Assert.assertTrue(objPojo.getObjSeleniumWrapperFunction().click(Loc_inpLanguage));
		//	  Assert.assertTrue(objPojo.getObjSeleniumWrapperFunction().click(Loc_butSkils));
	  }
	   public void selectRegistrationForSkils(String strSkils) {
			  Assert.assertTrue(objPojo.getObjSeleniumWrapperFunction().slectDropDown(Loc_selectSkils, strSkils));
	  }
	   public void selectRegistrationForCountry(String strCountry) {
			  Assert.assertTrue(objPojo.getObjSeleniumWrapperFunction().slectDropDown(Loc_selectCountry, strCountry));
	  }
	   public void searchRegistrationForsearchCountry(String strsearchCountry) {
		  Assert.assertTrue(objPojo.getObjSeleniumWrapperFunction().slectDropDown(Loc_selectSearchCountry,strsearchCountry));
		//	  Assert.assertTrue(objPojo.getObjSeleniumWrapperFunction().searchElement(Loc_searchCountry, strsearchCountry));
       //     Assert.assertTrue(objPojo.getObjSeleniumWrapperFunction().click(Loc_selectSearchCountry));
	   }
	   public void selectYear(String strYear) {
			  Assert.assertTrue(objPojo.getObjSeleniumWrapperFunction().slectDropDown(Loc_selectYear, strYear));
	  }
	   public void selectMonth(String strMonth) {
			  Assert.assertTrue(objPojo.getObjSeleniumWrapperFunction().slectDropDown(Loc_selectMonth, strMonth));
	  }
	   public void selectDay(String strDay) {
			  Assert.assertTrue(objPojo.getObjSeleniumWrapperFunction().slectDropDown(Loc_selectDay, strDay));
	  }
	   public void setPassword(String strPassword) {
			  Assert.assertTrue(objPojo.getObjSeleniumWrapperFunction().setText(Loc_inpPassword,strPassword)); 
	  }
	   public void setConfirmPassword(String strConfirmPassword) {
			  Assert.assertTrue(objPojo.getObjSeleniumWrapperFunction().setText(Loc_inpConfirmPassword,strConfirmPassword)); 
	  }
	   public void clickSubmit() {
			  Assert.assertTrue(objPojo.getObjSeleniumWrapperFunction().click(Loc_butnSubmit));
	  }
}
	   
	   

