package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home {
	WebDriver driver;

	@FindBy(name = "email") WebElement Ids;
	@FindBy(name = "pass") WebElement pwd;
	@FindBy(linkText = "Forgot password?") WebElement forgot;
	
	/*public home(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);*/
		
		public home(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		

}
	public void email() {
		Ids.sendKeys("username");
	}
	public void pass() {
		pwd.sendKeys("passW0rd");
	}
	public void forgot() {
		forgot.click();
		
	}


}
