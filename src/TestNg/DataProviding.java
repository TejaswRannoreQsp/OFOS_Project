package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviding {
	@DataProvider(name="cred")
	public String[][] data(){
		String[][] sarr= {
				{"admin","admin"},
				{"trainer","trainer"},
				{"tejaswi","tejaswi"}
		};
		return sarr;
		
	}
	
	@Test(dataProvider="cred")
	public void Fetching(String[] Credentails) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys(Credentails[0]);
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys(Credentails[1]);
		
	}

}
