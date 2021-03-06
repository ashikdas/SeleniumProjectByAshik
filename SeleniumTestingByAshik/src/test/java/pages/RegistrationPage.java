package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//setup
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		// Visit homepage
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(3000);
		
		//click Sign in button
//		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(2000);
		
//		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		//Provide email to register
		driver.findElement(By.id("email_create")).sendKeys("meram56030@omibrown.com");
		Thread.sleep(2000);
		
		//Click create account button
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(4000);

		// Select Gender
		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
		Thread.sleep(2000);
		
		// First Name
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Demo");
		Thread.sleep(2000);
		
		// Last Name
		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Name");
		Thread.sleep(2000);
		
		// Password
		driver.findElement(By.id("passwd")).sendKeys("12345");
		Thread.sleep(2000);
		
		
		// Select Date of Birth
		Select day = new Select(driver.findElement(By.id("days")));
		Thread.sleep(1000);
		day.selectByValue("15");
		Thread.sleep(2000);
		
		
		Select month = new Select(driver.findElement(By.id("months")));
		Thread.sleep(1000);
		month.selectByValue("8");
		Thread.sleep(2000);
		
		Select year = new Select(driver.findElement(By.id("years")));
		Thread.sleep(1000);
		year.selectByValue("1996");
		Thread.sleep(2000);
		
		// CheckBox-1
		driver.findElement(By.xpath("//input[@id='newsletter']")).click();
		Thread.sleep(2000);
		
		//CheckBox-2
		driver.findElement(By.xpath("//input[@id='optin']")).click();
		Thread.sleep(2000);
		
		// Give Company Name
		driver.findElement(By.id("company")).sendKeys("xyz");
		Thread.sleep(2000);
		
		// Address
		driver.findElement(By.id("address1")).sendKeys("53");
		Thread.sleep(2000);
		
		//Address 2
		driver.findElement(By.id("address2")).sendKeys("Rajarbagh");
		Thread.sleep(2000);
		
		// City
		driver.findElement(By.id("city")).sendKeys("Dhaka");
		Thread.sleep(2000);
		
		//Select State
		Select state = new Select(driver.findElement(By.id("id_state")));
		state.selectByValue("5");
		Thread.sleep(2000);
		
		// Post Code
		driver.findElement(By.id("postcode")).sendKeys("12145");
		Thread.sleep(2000);
		
		// Mobile Phone
		driver.findElement(By.id("phone_mobile")).sendKeys("123456789");
		Thread.sleep(2000);
		
//		// Assign an address alias for future reference.
//		driver.findElement(By.id("alias")).sendKeys("hello hello");
//		Thread.sleep(2000);
		
		// Click Register Button
		driver.findElement(By.cssSelector("body.authentication.hide-left-column.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-12 form.std.box div.submit.clearfix:nth-child(4) button.btn.btn-default.button.button-medium:nth-child(4) > span:nth-child(1)")).click();
		Thread.sleep(3000);
		
		driver.quit();

	}
	
}
