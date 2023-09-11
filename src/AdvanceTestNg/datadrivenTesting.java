package AdvanceTestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class datadrivenTesting {
	@DataProvider(name="cred")
	public String[][] data(){
		String[][] arr= {
				{"admin","admin"},
				{"trainee","trainee"},
				{"Tejaswi","trainee"}
				
				
		};
		return arr;


		
}
	@Test(dataProvider="cred")
	public void fetching(String[][] credentails) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("");
	}
}
