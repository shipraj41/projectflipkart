package tests;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ObjectRepository.CommonLocators;
import ObjectRepository.HomePage;
import ObjectRepository.UserHomePage;
import util.TestUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginTest extends TestUtil{
	
	WebDriver driver;
	
	public static Logger log = LogManager.getLogger(LoginTest.class.getName());	
	@BeforeMethod
	public void openwebsite1() throws IOException, InterruptedException
	{
		driver = initializebrowser();
		driver.get(initializeweburl());
	}
	
	@Test
	public void logincheckandpagetitle() throws IOException, InterruptedException
	{
		
		String hometitle = driver.getTitle();
		System.out.println(hometitle);

		login(driver,"shipraj41@gmail.com","!njan019@");
		
		String logintitle = driver.getTitle();
		System.out.println(logintitle);
		
		AssertJUnit.assertEquals(hometitle, logintitle);
		}
		
	
	@Test(dependsOnMethods= {"logincheck"})
	public void checksearchfunction() throws IOException, InterruptedException
	{
		login(driver,"shipraj41@gmail.com","!njan019@");
		searchfunc(driver,"saree");
		
	}
	
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}

}
