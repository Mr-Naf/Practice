package prectice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class prectice {
   static String url="https://rahulshettyacademy.com/AutomationPractice/";
  
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			driver.get(url);
			
			WebElement radioButton = driver.findElement(By.xpath("//input[@type='radio' and @value='radio2']"));
			radioButton.click();
			
			// Type into the Suggession box
			WebElement Suggession = driver.findElement(By.id("autocomplete"));
			Suggession.sendKeys("Sri");
			//
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        List<WebElement> suggestions = wait.until(
		        		ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(".ui-menu-item")));
            // find the element usinf  enhanced for loop
	        for (WebElement suggestion : suggestions) {
	            if (suggestion.getText().equalsIgnoreCase("Sri Lanka")) {
	                suggestion.click();
	                break;
	            }
	        }



		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
