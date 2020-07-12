package com.osa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumPage {
	WebDriver dr;
public SeleniumPage(WebDriver dr) {
	this.dr=dr;
	
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

public JunitPage clickSelenium() throws InterruptedException {
	Thread.sleep(3000);
	dr.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[4]/a")).click();
	return new JunitPage(dr);
	
	
}






}
