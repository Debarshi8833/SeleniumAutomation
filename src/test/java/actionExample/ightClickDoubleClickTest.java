package actionExample;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ightClickDoubleClickTest {
    WebDriver driver;
    
    @BeforeTest
    public void loadPage() throws Exception {
         String url = "https://demo.guru99.com/test/simple_context_menu.html";
         driver = WebDriverManager.chromedriver().create();
         driver.get(url);
         driver.manage().window().maximize();
         Thread.sleep(1000);
         
    }
    
    @AfterTest
    public void closePage() throws Exception {
        Thread.sleep(3000);
        driver.close();
    }

    @Test (priority = -1)
    public void RightClickTest() throws Exception {
        
        
        WebElement rightButton = driver.findElement(By.xpath("//span[contains(text(),'right')]"));
        
        WebElement deleteButton = driver.findElement(By.xpath("//span[contains(text(),'Delete')]"));
        
        
        //Create an Object of Actions class
        
        Actions act = new Actions(driver);
        act.contextClick(rightButton).perform();
        
        Thread.sleep(1000);

        deleteButton.click();
        //act.click(deleteButton).perform();
        
        Thread.sleep(1000);
        
        //handle alert
        
        Alert promptAlert = driver.switchTo().alert();
      
        
        System.out.println("Alert Title: " + promptAlert.getText());
        
        //validation step
        Assert.assertTrue(promptAlert.getText().contains("delete"));
        
        promptAlert.dismiss();
        
        Thread.sleep(1000);
        
        
        
    }
    
    
   @Test(priority = 1)
  public void DoubleClickTest() throws Exception {
        
        
        WebElement doubleButton = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
        
        
        
        
        //Create an Object of Actions class
        
        Actions act1 = new Actions(driver);
        act1.doubleClick(doubleButton).perform();

        //deleteButton.click();
        //act.click(deleteButton).perform();
        
        //handle alert
        
        Alert promptAlert1 = driver.switchTo().alert();
      
        
        System.out.println("Alert Title: " + promptAlert1.getText());
        
        
        //validation step  ---- alert Text
        Assert.assertTrue(promptAlert1.getText().contains("double"));
        
        promptAlert1.dismiss();
        
        
        //dismiss
        
    }
    
    
}

