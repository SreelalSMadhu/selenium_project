package page_pkg;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home_page {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"header_container\"]/div[2]/span")WebElement product;
	@FindBy(tagName = "a")List<WebElement> links;
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-backpack\"]")WebElement cart;
	
	public home_page(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	   public String txtmthd() {
		String acutaltext= product.getText();
		return acutaltext;
	    }
	   public int linkcout() {
		int count= links.size();
		return count;
		}
	   public void cart() {
		cart.click();
	   }
}
