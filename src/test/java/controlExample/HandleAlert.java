package controlExample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleAlert extends BaseTest{
	
	@Test
    public void verifyPromptAlert() throws Exception {
        
        Thread.sleep(3000);
        //generate an alert
        
       driver.findElement(By.xpath("//button[contains(text(),'Prompt')]")).click();
        
       Alert promptAlert = driver.switchTo().alert();
       System.out.println("Text on Alert: " + promptAlert.getText());
       
       Thread.sleep(3000);
       
       Assert.assertEquals(promptAlert.getText(), "Your Name Please");
       
       Thread.sleep(2000);       
           
       promptAlert.sendKeys("Debarshi");
       
       Thread.sleep(4000);
       promptAlert.accept();
       
       
        Thread.sleep(3000);
       
              
        
    }

}
