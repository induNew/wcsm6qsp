package xpathLocator;

import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingDependentIndependentMethod {

	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please type the complete phone name : ");
		String phoneName = sc.nextLine();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");


		driver.findElement(By.xpath("//button[.='✕']")).click();

		driver.findElement(By.name("q")).sendKeys("Samsung");


		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();

		String priceOfSamsungPhone = driver.findElement(By.xpath("//div[.='"+phoneName+"']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
		System.out.println(priceOfSamsungPhone);
		String parentHandle = driver.getWindowHandle();
		driver.findElement(By.xpath("//div[.='SAMSUNG Galaxy F22 (Denim Black, 64 GB)']")).click();
		Thread.sleep(8000);


		Set<String> allhandles = driver.getWindowHandles();

		for(String wh:allhandles)
		{
			if(!wh.equals(parentHandle))
			{
				driver.switchTo().window(wh);
			}

		}

			driver.findElement(By.id("pincodeInputId")).sendKeys("411033");
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();



	}

}
