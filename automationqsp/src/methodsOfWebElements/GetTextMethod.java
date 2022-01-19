package methodsOfWebElements;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please type the complete phone name : ");
		String phoneName = sc.nextLine();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
		
		
		driver.findElement(By.xpath("//button[.='✕']")).click();
		
		driver.findElement(By.name("q")).sendKeys("Samsung");
		
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	
		String priceOfSamsungPhone = driver.findElement(By.xpath("//div[.='"+phoneName+"']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
		
		System.out.println(priceOfSamsungPhone);

	}

}
