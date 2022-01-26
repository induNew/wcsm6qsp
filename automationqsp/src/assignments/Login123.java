package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login123 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-smc8hiai/login.do");
		
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("admin");
		
		driver.navigate().refresh();
		
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("suraj");
		
		
		
		
		
	
	
		
		
	}

}
