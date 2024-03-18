package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Editead {
	public static void main(String[] args) {
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
		// lead
		driver.findElement(By.xpath("(//div[@class='x-panel-header'])[2]/a")).click();
		//Create lead
		driver.findElement(By.xpath("(//a[text()='Create Lead'])")).click();
		//company name
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TCS");
		//firstname
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Hema");
		//lastname
		driver.findElement(By.xpath("//div[@class='fieldgroup-body']/table/tbody/tr[2]/td[4]/input")).sendKeys("Latha");
		//FirstName (Local) 
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Hemalocal");
		//Department Field Using any Locator of Your Choice.
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Dept");
		//Description Field
		driver.findElement(By.name("description")).sendKeys("Sample Tesleaf");
		//email 
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Sample@abc.com");
		//State/Province select drop down by visible text
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select province = new Select(state);
		province.selectByVisibleText("California");
		
		//Create Button click   
		driver.findElement(By.xpath("(//td[@colspan='4'])[8]/input")).click();
		
		//click edit button
		driver.findElement(By.xpath("(//div[@class='frameSectionExtra'])[2]/a[3]")).click();
		//Clear description
		driver.findElement(By.name("description")).clear();
		//Fill the Important Note Field with Any text
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("imp notes added");
		//Click on the update button
		
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		//get title
		System.out.println(driver.getTitle());
		//close
		driver.close();
	   

}



}