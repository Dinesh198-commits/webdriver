package Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBlogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.crome.driver","C://Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		//Thread.sleep(3000);
		
		
		WebElement UserName = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.id("pass"));
		WebElement LoginButton = driver.findElement(By.name("login"));
		UserName.clear();
		UserName.sendKeys("kumar.indian777@gmail.com");
		password.clear();
		password.sendKeys("*67dkmk67*");
		Thread.sleep(3000);
		LoginButton.click();
		Thread.sleep(4000);
		//close the browser
		driver.close();

	}

}
