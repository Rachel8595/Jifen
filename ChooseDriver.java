package Login;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;  

public class ChooseDriver 
{
	
	 private WebDriver dr;  
     DesiredCapabilities browsers;  
     
     public WebDriver setUp(String browser,String nodeIp) {  
         if(browser.equals("ie")) browsers = DesiredCapabilities.internetExplorer();  
         else if(browser.equals("firefox")) browsers = DesiredCapabilities.firefox();  
         else if(browser.equals("chrome")) browsers = DesiredCapabilities.chrome();   
 
         try {
			dr = new RemoteWebDriver(new URL(nodeIp+"/wd/hub"),browsers);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
         return dr;
         //查看运行每个node的进程
        /* long id = Thread.currentThread().getId();
         System.out.println("Thread id is: " + id);*/
     }  
	   
	/*@Test  
	public void Local()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.2345.com/?kddff");
	}*/          
	   
}
