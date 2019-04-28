package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonLocators {
	
	WebDriver driver;
	
	public CommonLocators(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="div[class='O8ZS_U']>input")
	WebElement searchtextbox;
	
	@FindBy(css="button[class='vh79eN']")
	WebElement searchbutton;
	
	public WebElement entersearchtextbox()
	{
		return searchtextbox;
	}
	
	public WebElement clicksearchbutton()
	{
		return searchbutton;
	}
	
	

}
