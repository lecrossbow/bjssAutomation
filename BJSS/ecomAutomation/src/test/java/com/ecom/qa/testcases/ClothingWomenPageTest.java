package com.ecom.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.ecom.qa.base.TestBase;
import com.ecom.qa.pages.ClothingWomenPage;

public class ClothingWomenPageTest extends TestBase {
		ClothingWomenPage clothingWomenPage;

		
		public ClothingWomenPageTest() {
			super();
		}
		
		@BeforeMethod
		public void setUp() {
			initialisation();
			clothingWomenPage = new ClothingWomenPage();

		}

//		Only testable in my opinion if you use many ACTIONS, not maintainable and very fragile.
		
//		@Test(priority=0)
//		public void BuyADressTest() {
	
//			clothingWomenPage.loginMainPage();
//			clothingWomenPage.Logout();
//			clothingWomenPage.buyADress();			
			
//		  }

		
		
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}

}
