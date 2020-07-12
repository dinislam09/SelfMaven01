package selfslenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseRun {
	WebDriver dr;
	
	@Before
	public void openB() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shihab\\Desktop\\Osa 1221201905a\\ChD\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().window().maximize();
		
		
		
	}
	
	
	

	
	
}
