package testPageObjectModel;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadConfig;

public class BaseTest {

	WebDriver driver;
    ReadConfig conf;
    Logger log;
    //ctrl+Shoift+O ----- autoimport
    //pre-condition    ----- @BeforeSuite-----
    //Test
    //post-condition   ----- @AfterSuite
    
    
    @BeforeTest
    public void launchApp() throws Exception {
    	
    	log = Logger.getLogger("NOP Commerce Application Module");
    	PropertyConfigurator.configure(".\\testData\\log4j.properties");
    	
    	log.info("launching application");
    	
       // System.out.println("launching application");
        
        
        //create an Object on ReadConfig file
        conf = new ReadConfig();
       // System.out.println(conf.get_NOP_URL());
        log.info("Application URL "+ conf.get_NOP_URL());
        
        
        driver = WebDriverManager.chromedriver().create();
        driver.get(conf.get_NOP_URL());
        log.info("Application launched successfully in chrome browser "+ conf.get_NOP_URL());
        
        driver.manage().window().maximize();
        
    }
    
    @AfterTest
    public void closeApp() throws Exception {
        
        Thread.sleep(5000);
        driver.close();
        log.info("Closing Application");
        
       // System.out.println("closing application");
    }

}
