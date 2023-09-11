package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Project {
	@Test
	public void Launching() {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://elftestingserver/domain/Online_Food_Ordering_System/login.php");
		
		driver.findElement(By.name("username")).sendKeys("Tejaswi");
		driver.findElement(By.name("password")).sendKeys("Tejaswi@123");
		driver.findElement(By.name("submit")).click();
		System.out.println(driver.getTitle());
	}

}
