package Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.crome.driver","C://Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		Thread.sleep(3000);
		//child parent
		//find out rows of the table
		List<WebElement> Rows = driver.findElements(By.xpath("//table[@id = 'customers']/tbody/tr"));
		System.out.println("Row are " +Rows.size());
		
		List<WebElement> Colomns = driver.findElements(By.xpath("//table[@id = 'customers']/tbody/tr[1]/th"));
		System.out.println("Colomns are " +Colomns.size());
		
		//for specific data get
		WebElement Data =driver.findElement(By.xpath("//table[@id = 'customers']/tbody/tr[4]/td[1]"));
		System.out.print("Required data is " +Data.getText());
		
		
		//for all data get
		
		//for(WebElement row : Rows ) {
			//List<WebElement>all_cells = row.findElements(By.tagName("td"));
			//for(WebElement cell : all_cells) {
				//System.out.print(cell.getText() +"\t ");
			//}
			//System.out.println();
		for (int row=1;row<=Rows.size();row++) {
			for(int col=1;col<=Colomns.size();col++) {
				WebElement cell =driver.findElement(By.xpath("//table[@id = 'customers']/tbody/tr ["+ row +"] /* td["+ col +"]"));
				System.out.println(cell.getText());
				
				
			}
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		driver.quit();

	}

}
