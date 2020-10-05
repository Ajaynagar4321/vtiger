package pom;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import generic.ExtentReport;
import generic.Generic_Screenshot;

public class BaseTest implements Auto_Constant {
	public WebDriver driver;
	ExtentReports Ext;
	ExtentTest test;

	@BeforeTest
	public void OpenAppln() {
		System.setProperty(Chrome_Key, Chrome_Value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Url);
		
	}

	@AfterMethod
	public void CloseAppln(ITestResult res) throws IOException {

		int result = res.getStatus();
		String tcname=res.getName();
		Ext = new ExtentReports("./reportss/testreport.html", false);

		test = Ext.startTest(tcname);
		
		System.out.println(result);
		String path = Generic_Screenshot.Screenshot(driver);

		if (result == 1) {
			test.log(LogStatus.PASS, "test is passs");
		} else if (result == 2) {	
			test.log(LogStatus.FAIL, test.addScreenCapture(path));
		} else if (result == 3) {
			test.log(LogStatus.SKIP,  test.addScreenCapture(path));
		}

	

		
		Ext.endTest(test);
		Ext.flush();
		driver.close();
	}

}
