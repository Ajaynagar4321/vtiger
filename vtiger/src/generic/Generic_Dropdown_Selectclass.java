package generic;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Generic_Dropdown_Selectclass {
	public void selectIndex(WebElement ele,int i)
	{
		Select s = new Select(ele);
		s.deselectByIndex(i);
	}
	public static void selecttext(WebElement ele,String text)
	{
		Select s = new Select(ele);
		s.selectByVisibleText(text);
		
		
	}

}
