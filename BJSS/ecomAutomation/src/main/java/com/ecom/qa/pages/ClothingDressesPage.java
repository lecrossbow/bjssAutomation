package com.ecom.qa.pages;

import com.ecom.qa.base.TestBase;

import java.util.Map;
import org.openqa.selenium.WebDriver;

public class ClothingDressesPage extends TestBase {
    private WebDriver driver;


    
    //Page Objects Initialised 
    
    public ClothingDressesPage() {
    }

    public ClothingDressesPage(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public ClothingDressesPage(WebDriver driver, Map<String, String> data) {
        this(driver);
    }

    public ClothingDressesPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
    }
    
    //Actions
    public String validateClothingDressesPageTitle() {
    	return driver.getTitle();
    }
    
    
    
}
