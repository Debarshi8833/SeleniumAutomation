package frameExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadConfig;

public class SeleniumActions {
	
	
	public WebDriver driver;
    public ReadConfig conf;
	
	@Test
	public void launch_app() throws Exception {
		
		System.out.println("Launching Application");
		
		conf = new ReadConfig();
		driver = WebDriverManager.chromedriver().create();
		driver.get(conf.get_selenium_URL());
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		WebElement actionsframe = driver.findElement(By.xpath("//*[@name = 'packageFrame']"));
		
		driver.switchTo().frame(actionsframe);
		
		driver.findElement(By.xpath("//a[contains(text(),'Actions')]")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
		WebElement performframe = driver.findElement(By.xpath("//*[@name = 'classFrame']"));
		
		driver.switchTo().frame(performframe);
		
			
		driver.findElement(By.xpath("//p[contains(text(),' Call')]//child::a[@href='#perform()']")).click();
		
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		
	}

}
