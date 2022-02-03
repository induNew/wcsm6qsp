package windowbasedpopups;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Upload {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://laptop-smc8hiai/login.do");
	
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Settings")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logo & Color Scheme")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("uploadNewLogoOption")).click();
		
        WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();
		
		Thread.sleep(4000);
		
		
		File flib = new File("./autoitscripts/uc1.exe");
		String abspath = flib.getAbsolutePath();
		Runtime.getRuntime().exec(abspath);
	}

}
