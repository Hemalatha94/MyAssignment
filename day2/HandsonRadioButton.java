package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandsonRadioButton {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Your most favorite browser
		driver.findElement(By.xpath("//table[@id='j_idt87:console1']/tbody[1]/tr[1]/td[4]/div[1]/div[2]/span[1]")).click();
		//selecting same checkbox anf verify it is unselected
		driver.findElement(By.xpath("//div[@id='j_idt87:city2']/div[1]/div[2]/div[1]/div[2]/span")).click();
		System.out.println("city is selected");
		//Unselcting the same optiona and checking the option is Unselected
		WebElement city = driver.findElement(By.xpath("//div[@id='j_idt87:city2']/div[1]/div[2]/div[1]/div[2]/span"));
		city.click();
		if(city.isSelected()) {
			System.out.println("city is selected");
		}
		else {
			System.out.println("city is unselected");
		}
		//default selector is enabled
		WebElement safari = driver.findElement(By.xpath("//table[@id='j_idt87:console2']/tbody[1]/tr[1]/td[3]/div/div[2]/span"));
		if(safari.isEnabled()) {
			System.out.println("safari enabled by default");
		}
		else {
			System.out.println("Safari not enabled by default");
			
		}
		WebElement Agegroup21to40 = driver.findElement(By.xpath("//div[@id='j_idt87:age']/div[1]/div[2]/div[1]/div[2]/span"));
		if(Agegroup21to40.isEnabled()){
			System.out.println("Age group 21-40 is Already enabled");
			
		}
		else {
			System.out.println("Age group 21-40 is Not selected");
			safari.click();
		}
	
		driver.close();
		
	}

}
