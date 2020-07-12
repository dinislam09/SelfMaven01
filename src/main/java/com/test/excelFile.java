package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

@Test
public class excelFile {
	public void excel() throws IOException {
		FileInputStream f = new FileInputStream("C:\\Users\\shihab\\Desktop\\Java\\Book22.xlsx");
		XSSFWorkbook b = new XSSFWorkbook(f);
		XSSFSheet s=b.getSheet("manu");
		int r=s.getLastRowNum();
		int c=s.getRow(0).getLastCellNum();
		//System.out.println(r);
		
		Object[][]data=new Object[r][c];
		for(int i =1;i<=r;i++) {
			for(int j=0;j<c;j++) {
				
				data[i][j]=s.getRow(i).getCell(j);	
				
				System.out.println(data[i][j]);
			}
		
		}
		//System.out.println(r + c);

		//System.out.println(data[r][c]);
		
	}

}
