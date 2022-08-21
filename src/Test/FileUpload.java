package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.crome.driver","C://Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		Thread.sleep(3000);
		
		WebElement FileUpload = driver.findElement(By.id("uploadfile_0"));
		FileUpload.sendKeys("C:\\Users\\Admin\\Desktop\\mysql-init.txt");
		
		WebElement tnc = driver.findElement(By.id("terms"));
		tnc.click();
		
		WebElement submit = driver.findElement(By.id("submitbutton"));
		submit.click();
	}

}
