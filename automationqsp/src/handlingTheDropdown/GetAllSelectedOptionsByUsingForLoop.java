package handlingTheDropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionsByUsingForLoop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/HP/Desktop/htmlwcsm6/multiSelectDropdown.html");
		WebElement element = driver.findElement(By.id("menu"));
		Select sel = new Select(element);
		for(int i=3;i<=7;i++)
		{
			sel.selectByIndex(i);
		}
		List<WebElement> allSelectedOptions = sel.getAllSelectedOptions();
		
		for(int j=0;j<allSelectedOptions.size();j++)
		{
		String textOfSelectedOption = allSelectedOptions.get(j).getText();
		System.out.println(textOfSelectedOption);
		}
		
		
	
	}

}
