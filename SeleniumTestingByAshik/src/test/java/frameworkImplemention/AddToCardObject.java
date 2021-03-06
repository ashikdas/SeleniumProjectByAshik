package frameworkImplemention;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddToCardObject {
	
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

}
