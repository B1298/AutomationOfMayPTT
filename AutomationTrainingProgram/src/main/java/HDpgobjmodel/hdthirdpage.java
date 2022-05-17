package HDpgobjmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class hdthirdpage {
	WebDriver driver;
	
	@FindBy(id = "email") WebElement email;
	@FindBy(id = "password-input-field") WebElement password;
	@FindBy(id = "zipCode") WebElement zipcode;
	@FindBy(id = "phone") WebElement phone;
	@FindBy(id = "recaptcha-anchor-label") WebElement recaptcha;
	@FindBy(className = "bttn__content") WebElement createaccount;
	
	public hdthirdpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void email() {
		email.click();
		email.sendKeys("validemail@yahoo.com");
	}
	public void password() {
		password.click();
		password.sendKeys("Password1!");
	}
	public void zipcode() {
		zipcode.click();
		zipcode.sendKeys("20723");
	}
	public void phone() {
		phone.click();
		phone.sendKeys("3015551555");
	}
	public void recaptcha() throws InterruptedException {
		driver.switchTo().frame(0);
		recaptcha.click();
		Thread.sleep(6000);
		driver.switchTo().parentFrame();
		Thread.sleep(6000);
	}
	public void createaccount() {
		createaccount.click();
	}
		
}
