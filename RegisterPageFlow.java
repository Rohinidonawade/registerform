package com.flows;

import com.generic.Pojo;
import com.generic.Utilities;
import com.pageFactory.RegisterPage;

    public class RegisterPageFlow extends Utilities{

	private Pojo objPojo;
	private RegisterPage objRegisterPage;
	private Utilities objUtilities;
	
	public RegisterPageFlow(Pojo pojo) {
		this.objPojo= pojo;
		objRegisterPage = new RegisterPage(objPojo);
		objUtilities = new Utilities();
	}
	
	public void setHomePageDetails() {
		objRegisterPage.setRegistrationForFirstName(getFirstName());
		objRegisterPage.setRegistrationForLastname(getLastName());
		objRegisterPage.setRegistrationForAddress("A/P:Ingali, Tq:Chikkodi, dist:Belgaum");
		objRegisterPage.setRegistrationForEmailId(getEmailId());
		objRegisterPage.setRegistrationForMobileNumber(getMobileNumber(10));
		objRegisterPage.selectGender("Male");
		objRegisterPage.setRegistrationForHobbies();
		objRegisterPage.setRegistrationForLanguage("English");
		objRegisterPage.selectRegistrationForSkils("APIs");
		objRegisterPage.selectRegistrationForCountry("Select Country");
		objRegisterPage.searchRegistrationForsearchCountry("India");
		objRegisterPage.selectYear("2000");
		objRegisterPage.selectMonth("May");
		objRegisterPage.selectDay("21");
		objRegisterPage.setPassword(getPassword());
		objRegisterPage.setConfirmPassword(getPassword());
		objRegisterPage.clickSubmit();
	}

	
}
