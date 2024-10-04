package AutomationPracticeForm;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/links.php");
		
		driver.findElement(By.xpath("//a[text()='HomewPWPU']")).click();
		
	}

}
