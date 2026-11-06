package test_pkg;

import org.testng.annotations.Test;

import base_pkg.base_class;

public class checkout_test extends base_class {
	@Test(priority=1)
	public void fullname() {
		check.payfullname();
	}
	@Test(priority=2)
	public void lastname() {
		check.paylname();
	}
	@Test(priority=3)
	public void zipcode() {
		check.payzip_pincode();
	}
	@Test(priority=4)
	public void clickcontiinue() {
		check.continues();
	}

}
