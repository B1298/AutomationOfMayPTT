package ProTrainingTech.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class homedepot {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/bilalazam/Downloads/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.homedepot.com");
		WebElement myaccount = driver.findElement(By.linkText("My Account"));
		myaccount.click();
		Thread.sleep(6000);
		Actions ob = new Actions(driver);
		WebElement register = driver.findElement(By.linkText("Register"));
		ob.moveToElement(register).click().build().perform();
		WebElement selectcontinue = driver.findElement(By.className("account-type-card"));
		ob.moveToElement(selectcontinue).click().build().perform();
		Thread.sleep(6000);
		WebElement email = driver.findElement(By.id("email"));
		ob.moveToElement(email).click().sendKeys("validemail@yahoo.com").build().perform();
		WebElement password = driver.findElement(By.id("password-input-field"));
		ob.moveToElement(password).click().sendKeys("Password1!");
		WebElement zipcode = driver.findElement(By.id("zipCode"));
		ob.moveToElement(zipcode).click().sendKeys("20723").build().perform();
		WebElement phone = driver.findElement(By.id("phone"));
		ob.moveToElement(phone).click().sendKeys("3015551555").build().perform();
		driver.switchTo().frame(0);
		WebElement recaptcha = driver.findElement(By.id("recaptcha-anchor-label"));
		ob.moveToElement(recaptcha).click().build().perform();
		Thread.sleep(6000);
		driver.switchTo().parentFrame();
		Thread.sleep(6000);
		WebElement createanaccount = driver.findElement(By.className("bttn__content"));
		ob.moveToElement(createanaccount).click().build().perform();
		WebElement zipcode1 = driver.findElement(By.id("zipCode"));
		ob.moveToElement(zipcode1).click().sendKeys("20723").build().perform();
		WebElement createanaccount1 = driver.findElement(By.className("bttn__content"));
		ob.moveToElement(createanaccount1).click().build().perform();
		
		
		
		
		
				
		
		
	}

}
