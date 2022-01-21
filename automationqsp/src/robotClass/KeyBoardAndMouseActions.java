package robotClass;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

//abstract window tool kit
public class KeyBoardAndMouseActions {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.urbanladder.com");
		driver.findElement(By.id("search")).sendKeys("table");

		driver.findElement(By.xpath("//span[@class='search-icon icofont-search']")).click();
		
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[contains(.,'Close') and @class='close-reveal-modal hide-mobile']")).click();
		WebElement target = driver.findElement(By.xpath("//h2[@class='withsubtext']"));
		
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();
		
		
		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		
		driver.findElement(By.id("search")).clear();
		
		driver.findElement(By.id("search")).click();
		
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(4000);
		WebElement target2 = driver.findElement(By.xpath("//label[contains(.,'Exclude')]"));
	
		act.contextClick(target2).perform();
		Thread.sleep(4000);
		for(int i=0;i<9;i++)
		{
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
			Thread.sleep(3000);
		}
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		

		

	}
}
