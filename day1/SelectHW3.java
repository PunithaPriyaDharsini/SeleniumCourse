package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SelectHW3 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("test");
		WebElement fname=driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']"));
		fname.sendKeys("sss");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("s");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastNameLocal']")).sendKeys("s");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("IT");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("sdsa");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("as@gmail.com");
		//driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String title=driver.getTitle();
		System.out.println(title);
		fname.clear();
		fname.sendKeys("neww");
		driver.close();
		
		
		

	}

}
