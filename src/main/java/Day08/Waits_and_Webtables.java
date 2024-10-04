package Day08;



import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits_and_Webtables {
	

	public static void main(String[] args) {
		
		try {
			//waits();

			getTablevalues();	
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
private static void waits() throws InterruptedException {
	

		WebDriver driver = new ChromeDriver();	
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://google.com/ncr");
		driver.findElement(By.name("q")).sendKeys("Selenium" + Keys.ENTER);
		
		// Initialize and wait till element(link) became clickable - timeout in 5 seconds
		
		WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(5))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));
		
		
				
		WebElement myElement = new FluentWait<WebDriver>(driver).
				withTimeout(Duration.ofSeconds(5)).
				pollingEvery(Duration.ofMillis(100)).
				ignoring(ElementNotInteractableException.class).
				until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));
		
		// Print the first result
		System.out.println(firstResult.getText());
		firstResult.click();		
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(100))
				.ignoring(ElementClickInterceptedException.class)
				.ignoring(NoSuchElementException.class);
		
		
		// the below code is just a sample for fluent wait
		WebElement demo = wait.until(ExpectedConditions.elementToBeClickable(By.id("demo1")));
		demo.click();
		
		WebElement demo2 = wait.until(ExpectedConditions.elementToBeClickable(By.id("demo2")));
		demo2.click();
		
		
		//line 1
		
		Thread.sleep(2000); //static wait
		
		//line 2 - got failed 

		
	}

public static void getTablevalues () {
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
	
	 int rows =  driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
	 int cols = driver.findElements(By.xpath("//table[@id='customers']//tr[1]/th")).size();
	
	for(int row = 2; row<=rows; row++) {
		
		for (int col = 1; col<=cols ; col++) {
			
			String value = driver.findElement
					(By.xpath("//table[@id='customers']/tbody/tr["+row+"]/td["+col+"]")).getText();
			
			System.out.print(value +"    ");
		}	
		System.out.println();
	}
	
//	 int rows =  driver.findElements(By.xpath("//table[@summary='Sample Table']/tbody/tr")).size();
//	 int cols = driver.findElements(By.xpath("//table[@summary='Sample Table']/thead/tr[1]/th")).size();
//	
//	for(int row = 1; row<=rows; row++) {
//		
//		for (int col = 1; col<cols ; col++) {
//			
//			String value = driver.findElement
//					(By.xpath("//table[@summary='Sample Table']/tbody/tr["+row+"]/td["+col+"]")).getText();
//			
//			System.out.print(value +"    ");
//		}	
//		System.out.println();
//	}
	
	String value = "Vijay Arabia";
	
	try {
		WebElement we = driver.findElement(By.xpath("//table[@summary='Sample Table']//td/*[contains(text(),'"+value+"')]"));
		System.out.println("value Saudi Arabia is present in the webtable");

	}
	catch(Exception e) {
		//e.printStackTrace();
		System.out.println("value is not present in the webtable");	
	}
	System.out.println("i am with proceeding next test case");
	
	
	
}

}
