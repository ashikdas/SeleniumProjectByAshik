package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AddToCard {
	
	public static void main(String[] args) throws InterruptedException {
		
		//setup
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();	
				
		// Visit homepage
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(3000);
				
		// Click a product
		driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/div[1]/a[1]/img[1]")).click();
		Thread.sleep(3000);
				
		// Increase quantity
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[4]/form[1]/div[1]/div[2]/p[1]/a[2]/span[1]")).click();
		Thread.sleep(2000);
				
		//Choose size
		Select size = new Select(driver.findElement(By.id("group_1")));
		size.selectByValue("2");
		Thread.sleep(2000);
				
		// Select color
		driver.findElement(By.id("color_8")).click();
		Thread.sleep(2000);
				
		// Add to cart
		driver.findElement(By.id("add_to_cart")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("body.product.product-2.product-blouse.category-7.category-blouses.hide-left-column.hide-right-column.lang_en:nth-child(2) div.header-container div.container div.row div.clearfix div.layer_cart_cart.col-xs-12.col-md-6 div.button-container:nth-child(5) span.continue.btn.btn-default.button.exclusive-medium > span:nth-child(1)")).click();
		
	}
}
