package handlingTheDropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingTheDropdown2 {
//Multiselect
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/HP/Desktop/htmlwcsm6/multiSelectDropdown.html");
		WebElement element = driver.findElement(By.id("menu"));
		Select sel = new Select(element);
		sel.selectByIndex(7);// index starts with zero 
		Thread.sleep(3000);
		sel.deselectByIndex(7);
		
		
	}

}
