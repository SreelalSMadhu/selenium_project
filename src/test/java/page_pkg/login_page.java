package page_pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {
	WebDriver driver;
	@FindBy(xpath="//input[@id='user-name']")WebElement username;
	@FindBy(xpath="//input[@id='password']")WebElement password;
	@FindBy(xpath="//input[@id='login-button']")WebElement login;
    public login_page(WebDriver driver) {
    	this.driver=driver;
    	PageFactory.initElements(driver,this);
    	    		} 
    public String titlemthd() {
    	String title=driver.getTitle();
    	return title;
    	    }
    public void loginmthd(String un, String ps) {
    	username.sendKeys(un);
    	password.sendKeys(ps);
    	login.click();
    }
         public String url_method() {
        	 String actual= driver.getCurrentUrl();
        	 return actual;
         }
}
