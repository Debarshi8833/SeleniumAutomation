package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadDataConfig {

	Properties prop;
	
	public ReadDataConfig() throws Exception {

		FileInputStream fis = new FileInputStream("./testData/config.properties");

		prop = new Properties();

		prop.load(fis);

	}
	
	public String getApp() {
		
		return prop.getProperty("hrm_app");
		
	}
	

}
