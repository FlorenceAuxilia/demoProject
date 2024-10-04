package numpy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TutorialsNinja {
	
	
	

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			ChromeDriver driver =new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
			driver.get("https://tutorialsninja.com/demo/");
			
			
		//2. Select the currency in the left top corner to Euro	
			WebElement objSelect=driver.findElement(By.xpath("//i[@class='fa fa-caret-down']"));
			objSelect.click();
			driver.findElement(By.xpath("//button[text()='€Euro']")).click();
			
			
			//			3. Try to order a canon EOS 5 D camera and collect 
			//			the error message occurred due to a
			//			bug in select option by clicking add to cart.----------Error
			
			driver.findElement(By.xpath("//a[text()='Cameras']")).click();
			driver.findElement(By.linkText("Canon EOS 5D")).click();
			driver.findElement(By.id("button-cart")).click();
			
			
			//WebElement  loc =driver.findElement(By.xpath("//div[@class='text-danger']"));
			//System.out.println(loc.getText());
			
//			4.Move to the home screen by clicking home icon, 
//		Click on iphone and go to details screen, change the quantity to two then add to cart.
			
			driver.findElement(By.xpath("//i[@class='fa fa-home']")).click();
			driver.findElement(By.linkText("Phones & PDAs")).click();
			driver.findElement(By.linkText("iPhone")).click();
			driver.findElement(By.id("input-quantity")).clear();
			driver.findElement(By.id("input-quantity")).sendKeys("2");
			driver.findElement(By.id("button-cart")).click();
			
						
		//5.	Print the success message in the console
		
			String str= driver.findElement(By.xpath("//span[@id='cart-total']")).getText();
			System.out.println(str);
			
			//6.Click on the cart icon (black color) in the right side top then click view cart
			driver.findElement(By.xpath("//a[@title='Shopping Cart']")).click();
			
			// 7.Change the quantity of iphone to 3 and click update button
			
			driver.findElement(By.xpath("//input[@value='2']")).sendKeys("3");
			//driver.findElement(By.name("//input[@value='2']")).sendKeys("3");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			//8. Print the Eco tax and VAT Amount in console and click Checkout button
			//Thread.sleep(2000);
			WebElement ecoTax = driver.findElement(
					By.xpath("(//strong[contains(text(), 'VAT')])[2]/../../td[2]"));
			String tx=ecoTax.getText();
			System.out.println("ECo tax :"+tx);
			String vat = driver.findElement(
					By.xpath("(//strong[contains(text(), 'VAT')])[2]/../../td[2]")).getText();
			System.out.println("Vat ammount : "+vat);
			
			driver.findElement(By.linkText("Checkout")).click();
			
			//9. Print the error message and remove the product from the cart
			//Thread.sleep(2000);
			String text =driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
			System.out.println(text);
			
			driver.findElement(By.xpath("//button[@data-original-title='Remove']")).click();
			
///			10. Move to the laptops screen and click on HP laptop, check the default quantity is 1 and
///			click add to cart then verify success message
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.linkText("Laptops & Notebooks")).click();
			driver.findElement(By.linkText("Show AllLaptops & Notebooks")).click();
			driver.findElement(By.linkText("HP LP3065")).click();
			WebElement qty=driver.findElement(By.id("input-quantity"));
			//qty.s
			
			driver.findElement(By.id("button-cart")).click();

//			11. Click on the shopping cart link in the top and apply ABCD123 as coupon code to check,
//			print error message
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@title='Shopping Cart']")).click();
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Use Coupon Code ']")).click();
			driver.findElement(By.id("input-coupon")).sendKeys("ABCD123");
			driver.findElement(By.id("button-coupon")).click();
			//Thread.sleep(2000);
			text =driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
			System.out.println(text);
			
			//12. Enter AXDFGH123 as gift certificate and perform apply to check, print error message
			driver.findElement(By.xpath("//a[text()='Use Gift Certificate ']")).click();
			driver.findElement(By.id("input-voucher")).sendKeys("AXDFGH123");
			driver.findElement(By.id("button-voucher")).click();
			Thread.sleep(2000);
			text =driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
			System.out.println(text);
			
			//13. Clear both textbox values and proceed to checkout
			driver.findElement(By.xpath("//a[text()='Use Coupon Code ']")).click();
			driver.findElement(By.id("input-coupon")).clear();
			driver.findElement(By.xpath("//a[text()='Use Gift Certificate ']")).click();
			driver.findElement(By.id("input-voucher")).clear();
			driver.findElement(By.linkText("Checkout")).click();
			
			//14. Select register account option and enter all account and billing details, click continue
			//Thread.sleep(2000);
			driver.findElement(By.id("button-account")).click();
			//reg details
			//Thread.sleep(2000);
			driver.findElement(By.id("input-payment-firstname")).sendKeys("Flor");
			driver.findElement(By.id("input-payment-lastname")).sendKeys("Emm");
			driver.findElement(By.id("input-payment-email")).sendKeys("Emm12221@gmail.com");
			driver.findElement(By.id("input-payment-telephone")).sendKeys("123123569");
			driver.findElement(By.id("input-payment-address-1")).sendKeys("123 susex trl ");
			driver.findElement(By.id("input-payment-city")).sendKeys("surprise ");
			driver.findElement(By.id("input-payment-postcode")).sendKeys("85387");
			driver.findElement(By.id("input-payment-password")).sendKeys("asdfge");
			driver.findElement(By.id("input-payment-confirm")).sendKeys("asdfge");
			Select drpCountry = new Select(driver.findElement(By.name("country_id")));
			drpCountry.selectByVisibleText("United States");
			//Thread.sleep(2000);
			Select drpState = new Select(driver.findElement(By.name("zone_id")));
			drpState.selectByVisibleText("Arizona");
			
			driver.findElement(By.name("agree")).click();
			driver.findElement(By.id("button-register")).click();
			
			//Thread.sleep(2000);
			driver.findElement(By.id("button-shipping-address")).click();
			//Thread.sleep(2000);
			driver.findElement(By.id("button-shipping-method")).click();
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='agree']")).click();
			driver.findElement(By.id("button-payment-method")).click();
			
			//Thread.sleep(2000);
			driver.findElement(By.id("button-confirm")).click();
		}
		
		

}
