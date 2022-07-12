package Clipboard.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HamburgermenuPage extends TestBase {
	
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/ul[1]/li[16]/a/div")
	WebElement mnSpbyTVAppEle;
	
	
	public HamburgermenuPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void clickSpByTVAppEle()
	{
		
		mnSpbyTVAppEle.click();
	}

}
