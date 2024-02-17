package selenium;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exp2{
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riyas\\eclipse\\jee-2021-12\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//waits a specified time before throwing an exception if the element is not found
		
		driver.get("https://practice.automationtesting.in/my-account/");
		
		WebElement username = driver.findElement(By.id("username"));
		//a WebElement is an HTML element on a web site. 
		//It is the interface that allows Selenium code to interact with elements on web pages.
		username.isDisplayed();
		username.isEnabled();
		username.sendKeys("tiet@gmail.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.isDisplayed();
		password.isEnabled();
		password.sendKeys("tiet@1234#");
		
		WebElement login = driver.findElement(By.name("login"));
		login.isDisplayed();
		login.isEnabled();
		login.click();
		
		WebElement dash = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[1]/a"));
		dash.click();
		
		WebElement shop = driver.findElement(By.xpath("//*[@id=\"menu-item-40\"]/a"));
		shop.click();
		
		WebElement java = driver.findElement(By.xpath("//*[@id=\"woocommerce_product_categories-2\"]/ul/li[3]/a"));
		java.click();
		
		WebElement book = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[1]/a[1]"));
		book.click();
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//WebElement quant = driver.findElement(By.className("input-text qty text"));
		//Select se = new Select(quant);
		//se.selectByValue("2");
		
		WebElement add = driver.findElement(By.xpath("//*[@id=\"product-170\"]/div[2]/form/button"));
		add.click();
		
		try {
			Thread.sleep(6000); 
		//Thread.sleep() is a wait command that tells the program to suspend execution for a specific condition or time.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement view = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/a"));
		view.click();
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
	}
}