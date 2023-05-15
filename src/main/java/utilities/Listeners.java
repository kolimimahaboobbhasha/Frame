package utilities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Basepackage.Baseapp;

public class Listeners implements ITestListener{
	ExtentSparkReporter Reporter;
	ExtentReports Report;
	ExtentTest Test;
	

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestStart(result);
		String Methodname=result.getMethod().getMethodName();
		Test=Report.createTest(Methodname);
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSuccess(result);
		String Methodname=result.getMethod().getMethodName();
		Test.log(Status.PASS, Methodname+"Test Success");
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailure(result);
		webdriver wd=new webdriver();
		JavaConstant JC=new JavaConstant();
		String Methodname=result.getMethod().getMethodName();
		String ScreenShot=Methodname+""+JC.getSystemDateInFormat();
		Test.log(Status.FAIL, Methodname+"Test Failed");
		Test.log(Status.FAIL, result.getThrowable());
	try 
	{
		String Path=wd.takeScreenShot(Baseapp.rdriver, ScreenShot);
		Test.addScreenCaptureFromBase64String(Path);
	}
		catch(IOException e)
	{
			e.printStackTrace();
	}
	}
		
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSkipped(result);
		String Methodname=result.getMethod().getMethodName();
		Test.log(Status.SKIP, Methodname+"Test Failed");
		Test.log(Status.SKIP, result.getThrowable());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedWithTimeout(result);
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onStart(context);
		 Reporter =new ExtentSparkReporter(System.getProperty("user.dir")+"/Extent/Report.html");
		 Reporter.config().setDocumentTitle("Application Execute report");
		Reporter.config().setTheme(Theme.STANDARD)	;
	
		Report=new ExtentReports();
		Report.attachReporter(Reporter);
		Report.setSystemInfo("Browser", "Firefox");
		Report.setSystemInfo("Reporter-Name", "Bhasha");
		Report.setSystemInfo("platform", "window");	
	}
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onFinish(context);
		Report.flush();
	}
}
