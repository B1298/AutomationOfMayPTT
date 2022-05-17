package ProTrainingTech.AutomationTrainingProgram;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class copyandpaste {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/bilalazam/Downloads/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //implicit wait 10 seconds. it will run for duration until time lapses then it will show error in script. will function as normal until error is found. will notify of error after time lapses.
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(10)); // explicit wait puts condition on an element then it will wait until expected condition is met
		wt.until(ExpectedConditions.elementToBeClickable(By.id("twotabsearchtextbox")));// can be any condition this is for the element to be clickable by id
		WebElement searchto = driver.findElement(By.id("twotabsearchtextbox")); //put 4 for example of error there was delay for script to show error. ran until time lapsed.
		searchto.sendKeys("computer");
		Actions ob = new Actions(driver);
		ob.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform(); //controls keyboard when down key up releases keyboard cntrl acv doesnt work on mac try cmd
		ob.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(6000);
		searchto.clear();
		searchto.click();
		Thread.sleep(6000);
		ob.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
				
	}

}
