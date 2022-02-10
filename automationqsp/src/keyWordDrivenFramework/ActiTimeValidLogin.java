package keyWordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeValidLogin extends BaseTest{

	public static void main(String[] args) throws IOException {

		BaseTest bt = new BaseTest();
		Flib flib = new Flib();
		String username = flib.readPropertyData("./data/config.properties", "un");
		String password = flib.readPropertyData("./data/config.properties", "pass");
		bt.openBrowser();
		
		driver.findElement(By.name("username")).sendKeys(username);

		driver.findElement(By.name("pwd")).sendKeys(password);

		driver.findElement(By.id("loginButton")).click();
		//suraj


	}

}
