package frameworkImplemention;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTestwithTestNG {
	
	static WebDriver driver = null;
	
		@BeforeTest
		public static void SetUp(){
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		@Test
		public void LoginTest() throws InterruptedException{
			
			driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
			
			LoginPageObject.username(driver).sendKeys("meram56030@omibrown.com");
			
			LoginPageObject.password(driver).sendKeys("12345");
			
			LoginPageObject.signInButton(driver).click();
			Thread.sleep(3000);
			
		}
		
		@AfterTest
		public static void TearDown(){
			
			driver.close();
			System.out.println("Testing End");
			
		}

}
