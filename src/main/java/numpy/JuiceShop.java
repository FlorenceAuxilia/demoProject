package numpy;

import java.time.Duration;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import Utilities.LoggerLoad;

public class JuiceShop {

	public static String generateString() {
        String uuid = UUID.randomUUID().toString();
        //uuid = uuid.substring(0, Math.min(uuid.length(), 10));
      // System.err.println(uuid);
        return uuid;
    }  
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://juice-shop.herokuapp.com/#/");
		LoggerLoad.info("------------Testing Info-----------");
		driver.findElement(By.xpath("//a[text()='Me want it!']")).click();
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		driver.findElement(By.xpath("//span[text()=' Account '] ")).click();
		driver.findElement(By.id("navbarLoginButton")).click();
		driver.findElement(By.id("email")).sendKeys("auxilia06@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Test1234");
		driver.findElement(By.id("loginButton")).click();
		
		
		
		WebElement Element = driver.findElement(By.xpath("//div[text()=' Lemon Juice (500ml) ']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		driver.findElement(By.xpath("html[1]/body[1]/app-root[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-search-result[1]/div[1]/div[1]/div[2]/mat-grid-list[1]/div[1]/mat-grid-tile[11]/div[1]/mat-card[1]/div[2]/button[1]/span[1]/span[1]")).click();
		
		driver.findElement(By.xpath("(//span[text()='Add to Basket'])[11]")).click();
		
		Thread.sleep(2000);
		 Element = driver.findElement(By.xpath("//span[text()=' Your Basket']"));

		 js.executeScript("arguments[0].scrollIntoView();", Element);
		driver.findElement(By.xpath("//span[text()=' Your Basket']")).click();
		
		driver.findElement(By.xpath("(//button[@class='mat-focus-indicator mat-icon-button mat-button-base ng-star-inserted' ] )[2]")).click();
		driver.findElement(By.id("checkoutButton")).click();
		
		driver.findElement(By.xpath("//span[text()='Add New Address']")).click();
		//Add new Address
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String str =generateString();
		System.out.println(str);
		LoggerLoad.info("------------Testing Info-----------");
		driver.findElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c21-18']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c21-18']/input")).sendKeys("USAA");
		driver.findElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c21-19']")).click();
		driver.findElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c21-19']/input")).sendKeys("sadsdA");
		driver.findElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c21-20']")).click();
		driver.findElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c21-20']/input")).sendKeys("4568243442");
		driver.findElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c21-21']")).click();
		driver.findElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c21-21']/input")).sendKeys("231123");
		driver.findElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c21-22']")).click();
		driver.findElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c21-22']/textarea")).sendKeys("dsksfjksdjf45dhjbs");
		driver.findElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c21-23']")).click();
		driver.findElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c21-23']/input")).sendKeys("ssd");
		
		driver.findElement(By.xpath("//span[text()=' Submit ']")).click();
		driver.findElement(By.xpath("//span[@class='mat-radio-outer-circle']")).click();
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		
		driver.findElement(By.xpath("//label[@class='mat-radio-label']")).click();
		driver.findElement(By.linkText("Me want it!")).click();
	}

}
