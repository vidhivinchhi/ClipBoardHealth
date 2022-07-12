1. The framework is developemed with page object model concept.
2. In order to run autoamted tests through maven, please make sure, below system variables are set
   MAVEN_HOME = C:\apache-maven-3.8.4
   Add %MAVEN_HOME%\bin to Path variable on windows.
3. For windows, go to command prompt, change to current folder to autoamation and run "mvn clean install" to run framework from command line.
4. Below code handles requirement of running it on MAC OS and Linux but due to unavialablity of MAC and Linux platform, code isn't tested.

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
		System.setProperty("webdriver.chrome.driver", "/Applications/Google\\ Chrome.app/Contents/MacOS/Google\\ chromedriver.exe");
		}