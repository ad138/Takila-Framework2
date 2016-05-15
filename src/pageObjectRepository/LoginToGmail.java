package pageObjectRepository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import geneicLib.BrowserDriver;
//my login gmail class
public class LoginToGmail {
	@FindBy(id="Email")
	private WebElement userName;
	
	@FindBy(id="next")
	private WebElement nextBtn;
	
	@FindBy (id="Passwd")
	private WebElement pwdEdit;
	
	@FindBy (id="signIn")
	private WebElement signinBtn;
	
	public void loginToGmail(){
		BrowserDriver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		BrowserDriver.driver.get("https://gmail.com");
		userName.sendKeys("seleniumocme");
		nextBtn.click();
		pwdEdit.sendKeys("justenter123");
		signinBtn.click();
	}
	

}
