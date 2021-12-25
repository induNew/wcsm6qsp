package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();//open browser
		Thread.sleep(6000);//delay of 6 seconds(wait for 6 sec)
		driver.close();// close browser
	}

}
