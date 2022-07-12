package Clipboard.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage {

	
	@FindBy(xpath="/html/body/div[2]/div[2]/div[5]/div[4]/div[4]/div[45]/div/h1")
	WebElement AboutThisItem;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div[5]/div[4]/div[4]/div[45]/div/a")
	WebElement lnSeemoreDetails;
	
	
	public ProductDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
