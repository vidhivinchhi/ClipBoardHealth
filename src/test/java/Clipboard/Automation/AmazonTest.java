package Clipboard.Automation;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AmazonTest extends TestBase{

	
     private HomePage homepage;
     public HamburgermenuPage hamburgermenu;
     public TVAudioCameramenuPage tvAudiocameramenupage;
     public SearchPage searchpage;
	 public SearchResultsPage searchresultspage;
	 public ProductDetailsPage productdetailspage;
	SoftAssert softAssert1 = new SoftAssert();
	
	
	
	public AmazonTest() throws InterruptedException, IOException
	{
		super();
	 initialization();
	 homepage=new HomePage(driver);   
    }
	
	
	@Test(priority=1)
	public void VerifyAmazonHomePageTitle() throws IllegalArgumentException, InterruptedException
	{
		homepage.gottoURL("https://www.amazon.in/");
		Assert.assertTrue(homepage.checkTitle("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"), "Home Page title is not displayed as expected.");
		Assert.assertTrue(homepage.mnhamburgerHomePage.isDisplayed(),"Hamburger Menu is not displayed.");
	    
	}
	
	@Test(priority=2)
	public void VerifyAmazonHomePageHamburgerMenuOptions() throws InterruptedException
	{
		homepage.clickHamburgerHomePage();	
	    hamburgermenu = new HamburgermenuPage(driver);
	    hamburgermenu.clickSpByTVAppEle();	
	    tvAudiocameramenupage=new TVAudioCameramenuPage(driver);
	    tvAudiocameramenupage.clickTelevisions();
	    searchpage=new SearchPage(driver);
	    searchpage.clickBranchSamsung();
	    Thread.sleep(2000);
	    
	}
	
	
	@Test(priority=3)
	public void VerifySearchpage() throws InterruptedException
	{
		searchresultspage= new SearchResultsPage(driver);
		searchresultspage.clickoptSort();
		Thread.sleep(2000);
		System.out.println("This is current url "+driver.getCurrentUrl());
		searchresultspage.clicksortByHightoLow();
		Thread.sleep(2000);
		
	}
	
	
	@Test(priority=4)
	public void VerifyProductDetailspage() throws InterruptedException
	{
		
		searchresultspage.clickonSecondSearchResult();
		Thread.sleep(3000);
		productdetailspage= new ProductDetailsPage(driver);
		String parentWindow= driver.getWindowHandle();
	      
	      Set<String> allWindows = driver.getWindowHandles();
	      for(String curWindow : allWindows){
	          driver.switchTo().window(curWindow);
	      }
	      
	      
	    		      
	      WebElement AboutThisItem = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[5]/div[4]/div[4]/div[45]/div/h1")); // Scroll down to see About this item section
	      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AboutThisItem);
	      
	     
	      Assert.assertTrue(AboutThisItem.isDisplayed(),"About this item section is not displayed");
	      
	      WebElement lnSeemoreDetails = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[5]/div[4]/div[4]/div[45]/div/a")); // Scroll down to see full bulletted list.
	      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", lnSeemoreDetails);
	      Thread.sleep(3000); 
	      List<WebElement> allElements = driver.findElements(By.xpath("/html/body/div[2]/div[2]/div[5]/div[4]/div[4]/div[45]/div/ul"));
	      System.out.println(allElements);

	      for (WebElement element2: allElements) {
	          System.out.println("\n This is Element text \n"+ element2.getText());
	                  
	      }
	}
	
	
	@Test(priority=5)
	public void CloseBrowser() throws InterruptedException
	{
		driver.quit();
	}
}
