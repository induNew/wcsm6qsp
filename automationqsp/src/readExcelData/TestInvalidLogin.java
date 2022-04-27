package readExcelData;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestInvalidLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("http://laptop-smc8hiai/login.do");
		Thread.sleep(4000);

		Flib flib = new Flib();
		int rc = flib.rowCount("./data/TestDataNew.xlsx", "invaliddata");
		for(int i=1;i<=rc;i++) {
			String usernameData = flib.readExcelData("./data/TestDataNew.xlsx", "invaliddata", i, 0);
			String passwordData = flib.readExcelData("./data/TestDataNew.xlsx", "invaliddata", i, 1);

			driver.findElement(By.name("username")).sendKeys(usernameData);
			driver.findElement(By.name("pwd")).sendKeys(passwordData);
			driver.findElement(By.id("loginButton")).click();

			Thread.sleep(3000);
			driver.findElement(By.name("username")).clear();
		}


	}

}
