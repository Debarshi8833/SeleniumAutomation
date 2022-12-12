package locatorExample;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class HyrTutorial {

	
	@Test
	public void HyrTutorial() throws Exception {
		
			
			WebDriver driver = WebDriverManager.chromedriver().create();
			
			//WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");	
			driver.manage().window().maximize();
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//td[contains(text(), 'Helen')]//preceding-sibling::td//child::input[@type='checkbox']")).click();
			
			Thread.sleep(5000);
		
	}

}
