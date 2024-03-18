package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandsonLeafGrdButn {
		public static void main(String[] args) {
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://leafground.com/button.xhtml");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//Click and Confirm title
			driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']/span")).click();
			//getitle and verify it is dashboard
			String actualTitle = driver.getTitle();
			String expectedTitle = "Dashboard";
			if(actualTitle.equals(expectedTitle)) {
				System.out.println("Title is Dashboard");
			}
			else {
				System.out.println("Title is not dashbard");
			}
			//Navgate back to the first screen
			driver.navigate().back();
			//Check if the button with the text ‘Confirm if the button is disabled’ is disabled
			WebElement button = driver.findElement(By.xpath("//button[@disabled='disabled']"));
			if(button.isEnabled()) {
				System.out.println("button is Enabled");
				button.click(); //click if it is enable
			}
			else {
				System.out.println("button is disabled");
			}
			//position of the button with the text ‘Submit'
			WebElement position = driver.findElement(By.xpath("//span[text()='Submit']/parent::button"));
			System.out.println(position.getLocation());
			//get colour of save
			WebElement colour = driver.findElement(By.xpath("//span[text()='Save']"));
			System.out.println(colour.getCssValue("color"));
			//get height and width
			WebElement higwid = driver.findElement(By.xpath("(//span[text()='Submit'])[2]/parent::button"));
			System.out.println("Height & width of thesubmit"+higwid.getSize());
			
			driver.close();
			
			
			
	}}


