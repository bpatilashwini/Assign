

 import junit.framework.Assert;

import org.apache.http.util.Asserts;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
 
public class Amazon_Search {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:/Users/Acer/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		driver.get("https://www.amazon.com/gp/gw/ajax/s.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("apple watch");
		driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
	    //driver.findElement(By.xpath(".//*[@id='refinements']/div[2]/ul[1]/li[1]/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id='result_0']/div/div/div/div[2]/div[1]/a/h2")).click();
	  
	   // WebElement ele =driver.findElement(By.xpath("https://images-na.ssl-images-amazon.com/images/I/31BuQz8zraL._AA160_.jpg']"));
	   
	  //*[@id="result_0"]/div/div[5]/span/span/a/i[1]
	  //*[@id="result_0"]/div/div[5]/span/span/a/i[1]/span
	    
	   // driver.findElement(By.xpath("//*[@id='result_0']/div/div[2]/div[1]/a/h2")).click();
	   // $x('//*[@id="result_0"]/div/div[2]/div[1]/a/h2')

	    
	    action.moveToElement(driver.findElement(By.xpath( "//*[@id='acrPopover']/span[1]/a/i[1]"))).click().build().perform();
	   String st =  driver.findElement(By.xpath("//*[@id='a-popover-content-1']/div/div/div/div[1]/span")).getText(); 
	    Assert.assertEquals("4.4 out of 5 stars",st);  
	   //if it passed assertion 
	    System.out.println("Test Passed");
	    
	    
	    
		
	  
		    
		  

	}

}
