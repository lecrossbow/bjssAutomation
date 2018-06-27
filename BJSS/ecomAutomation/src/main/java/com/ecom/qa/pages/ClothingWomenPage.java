package com.ecom.qa.pages;

import com.ecom.qa.base.TestBase;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ClothingWomenPage  extends TestBase{
    private WebDriver driver;    
    
    //Page Objects Initialised 
    
    public ClothingWomenPage() {
    }

    public ClothingWomenPage(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public ClothingWomenPage(WebDriver driver, Map<String, String> data) {
        this(driver);
    }

    public ClothingWomenPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
    }
    
    
    
    //Actions
//    public String validateClothingWomenPageTitle() {
//    	return driver.getTitle();
//    }
    
    public void buyADress() {
    
    	 Actions action = new Actions(driver);
  	   WebElement quickView = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul"));
  	   action.moveToElement(quickView).moveToElement(driver.findElement(By.cssSelector("#block_top_menu > ul > li:nth-child(1) > a"))).click().build().perform();
  
    	
    	
    	//driver.findElement(By.cssSelector("#block_top_menu > ul > li:nth-child(1) > a")).click();
        driver.findElement(By.xpath("//ul[@id='homefeatured']/li/div/div[2]/div[2]/a/span")).click();
        driver.findElement(By.xpath("//div[@id='layer_cart']/div/div[2]/div[4]/span/span")).click();
        driver.findElement(By.xpath("//ul[@id='homefeatured']/li[2]/div/div[2]/div[2]/a/span")).click();
        driver.findElement(By.xpath("//div[@id='layer_cart']/div/div[2]/div[4]/a/span")).click();
        driver.findElement(By.xpath("//div[@id='center_column']/p[2]/a/span")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("crossley_lee@yahoo.co.uk");
        driver.findElement(By.id("passwd")).clear();
        driver.findElement(By.id("passwd")).sendKeys("BJSSTest");
        driver.findElement(By.xpath("//button[@id='SubmitLogin']/span")).click();
        driver.findElement(By.xpath("//div[@id='center_column']/form/p/button/span")).click();
        driver.findElement(By.id("cgv")).click();
        driver.findElement(By.xpath("//form[@id='form']/p/button/span")).click();
        driver.findElement(By.linkText("Pay by check (order processing will be longer)")).click();
        driver.findElement(By.xpath("//p[@id='cart_navigation']/button/span")).click();
        driver.findElement(By.linkText("Back to orders")).click();
        driver.findElement(By.linkText("Sign out")).click();
      }
        
 }


