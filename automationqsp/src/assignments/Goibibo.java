package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibibo {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://www.goibibo.com");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//span[text()='From']/following-sibling::p")).click();
		driver.findElement(By.xpath("//span[text()='From']/following-sibling::input")).sendKeys("pune");
	
		driver.findElement(By.xpath("//p[text()='Pune Airport']/ancestor::div[@class='sc-jObWnj dmPlWU']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[text()='To']/following-sibling::p")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Banglore");
		driver.findElement(By.xpath("//p[contains(text(),'Beng')]/ancestor::div[@class='sc-jObWnj dmPlWU']")).click();
		
	
		driver.findElement(By.xpath("//div[contains(@aria-label,'Mar')]/p[.='19']")).click();
	
		driver.findElement(By.xpath("//span[.='Done']")).click();
		driver.findElement(By.xpath("//a[.='Done']")).click();
		driver.findElement(By.xpath("//span[text()='SEARCH FLIGHTS']")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//span[@class='font13 padL5 black']"));
		
		
		
		for(int i=0;i<list.size();i++)
		{
			String flightList = list.get(i).getText();
			System.out.println(flightList);
		}
	}

}
