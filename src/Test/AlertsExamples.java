package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExamples {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.crome.driver","C://Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		Thread.sleep(3000);
		//accept
		WebElement Button1 = driver.findElement(By.id("alertButton"));
		Button1.click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(3000);
		alert.accept();
		
		//dismiss
		WebElement Button2 = driver.findElement(By.id("confirmButton"));
		Button2.click();
		Thread.sleep(6000);
		alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(3000);
		alert.dismiss();
		
		//scroll to button 2 due to element not visible
		WebElement Target = driver.findElement(By.id("confirmButton"));
		JavascriptExecutor obj = (JavascriptExecutor) driver;
		obj.executeScript("arguments[0].scrollIntoView();", Target);
		
		
		//PromptButton
		WebElement Button3 = driver.findElement(By.id("promtButton"));
		Button3.click();
		Thread.sleep(6000);
		alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(3000);
		alert.sendKeys("Yes I have accepted");
		alert.accept();
		
		
		
	}

}
