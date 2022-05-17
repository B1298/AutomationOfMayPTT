package CommonCodeClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class Utility {
	public WebDriver driver;
	@Parameters({"browser"})
 
  @BeforeClass
  public void beforeClass(String browsers) {
	  if(browsers.equalsIgnoreCase("Chrome")) {
		  System.setProperty("webdriver.chrome.driver", "/Users/bilalazam/Downloads/chromedriver 2");
				driver = new ChromeDriver();
				driver.navigate().to("https://www.facebook.com");
		  
	  }else if(browsers.equalsIgnoreCase("Edge")) {
		  System.setProperty("webdriver.edge.driver", "/Users/bilalazam/Downloads/edgedriver_mac64/msedgedriver");
			  driver = new EdgeDriver();
			  driver.navigate().to("https://www.facebook.com");
		  
	  }else if(browsers.equalsIgnoreCase("Firefox")) {
		  System.setProperty("webdriver.gecko.driver", "/Users/bilalazam/Downloads/geckodriver");
		  driver = new FirefoxDriver();
		  driver.navigate().to("https://www.facebook.com");
		  
	  }
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  public void pictures() throws IOException { // allows multiple screenshots to take place
	  Date dt = new Date(); // adds timestamp to differentiate between screenshots
	  System.out.println(dt);
	 String it = dt.toString().replace(" ", "_").replace(":", "_"); // converts date to string format and replacing formats
	  System.out.println(it); //added "+it+ to screenshot path for them to save into screenshots folder
	  
	  File Webshots = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //takes screenshot with file format // file in the beginning allows to save as a variable
	  FileHandler.copy(Webshots, new File("/Users/bilalazam/eclipse-workspace/AutomationTrainingProgram/Screenshots/PicturesOfWeb"+it+".jpg")); //saves screenshot for further use in screenshots folder and transfers to local drive
	  
	 
  }

}
