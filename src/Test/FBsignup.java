package Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBsignup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.crome.driver","C://Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		Thread.sleep(3000);
		
		//click on sign up link
		WebElement Signup_Link = driver.findElement(By.xpath("//a[@data-testid = 'open-registration-form-button']"));
		Signup_Link.click();
		WebElement FirstName = driver.findElement(By.xpath("//input[@name = 'firstname']"));
		WebElement SurName = driver.findElement(By.xpath("//input[@name = 'lastname']"));
		WebElement MobileNumber = driver.findElement(By.xpath("//input[@name = 'reg_email__']"));
		WebElement password = driver.findElement(By.xpath("//input[@name = 'reg_passwd__']"));
		
		FirstName.sendKeys("Dinesh");
		SurName.sendKeys("Kumar");
		MobileNumber.sendKeys("7742330462");
		password.sendKeys("@123erR");
		
		
		WebElement BDay = driver.findElement(By.name("birthday_day"));
		Select DDay = new Select(BDay);
		DDay.selectByVisibleText("15");
		
		WebElement BMonth = driver.findElement(By.name("birthday_month"));
		Select Month = new Select(BMonth);
		Month.selectByVisibleText("Jan");
		System.out.println("selected month is " + Month.getFirstSelectedOption().getText());
		
		WebElement BYear = driver.findElement(By.name("birthday_year"));
		Select Year = new Select(BYear);
		Year.selectByVisibleText("1990");
		
		//for all months print
		List<WebElement> TotalMonth = Month.getOptions();
		for(WebElement element : TotalMonth) {
			System.out.println(element.getText());
		}
		
		List<WebElement> TotalDay = DDay.getOptions();
		for(WebElement element : TotalDay) {
			System.out.println(element.getText());	
		}
		
		String Gender = "Custom";
		
		//Radio button selection old practice
		
		//WebElement Male = driver.findElement(By.xpath("//input[@type = 'radio' and @value = '2']"));
		//WebElement Female = driver.findElement(By.xpath("//input[@type = 'radio' and @value = '1']"));
		//WebElement Custom = driver.findElement(By.xpath("//input[@type = 'radio' and @value = '-1']"));
		
		//if(Gender.equals("Female")) {
			//Female.click();
			//System.out.println("Female button is select" +Female.isSelected());
		//}//else if (Gender.equals("Male")) {
			//Male.click();
			//System.out.println("Male button is select  " +Male.isSelected());
			//}
		//else {
			//Custom.click();
			//System.out.println("Custom button is select " +Custom.isSelected());
		//}
		
		//print all years
		List<WebElement> Years =Year.getOptions();
		for(WebElement elem1 : Years) {
			System.out.println(elem1.getText());
		}
		
		//best radio button selection practice
		
		//String Xpath = "//label[text() ='" +Gender+ "']/following-sibling::input";
		String Xpath = "//label[text() ='Placeholder']/following-sibling::input";
		String NewXpath = Xpath.replace("Placeholder", Gender);
		WebElement gender_radio = driver.findElement(By.xpath(NewXpath));
		gender_radio.click();
		
		
		
		
		
		
	
		
		
		
		

	}

}
