package com.TestLayer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.RegisterPage;

public class RegisterPageTest  extends BaseClass
	{
		private static RegisterPage registerPage;		//we make it as global private static to use within class for all methods
	@BeforeClass
	public void setUp()
	{
	BaseClass.initialization();	//here we use BeforeClass annotation (it is applicable beforclass for all mehods in class)
	}
	@Test(priority=1)
	public void validateContactInformation() {
		  registerPage = new RegisterPage();
			registerPage.contactInformation("Shrikant","Khemkar","9898","shrikant@gmail.com");
			}
	@Test(priority=2)
	public void validateMailingInformation() {
		registerPage.mailingInformation("Pune","Pune","Maharashtra","453434","INDIA");
	}
	@Test(priority=3)
	public void validateUserInformation() {
		registerPage.userInformation("shrikant@gmail.com","shri@123","shri@123");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	}

