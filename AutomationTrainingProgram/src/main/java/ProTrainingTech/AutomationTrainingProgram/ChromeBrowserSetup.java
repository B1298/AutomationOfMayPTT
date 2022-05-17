package ProTrainingTech.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserSetup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub, how to launch chrome browser
		System.setProperty("webdriver.chrome.driver", "/Users/bilalazam/Downloads/chromedriver 2");
WebDriver driver = new ChromeDriver();
driver.navigate().to("https://www.amazon.com");
driver.manage().window().maximize(); // this maximizes the window
driver.navigate().back(); // this navigates one page back
Thread.sleep(6000); // this pauses the time between action every 1000 is 1 second
driver.navigate().forward(); // this navigates one page forward
String windowhandleid = driver.getWindowHandle(); //driver.getw... gets the window session id
System.out.println(windowhandleid);// string was created above to print id
WebElement Searchfield = driver.findElement(By.name("field-keywords")); // element for search bar
Searchfield.sendKeys("Computer"); // send keys allows text input
Thread.sleep(6000);
WebElement SearchButton = driver.findElement(By.id("nav-search-submit-button")); // driver.f.. locates unique element. Webelement allows for storage of the element by giving name
SearchButton.click(); // the name of stored element. allows to perform an action with it. in this case the action is to click the search button
WebElement deallink = driver.findElement(By.linkText("Today's Deals")); // todays deals link element
deallink.click(); // link element action
driver.findElement(By.partialLinkText("Today's")); // partial link locator for todays deal
//driver.close(); // this closes the browser



	}

}
