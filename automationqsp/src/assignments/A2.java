package assignments;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

////p[.='Java']/ancestor::div[contains(@class,'card-body')]/descendant::a[.='API Docs']
public class A2 {
	
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev");
		
		driver.findElement(By.xpath("//a[contains(.,'Read')]")).click();
		
		
		
		
		
		
		
	}
	
	
	

}
