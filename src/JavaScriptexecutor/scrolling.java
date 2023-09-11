package JavaScriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com/doodles");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		for(;;) {
			try{
				driver.findElement(By.linkText("Lenka Franulic's 115th Birthday")).click();
				break;
			}catch(Exception e) {
				js.executeScript("window.scrollBy(0,500);", true);
			}
		}
		

	}

}
