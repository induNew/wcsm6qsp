package javaScriptExecutorI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor1 {

	public static void main(String[] args) {
		//to handle the disabled element we need to use the JavaScriptExecutor(I)
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/HP/Desktop/htmlwcsm6/diabledTextBox.html");

		driver.findElement(By.id("i2")).sendKeys("admin");

		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("document.getElementById(\"i3\").value=\"manager\"");






	}

}
