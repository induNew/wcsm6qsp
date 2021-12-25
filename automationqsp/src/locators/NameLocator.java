package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/htmlwcsm6/LoginPage.html");
		Thread.sleep(5000);
		driver.findElement(By.name("n1")).sendKeys("admin");
		driver.findElement(By.name("n2")).sendKeys("manager");
	}

}
