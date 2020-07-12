package com.osa.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Best {
	
	public WebDriver dr;
	public Properties p;
	
	@Before
	public void openBrowse() throws IOException {
		FileInputStream fl = new FileInputStream("C:\\Users\\shihab\\Desktop\\Osa 1221201905a\\selfslenium\\src\\main\\resources\\config.properties");
		p = new Properties();
	    p.load(fl);
	    String b = p.getProperty("browser");
	    System.out.println(b);
	
	
	if (b.equals("Chrome")) {
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\shihab\\Desktop\\Osa 1221201905a\\Driver\\chromedriver.exe";
		System.setProperty(key, value);
		dr = new ChromeDriver();
		dr.manage().window().maximize();
	}
	
	else if (b.equals("firefox")){
		System.setProperty("", "");
	}
	
	
	
	String url=p.getProperty("url");
	dr.get(url);
	
	
	
	
	}	


	
	//@After
		public void browseClose() {
			dr.close();
	}		
}