package Testcases;

import java.io.IOException;
@Listeners()

import org.testng.annotations.Test;

import App.pom.Login;
import Basepackage.Baseapp;

public class TC_Employee extends Baseapp{
	
	@Test
	public void emplogin() throws IOException, InterruptedException  {
	
		Login app=new Login(driver);
		app.username();
		app.password();
		app.click();
	}


}
