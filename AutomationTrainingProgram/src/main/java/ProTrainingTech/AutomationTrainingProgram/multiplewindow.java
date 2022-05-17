package ProTrainingTech.AutomationTrainingProgram;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class multiplewindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/bilalazam/Downloads/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		Actions ob = new Actions(driver);
		WebElement newreleases = driver.findElement(By.linkText("New Releases"));
		ob.keyDown(Keys.SHIFT).build().perform();
		newreleases.click();
		ob.keyUp(Keys.SHIFT).build().perform();
		//driver.getWindowHandle(); // current window handle
		Set<String> windowhandles = driver.getWindowHandles(); // gets window handle for both windows
		Iterator<String> iterator = windowhandles.iterator(); // iterator is used to create strings for multiple entries ex. this will have 2 strings bc of 2 different window handle
		String parentwindow = iterator.next(); // .next is used to get window handle does it in order so this will get first handle
		String secondwindow = iterator.next(); // this gets second window handle
		System.out.println("this is the parent window handle = " +parentwindow);
		System.out.println("this is the second window handle = " +secondwindow);
		driver.switchTo().window(secondwindow); // used to switch to different window to perform actions there
		WebElement newwindowclick = driver.findElement(By.linkText("Camera & Photo Products"));
		Thread.sleep(6000);
		newwindowclick.click();
		
		
	}

}
