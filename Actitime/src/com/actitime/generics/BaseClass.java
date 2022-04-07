package com.actitime.generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static WebDriver driver;
    @BeforeTest
    public void openbrowser(){
    driver=new ChromeDriver();
    }
    @BeforeMethod
    public void Login() {
    	driver.get("https://demo.actitime.com/");
    	
    	
    	
    
	



	}

}
