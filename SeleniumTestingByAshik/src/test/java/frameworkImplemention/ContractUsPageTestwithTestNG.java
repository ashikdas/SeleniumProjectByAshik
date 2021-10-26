package frameworkImplemention;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContractUsPageTestwithTestNG {
	
	static WebDriver driver = null;
	
	@BeforeTest
	public static void Setup(){
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test
	public static void ContractUsTest() throws InterruptedException{
		
		driver.get("http://automationpractice.com");
		Thread.sleep(3000);
		
		ContractUsPageObject.contractUs(driver).click();
		
		ContractUsPageObject.subjectHeading(driver).selectByValue("2");
		
		ContractUsPageObject.email(driver).sendKeys("ashik@gmail.com");
		
		ContractUsPageObject.orderRefecence(driver).sendKeys("IKKZSKAZH");
		
		ContractUsPageObject.attachFile(driver).sendKeys("C:\\Users\\ashik\\Downloads\\tiger.jpg");
		
		ContractUsPageObject.message(driver).sendKeys("Hello, I have some issue!");
		
		ContractUsPageObject.sendButton(driver).click();
		
	}
	
	@AfterTest
	public static void TearDown() throws InterruptedException{
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
