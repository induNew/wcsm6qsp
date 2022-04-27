package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {
	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("http://laptop-smc8hiai/login.do");
		Thread.sleep(4000);
		
		Flib flib = new Flib();
		String usernameData = flib.readExcelData("./data/TestDataNew.xlsx", "validdata", 1, 0);
		String passwordData = flib.readExcelData("./data/TestDataNew.xlsx", "validdata", 1, 1);
		
		driver.findElement(By.name("username")).sendKeys(usernameData);
		driver.findElement(By.name("pwd")).sendKeys(passwordData);
		driver.findElement(By.id("loginButton")).click();
		
	}

}
