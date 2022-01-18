package handlingTheDropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsUsingForLoop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/HP/Desktop/htmlwcsm6/singleSelectDropdown.html");
		WebElement element = driver.findElement(By.id("menu"));
		Select sel = new Select(element);
		
		List<WebElement> optionsOfDropdown = sel.getOptions();
		
		for(int i=0;i<optionsOfDropdown.size();i++)
		{
			String textOfOption = optionsOfDropdown.get(i).getText();
			System.out.println(textOfOption);
		}

	
	}

}
