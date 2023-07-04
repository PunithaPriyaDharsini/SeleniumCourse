package week3.day2.hw;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractice {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		Alert simplealert = driver.switchTo().alert();
		String simpletext = simplealert.getText();
		if(simpletext.contains("simple"))
		{
			System.out.println(simpletext);
		}
		simplealert.accept();
		WebElement simplesucess = driver.findElement(By.xpath("//span[contains(text(),'successfully')]"));
		String text1 = simplesucess.getText();
		System.out.println(text1);
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Alert confirmalert = driver.switchTo().alert();
		String confirmtext = confirmalert.getText();
		System.out.println(confirmtext);
		confirmalert.accept();
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Dismiss')]")).click();
		driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert alertpro = driver.switchTo().alert();
		alertpro.sendKeys("test");
		alertpro.accept();
		driver.close();
		
		
	}

}
