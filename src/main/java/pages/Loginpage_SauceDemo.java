package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Loginpage_SauceDemo {
	
	public static WebDriver driver;
	String url="https://www.saucedemo.com/";
	By userName=By.id("user-name");
	By password =By.id("password");
	By loginButton =By.id("login-button");
	
	
	
	public void Login()
	{
		driver = new ChromeDriver();
		driver.get(url);
		WebElement uName = driver.findElement(userName);
		uName.sendKeys("standard_user");
		driver.findElement(password).sendKeys("secret_sauce");
		driver.findElement(loginButton).click();
		
	}
	
	public static void main(String args)
	{
		Loginpage_SauceDemo obj =new Loginpage_SauceDemo();
		obj.Login();
	}
	
	
	
	
	
	
	
	
	
		
		

	}


