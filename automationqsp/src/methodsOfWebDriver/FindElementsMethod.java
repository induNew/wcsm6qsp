package methodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {
	
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement googleSearchBox = driver.findElement(By.name("q"));
		googleSearchBox.sendKeys("bike");
		Thread.sleep(8000);
		List<WebElement> suggessionOfBike = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
		
		// using for each loop
		for(WebElement option: suggessionOfBike)
		{
			String textToPrint = option.getText();
			Thread.sleep(2000);
			System.out.println(textToPrint);
		}
		
	}

}
