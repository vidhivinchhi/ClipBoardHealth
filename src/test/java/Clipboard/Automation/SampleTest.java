package Clipboard.Automation;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {
	
	
	@Test
	public void Hello() throws InterruptedException
	{
		
		String os = System.getProperty("os.name");
		System.out.println("This is current "+ os);
		/*System.setProperty("webdriver.chrome.driver", "C:/New/Automation/chromedriver.exe");
		      WebDriver driver = new ChromeDriver();
		      String url = "https://www.amazon.in/";
		      driver.get(url);
		      Thread.sleep(2000);
		      
		      driver.manage().window().maximize();
		      driver.findElement(By.xpath("/html/body/div[1]/header/div/div[5]/div[1]/a/i")).click();  //Click on the hamburger menu in the top left corner.
		      Thread.sleep(2000);
		      System.out.println("This is the title after click" + driver.getTitle());
		      driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/ul[1]/li[16]/a/div")).click(); // Scroll own and then Click on the TV, Appliances and Electronics link under Shop by Department section.
		      Thread.sleep(2000);
		      driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/ul[9]/li[3]/a")).click(); // Then click on Televisions under Tv, Audio & Cameras sub section.
		      
		      WebElement Samsung = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[20]/ul/li[3]/span/a/span")); // Scroll down and filter the results by Brand �Samsung�.
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Samsung);
		      Thread.sleep(3000); 
		      Samsung.click();   //Click on Samsung
		      
		      
		      driver.findElement(By.xpath("/html/body/div[1]/div[2]/span/div/h1/div/div[2]/div/div/form/span/span/span/span/span[2]")).click(); // Sort the Samsung results with price High to Low.
		      driver.findElement(By.xpath("/html/body/div[4]/div/div/ul/li[3]/a")).click();     // 
		      
		      Thread.sleep(2000);
		      
		      driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div[2]/div[1]/h2/a/span")).click();  // Click on 2nd highest in the result
		      
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
		      */
		      
		     // driver.close();
	}

}
