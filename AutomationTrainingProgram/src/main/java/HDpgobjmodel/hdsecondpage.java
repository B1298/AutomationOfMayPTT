package HDpgobjmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class hdsecondpage {
	WebDriver driver;
	
	@FindBy(className = "account-type-card") WebElement selectcontinue;
	
	public hdsecondpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		public void select() throws InterruptedException {
			selectcontinue.click();
			Thread.sleep(6000);
		}
		

}
