package selenium;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab1{
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\eclipse-jee-2022-06-R-win32-x86_64\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//waits a specified time before throwing an exception if the element is not found
		
		driver.get("http://notatmrp.com/login");
		
		WebElement username = driver.findElement(By.id("email"));
		//a WebElement is an HTML element on a web site. 
		//It is the interface that allows Selenium code to interact with elements on web pages.
		username.isDisplayed();
		username.isEnabled();
		username.sendKeys("testing@notatmrp.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.isDisplayed();
		password.isEnabled();
		password.sendKeys("Testing@123");
		
		WebElement login = driver.findElement(By.id("submit"));
		login.isDisplayed();
		login.isEnabled();
		login.click();
		
	
		
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
	}
}