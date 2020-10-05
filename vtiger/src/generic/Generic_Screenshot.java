package generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class Generic_Screenshot {

	public static String Screenshot(WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("./screenshot/images.png");
		String path = des.getAbsolutePath();
		FileUtils.copyFile(src, des);
		return path;
	
	}
}
