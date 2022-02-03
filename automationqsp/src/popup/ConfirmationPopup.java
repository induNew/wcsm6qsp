package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/HP/Desktop/wcsm5HtmlDocs/Confirmation.html");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[.='I am Hungry']")).click();
		Alert al = driver.switchTo().alert();
		
		String textIOfAlertPopup = al.getText();
		System.out.println(textIOfAlertPopup);
		al.accept();//hit ok button

		
	
		
	}
}
