package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunTimePolymorphismExampleToLaunchTheBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the browser name ");
		String browserValue = sc.nextLine();//taking the user input
		
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");//set the path of chromedriver executables(Avoid IllegalStateException)
			driver=new ChromeDriver();//open the chrome Browser
			driver.manage().window().maximize();//maximize the browser
			driver.get("https://www.google.com");//launch the web app with URL
			Thread.sleep(3000);//delay of 3 seconds
			driver.close();//close the browser
			
			
		}
		
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");//set the path of geckodriver executables(Avoid IllegalStateException)
			driver=new FirefoxDriver();//open firefox browser
			driver.manage().window().maximize();//maximize the browser
			driver.get("https://www.google.com");//launch the web app  with URL
			Thread.sleep(3000);//delay 
			driver.close();//close the browser
			
		}
		
		else
		{
			System.out.println("enter either chrome /firefox");
		}
	
	}

}
