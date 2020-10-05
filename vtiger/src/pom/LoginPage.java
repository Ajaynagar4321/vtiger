package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(name="user_name")
	private WebElement untbox;

	@FindBy(name="user_password")
	private WebElement pwdtbox;
	
	@FindBy(id="submitButton")
	private WebElement lgnbtn;
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	public void login(String un,String pwd)
	{
		untbox.sendKeys(un);
		pwdtbox.sendKeys(pwd);
		lgnbtn.click();
	}
}
