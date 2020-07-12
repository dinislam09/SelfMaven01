package selfslenium;

import org.junit.Test;

import com.osa.test.HomePage;
import com.osa.test.IntervewQuestion;
import com.osa.test.SeleniumPage;
import com.osa.test.LoginPage;
import com.osa.test.JunitPage;

public class SmokeRun extends BaseRun {

	@Test
	public void test() throws InterruptedException {
		HomePage ph = new HomePage(dr);
		ph.urlVarifay();
		ph.titleVarifay();
		
		LoginPage lp=ph.clickOnFormLoginButton();
		lp.urlVarifay();
		lp.loginTest();
		
		
/*	IntervewQuestion iq=lp.IntervewQuestionClic();
		iq.urlVarifay();
		iq.ClickJava();
		
		SeleniumPage j=iq.ClickJava();
		j.urlVarifay();
		j.clickSelenium();
		
		Selenium s=j.clickSelenium(); */
		
	}
	
	
	
	
}
