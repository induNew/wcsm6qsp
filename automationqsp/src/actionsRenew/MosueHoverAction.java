package actionsRenew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MosueHoverAction {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
	
		Thread.sleep(4000);
		driver.findElement(By.id("denyBtn")).click();
		WebElement target = driver.findElement(By.xpath("//li[@class='menuparent repb']/a[contains(text(),'Ring')]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		
	}
	
	

}
