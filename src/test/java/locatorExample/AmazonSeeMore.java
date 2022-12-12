package locatorExample;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonSeeMore {

		
	@Test
	public void amazonSeeMore() throws Exception {
		
		WebDriver driver = WebDriverManager.chromedriver().create();
		
		//WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//h2[text()='Shop for your baby by age']//parent::div//following-sibling::div[@class='a-cardui-footer']//child::a[contains(text(),'See')]")).click();
		Thread.sleep(8000);
		
				
	}

}
