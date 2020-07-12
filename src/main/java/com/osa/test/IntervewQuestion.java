package com.osa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IntervewQuestion {
	WebDriver dr;
	@FindBy(xpath="//a[@href='selenium_interview_question.php']") WebElement selenium;
	
public IntervewQuestion(WebDriver dr) {
	this.dr=dr;
	PageFactory.initElements(dr, this);
}
public void urlVarifay() {
	
	String expcteUrl="http://www.osaconsultingtech.com/Forum/questions/java_interview_question.php";
	String actualUrl=dr.getCurrentUrl();
	System.out.println(actualUrl);
	if(expcteUrl.equals(actualUrl)) {
	System.out.println("Pass");
	}
	else {
		System.out.println("Fail");
	}
}
public SeleniumPage clickOnSelenium() throws InterruptedException {
	Thread.sleep(3000);
	selenium.click();
	return new SeleniumPage(dr);
}




}
