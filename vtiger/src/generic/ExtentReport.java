package generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport {
	public static WebDriver driver;

	public static void testreport(ITestResult res) throws IOException {
		int result = res.getStatus();
		String path = Generic_Screenshot.Screenshot(driver);
		ExtentReports Ext = new ExtentReports("./reportss/testreport.html", false);

		ExtentTest test = Ext.startTest("regression test case");
		if (result == 1) {
			test.log(LogStatus.PASS, "test is passs");
		} else if (result == 2) {
			test.log(LogStatus.FAIL, path);
		} else if (result == 3) {
			test.log(LogStatus.SKIP, path);
		}

		Ext.endTest(test);
		Ext.flush();

	}

}
