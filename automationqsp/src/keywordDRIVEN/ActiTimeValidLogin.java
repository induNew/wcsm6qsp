package keywordDRIVEN;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeValidLogin  extends BaseTest{
	
	public static void main(String[] args) throws IOException {
		
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		Flib flib = new Flib();
		String username = flib.readPropertyData("./data/config.properties", "un");
		String password = flib.readPropertyData("./data/config.properties", "pass");
		
		driver.findElement(By.name("username")).sendKeys(username);

		driver.findElement(By.name("pwd")).sendKeys(password);

		driver.findElement(By.id("loginButton")).click();
		bt.closeBrowser();
		
		
	

		
	}
	
	

}
