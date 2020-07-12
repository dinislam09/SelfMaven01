package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Excel_Read2 {
	WebDriver dr;
	
	@DataProvider(name="facebook")
	public Object[][] excelRead() throws IOException {
		FileInputStream f = new FileInputStream("C:\\Users\\shihab\\Desktop\\Group A.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(f);
		XSSFSheet sheet = book.getSheet("menu");
		int rowSize=sheet.getLastRowNum();
		int cellSize=sheet.getRow(0).getLastCellNum();
		
		
		Object[][]data=new Object[rowSize][cellSize];
		
		for (int i=1;i<=rowSize;i++) {
			for(int j=0; j<cellSize;j++) {
				
				data[i-1][j]=sheet.getRow(i).getCell(j);
			}
			
		}
		
		return data;
		
}
	@Test(dataProvider="facebook")
	public void getData(Object a,Object b) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shihab\\Desktop\\Osa 1221201905a\\Driver\\chromedriver.exe");
		dr= new ChromeDriver();
		dr.get("https://www.facebook.com/");
		dr.findElement(By.id("email")).sendKeys(a.toString());
		dr.findElement(By.id("pass")).sendKeys(b.toString());
		dr.findElement(By.xpath("//input[@type='submit']")).click();
		dr.quit();
		
		
	}
	
	
	

}
