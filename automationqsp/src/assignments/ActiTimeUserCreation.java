package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeUserCreation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-smc8hiai/login.do");

		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.linkText("Users")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Create New User']")).click();
		Thread.sleep(4000);
		
		
		//form filling
		driver.findElement(By.name("username")).sendKeys("divya");
		driver.findElement(By.name("passwordText")).sendKeys("divya@1234");
		driver.findElement(By.name("passwordTextRetype")).sendKeys("divya@1234");
		driver.findElement(By.name("firstName")).sendKeys("divya");
		driver.findElement(By.name("lastName")).sendKeys("dharme");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@value,'Create')]")).click();
		
		
		
	
		


	}
}
