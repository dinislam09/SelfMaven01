package selfslenium;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;

import com.osa.test.Best;

public class google extends Best {

	@Test
	public void test() {
		dr.findElement(By.xpath("//*[@id=\"ftco-nav\"]/ul/li[7]/a")).click();
		dr.findElement(By.id("username")).sendKeys(p.getProperty("username"));
		dr.findElement(By.id("password")).sendKeys(p.getProperty("password"));
	}

}
