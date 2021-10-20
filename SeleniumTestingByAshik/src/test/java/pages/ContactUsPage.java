package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContactUsPage {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		// Visit homepage
		driver.get("http://automationpractice.com");
		Thread.sleep(3000);
		
		// Click Contact Us
		driver.findElement(By.id("contact-link")).click();
		Thread.sleep(3000);
		
		//Select Subject Heading
		Select sub = new Select(driver.findElement(By.id("id_contact")));
		sub.selectByValue("2");
		Thread.sleep(2000);
		
		//Provide email
		driver.findElement(By.id("email")).sendKeys("meram56030@omibrown.com");
		Thread.sleep(2000);
		
		//Select Order reference
		driver.findElement(By.id("id_order")).sendKeys("IKKZSKAZH");
		Thread.sleep(2000);
		
		// Attach file
		driver.findElement(By.id("fileUpload")).sendKeys("C:\\Users\\ashik\\Downloads\\tiger.jpg");;
		Thread.sleep(2000);
		
		//Write Message
		driver.findElement(By.id("message")).sendKeys("hello hello");
		Thread.sleep(1000);
		
		// Click Send
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/fieldset[1]/div[2]/button[1]/span[1]")).click();
		Thread.sleep(3000);
		
		
		driver.quit();
//		//Select Order reference
//		Select order = new Select(driver.findElement(By.id("id_order")));
//		order.getFirstSelectedOption();
//		Thread.sleep(2000);

	}

}
