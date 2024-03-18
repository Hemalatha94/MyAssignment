package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandsonCheckbox {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		//basic checkox
		driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget']/div)[2]")).click();
		//Notification checkbocx
		driver.findElement(By.xpath("(//div[contains(@id,'j_idt87:j_idt91')]/div)[2]")).click();
		//message is displayed.
		WebElement checked = driver.findElement(By.xpath("//span[@class='ui-growl-title']"));
		String message = checked.getText();
		if(message.contains("Checked")) {
			System.out.println("Notification checkbox checked and displayed as checked");
		}
		else {
			System.out.println("Notification checkboxis not checked and message not displayed");
		}
		
		
		driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[1]/div[2]")).click();
		//tri state
		WebElement tristate = driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']/div[2]"));
		tristate.click();
		Thread.sleep(2000);
		System.out.println(tristate.isSelected());
		if(!tristate.isSelected()) {
			System.out.println("Tri state selected");
		}
		else {
			System.out.println("Tristate not selected ");
		}
		//
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		if(driver.findElement(By.xpath("//div[@role='alert']")).isDisplayed()) {
			System.out.println("Alert displayed fr tggleswitch");
			
		}
		else {
			System.out.println("Alert Not displayed for toggle switch");
		}
		//checknox disbaed
		if(driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[3]")).isEnabled()) {
			System.out.println("checkbox is enabled");
		}
		else {
			System.err.println("checkbox disabled");
		}
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s']")).click();
		Thread.sleep(2000);
		List<WebElement> place = driver.findElements(By.xpath("//ul[contains(@class,'selectcheckboxmenu-list ui-widget-content ui-widget ui-corner-all ui-helper-reset')]//label"));
		for (int i = 0; i < place.size(); i++) {
			String text = place.get(i).getText();
			System.out.println(text);
			if(text.equals("London")) {
				driver.findElement(By.xpath("((//label[text()='London'])[2]/preceding::div)[last()]")).click();
			break;	
			}
			
		}
		driver.findElement(By.xpath("//a[@class='ui-selectcheckboxmenu-close ui-corner-all']")).click();
		driver.close();
		
	}
	}
	
		
		
		
		
		
		
		//driver.findElement(By.xpath("//input[contains(@class,'ui-inputfield ui-inputtext ui-widget ui-state-default')]")).sendKeys("London");
		
		
		
		
		//driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-items-wrapper']/ul/li/div/div[2]")).click();
		//driver.findElement(By.xpath("//a[@class='ui-selectcheckboxmenu-close ui-corner-all']")).click();
		//driver.close();
		


