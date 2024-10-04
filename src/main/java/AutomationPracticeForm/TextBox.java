package AutomationPracticeForm;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
		
		driver.findElement(By.id("fullname")).sendKeys("Florence");
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("address")).sendKeys("1453 ,grayfox trl,surprise Az.");
		driver.findElement(By.id("password")).sendKeys("Test1234");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		driver.findElement(By.id("headingOne")).click();
		//Checkbox
		driver.findElement(By.xpath("//a[@href='check-box.php']")).click();
		driver.findElement(By.xpath("//li[@id='bs_1']/input[@type='checkbox']")).click();
		
		//RadioButton
		driver.findElement(By.xpath("//a[@href='radio-button.php']")).click();
		Boolean ena=driver.findElement(By.xpath("//input[@value='igottwo']")).isEnabled();
		System.out.println("yes is "+ena);
		 ena=driver.findElement(By.xpath("//input[@name='inlineRadioOptions']")).isDisplayed();
		 System.out.println("No  is "+ena);
		 driver.findElement(By.xpath("//input[@value='igottwo']")).click();
		 
		 
		 
	}

}
