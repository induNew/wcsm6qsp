package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		
		
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("laptop");
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Core i5']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='HP']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Windows 10']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//div[contains(text(),'4') and contains(text(),'above')]")).click();
		Thread.sleep(3000);
		

	}

}
