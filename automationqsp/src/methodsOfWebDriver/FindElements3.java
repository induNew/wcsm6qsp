package methodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements3 {
	
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement googleSearchBox = driver.findElement(By.name("q"));
		googleSearchBox.sendKeys("bike");
		Thread.sleep(8000);
		List<WebElement> suggessionOfBike = driver.findElements(By.xpath("//div[@class='wM6W7d']/input"));
		
		for(int i=0;i<suggessionOfBike.size();i++)
		{
			WebElement option = suggessionOfBike.get(i);
			String textToPrint = option.getText();
			System.out.println(textToPrint);
		}
		
		
		
	}

}
