package com.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.flows.HomePageFlow;
import com.flows.RegisterPageFlow;
import com.generic.BaseTest;
import com.generic.Pojo;
import com.pageFactory.HomePage;
import com.pageFactory.RegisterPage;

public class RegisterPageTest extends BaseTest{

	private Pojo objPojo;
	private HomePageFlow objHomePageFlow;
	private RegisterPage objRegisterPage;
	private RegisterPageFlow objRegisterPageFlow;
	
	public void initilizeWebPages() {
		objRegisterPage = new RegisterPage(this);	
		objRegisterPageFlow = new RegisterPageFlow(this);	
		objHomePageFlow = new HomePageFlow(this);

	}
	
	@BeforeClass
	public void initializeOfWebEnvir() {
		this.initilizeWebPages();
		this.initilizeOfWebDriver();
	}

	@AfterClass
	public void tearDownEnv() {
		this.tearDown();
   }
	
	@Test
	public void TC_002_CheckRegisterPage() {
		objHomePageFlow.doLogin();
		objRegisterPageFlow.setHomePageDetails();
	}
}
