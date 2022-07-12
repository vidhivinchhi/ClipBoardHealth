package Clipboard.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends TestBase{

	@FindBy(xpath="/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[20]/ul/li[3]/span/a/span")
	WebElement chkboxBranchSamsung;
	
	
	
	
	

	public SearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	

	public void clickBranchSamsung()
	{
		chkboxBranchSamsung.click();
	}
	
	
}
