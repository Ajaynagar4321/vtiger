package generic;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;

public class Generic_WebDriver {
	
	public String title(WebDriver driver)
	{
		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}

	public String url(WebDriver driver)
	{
		String url = driver.getCurrentUrl();
		System.out.println(url);
		return url;
	
		
	}

}
