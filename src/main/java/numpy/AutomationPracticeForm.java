package numpy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPracticeForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ChromeDriver driver =new ChromeDriver();
			driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
			
			driver.findElement(By.name("firstname")).sendKeys("Florence");
			driver.findElement(By.name("lastname")).sendKeys("Emm");
			driver.findElement(By.id("sex-1")).click();
			driver.findElement(By.id("exp-5")).click();
			driver.findElement(By.name("datepicker")).click();
			driver.findElement(By.name("datepicker")).sendKeys("12/09/2024");
			driver.findElement(By.id("profession-1")).click();
			driver.findElement(By.id("tool-1")).click();
			
			driver.findElement(By.id("continents")).click();
			driver.findElement(By.xpath("//option[text()='Europe']")).click();
			
			driver.findElement(By.xpath("//option[text()='Wait Commands']")).click();
			
//			WebElement fileInput = driver.findElement(By.cssSelector("input[type=file]"));
//			    fileInput.sendKeys(uploadFile.getAbsolutePath());
//			    driver.findElement(By.id("file-submit")).click();
//			
			
			
			
			
			
			
	}

}
