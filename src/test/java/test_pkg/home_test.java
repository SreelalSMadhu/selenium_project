package test_pkg;

import org.testng.Assert;
import org.testng.annotations.Test;

import base_pkg.base_class;

public class home_test extends base_class {
	@Test(priority = 1)
	public void textverify() {
		//login.loginmthd("standard_user", "secret_sauce");// calling login page method for username and passwords
		String producttext = home.txtmthd();
		Assert.assertEquals(producttext, "Products");
			}
	@Test(priority=2)
	public void linkverify() {
		int linkcount=home.linkcout();
		System.out.println("Link count is : "+linkcount);
	}
	@Test(priority=3)
	public void carts() {
		home.cart();
	}
          
}
