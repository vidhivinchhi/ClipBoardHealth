package Clipboard.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	
	public static  WebDriver driver;
	
	public static  void initialization()
	{
		
		
		String os = System.getProperty("os.name");
		
		if (os.contains("Windows"))
		{
		System.setProperty("webdriver.chrome.driver", "C:/New/Automation/chromedriver.exe");
		}
		if (os.contains("Linux"))
		{
		System.setProperty("webdriver.chrome.driver", "/usr/bin/google-chrome/chromedriver.exe");
		}
		if (os.contains("MAC OS"))
		{
		System.setProperty("webdriver.chrome.driver", "/Applications/Google\\ Chrome.app/Contents/MacOS/Google\\ Chrome");
		}
		
			driver = new ChromeDriver();
		
		
	}

}
