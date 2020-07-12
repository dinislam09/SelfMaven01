package com.osa.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class HomePage {

	WebDriver dr;
	public HomePage(WebDriver dr) {
		this.dr=dr;
		
}
	public void urlVarifay() {
		dr.get("http://www.osaconsultingtech.com/");
		String expcteUrl="http://www.osaconsultingtech.com/";
		String actualUrl=dr.getCurrentUrl();
		if(expcteUrl.equals(actualUrl)) {
			System.out.println(actualUrl);
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
	}
	public void titleVarifay() {
		String expecteTitle="OSA Consulting Tech Corp || Best Available Resources For Software Industry";
		String actualeTitle=dr.getTitle();
		if(expecteTitle.equals(actualeTitle)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}
		
		
	public LoginPage clickOnFormLoginButton() {
		
		dr.findElement(By.xpath("//a[text()='Forum Login']")).click();
		return new LoginPage(dr);
		
		
		
	}	
		
		
		
	
	
	
	
	
	
	
	
	
}
