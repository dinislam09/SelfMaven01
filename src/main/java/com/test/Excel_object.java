package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Excel_object extends Base {
	
	
	@DataProvider(name="facebook")
	
	public Object[][] excelRead(){
		
		try {
		
		FileInputStream f = new FileInputStream("C:\\Users\\shihab\\Desktop\\Java\\Book22.xlsx");
		XSSFWorkbook b = new XSSFWorkbook(f);
		XSSFSheet s=b.getSheet("manu");
		int r=s.getLastRowNum();
		int c=s.getRow(0).getLastCellNum();
		
		Object[][] data = new Object[r][c];
		
		for(int i=1;i<=r;i++) {
			
			for(int j=0;j<c;j++) {
				
				data[i-1][j]=s.getRow(i).getCell(j);
				
				
			}
			
		}
		//System.out.println(data[1][1]);
		
		return data;
		
		}catch(Exception e) {}
		return null;
		
		
	}
	
	@Test(dataProvider="facebook")
	public void getData(Object a,Object b,Object c,Object d) {
		
	
		
		dr.findElement(By.xpath("//input[@name='firstname']")).sendKeys(a.toString());
		dr.findElement(By.xpath("//input[@name='lastname']")).sendKeys(b.toString());
		dr.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(c.toString());
		dr.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(d.toString());
		dr.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		
		//System.out.println(a);
		
	}


	
	

}
