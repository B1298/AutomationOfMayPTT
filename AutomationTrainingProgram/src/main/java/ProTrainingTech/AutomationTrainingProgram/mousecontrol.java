package ProTrainingTech.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousecontrol {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/bilalazam/Downloads/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		Actions ob = new Actions(driver); // have to create action for mouse actions also need objects
		WebElement Signin = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		ob.moveToElement(Signin).build().perform(); // .perform is neccesary for functions  .build isnt
		Thread.sleep(6000);
		WebElement primemembership = driver.findElement(By.linkText("Prime Membership"));
		ob.moveToElement(primemembership).click().build().perform();
	}

}
