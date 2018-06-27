package com.ecom.qa.pages;

import com.ecom.qa.base.TestBase;

import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginPage  extends TestBase{

    //Page Objects Initialised 
	
    public LoginPage() {
    }

    public LoginPage(WebDriver driver) {
        this();
    }

    public LoginPage(WebDriver driver, Map<String, String> data) {
        this(driver);
    }

    public LoginPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
    }
    
    //Actions
    public String validateLoginPageTitle() {
    	return driver.getTitle();
    }
    
    public void validateQuickView() {
    	 Actions action = new Actions(driver);
    	   WebElement quickView = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[1]/div/div[1]/div/a[1]"));
    	   action.moveToElement(quickView).moveToElement(driver.findElement(By.cssSelector("#homefeatured li:nth-of-type(1) div.product-container div:nth-of-type(1) div.product-image-container a:nth-of-type(2)"))).click().build().perform();
    }
    
    public void OrderHistoryBtn() {
    driver.findElement(By.xpath("//div[@id='center_column']/div/div/ul/li/a/span")).click();
    }
    

    

	
}
		
	


