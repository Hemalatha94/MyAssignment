package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCreateLeaf {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		// Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//to maximize the window
		driver.manage().window().maximize();
		//locate the username field and type the username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		//enter the password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		//Click Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//to verify the title 
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[contains(@id,'companyName')]")).sendKeys("Test");
		driver.findElement(By.xpath("//input[contains(@id,'firstName')]")).sendKeys("Hema");
		driver.findElement(By.xpath("//input[contains(@id,'lastName')]")).sendKeys("latha");
		driver.findElement(By.xpath("(//input[@name='companyName'])[1]")).sendKeys("Hema1");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.close();
		
				
	}

}
