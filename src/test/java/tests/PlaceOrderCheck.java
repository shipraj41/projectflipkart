package tests;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ObjectRepository.ProductPage;
import ObjectRepository.UserSearchPage;
import util.TestUtil;

public class PlaceOrderCheck extends TestUtil{

	WebDriver driver;
	
	@BeforeMethod
	public void openwebsite() throws IOException, InterruptedException
	{
		driver = initializebrowser();
		driver.get(initializeweburl());
	}
	
	@Test
	public void placeordercheck() throws IOException, InterruptedException
	{
		login(driver,"shipraj41@gmail.com","!njan019@");
		searchfunc(driver,"saree");
		UserSearchPage usp = new UserSearchPage(driver);
		usp.selectfirstproduct().click();
		String windowtitle = driver.getTitle();
		System.out.println(windowtitle);
		switchwindows(driver,windowtitle);
		ProductPage pp = new ProductPage(driver);
		pp.clickbuynowbutton().click();
		
	}
}
