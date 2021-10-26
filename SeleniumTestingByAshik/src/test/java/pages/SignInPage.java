package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignInPage {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		// Visit Sign In Page
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		Thread.sleep(3000);
		
		//Provide email to Login
		driver.findElement(By.id("email")).sendKeys("meram56030@omibrown.com");
		Thread.sleep(2000);
				
		//Provide Password 
		driver.findElement(By.id("passwd")).sendKeys("12345");
		Thread.sleep(2000);
		
		//Click Sign In Button
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]")).click();
		Thread.sleep(3000);
		
		driver.quit();

	}

}
