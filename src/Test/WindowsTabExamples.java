package Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsTabExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.crome.driver","C://Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		Thread.sleep(3000);
		
		String ParentWindow = driver.getWindowHandle();
		System.out.println("Before clicking window my window is" +ParentWindow);
		
		WebElement Tab = driver.findElement(By.id("tabButton"));
		Tab.click();
		System.out.println("after clicking tab button");
		
		Set <String> allWindows =driver.getWindowHandles();
		for(String win : allWindows) {
			System.out.println(win);
			if(!win.equals(ParentWindow)) {
				driver.switchTo().window(win);
				}
			}
		WebElement childHeader = driver.findElement(By.id("sampleHeading"));
		System.out.println(childHeader.getText());

		driver.switchTo().window(ParentWindow);
				
	    WebElement WinBtn = driver.findElement(By.id("windowButton"));
	    WinBtn.click();
	    driver.quit();


			

		}
}
