package Basepackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class driverfactory {
	
	public WebDriver driver;
	
//	public void setup(String browser)
//	{
//
//		if(browser.equalsIgnoreCase("firefox"))
//		{
//			WebDriverManager.firefoxdriver().setup();
//			driver=new FirefoxDriver();
//		}
//		else if(browser.equalsIgnoreCase("edge"))
//		{
//			WebDriverManager.edgedriver().setup();
//			driver=new EdgeDriver();
//		}
//		else if(browser.equalsIgnoreCase("chrome"))
//		{
//			WebDriverManager.chromedriver().setup();
//			driver=new ChromeDriver();
//		}
//		else if (browser.equalsIgnoreCase("IOS"))
//		{
//			WebDriverManager.safaridriver().setup();
//			driver=new SafariDriver();
//		}
//		else {
//			System.out.println("choose a Browser");
//		}
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		
//		}
//	public void Browserclose()
//	{
//		driver.close();
//	}
//	public void BrowserQuit()
//	{
//		driver.quit();
//	}
	

}
