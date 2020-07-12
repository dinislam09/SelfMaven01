package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Base {
	WebDriver dr;
	Properties p;
	
	@BeforeMethod
	public void openbrowser() throws IOException {
		FileInputStream f = new FileInputStream("C:\\Users\\shihab\\Desktop\\Osa 1221201905a\\selfMaven\\src\\main\\resources\\config.properties");
		p = new Properties();
		p.load(f);
		String b=p.getProperty("browser");
		
		if(b.equals("Chrome")) {
			String key = "webdriver.chrome.driver";
			String value = "C:\\Users\\shihab\\Desktop\\Osa 1221201905a\\Driver\\chromedriver.exe";
			System.setProperty(key, value);
			dr= new ChromeDriver();
			dr.manage().window().maximize();
			dr.get("https://www.facebook.com/");
		}
		
		else if(b.equals("firefox")) {
			String key = "webdriver.gecko.driver";
			String value = "C:\\Users\\shihab\\Desktop\\Osa 1221201905a\\Driver\\geckodriver.exe";
			System.setProperty(key, value);
			dr = new FirefoxDriver();
			dr.manage().window().maximize();
			
		}
		
		else { b.equals("Explore");
		}
		
	}
	
	@AfterMethod
	public void browserClose() {
		dr.quit();
	}
		
	
}
