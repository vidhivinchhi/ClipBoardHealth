package Clipboard.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TVAudioCameramenuPage extends TestBase{

	
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/ul[9]/li[3]/a")
	WebElement mnTelevisions;
	
	
	public TVAudioCameramenuPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickTelevisions()
	{
		mnTelevisions.click();
	}
}
