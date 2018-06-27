package com.ecom.qa.testcases;

import com.ecom.qa.base.TestBase;
import com.ecom.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;

	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialisation();
		loginPage = new LoginPage();
		
	}
	
//	Login
	@Test(priority=0)
	public void homePageLogin() {
		
		loginPage.loginMainPage();
		Assert.assertEquals("OrderHistoryBtn","OrderHistoryBtn");
	  }
	
//	Login then Logout - assert on homepage logo
	@Test(priority=1)
	public void homePageLogout() {
		
		loginPage.loginMainPage();
		loginPage.Logout();
		Assert.assertEquals("HomePageLogo","HomePageLogo");
	}

// Validate quick view
	@Test(priority=2)
	public void quickView() {
		loginPage.validateQuickView();
		Assert.assertEquals("HomePageLogo","HomePageLogo");
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
