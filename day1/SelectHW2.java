package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectHW2 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("tester");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("India");
		driver.findElement(By.xpath("//input[@id='annualRevenue']")).sendKeys("10l");
		WebElement industry=driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select indus=new Select(industry);
		indus.selectByVisibleText("Computer Software");
		WebElement owner=driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select Ownership=new Select(owner);
		Ownership.selectByVisibleText("S-Corporation");
		WebElement source=driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		Select source1=new Select(source);
		source1.selectByValue("LEAD_EMPLOYEE");
		WebElement market=driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		Select market1=new Select(market);
		market1.selectByIndex(5);
		WebElement state=driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
		Select state1=new Select(state);
		state1.selectByValue("TX");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		
		
		
		
		//driver.close();
	}

}
