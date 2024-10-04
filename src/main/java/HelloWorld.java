
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class HelloWorld {

	public static void main(String[] args) {
		
		ChromeOptions option =new ChromeOptions();
		option.addArguments("Start Maximised");
		
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.numpyninja.com/");
		
		WebElement frstNameEle = driver.findElement(By.name("first-name"));
		frstNameEle.sendKeys("vijaya");
	}

}
