package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
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
		
		//Click Check out button
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]")).click();
		Thread.sleep(3000);
		
		// Proceed to check out
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]/span[1]")).click();
		Thread.sleep(3000);
		
		//Sign In process
		driver.findElement(By.id("email")).sendKeys("meram56030@omibrown.com");
		Thread.sleep(2000);

		driver.findElement(By.id("passwd")).sendKeys("12345");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]")).click();
		Thread.sleep(3000);
		
		// Don't make any change in Address section just click proceed to check out
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]")).click();
		Thread.sleep(3000);
		
		// Click Terms of service Checkbox
		driver.findElement(By.id("cgv")).click();
		Thread.sleep(2000);
		
		// Proceed to check out
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]/span[1]")).click();
		Thread.sleep(3000);
		
		// Click Payment type
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/p[1]/a[1]/span[1]")).click();
		Thread.sleep(3000);
		
		//Confirm Order
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]")).click();
		Thread.sleep(3000);
		
		// Click back to Orders
		driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/p[1]/a[1]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("header_logo")).click();
		Thread.sleep(3000);
		
		driver.quit();

	}
	
}
