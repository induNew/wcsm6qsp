package dataDrivenFramewok;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeInvalidLogin {
	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("http://laptop-smc8hiai/login.do");
		
		Flib flib = new Flib();
		int rc = flib.getRowCount("./data/TestData.xlsx", "invalidcreds");
		
		for(int i=1;i<rc;i++)
		{
			String username = flib.readExcelData("./data/TestData.xlsx", "invalidcreds", i, 0);
			driver.findElement(By.name("username")).sendKeys(username);
			String password = flib.readExcelData("./data/TestData.xlsx", "invalidcreds", i, 1);
			driver.findElement(By.name("pwd")).sendKeys(password);
			Thread.sleep(3000);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			
			try
			{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.titleContains("Enter"));
			}
			catch (Exception e) {
				flib.writeExcelData("./data/TestData.xlsx", "invalidcreds", 1, 2, "pass");
			}
			
			
			driver.findElement(By.name("username")).clear();
			
			
			
			
		}
	
		
		
	}

}
