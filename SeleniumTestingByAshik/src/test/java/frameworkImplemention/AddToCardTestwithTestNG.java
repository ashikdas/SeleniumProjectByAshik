package frameworkImplemention;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCardTestwithTestNG {
	
	static WebDriver driver = null;
	
	@BeforeTest
	public static void SetUp(){
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test
	public static void AddToCardTest() throws InterruptedException{
		
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
		
		AddToCardObject.continueShoppingBtn(driver).click();
		
	}
	
	@AfterTest
	public static void TearDown(){
		
		driver.close();
		
	}

}
