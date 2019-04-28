package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserSearchPage {
	
WebDriver driver;
	
	public UserSearchPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By firstproduct = By.xpath("(//img[@class='_3togXc'])[1]");
	

	public WebElement selectfirstproduct() {
		return driver.findElement(firstproduct);
	}

}
