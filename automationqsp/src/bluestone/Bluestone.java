package bluestone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestone {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='chat-widget']"));
		driver.switchTo().frame(frameElement);
		driver.findElement(By.xpath("//p[.='Leave a message']")).click();
		
		
		driver.findElement(By.id("name")).sendKeys("suraj");
		driver.findElement(By.id("email")).sendKeys("sawantsuraj743@gmail.com");
		driver.findElement(By.xpath("//span[.='Phone']/ancestor::label[@class='lc-15z5qm9 e2zxkge0']/following-sibling::input")).sendKeys("49848454655");
		driver.findElement(By.xpath("//span[.='Subject:']/ancestor::label[@class='lc-15z5qm9 e2zxkge0']/following-sibling::input")).sendKeys("message to test frames");
		driver.findElement(By.xpath("//span[.='Message:']/ancestor::label[@class='lc-15z5qm9 e2zxkge0']/following-sibling::textarea")).sendKeys("message for bluestone");
		driver.findElement(By.xpath("//div[@class='lc-90q5um esv0owm0']/span")).click();
		
		
	
	}

}
