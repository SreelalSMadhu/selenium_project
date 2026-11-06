package test_pkg;

import org.testng.annotations.Test;

import base_pkg.base_class;

public class payment_test extends base_class{
    @Test(priority=1)
    public void takess() throws Exception {
    	payment.screenshot();
    }
    @Test(priority=2)
    public void payfinish() {
    	payment.finish();
    }
}
