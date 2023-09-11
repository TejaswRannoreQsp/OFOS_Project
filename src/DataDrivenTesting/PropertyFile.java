package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./TestData/testdata.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String url = (String) prop.get("url");
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		

	}

}
