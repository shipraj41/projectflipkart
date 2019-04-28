package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import ObjectRepository.CommonLocators;

public class TestBase {

	WebDriver driver;
	public Properties prop;
	
	public WebDriver initializebrowser() throws IOException, InterruptedException
	{
		FileInputStream fis = new FileInputStream("/Users/shipra/projectflipkart/src/main/java/config/Config.properties");
		prop = new Properties();
		prop.load(fis);
		
		String browsername = prop.getProperty("browser");
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/Users/shipra/chromedriver");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		return driver;
	}
	
	public String initializeweburl()
	{
		String urlname = prop.getProperty("url");
		return urlname;
	}
	
	public void getscreenshot(String result) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("/Users/shipra/projectflipkart/Screenshots" + result + "/screenshot.png"));
		
		
	}
	
	
	
}
