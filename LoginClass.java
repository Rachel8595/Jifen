package Login;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;  

public class LoginClass 
{
	private WebDriver dr;
	GetLocation get;
	
     /*@Parameters({"browser","nodeIp"})  
     @Test
     public void setUp(String browser,String nodeIp) {  
    	 
    	System.out.println(browser);
    	WebDriver dr = new ChooseDriver().setUp(browser, nodeIp);
        dr.get("http://jifen.2345.com/");     
     }*/  
     
     @BeforeTest
     public void setUp2()
     {
    	System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
    	dr = new ChromeDriver();
 		dr.get("http://jifen.2345.com/");
 		get=new GetLocation();
     }
     
     @Test
     public void login()
     {
    	 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 dr.findElement(get.get()).click();
     }
     
	   
	/*@Test  
	public void Local()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.2345.com/?kddff");
	}*/          
	   
}
