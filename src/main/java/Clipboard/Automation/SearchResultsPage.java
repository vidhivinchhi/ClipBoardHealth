package Clipboard.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage extends TestBase{
	
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div[2]/div[1]/h2/a/span")
	WebElement SecondSearchResult;

	@FindBy(xpath="/html/body/div[1]/div[2]/span/div/h1/div/div[2]/div/div/form/span/span/span/span/span[2]")
	WebElement optSort;
	
	@FindBy(xpath="/html/body/div[4]/div/div/ul/li[3]/a") 
	WebElement sortByHightoLow;
	
	
	
	public SearchResultsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickoptSort()
	{
		optSort.click();
	}
	
	
	public void clicksortByHightoLow()
	{
		sortByHightoLow.click();
	}
	
	
	public void clickonSecondSearchResult()
	{
		SecondSearchResult.click();
	}
}
