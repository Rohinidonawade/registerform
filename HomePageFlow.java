package com.flows;

import com.generic.Pojo;
import com.pageFactory.HomePage;

public class HomePageFlow {

	private Pojo objPojo;
	private HomePage objHomePage;
	
	public HomePageFlow(Pojo pojo) {
		this.objPojo= pojo;
		objHomePage = new HomePage(objPojo);
	}
	
	public void doLogin() {
		objHomePage.setHomePage("XYZ@gmail.com");
		objHomePage.click();
		
	}
}
