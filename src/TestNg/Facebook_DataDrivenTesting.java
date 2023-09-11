package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Facebook_DataDrivenTesting {
	@DataProvider(name="reg")
	public String[][] register(){
		String[][] sarr= {
				{"Tejaswi","Rao","9916322820","Tejaswi@123"},
				{"abcd","def","896532140","abcg@123"},
				{"anu","radha","9916168569","anu@123"},
		};
		return sarr;
		
	}
	
	@Test(dataProvider="reg")
	public void data(String[] Register) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		driver.findElement(By.name("firstname")).sendKeys(Register[0]);
		Thread.sleep(1000);
		driver.findElement(By.name("lastname")).sendKeys(Register[1]);
		Thread.sleep(1000);
		driver.findElement(By.name("reg_email__")).sendKeys(Register[2]);
		Thread.sleep(1000);
		driver.findElement(By.name("reg_passwd__")).sendKeys(Register[3]);
	}
	

}
