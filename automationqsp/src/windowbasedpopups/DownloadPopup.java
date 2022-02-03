package windowbasedpopups;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.omg.SendingContext.RunTime;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownloadPopup {
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/downloads");
		driver.findElement(By.linkText("4.1.2")).click();
		Thread.sleep(6000);
		
		File flib = new File("./autoitscripts/download1.exe");
		String abspath = flib.getAbsolutePath();
		Runtime.getRuntime().exec(abspath);
		
	}

}
