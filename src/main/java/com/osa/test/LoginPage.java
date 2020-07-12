package com.osa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver dr;
	
	@FindBy(name="username")WebElement username;      //pageFactory concept.
	@FindBy(id="password")WebElement password;
	@FindBy(id="login_button")WebElement loginButton;
	
	
	public LoginPage(WebDriver dr) {
		this.dr=dr;
		PageFactory.initElements(dr, this);
		
}
	public void urlVarifay() {
		String expcteUrl="http://www.osaconsultingtech.com/Forum/logins/forum_login.html";
		String actualUrl=dr.getCurrentUrl();
		System.out.println(actualUrl);
		if(expcteUrl.equals(actualUrl)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}	
}
	
	public ForumPage loginTest() {
		
		username.sendKeys("md.islam@osaconsultingtech.com");
		password.sendKeys("5076Md1988");
		loginButton.click(); 
		return new ForumPage(dr);
		
}

	
	
	
	
}
