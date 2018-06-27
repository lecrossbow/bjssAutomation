package com.ecom.qa.base;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import com.ecom.qa.utilities.TestUtilities;

public class TestBase {
	
	
	protected static WebDriver driver;
	protected static Properties prop;
	
	public TestBase() {
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("/Users/apple/Documents/Tutorials/BJSS/ecomAutomation/src/main/java/com/ecom/qa/"
					+ "config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public static void initialisation() {
			String browserName = prop.getProperty("browser");
			
			if(browserName.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/chromedriver");
				driver = new ChromeDriver();
			} 
			else if(browserName.equals("FF")) {
				System.setProperty("webdriver.gecko.driver", "/Users/apple/Downloads/geckodriver");
				driver = new FirefoxDriver();
			}
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtilities.PAGE_LOAD_TIMEOUT,  TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtilities.IMPLICIT_WAIT,  TimeUnit.SECONDS);
			
			driver.get(prop.getProperty("url"));
			
			
	}
	
	//Actions
	
	public void loginMainPage() {
		
//		System.getProperty("username");
//		
	    driver.findElement(By.linkText("Sign in")).click();
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("crossley_lee@yahoo.co.uk");
	    driver.findElement(By.id("passwd")).clear();
	    driver.findElement(By.id("passwd")).sendKeys("BJSSTest");
	    driver.findElement(By.xpath("//button[@id='SubmitLogin']/span")).click();
	   
	}
	
    public void Logout() {
        driver.findElement(By.linkText("Sign out")).click();
        driver.findElement(By.xpath("//img[@alt='My Store']")).click();
    }
    
    public void HomePageLogo() {
    	driver.findElement(By.xpath("//img[@alt='My Store']")).click();
    }
	
    public static String sendGet(String apiEndPoint) throws Exception {

		
		
		URL obj = new URL(apiEndPoint);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");
		//con.setRequestProperty("Cookie", "__cfduid=d224920ec1ddcad87ad6761f0c6d2edbf1530125207");

		con.setRequestProperty("User-Agent","Chrome/67.0.3396.99");
		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + apiEndPoint);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		//print result
		System.out.println(response.toString());
		
		return response.toString();

	}
	 
    public static String sendPost(String apiEndPoint,String urlParameters) throws Exception {

		URL obj = new URL(apiEndPoint);
		HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

		//add request header
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", "Chrome/67.0.3396.99");
		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
		
		// Send post request
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();

		int responseCode = con.getResponseCode();
		boolean validateResponseCode=false;
		
		if(responseCode==201) {
			validateResponseCode=true;
		}
		
		Assert.assertTrue(validateResponseCode);
		System.out.println("\nSending 'POST' request to URL : " + apiEndPoint);
		System.out.println("Post parameters : " + urlParameters);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		
		//print result
		System.out.println(response.toString());
		return response.toString();

	}
    
    public static String sendPut(String apiEndPoint,String urlParameters) throws Exception {

		URL obj = new URL(apiEndPoint);
		HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

		//add request header
		con.setRequestMethod("PUT");
		con.setRequestProperty("User-Agent", "Chrome/67.0.3396.99");
		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
		
		// Send put request
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();

		int responseCode = con.getResponseCode();
		boolean validateResponseCode=false;
		
		if(responseCode==200) {
			validateResponseCode=true;
		}
		
		Assert.assertTrue(validateResponseCode);
		System.out.println("\nSending 'PUT' request to URL : " + apiEndPoint);
		System.out.println("Post parameters : " + urlParameters);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		
		//print result
		System.out.println(response.toString());
		return response.toString();

	}
    
    public static String sendDelete(String apiEndPoint,String urlParameters) throws Exception {

		URL obj = new URL(apiEndPoint);
		HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

		//add request header
		con.setRequestMethod("DELETE");
		con.setRequestProperty("User-Agent", "Chrome/67.0.3396.99");
		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
		
		// Send delete request
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();

		int responseCode = con.getResponseCode();
		boolean validateResponseCode=false;
		
		if(responseCode==204) {
			validateResponseCode=true;
		}
		
		Assert.assertTrue(validateResponseCode);
		System.out.println("\nSending 'DELETE' request to URL : " + apiEndPoint);
		System.out.println("Post parameters : " + urlParameters);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		
		//print result
		System.out.println(response.toString());
		return response.toString();

	}
    
}

	
