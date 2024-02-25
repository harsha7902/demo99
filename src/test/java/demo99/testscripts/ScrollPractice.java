package demo99.testscripts;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class ScrollPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=500 "); 
		List<WebElement> value=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		for(int i=0; i<value.size(); i++) 
		{
			
			Integer.parseInt(value.get(i).getText());
			sum=sum+Integer.parseInt(value.get(i).getText());
		}
		
		System.out.println(sum);
//		 System.out.println(driver.findElement(By.cssSelector(".totalAmount")).getText()); we need to trim the total amount text
		int total=Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim()); 		
		Assert.assertEquals(sum, total);

	}
	
}
