package base_pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import page_pkg.cart_page;
import page_pkg.checkout_page;
import page_pkg.home_page;
import page_pkg.login_page;
import page_pkg.payment_page;

public class base_class {
	public static WebDriver driver;
	public static login_page login;
	public static home_page home;
	public static cart_page cart;
	public static checkout_page check;
	public static payment_page payment;
	
	
	
	
	@BeforeTest
	public void swag() {
		ChromeOptions options= new ChromeOptions();//just used to ingnore browser pop-ups
		options.addArguments("--incognito");
		driver= new ChromeDriver(options);
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
	}
	@BeforeMethod
	public void objmthd() {
		login= new login_page(driver);
		
	}
	@BeforeMethod
	public void homemthd() {
		home= new home_page(driver);
	}
	@BeforeMethod
	public void cartmthd() {
		cart= new cart_page(driver);
	}
	@BeforeMethod
	public void paymthd() {
		check=new checkout_page(driver);
	}
	@BeforeMethod
	public void paymentmthd() {
		payment= new payment_page(driver);
	}
	
	
	
	

}
