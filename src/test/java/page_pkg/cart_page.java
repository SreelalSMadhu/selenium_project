package page_pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cart_page {
         WebDriver driver;
         @FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")WebElement carts;
         @FindBy(xpath="//*[@id=\"header_container\"]/div[2]/span")WebElement cartlogo;
         @FindBy(xpath ="//button[@id='checkout']")WebElement checkoutlogo;
         
         public cart_page(WebDriver driver) {
     		
     		this.driver=driver;
     		PageFactory.initElements(driver,this);
         }
         public void cartclick() {
        	 carts.click();
         }
         public String cartmthd() {
        	 String checktext= cartlogo.getText();
     		return checktext;
         }
         public void Checkout() {
        	 checkoutlogo.click();
         }
}
