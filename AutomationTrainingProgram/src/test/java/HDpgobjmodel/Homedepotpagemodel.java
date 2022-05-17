package HDpgobjmodel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Homedepotpagemodel {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  HDhome ob = new HDhome(driver);
	  ob.account();
	  ob.register();
	  
	  hdsecondpage ob2 = new hdsecondpage(driver);
	  ob2.select();
	  
	  hdthirdpage ob3 = new hdthirdpage(driver);
	  ob3.email();
	  ob3.password();
	  ob3.zipcode();
	  ob3.phone();
	  ob3.recaptcha();
	  ob3.createaccount();
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "/Users/bilalazam/Downloads/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.homedepot.com");
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(2000);
	 driver.quit();
	  
  }

}
