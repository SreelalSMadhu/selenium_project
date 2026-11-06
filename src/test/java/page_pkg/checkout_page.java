package page_pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkout_page {
	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"first-name\"]")WebElement payfname;
	@FindBy(xpath = "//*[@id=\"last-name\"]")WebElement paylname;
	@FindBy(xpath = "//*[@id=\"postal-code\"]")WebElement payzip;
	@FindBy(xpath = "//*[@id=\"continue\"]")WebElement paycontinue;
	public checkout_page(WebDriver driver) {
    	this.driver=driver;
    	PageFactory.initElements(driver,this);
	}

	public void payfullname() {
		payfname.sendKeys("lalu");
	}
	public void paylname() {
		paylname.sendKeys("s");
	}
	public void payzip_pincode() {
		payzip.sendKeys("689532");
	}
	public void continues() {
		paycontinue.click();
	}

}
