package frameworkImplemention;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	
	private static WebElement locator = null;
	
	public static WebElement username(WebDriver driver){
		locator = driver.findElement(By.id("email"));
		return locator;
	}
	
	public static WebElement password(WebDriver driver){
		locator = driver.findElement(By.id("passwd"));
		return locator;
	}
	
	public static WebElement signInButton(WebDriver driver){
		locator = driver.findElement(By.id("SubmitLogin"));
		return locator;
	}
	
}
