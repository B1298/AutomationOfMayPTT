package ProTrainingTech.AutomationTrainingProgram;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTestclass {
  @Test // 5
  public void f() {
	  System.out.println("this is test annotation");
  }
  @BeforeMethod //4
  public void beforeMethod() {
	  System.out.println("this is before method annotation");
  }
  
  @Test // 5 // 2nd test added to check flow of execution
  public void test2() {
	  System.out.println("this is test2 annotation");
  }

  @AfterMethod //6
  public void afterMethod() {
	  System.out.println("this is after method annotation");
  }

  @BeforeClass //3
  public void beforeClass() {
	  System.out.println("this is before class annotation");
  }

  @AfterClass // 7
  public void afterClass() {
	  System.out.println("this is after class annotation");
  }

  @BeforeTest //2
  public void beforeTest() {
	  System.out.println("this is before test annotation");
  }

  @AfterTest // 8
  public void afterTest() {
	  System.out.println("this is after test annotation");
  }

  @BeforeSuite // 1st executed in console
  public void beforeSuite() {
	  System.out.println("this is before suite annotation");
  }

  @AfterSuite // 9  to run test right click on @ then run as testng
  public void afterSuite() {
	  System.out.println("this is after suite annotation");
  }

}
// execution flow goes before then test annotation  than after
