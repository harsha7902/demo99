package demo99.utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {

	public void waitForAnElement(WebElement element,WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void waitTillClickable(WebElement element,WebDriver driver) {				
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));			
		wait.until(ExpectedConditions.elementToBeClickable(element));			
	}

}
