package App.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Basepackage.driverfactory;
import utilities.property;

public class Login {
	property properties=new property();
	driverfactory Browser=new driverfactory();
	public WebDriver driver;
	public Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@name='username']")
	WebElement Uname;
//	@FindBy(xpath="//button[@type=\"submit\"]")
//	WebElement next;
	@FindBy(xpath="//input[@name='password']")
	WebElement pword;
	@FindBy(xpath="//button[@type='submit']")
	WebElement login;
	public void username() throws IOException, InterruptedException
	{
	   Uname.sendKeys(properties.getdatafromproperty("username"));
	}

	public void password() throws IOException 
    {
	    pword.sendKeys(properties.getdatafromproperty("password"));
	}
    public void click() throws InterruptedException
    {
    	login.click();
    	Thread.sleep(4000);
    }

}
