package actionsRenew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		Thread.sleep(4000);
		
		WebElement src = driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
		WebElement dest = driver.findElement(By.xpath("//ol[@Id='amt7']/descendant::li[@class='placeholder']"));
		
		
		Actions act = new Actions(driver);
		act.dragAndDrop(src, dest).perform();
		

	}

}
