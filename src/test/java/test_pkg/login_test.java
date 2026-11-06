package test_pkg;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import base_pkg.base_class;

public class login_test extends base_class {
	@Test(priority=1)
	public void titleverify() {
		String actualtitle= login.titlemthd();
		Assert.assertEquals(actualtitle, "Swag Labs");
		
	}
	@Test(priority=2)
	public void loginvalid() {
		login.loginmthd("standard_user", "secret_sauce");
			}
	@Test(priority=3)
	public void url_validation() {
		String homeurl= login.url_method();
		System.out.println("Home url is :"+homeurl);
		//Assert.assertEquals(homeurl, "https://www.saucedemo.com/inventory.html");-->1st method fpr verify url\
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.urlToBe("https://www.saucedemo.com/inventory.html"));//-->2nd method
		
	}
	
            
}
