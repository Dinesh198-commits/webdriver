package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.crome.driver","C://Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		Thread.sleep(3000);
		
//		WebElement Target = driver.findElement(By.xpath("//h2[text()='HTML Table Tags']"));
//		
//		JavascriptExecutor obj = (JavascriptExecutor) driver;
//		//Target page
//		obj.executeScript("arguments[0].scrollIntoView();", Target);
//		
//		//scroll up
//		
//		obj.executeScript("window.scrollTo(0, document.body.scrollHeight);");
//		
//		
//		//scroll down
//		obj.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
//		
		//page up page down through keys
		
		Actions action = new Actions(driver);
		
		//page up
		action.sendKeys(Keys.PAGE_UP).build().perform();		
		
		//page down
		action.sendKeys(Keys.PAGE_DOWN).build().perform();	
		
		
		//Go to end and start of page
		
		action.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		
		
		
		

	}

}
