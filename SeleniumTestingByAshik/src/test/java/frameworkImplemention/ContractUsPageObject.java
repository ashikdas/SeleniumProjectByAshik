package frameworkImplemention;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ContractUsPageObject {
	
	private static WebElement locator = null;
	
	public static WebElement contractUs(WebDriver driver){
		locator = driver.findElement(By.id("contact-link"));
		return locator;
	}
	
	public static Select subjectHeading(WebDriver driver){
		Select heading = new Select(driver.findElement(By.id("id_contact")));
		return heading;
	}
	
	public static WebElement email(WebDriver driver){
		locator = driver.findElement(By.id("email"));
		return locator;
	}
	
	public static WebElement orderRefecence(WebDriver driver){
		locator = driver.findElement(By.id("id_order"));
		return locator;
	}
	
	public static WebElement attachFile(WebDriver driver){
		locator = driver.findElement(By.id("fileUpload"));
		return locator;
	}
	
	public static WebElement message(WebDriver driver){
		locator = driver.findElement(By.id("message"));
		return locator;
	}
	
	public static WebElement sendButton(WebDriver driver){
		locator = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/fieldset[1]/div[2]/button[1]/span[1]"));
		return locator;
	}

}
