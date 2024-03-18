package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Login
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		//CRM/SFA link
		driver.findElement(By.xpath("//div[@id='label']/a")).click();
		
		//click lead link
		driver.findElement(By.xpath("(//div[@class='x-panel-header'])[2]/a")).click();
		//click find lead
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		//click and enter phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneCountryCode")).clear();  //country codeclear default value
		driver.findElement(By.name("phoneCountryCode")).sendKeys("91"); //entered contry code
		driver.findElement(By.name("phoneAreaCode")).sendKeys("002");
		driver.findElement(By.name("phoneNumber")).sendKeys("9087812345");
		//click find lead
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//Capture the lead ID of the first resulting lead.
		Thread.sleep(5000);
		WebElement firstrec = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")); 
		String firstead = firstrec.getText();
		//Click the first resulting lead
		firstrec.click();
		
		
		//Click the "Delete" button.
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		//click find lead again
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//Enter the captured lead ID
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(firstead); // how to enter the captre lead id?
		//click find lead again
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//"No records to display" confirm
		WebElement firstafterdelete = driver.findElement(By.xpath("//div[text()='No records to display']")); 
		String deletelead = firstafterdelete.getText();
		if(deletelead.contains("No records to display")) {
			System.out.println("records deleted - No record error displayed");
		}
		else {
			System.out.println("record not deleted");
		}
		driver.close();


}
}