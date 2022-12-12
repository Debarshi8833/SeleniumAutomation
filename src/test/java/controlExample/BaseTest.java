package controlExample;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadConfig;

public class BaseTest {

	WebDriver driver;
    ReadConfig conf;
    //ctrl+Shoift+O ----- autoimport
    //pre-condition    ----- @BeforeSuite-----
    //Test
    //post-condition   ----- @AfterSuite
    
    
    @BeforeClass
    public void launchApp() throws Exception {
        
        System.out.println("launching application");
        
        
        //create an Object on ReadConfig file
        conf = new ReadConfig();
        System.out.println(conf.get_sample_URL());
        
        
        driver = WebDriverManager.chromedriver().create();
        driver.get(conf.get_sample_URL());
        driver.manage().window().maximize();
        
    }
    
    @AfterClass
    public void closeApp() throws Exception {
        
        Thread.sleep(5000);
        driver.close();
        System.out.println("closing application");
    }

}
