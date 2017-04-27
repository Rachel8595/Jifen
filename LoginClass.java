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

public class LoginClass 
{
	
	 private WebDriver dr;  
     DesiredCapabilities test;  
     String baseUrl;  
   
     @Parameters({"browser","nodeUrl","webSite"})  
     @BeforeTest 
     public void setUp(String browser,String nodeUrl,String webSite){  
         baseUrl = webSite;  
           
         if(browser.equals("ie")) test = DesiredCapabilities.internetExplorer();  
         else if(browser.equals("ff")) test = DesiredCapabilities.firefox();  
         else if(browser.equals("chrome")) test = DesiredCapabilities.chrome();  
         else System.out.println("browser��������ֻ��Ϊie�� ff��chrome");  
           
         String url = nodeUrl + "/wd/hub";  
         URL urlInstance = null;  
         try {  
             urlInstance = new URL(url);  
         } catch (MalformedURLException e) {  
             // TODO Auto-generated catch block  
             e.printStackTrace();  
             System.out.println("ʵ����url���������һ��url��ʽ�Ƿ���ȷ����ʽΪ��http://192.168.40.67:5555");  
         }  
         dr = new RemoteWebDriver(urlInstance,test);  
         dr.get(webSite);  
     }  
	   
	/*@Test  
	public void Local()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.2345.com/?kddff");
	}*/
	   
}