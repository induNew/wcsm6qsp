package assignments;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

////p[.='Java']/ancestor::div[contains(@class,'card-body')]/descendant::a[.='API Docs']
public class ApiDocs {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the language name");
		String nameOfLanguage = sc.nextLine();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads");
		
		driver.findElement(By.xpath("//p[.='"+nameOfLanguage+"']/ancestor::div[contains(@class,'card-body')]/descendant::a[.='API Docs']")).click();
		
		
		
		
		
		
		
		
	}
	
	
	

}
