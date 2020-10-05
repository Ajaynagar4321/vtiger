package generic;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class Generic_WebElement {
	
	public String text(WebElement ele)
	{
		String text = ele.getText();
		System.out.println(text);
		return text;
	}
	
	
	public Point pointlocation(WebElement ele)
	{
		Point loc = ele.getLocation();
		System.out.println(loc);
		return loc;
	}

}
