package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectHW1 {

	public static void main(String[] args) {

ChromeDriver driver=new ChromeDriver();
driver.get("https://en-gb.facebook.com");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.findElement(By.xpath("//a[text()='Create new account']")).click();
driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Punitha");
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("s");
driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys("9884175755");
driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("helle");
WebElement date=driver.findElement(By.xpath("//select[@id='day']"));
Select date1=new Select(date);
date1.selectByValue("2");
WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
Select month1=new Select(month);
month1.selectByIndex(5);
WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
Select year1=new Select(year);
year1.selectByValue("1998");
driver.findElement(By.xpath("//label[text()='Female']")).click();
driver.close();





	}

}
