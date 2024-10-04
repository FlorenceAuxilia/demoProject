package numpy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.Test;


public class SauceDemo {
	
	
	static By userName=By.id("user-name");
	By password =By.id("password");
	By loginButton =By.id("login-button");
	
	public static void main(String args[]) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		WebElement uName = driver.findElement(userName);
		uName.sendKeys("standard_user");
		
		
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
		//Click Sauce Labs Bike Light
		driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']")).click();
		
		//Click Add to cart
		driver.findElement(By.id("add-to-cart")).click();
		
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		
		
		driver.findElement(By.id("checkout")).click();
		
		driver.findElement(By.id("first-name")).sendKeys("Florence");
		driver.findElement(By.id("last-name")).sendKeys("Emm");
		driver.findElement(By.id("postal-code")).sendKeys("85387");
		
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("finish")).click();
		
		WebElement finalText =driver.findElement(By.xpath("//h2[@class='complete-header']"));
		
		String fintex=finalText.getText();
		System.out.println(fintex);
		
		//Assert.assertEquals(fintex, "Thank you for your order!");
	}

}
