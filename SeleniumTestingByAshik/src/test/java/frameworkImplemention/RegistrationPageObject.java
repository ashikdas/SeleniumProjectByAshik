package frameworkImplemention;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPageObject {
	
	private static WebElement locator = null;
	
	public static WebElement createAccount(WebDriver driver){
		locator = driver.findElement(By.id("email_create"));
		return locator;
	}
	
	public static WebElement createAccountButton(WebDriver driver){
		locator = driver.findElement(By.id("SubmitCreate"));
		return locator;
	}
	
	public static WebElement selectGender(WebDriver driver){
		locator = driver.findElement(By.xpath("//input[@id='id_gender1']"));
		return locator;
	}
	
	public static WebElement firstName(WebDriver driver){
		locator = driver.findElement(By.id("customer_firstname"));
		return locator;
	}
	
	public static WebElement lastName(WebDriver driver){
		locator = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
		return locator;
	}
	
	public static WebElement password(WebDriver driver){
		locator = driver.findElement(By.id("passwd"));
		return locator;
	}
	
	public static Select day(WebDriver driver){
		locator = driver.findElement(By.id("days"));
		Select days = new Select(locator);
		return days;
	}
	
	public static Select month(WebDriver driver){
		locator = driver.findElement(By.id("months"));
		Select months = new Select(locator);
		return months;
	}
	
	public static Select year(WebDriver driver){
		locator = driver.findElement(By.id("years"));
		Select years = new Select(locator);
		return years;
	}
	
	public static WebElement checkBox_1(WebDriver driver){
		locator = driver.findElement(By.xpath("//input[@id='newsletter']"));
		return locator;
	}
	
	public static WebElement checkBox_2(WebDriver driver){
		locator = driver.findElement(By.xpath("//input[@id='optin']"));
		return locator;
	}
	public static WebElement companyName(WebDriver driver){
		locator = driver.findElement(By.id("company"));
		return locator;
	}
	
	public static WebElement address_1(WebDriver driver){
		locator = driver.findElement(By.id("address1"));
		return locator;
	}
	
	public static WebElement address_2(WebDriver driver){
		locator = driver.findElement(By.id("address2"));
		return locator;
	}
	
	public static WebElement city(WebDriver driver){
		locator = driver.findElement(By.id("city"));
		return locator;
	}
	
	public static Select state(WebDriver driver){
		Select state = new Select(driver.findElement(By.id("id_state")));
		return state;
	}
	
	public static WebElement postCode(WebDriver driver){
		locator = driver.findElement(By.id("postcode"));
		return locator;
	}
	
	public static WebElement phoneNumber(WebDriver driver){
		locator = driver.findElement(By.id("phone_mobile"));
		return locator;
	}
	
	public static WebElement fututeReference(WebDriver driver){
		locator = driver.findElement(By.id("alias"));
		return locator;
	}
	
	public static WebElement registrationButton(WebDriver driver){
		locator = driver.findElement(By.cssSelector("body.authentication.hide-left-column.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-12 form.std.box div.submit.clearfix:nth-child(4) button.btn.btn-default.button.button-medium:nth-child(4) > span:nth-child(1)"));
		return locator;
	}

}
