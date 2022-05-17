package ProTrainingTech.AutomationTrainingProgram;

import org.testng.annotations.Test;
import CommonCodeClass.Utility;
import pageobjectmodel.forgotpwdpage;
import pageobjectmodel.home;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class browser extends Utility {
  @Test(priority = 2)//,dependsOnMethods = "verificationofText" ) // only runs depending on other method 
  public void f() throws IOException {
	  home ob = new home(driver); // called from home page
	  ob.email();
	  ob.pass();
	  ob.forgot();
	  pictures();
	  forgotpwdpage obj = new forgotpwdpage(driver); // called from forgotpage
	  obj.cancel();
	  WebElement id = driver.findElement(By.name("email"));
	  id.sendKeys("username");
	  WebElement pw = driver.findElement(By.name("pass"));
	  pw.sendKeys("passworD"); 
  }
  @Test(priority = 1)
  
  public void verifitcationofText() throws InterruptedException, IOException {
	  home ob = new home(driver);
	  forgotpwdpage obj = new forgotpwdpage(driver);
	  Thread.sleep(6000);
	  ob.forgot();
	  Thread.sleep(6000);
	  pictures();
	  String VerificationOfText = obj.GetOfText();
	  System.out.println(VerificationOfText);
	 // SoftAssert st = new SoftAssert(); // soft assert
	 // st.assertEquals(VerificationOfText, "Please enter your email or mobile number to search for your account.");
	  Assert.assertEquals(VerificationOfText, "Please enter your email or mobile number to search for your account.", "Text is displaying");
	  System.out.println("This is afterassert");
	  obj.cancel();
	 // st.assertAll(); // must be added for soft assert at the end
	  
  }
  
}
