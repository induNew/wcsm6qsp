package bluestone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ParentFrameClass {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/HP/Desktop/LoginPage.html");
		
		driver.findElement(By.id("un")).sendKeys("suraj");
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("pwd")).sendKeys("sawant");//we are present in frame 0
		
		//i want to go to the parent
		driver.switchTo().parentFrame();
		
		driver.findElement(By.id("un")).clear();
		driver.findElement(By.id("un")).sendKeys("rupali");
		
		
	}

}
