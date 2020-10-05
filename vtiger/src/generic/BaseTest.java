package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest implements Auto_Constant {
	public WebDriver driver;
	@BeforeTest
	public void openBrowser()
	{
	System.setProperty(Chrome_Key,Chrome_Value);
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(Url);
	}
@AfterTest
public void closeBrowser()
{
	driver.close();
}
}
