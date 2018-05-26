package demo;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MavenTest {
	WebDriver driver;
	@BeforeMethod
	public void setUp(){
		
		driver=new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chrome driver\\chromedriver.exe");
		//driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	
	}
	@AfterMethod
	public void tearDown() throws Exception{
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Test
	public void m1(){
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Forgotten account?")).click();
	}
}
