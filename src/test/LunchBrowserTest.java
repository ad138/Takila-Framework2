package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import geneicLib.BrowserDriver;
import pageObjectRepository.LoginToGmail;

public class LunchBrowserTest {
  @Test
  public void chromeBrowserTest() {
	  BrowserDriver.getDriver();
	  
	  LoginToGmail log=PageFactory.initElements(BrowserDriver.driver, LoginToGmail.class);
	  log.loginToGmail();
  }
}
