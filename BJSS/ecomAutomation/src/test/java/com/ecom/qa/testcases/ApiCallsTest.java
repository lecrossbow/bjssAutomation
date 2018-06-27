package com.ecom.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ecom.qa.base.TestBase;

//Generally these tests should run first to assure service availability (if they were the actual services being used)
//Virtual Services could be utilised on failure (see README.txt in main project folder for an option for this)

public class ApiCallsTest extends TestBase {
	
	@Test(priority=0)
	public void apiTestReadUsersList001() throws Exception {

		String response=TestBase.sendGet("https://reqres.in/api/users?page=2");

		Assert.assertNotNull(response);
		
		if(!response.contains("Eve")) {
			Assert.fail();
		}
		
	  }
	
	@Test(priority=1)
	public void apiTestReadUsersList002() throws Exception {

		String response=TestBase.sendGet("https://reqres.in/api/users?page=2");

		Assert.assertNotNull(response);
		
		if(response.contains("Eve")) {
			Assert.fail("Eve is found in response **Expected failure**");
		}
	}
	
	@Test(priority=2)
	public void apiTestCreateUser003() throws Exception {


		String rqstBody="{\n" + 
				"    \"name\": \"Lee\",\n" + 
				"    \"job\": \"leader\"\n" + 
				"}";
		
		TestBase.sendPost("https://reqres.in/api/users", rqstBody);
		
	  }
	
	//if no user a new one will be created
	@Test(priority=3)
	public void apiTestUpdateUser004() throws Exception {
		
		String rqstBody="{\n" + 
				"    \"name\": \"Crossley\",\n" + 
				"    \"job\": \"leader\"\n" + 
				"}";
		
		TestBase.sendPut("https://reqres.in/api/users/2", rqstBody);
		
	  }
	
	@Test(priority=4)
	public void apiTestDeleteUser005() throws Exception {
		
		String rqstBody="{\n" + 
				"    \"name\": \"Crossley\",\n" + 
				"    \"job\": \"leader\"\n" + 
				"}";
		
		TestBase.sendDelete("https://reqres.in/api/users/2", rqstBody);
		
		
	  }
	
}
