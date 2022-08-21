package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.crome.driver","C://Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		//Step 1-click date picker
		Thread.sleep(5000);
		WebElement datePicker = driver.findElement(By.id("dob"));
		datePicker.click();
		
		WebElement BMonth = driver.findElement(By.xpath("//select[@class = 'ui-datepicker-month']']"));
		Select Month = new Select(BMonth);
		Month.selectByVisibleText("Jan");
		
		WebElement BYear = driver.findElement(By.xpath("//select[@class = 'ui-datepicker-year']"));
		Select Year = new Select(BYear);
		Year.selectByVisibleText("1996");

		WebElement BDay = driver.findElement(By.xpath("//select[@class = '//a[@data-date = '1']']"));
		BDay.click();
		
		
		
		

	}

}
