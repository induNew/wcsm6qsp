package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign4 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-smc8hiai/login.do");
	
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Settings")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logo & Color Scheme")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("uploadNewLogoOption")).click();
	}

}
