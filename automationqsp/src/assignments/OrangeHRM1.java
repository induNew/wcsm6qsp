package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
		
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	
		driver.findElement(By.name("Submit")).click();
		
		driver.findElement(By.xpath("//b[text()='PIM']")).click();
		
		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
	
		driver.findElement(By.id("firstName")).sendKeys("nitin");
		
		driver.findElement(By.id("middleName")).sendKeys("abc");
		
		driver.findElement(By.id("lastName")).sendKeys("kumar");
		
		driver.findElement(By.id("employeeId")).clear();
		
		driver.findElement(By.id("employeeId")).sendKeys("6876");
		
		driver.findElement(By.id("btnSave")).click();
		
		
		
		
	}

}
