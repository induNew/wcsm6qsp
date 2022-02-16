package keywordDRIVEN;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	static WebDriver driver;
	public void openBrowser() throws IOException
	{
		Flib flib = new Flib();
		String url = flib.readPropertyData("./data/config.properties", "url");
		String browserValue = flib.readPropertyData("./data/config.properties", "browser");
		if(browserValue.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.get(url);
		}

		else if(browserValue.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.get(url);
		}

		else
		{
			System.out.println("invalid optiuon");
		}

	}


	public void closeBrowser()
	{
		driver.quit();
	}

}
