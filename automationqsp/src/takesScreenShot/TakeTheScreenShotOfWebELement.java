package takesScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import com.google.common.io.Files;

public class TakeTheScreenShotOfWebELement {
	//way2 of taking screenshot
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		WebElement googleSearch = driver.findElement(By.name("q"));
		File src = googleSearch.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./screenshots/screenshot6OfTheWebelement.png");
		Files.copy(src,dest);
		

		
		

		
		
		
		
	}

}