package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class forgotpwdpage {

WebDriver driver;

@FindBy(linkText = "Cancel") WebElement cancellink;
@FindBy(xpath = "//*[contains(text(),'Please enter your email')]") WebElement ForgotPageText;

public forgotpwdpage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
public void cancel() {
	cancellink.click();
}
public String GetOfText() {
	String ForgotPageVerify = ForgotPageText.getText();
	return ForgotPageVerify;
}

}
