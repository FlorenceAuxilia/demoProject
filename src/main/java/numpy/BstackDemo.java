package numpy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BstackDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://bstackdemo.com/signin");
		
		WebElement frstNameEle =driver.findElement(By.xpath("//div[@id='username']"));
		frstNameEle.click();
		//frstNameEle.sendKeys("demouser");
		driver.findElement(By.xpath("//div[text()='demouser']")).click();
		WebElement passwd =driver.findElement(By.xpath("//div[@id='password']"));
		passwd .click();
		passwd.findElement(By.xpath("//div[text()='testingisfun99']")).click();
		
		driver.findElement(By.xpath("//button[@id='login-btn']")).click();
	
		
		String title=driver.getTitle();
		System.out.println(title);
		//driver.manage().timeouts().implicitlyWait(Duration 5);
		//driver.findElement(By.xpath("//span[text()='Google']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='17']/div[text()='Add to cart']")).click();
		driver.findElement(By.xpath("//div[text()='Checkout']")).click();
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='firstNameInput']")).sendKeys("flor");
		driver.findElement(By.xpath("//input[@id='lastNameInput']")).sendKeys("Auxi");
		driver.findElement(By.xpath("//input[@id='addressLine1Input']")).sendKeys("Mcdowell road");
		driver.findElement(By.xpath("//input[@id='provinceInput']")).sendKeys("phoenix");
		driver.findElement(By.xpath("//input[@id='postCodeInput']")).sendKeys("85369");
		driver.findElement(By.xpath("//button[@id='checkout-shipping-continue']")).click();
		
		Thread.sleep(3000);
		String str=driver.findElement(By.xpath("//strong")).getText();
		
		System.out.println(str);
		
		driver.quit();
	}

}
