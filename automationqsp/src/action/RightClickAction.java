package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		WebElement target = driver.findElement(By.xpath("//span[contains(.,'Locate')]"));
		
		Actions act = new Actions(driver);
		act.contextClick(target).perform();//right click
		Thread.sleep(4000);
	
		
		
	}
}
