package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Excel_Read {
	WebDriver dr;
	
	@Test
	public void read() throws IOException {
		FileInputStream f = new FileInputStream("C:\\Users\\shihab\\Desktop\\Book1.xlsx");
		XSSFWorkbook w = new XSSFWorkbook(f);
		XSSFSheet s=w.getSheet("manue");
		int a=s.getLastRowNum();
		System.out.println(a);
		
		for(int i=0;i<=a;i++) {
			XSSFRow r=s.getRow(i);
			String username=r.getCell(0).toString();
			String password=r.getCell(1).toString();
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shihab\\Desktop\\Osa 1221201905a\\Driver\\chromedriver.exe");
			dr = new ChromeDriver();
			dr.get("https://www.facebook.com/");
			dr.findElement(By.id("email")).sendKeys(username);
			dr.findElement(By.id("pass")).sendKeys(password);
			dr.findElement(By.xpath("//input[@type='submit']")).click();
			dr.quit();
	
		
			//System.out.println(username + " "+password);
			
		}
		
		
		
		
		
		
	}

}
