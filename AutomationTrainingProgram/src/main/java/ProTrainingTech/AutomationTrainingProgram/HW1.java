package ProTrainingTech.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/bilalazam/Downloads/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		WebElement Username = driver.findElement(By.id("email"));
		Username.click();
		Username.sendKeys("facebook_1@yahoo.com");
		WebElement Password = driver.findElement(By.id("pass"));
		Password.click();
		Password.sendKeys("password");
		WebElement Login = driver.findElement(By.name("login"));
		Login.click();
		
		driver.navigate().to("https://www.protrainingtech.com");
		WebElement Contactus = driver.findElement(By.linkText("Contact us"));
		Contactus.click();
		WebElement Firstn = driver.findElement(By.id("nf-field-17"));
		Firstn.click();
		Firstn.sendKeys("Bilal");
		WebElement Lastn = driver.findElement(By.name("lname"));
		Lastn.click();
		Lastn.sendKeys("Azam");
		WebElement Email = driver.findElement(By.id("nf-field-19"));
		Email.click();
		Email.sendKeys("B@gmail.com");
		WebElement Phone = driver.findElement(By.id("nf-field-20"));
		Phone.click();
		Phone.sendKeys("1235550211");
		WebElement Register = driver.findElement(By.id("nf-field-27"));
		Register.click();
		
		
	}

}
