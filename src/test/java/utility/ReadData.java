package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadData {

	public static void main(String[] args) throws IOException {
		
		
		// FileInputStream fis = new FileInputStream("C:\\Users\\Student\\eclipse-workspace\\Selenium_IBM_Debarshi\\testData\\config.properties");
	//	FileInputStream fis = new FileInputStream(".\\testData\\config.properties");
		FileInputStream fis = new FileInputStream("./testData/config.properties");
		

		Properties prop = new Properties();
		
		prop.load(fis);
		
		System.out.println("QA Path : " + prop.getProperty("appURL_QA"));
		System.out.println("QA Path : " + prop.getProperty("appURL_DEV"));
		
	}


}
