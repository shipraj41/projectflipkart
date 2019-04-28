package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="div[class='_32LSmx']")
	WebElement loginpopup;
	
	@FindBy(linkText="Login & Signup")
	WebElement loginlink;
	
	@FindBy(css="input[class='_2zrpKA']")
	WebElement emailtextbox;
	
	@FindBy(css="button[class='_2AkmmA _1LctnI _7UHT_c']")
	WebElement continuebutton;
	
	@FindBy(xpath="//button[contains(text(),'Login with Password')]")
	WebElement loginwithpasswordbutton;
	
	@FindBy(css="input[class='_2zrpKA _3v41xv']")
	WebElement passwordtextbox;
	
	@FindBy(css="button[class='_2AkmmA _1LctnI _7UHT_c']")
	WebElement loginbutton;
	
	public WebElement clickloginlink()
	{
		return loginlink;
	}
	
	public WebElement enteremailtextbox()
	{
		return emailtextbox;
	}
	
	public WebElement clickcontinuebutton()
	{
		return continuebutton;
	}
	
	public WebElement clickloginwithpasswordbutton()
	{
		return loginwithpasswordbutton;
	}
	
	public WebElement enterpasswordtextbox()
	{
		return passwordtextbox;
	}
	
	public WebElement clickloginbutton()
	{
		return loginbutton;
	}
	
	public WebElement loginpopupdisplayed()
	{
		return loginpopup;
	}

}
