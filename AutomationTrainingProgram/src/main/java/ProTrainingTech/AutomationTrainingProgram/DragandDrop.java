package ProTrainingTech.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/bilalazam/Downloads/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/");
		WebElement droppablelink = driver.findElement(By.linkText("Droppable"));
		droppablelink.click();
		driver.switchTo().frame(0); // switches to frame that allows the drag action on page. it is by index number it is the first frame so 0
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		Actions ob = new Actions(driver);
		ob.dragAndDrop(draggable, droppable).build().perform();
		driver.switchTo().parentFrame(); // allows to switch back to main frame of the page 
		WebElement sortable = driver.findElement(By.linkText("Sortable"));
		sortable.click();
		
		
		
		
		
		
		
		// iframe is html inside an html so a page inside a page 
	}

}
