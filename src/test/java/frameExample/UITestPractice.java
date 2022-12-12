package frameExample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadConfig;

public class UITestPractice {
	
	public WebDriver driver;
    public ReadConfig conf;
	
	@Test
	public void launch_app() throws Exception {
		
		System.out.println("Launching Application");
		
		conf = new ReadConfig();
		driver = WebDriverManager.chromedriver().create();
		driver.get(conf.ui_practice_URL());
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[@class='']")).click();
		Thread.sleep(3000);
		
		WebElement heading = driver.findElement(By.xpath("//h4[@class='modal-title']"));
		System.out.println("The heading is: " + heading.getText());
		 Assert.assertEquals(heading.getText(), "Modal window demo");
		 
		 Thread.sleep(1000);
		 
		 WebElement body = driver.findElement(By.xpath("//*[@class='modal-body']"));
			System.out.println("The body is: " + body.getText());
			// Assert.assertEquals(body.getText(), "A modal dialog is a window that forces the user to interact with it before they can go back to using the parent application. It can be gmail or facebook authentication window also.");
			Assert.assertTrue(driver.getTitle().contains("A modal dialog is"));
			 driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			 
			 Thread.sleep(2000);
		 
		 
		
		
		
		
		
		
		
		
		
		
	}

}
	
