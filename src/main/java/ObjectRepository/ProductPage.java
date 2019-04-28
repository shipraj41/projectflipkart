package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
	WebDriver driver;
	
	public ProductPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="button[class='_2AkmmA _2Npkh4 _2kuvG8 _7UHT_c']")
	WebElement buynowbutton;
	
	public WebElement clickbuynowbutton()
	{
		return buynowbutton;
	}

}
