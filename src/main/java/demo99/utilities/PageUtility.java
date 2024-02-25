package demo99.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	public void selectByVisibleText(WebElement element, WebDriver driver, String str) throws InterruptedException {																								
		Thread.sleep(1000);																							
		Select s = new Select(element);																							
		if(s.getOptions().size()>1) {																							
			s.selectByVisibleText(str);																						
		}																							
	}		

}
