package prectice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prectice {
  String url="https://rahulshettyacademy.com/AutomationPractice/";
  
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
