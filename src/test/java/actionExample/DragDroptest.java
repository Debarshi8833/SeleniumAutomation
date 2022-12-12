package actionExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDroptest {
	
	WebDriver driver;
	
	   public void loadPage() throws Exception {
	         String url = "https://www.globalsqa.com/demo-site/draganddrop/";
	         driver = WebDriverManager.chromedriver().create();
	         driver.get(url);
	         driver.manage().window().maximize();
	         Thread.sleep(1000);
	         
	    }
	    
	    @AfterTest
	    public void closePage() throws Exception {
	        Thread.sleep(5000);
	        driver.close();
	    }

	        
	    
	    @Test
	    public void dragdrop() throws Exception {
	        
	        
	        WebElement img3 = driver.findElement(By.cssSelector("img[src*='tatras3']"));
	        WebElement trash = driver.findElement(By.cssSelector("div#trash"));
	        
	        //Create an Object of Actions class
	        Actions act = new Actions(driver);
	        act.dragAndDrop(img3, trash).perform();

	        
	    }

}
