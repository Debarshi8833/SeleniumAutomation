package locatorExample;

import java.util.List;

//import java.awt.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HRMLoginTest {

	
		@Test
		public void verifyLogin() throws Exception {
			
			WebDriver driver = WebDriverManager.chromedriver().create();
			
			//WebDriver driver = new ChromeDriver();
			
			driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
			driver.manage().window().maximize();
			
			Thread.sleep(5000);
			WebElement txtUserName = driver.findElement(By.xpath("//input[@id='Email']"));
			
			txtUserName.clear();
		
			txtUserName.sendKeys("admin@yourstore.com");
			
						
			WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
			
			password.clear();
			
			password.sendKeys("admin");
			
			driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
			
			driver.findElement(By.className("buttons")).click();
			
			System.out.println(driver.getTitle());
	        System.out.println(driver.getCurrentUrl());
	        
	        Thread.sleep(5000);
	        
			driver.findElement(By.xpath("//a[@href=\"#\"]//child::p[contains(text(),'Customers')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@href=\"/Admin/Customer/List\"]//child::p[contains(text(),'Customers')]")).click();
			//driver.findElement(By.xpath("//a[@href=\"/Admin/Customer/List\"]/p")).click();
			System.out.println("Application Title is :" + driver.getTitle());
	        
	        Thread.sleep(5000);
			driver.findElement(By.linkText("Logout")).click();
						
			driver.close();
			
					
		}
	}


