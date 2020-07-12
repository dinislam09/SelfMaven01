package com.osa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForumPage {
	WebDriver dr;
	@FindBy(xpath="/html/body/div[2]/div[1]/ul/li[2]/a") WebElement interviewQusetion; 
	
	
	public ForumPage(WebDriver dr) {
		this.dr=dr;
		PageFactory.initElements(dr, this);
		
}

	public void urlVarifay() {
		
		String expcteUrl="http://www.osaconsultingtech.com/Forum/logins/studentLogin.php";
		String actualUrl=dr.getCurrentUrl();
		System.out.println(actualUrl);
		if(expcteUrl.equals(actualUrl)) {
		System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}
	
	public IntervewQuestion clickonInterviewQuestion () {
		interviewQusetion.click();
		return new IntervewQuestion(dr);
		
		
		
		
	}
	

}
