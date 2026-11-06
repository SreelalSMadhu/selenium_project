package test_pkg;

import org.testng.Assert;
import org.testng.annotations.Test;

import base_pkg.base_class;

public class cart_test extends base_class{
    @Test(priority=2)
    public void cartss() {
    	String checktext = cart.cartmthd();
		Assert.assertEquals(checktext, "Your Cart");
		
    }
    
    @Test(priority=1)
    public void cartclick() {
    	cart.cartclick();
    }
    @Test(priority=3)
    public void checkoutclick() {
    	cart.Checkout();
    	
    }}
