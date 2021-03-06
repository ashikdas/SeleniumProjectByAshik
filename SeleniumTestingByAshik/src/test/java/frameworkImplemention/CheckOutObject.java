package frameworkImplemention;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CheckOutObject {
	
private static WebElement locator = null;
	
	public static WebElement product(WebDriver driver){
		locator = driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/div[1]/a[1]/img[1]"));
		return locator;
	}
	
	public static WebElement quantity(WebDriver driver){
		locator = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[4]/form[1]/div[1]/div[2]/p[1]/a[2]/span[1]"));
		return locator;
	}
	
	public static Select size(WebDriver driver){
		Select size = new Select(driver.findElement(By.id("group_1")));
		return size;
	}
	
	public static WebElement color(WebDriver driver){
		locator = driver.findElement(By.id("color_8"));
		return locator;
	}
	
	public static WebElement addToCardButton(WebDriver driver){
		locator = driver.findElement(By.id("add_to_cart"));
		return locator;
	}
	
	public static WebElement continueShoppingBtn(WebDriver driver){
		locator = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/span[1]/span[1]"));
		return locator;
	}
	
	// Checkout Button from cart
	public static WebElement cart(WebDriver driver){
		locator = driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[3]/div[1]/a[1]"));
		return locator;
	}
	// Proceed to CheckOut button from Summary Page
	public static WebElement proceedToCheckoutButton(WebDriver driver){
		locator = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]/span[1]"));
		return locator;
	}
	// Proceed to CheckOut button from Address Page
	public static WebElement proceedToCheckoutFromAddress(WebDriver driver){
		locator = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]"));
		return locator;
	}
	
	public static WebElement termsOfService(WebDriver driver){
		locator = driver.findElement(By.id("cgv"));
		return locator;
	}
	
	// Proceed to CheckOut button from Shipping Page
	public static WebElement proceedToCheckoutFromShipping(WebDriver driver){
		locator = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]/span[1]"));
		return locator;
	}
	
	// Payment type
	public static WebElement payByBank(WebDriver driver){
		locator = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/p[1]/a[1]/span[1]"));
		return locator;
	}
	
	public static WebElement confirmOrder(WebDriver driver){
		locator = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]"));
		return locator;
	}
	
	public static WebElement backToOrder(WebDriver driver){
		locator = driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/p[1]/a[1]"));
		return locator;
	}
}
