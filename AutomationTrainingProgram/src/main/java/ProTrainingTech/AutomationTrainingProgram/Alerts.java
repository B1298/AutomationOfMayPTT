package ProTrainingTech.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/bilalazam/Downloads/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://chercher.tech/practice-pop-ups-selenium-webdriver");
		WebElement alert = driver.findElement(By.name("alert"));
		alert.click();
		driver.switchTo().alert().accept(); // .accept or .dismiss allows to accept or decline an alert
		Thread.sleep(6000);
		WebElement confirmation = driver.findElement(By.name("confirmation"));
		confirmation.click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		Thread.sleep(6000);
		confirmation.click();
		Thread.sleep(6000);
		driver.switchTo().alert().dismiss();
		WebElement prompt = driver.findElement(By.name("prompt"));
		prompt.click();
		driver.switchTo().alert().sendKeys("Accept"); // allows to type in typebox on alert
		driver.switchTo().alert().accept();
	}

}
