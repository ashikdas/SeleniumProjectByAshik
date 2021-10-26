package frameworkImplemention;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckOutTestwithTestNG {
	
	static WebDriver driver = null;
	
	@BeforeTest
	public static void SetUp(){
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test
	public static void CheckOutTest() throws InterruptedException{
		
//		LoginPageTestwithTestNG login = new LoginPageTestwithTestNG();
//		login.LoginTest();
		
		// Login Process
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		LoginPageObject.username(driver).sendKeys("meram56030@omibrown.com");
		
		LoginPageObject.password(driver).sendKeys("12345");
		
		LoginPageObject.signInButton(driver).click();
		Thread.sleep(3000);
		
		//Add To Card Process
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(3000);
		
		AddToCardObject.product(driver).click();
		Thread.sleep(2000);
		
		AddToCardObject.quantity(driver).click();
		Thread.sleep(2000);
		
		AddToCardObject.size(driver).selectByValue("2");
		Thread.sleep(2000);
		
		AddToCardObject.color(driver).click();
		
		AddToCardObject.addToCardButton(driver).click();
		Thread.sleep(10000);
		
		// click continue shopping
		AddToCardObject.continueShoppingBtn(driver).click();
		
		CheckOutObject.cart(driver).click();
		Thread.sleep(3000);
		
		CheckOutObject.proceedToCheckoutButton(driver).click();
		Thread.sleep(3000);
		
		CheckOutObject.proceedToCheckoutFromAddress(driver).click();
		Thread.sleep(3000);
		
		CheckOutObject.termsOfService(driver).click();
		Thread.sleep(3000);
		
		CheckOutObject.proceedToCheckoutFromShipping(driver).click();
		
		// Payment Type
		CheckOutObject.payByBank(driver).click();
		
		CheckOutObject.confirmOrder(driver).click();
		
		CheckOutObject.backToOrder(driver).click();
			
	}

}
