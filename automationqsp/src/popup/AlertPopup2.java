package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup2 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/HP/Desktop/wcsm5HtmlDocs/Alert.html");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[.='Try it']")).click();//popup is generated
		Alert al = driver.switchTo().alert();
		
		al.dismiss();//hit ok button //popup is closed
		

		String textIOfAlertPopup = al.getText();
		System.out.println(textIOfAlertPopup);

		
	
		
	}
}
