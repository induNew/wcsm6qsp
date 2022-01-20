package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		WebElement target = driver.findElement(By.xpath("//a[.='Rings ']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		Thread.sleep(4000);
	
		
		driver.findElement(By.xpath("//a[text()='Diamond' and @title='Diamond Rings']")).click();
		
	}
}
