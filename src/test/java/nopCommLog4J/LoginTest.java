package nopCommLog4J;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	
	@Test
    public void verifyLogin() throws Exception {
        
      //  System.out.println("login to nopComm Application");
        
        log.info("Clear the username field");
        log.warn("Clear the username field");
        log.error("Clear the username field");
        
        driver.findElement(By.xpath("//input[contains(@id,'Email')]")).clear();
        log.info("Enter the email: "+ conf.get_adminuser());
        
        driver.findElement(By.xpath("//input[contains(@id,'Email')]")).sendKeys(conf.get_adminuser());
        
        log.info("Clear the password field");
        driver.findElement(By.xpath("//input[contains(@type,'pass')]")).clear();
        log.info("Enter the password: "+ conf.get_adminPass());
        driver.findElement(By.xpath("//input[contains(@type,'pass')]")).sendKeys(conf.get_adminPass());
        
        log.info("Click on Login button");
        driver.findElement(By.xpath("//button[contains(text(),'Log')]")).click();
        
        Thread.sleep(4000);
        //validation step
      //  System.out.println("after sucessful login, application title is: " + driver.getTitle());
        log.info("after sucessful login, application title is: " + driver.getTitle());
        
        
        
        //click on Customer menu/item
        
        Thread.sleep(4000);
        log.info("Click on Customer Menu");
        driver.findElement(By.xpath("//a[@href=\"#\"]//child::p[contains(text(),'Customers')]")).click();
        
        Thread.sleep(4000);
        log.info("Click on Customer Menu Item");
        driver.findElement(By.xpath("//a[@href='/Admin/Customer/List']//child::p[contains(text(),'Customers')]")).click();
        ////a[contains(@href,'Admin/Customer/List')]//child::p[contains(text(),'Customers')]
        
        Thread.sleep(4000);
        //validation step
       // System.out.println("after clicking on Customer menu item, application title is: " + driver.getTitle());
        log.info("after clicking on Customer menu item, application title is: " + driver.getTitle());
        
        Thread.sleep(4000);
        log.info("Click on Logout button");
        driver.findElement(By.xpath("//a[contains(text(),'Log')]")).click();
        Thread.sleep(4000);
    }

}
