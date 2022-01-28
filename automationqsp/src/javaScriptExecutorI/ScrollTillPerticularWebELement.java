package javaScriptExecutorI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTillPerticularWebELement {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev");
		Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//scroll till a perticular webelement
		
		WebElement news = driver.findElement(By.xpath("//h2[.='News']"));
		Point loc = news.getLocation();
		int xaxis = loc.getX();
		int yaxis=loc.getY();
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-100)+")");
	}

}
