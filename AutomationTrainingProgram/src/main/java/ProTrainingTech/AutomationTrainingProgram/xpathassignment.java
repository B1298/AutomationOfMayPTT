package ProTrainingTech.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/bilalazam/Downloads/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		//WebElement searchbar = driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/input"));//absolute xpath
		WebElement searchbar = driver.findElement(By.xpath("//input[@aria-label='Search']")); // relative xpath
		searchbar.click();
		searchbar.sendKeys("computer");
		WebElement books = driver.findElement(By.xpath("//a[text()='Books']")); // text xpatch
		books.click();
	}

}
