package page_pkg;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class payment_page {
	WebDriver driver;

      @FindBy(xpath = "//*[@id=\"finish\"]")WebElement screen;
	  
      public payment_page(WebDriver driver) {
      	this.driver=driver;
      	PageFactory.initElements(driver,this);
}
      public void screenshot() throws Exception {
    	  File r = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	  FileHandler.copy(r, new File("C:\\Users\\sreel\\OneDrive\\Desktop\\SeleniumWorks\\ss\\swag.png"));

      }
         public void finish() {
        	 screen.click();
         }


}
