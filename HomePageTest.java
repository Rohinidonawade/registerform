package com.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.flows.HomePageFlow;
import com.generic.BaseTest;
import com.generic.Pojo;
import com.pageFactory.HomePage;

public class HomePageTest extends BaseTest{
	
	private Pojo objPojo;
	private HomePage objHomePage;
	private HomePageFlow objHomePageFlow;
	
	public void initilizeWebPages() {
		objHomePage = new HomePage(this);	
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
	public void TC_001_VerifyHamePage() {
		objHomePageFlow.doLogin();
		
	}
}
