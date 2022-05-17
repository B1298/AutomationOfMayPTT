package HDpgobjmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HDhome {
	WebDriver driver;
	
	@FindBy(linkText = "My Account") WebElement myaccount;
	@FindBy(linkText = "Register") WebElement register;
	
	public HDhome(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	public void account() throws InterruptedException {
		myaccount.click();
		Thread.sleep(6000);
		
	}
	public void register() {
		register.click();
	}

}
