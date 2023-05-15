package Basepackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.Json;
import utilities.property;

public class Baseapp {
	public static WebDriver rdriver;
	public WebDriver driver;
	driverfactory Browser=new driverfactory();
	property properties=new property();
	Json json=new Json();
	
	//Login app=new Login(driver);
	@Parameters("Browser")
	@BeforeTest
	public void launchapp(String browser) throws IOException, InterruptedException
	{

		if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("IOS"))
		{
			WebDriverManager.safaridriver().setup();
			driver=new SafariDriver();
		}
		else {
			System.out.println("invalid Browser");
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@BeforeClass
		public void  config() throws IOException, ParseException
		{
		driver.get(json.getdatafromjson("url"));
		}

//	@AfterClass(alwaysRun=true)
//	public void teardown() {
//		driver.close();
//	}


}
