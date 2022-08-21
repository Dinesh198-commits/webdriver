package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.crome.driver","C://Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		Thread.sleep(3000);
		WebElement From = driver.findElement(By.xpath("//li[@id = 'credit2']/a"));
		WebElement To = driver.findElement(By.xpath("//ol[@id = 'bank']/li"));
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(From, To).build().perform();
		Thread.sleep(4000);
		driver.close();
		
		
		//scrolling operation
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(4000);
		
		driver.quit();
	}

}
