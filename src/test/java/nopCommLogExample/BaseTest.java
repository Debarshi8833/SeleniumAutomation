package nopCommLogExample;

import org.apache.log4j.Logger;

//import java.util.logging.Logger;

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
    	
    	log = Logger.getLogger("NOP Comm Application Module");
        PropertyConfigurator.configure(".\\testData\\log4j.properties");
        
        conf = new ReadConfig();
        
       // System.out.println("launching application");
        log.info("Application URL: "+ conf.get_NOP_URL());
        
        
        //create an Object on ReadConfig file
        
        // System.out.println(conf.get_NOP_URL());
        
        
        driver = WebDriverManager.chromedriver().create();
        driver.get(conf.get_NOP_URL());
        log.info("Application launched successfully into chrome browser "+ conf.get_NOP_URL());
        driver.manage().window().maximize();
        
    }
    
    @AfterTest
    public void closeApp() throws Exception {
        
        Thread.sleep(5000);
        driver.close();
       // System.out.println("closing application");
        log.info("closing application");
    }

}
