package Clipboard.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase{
	
	
	@FindBy(xpath="/html/body/div[1]/header/div/div[5]/div[1]/a/i")
	WebElement mnhamburgerHomePage;
	

	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickHamburgerHomePage()
	{
		mnhamburgerHomePage.click();
	}
	
	
		

	public void gottoURL(String s) throws InterruptedException,IllegalArgumentException {
		driver.get(s);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}

	public boolean checkTitle(String s) {
		
		return driver.getTitle().equals(s);
	}
}
