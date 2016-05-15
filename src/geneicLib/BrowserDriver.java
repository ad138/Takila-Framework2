package geneicLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserDriver {
	public static WebDriver driver;
	public static void getDriver(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Selenium Standalone Jar\\chromedriver.exe");
		driver=new ChromeDriver();
	}

}
