package util;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import ObjectRepository.CommonLocators;
import ObjectRepository.HomePage;
import tests.TestBase;

public class TestUtil extends TestBase{
	
	
	public Boolean login(WebDriver driver, String username, String password) throws IOException, InterruptedException
	{
		
		boolean loginSuccessful = false;
		HomePage hp = new HomePage(driver);
		
		if(!hp.enterpasswordtextbox().isDisplayed())
		{
			hp.enteremailtextbox().sendKeys(username);
			hp.clickcontinuebutton().click();
		}
		else
		{
			hp.enteremailtextbox().sendKeys(username);
			hp.enterpasswordtextbox().sendKeys(password);
			hp.clickloginbutton().click();
		}
		
		loginSuccessful = !hp.loginpopupdisplayed().isDisplayed();
		//Assert.assertTrue(loginSuccessful);
		
		//System.out.println("user login successful");
		
		return loginSuccessful;
    }
	
	public void searchfunc(WebDriver driver,String searchitem) throws InterruptedException
	{
		CommonLocators cl = new CommonLocators(driver);
		cl.entersearchtextbox().sendKeys(searchitem);
		cl.clicksearchbutton().click();
		Thread.sleep(3000);
	}
	
	public void switchwindows(WebDriver driver,String pagetitle)
	{
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		while(it.hasNext())
		{
			String id = it.next();
			if(driver.getTitle().equalsIgnoreCase(pagetitle))
			{
				driver.switchTo().window(id);
			}
		
		}
	}
	
}
