package Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.crome.driver","C://Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		//Step 1-click on log in link
		Thread.sleep(5000);
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();
		
		//step-2 Locate elements of login 
		WebElement UserName = driver.findElement(By.name("user_login"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement LoginButton = driver.findElement(By.name("btn_login"));
		
		
		//step-3 input value of elements
		UserName.sendKeys("kumar.indian777@gmail.com");
		password.sendKeys("*Dine22*");
		Thread.sleep(3000);
		
		//click on remember me button
		WebElement RButton = driver.findElement(By.className("rememberMe"));
	    RButton.click();
		
		
		
		//click on Login button
		LoginButton.click();
	    Thread.sleep(3000);
		
	    
	    //error verification
		WebElement Error = driver.findElement(By.id("msg_box"));
		String Actual_Error = Error.getText();
		String Expected_Error = "The email or password you have entered is invalid.";
		
		if (Actual_Error.equals(Expected_Error)) {
			System.out.println("Test is pass");
		}else {
			System.out.println("Test is fail");
		}
	
		//links find
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total Links are  " +links.size());
		for (int index = 0;index<links.size();index++) {
			System.out.println(links.get(index).getAttribute("href"));
		}
	
		//close the browser
		driver.close();
	}
	
}
