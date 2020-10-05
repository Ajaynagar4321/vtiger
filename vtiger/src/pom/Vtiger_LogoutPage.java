package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Generic_ActionClass;

public class Vtiger_LogoutPage {
	
	@FindBy(xpath = "//img[@src=\"themes/softed/images/user.PNG\"]")
	private WebElement administrator;

	@FindBy(xpath="//a[.='Sign Out']")
	private WebElement signout;
	
	public Vtiger_LogoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void logout(WebDriver driver)
	{
		Generic_ActionClass ga=new Generic_ActionClass();
		ga.mouseHoverAction(driver, administrator);
		signout.click();
	}
 

}
