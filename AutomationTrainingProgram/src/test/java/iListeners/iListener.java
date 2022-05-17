package iListeners;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import CommonCodeClass.Utility;

public class iListener extends Utility implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		this.driver = ((Utility)result.getInstance()).driver;
		Date dt = new Date(); // adds timestamp to differentiate between screenshots
		  System.out.println(dt);
		 String it = dt.toString().replace(" ", "_").replace(":", "_"); // converts date to string format and replacing formats
		  System.out.println(it); //added "+it+ to screenshot path for them to save into screenshots folder
		  
		  File Webshots = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //takes screenshot with file format // file in the beginning allows to save as a variable
		  try {
			FileHandler.copy(Webshots, new File("/Users/bilalazam/eclipse-workspace/AutomationTrainingProgram/Screenshots/passed/PicturesOfWeb"+it+".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //saves screenshot for further use in screenshots folder and transfers to local drive
	}	

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		this.driver = ((Utility)result.getInstance()).driver;
		Date dt = new Date(); // adds timestamp to differentiate between screenshots
		  System.out.println(dt);
		 String it = dt.toString().replace(" ", "_").replace(":", "_"); // converts date to string format and replacing formats
		  System.out.println(it); //added "+it+ to screenshot path for them to save into screenshots folder
		  
		  File Webshots = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //takes screenshot with file format // file in the beginning allows to save as a variable
		  try {
			FileHandler.copy(Webshots, new File("/Users/bilalazam/eclipse-workspace/AutomationTrainingProgram/Screenshots/failed/PicturesOfWeb"+it+".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //saves screenshot for further use in screenshots folder and transfers to local drive
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

}
