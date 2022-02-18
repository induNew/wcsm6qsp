package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome2 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");// to avoid IllegalStateException
		WebDriver driver = new ChromeDriver();//open the chrome browser
		driver.manage().window().maximize();//maximize the chrome browser
		driver.get("http://laptop-smc8hiai/login.do");//to launch the web app by sending url
	
		driver.findElement(By.xpath("//a[text()='License for using this software']")).click();
		
	
	} 
	
}


