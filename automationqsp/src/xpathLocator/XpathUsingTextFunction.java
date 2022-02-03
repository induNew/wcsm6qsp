package xpathLocator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingTextFunction {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='usernsjdjame']")).sendKeys("wdbbwdhbwd");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("manager");
		
		driver.findElement(By.xpath("//div[text()='Log In']")).click();
		
	}

}
