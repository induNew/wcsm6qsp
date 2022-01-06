package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign2 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-smc8hiai/login.do");
		String actualloginPageTitle = driver.getTitle();
		
		if(actualloginPageTitle.equals("actiTIME - Login"))
		{
			System.out.println("THE LOGIN PAGE TITLE IS VERIFIED !  TEST CASE IS PASSED");
		}
		
		else
		{
			System.out.println("THE LOGIN PAGE TITLE IS not VERIFIED !  TEST CASE IS FAILED");
		}
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(4000);
		
		String actualHomePageTitle = driver.getTitle();
		
		
		if(actualHomePageTitle.equals("actiTIME - Enter Time-Track"))
		{
			System.out.println("THE HOME PAGE TITLE IS VERIFIED ! TEST CASE IS PASSED");
		}
		
		else
		{
			
				System.out.println("THE HOME PAGE TITLE IS NOT  VERIFIED ! TEST CASE IS FAILED ");
			
		}
		
		
	}

}
