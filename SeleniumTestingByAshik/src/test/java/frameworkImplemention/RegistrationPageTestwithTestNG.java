package frameworkImplemention;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationPageTestwithTestNG {
	static WebDriver driver = null;
	
	@BeforeTest
	public static void Setup(){
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test
	public static void RegistrationTest() throws InterruptedException{
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		Thread.sleep(3000);
		
		RegistrationPageObject.createAccount(driver).sendKeys("ashik@gmail.com");
		Thread.sleep(2000);
		
		RegistrationPageObject.createAccountButton(driver).click();
		Thread.sleep(3000);
		
		RegistrationPageObject.selectGender(driver).click();
		
		RegistrationPageObject.firstName(driver).sendKeys("Ashik");
		
		RegistrationPageObject.lastName(driver).sendKeys("Das");
		
		RegistrationPageObject.password(driver).sendKeys("12345");
		
		RegistrationPageObject.day(driver).selectByValue("15");
		
		RegistrationPageObject.month(driver).selectByValue("8");
		
		RegistrationPageObject.year(driver).selectByValue("1996");
		
		RegistrationPageObject.checkBox_1(driver).click();
		
		RegistrationPageObject.checkBox_2(driver).click();
		
		RegistrationPageObject.firstName(driver).sendKeys("Ashik");
		
		RegistrationPageObject.lastName(driver).sendKeys("Das");
		
		RegistrationPageObject.address_1(driver).sendKeys("87");
		
		RegistrationPageObject.address_2(driver).sendKeys("Rajarbagh");
		
		RegistrationPageObject.city(driver).sendKeys("Dhaka");
		
		RegistrationPageObject.state(driver).selectByValue("3");
		
		RegistrationPageObject.postCode(driver).sendKeys("12145");
		
		RegistrationPageObject.phoneNumber(driver).sendKeys("1234567890");
		
		RegistrationPageObject.fututeReference(driver).clear();
		RegistrationPageObject.fututeReference(driver).sendKeys("address 1");
		Thread.sleep(2000);
		
		RegistrationPageObject.registrationButton(driver).click();
	}
	
	@AfterTest
	public static void TearDown() throws InterruptedException{
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
