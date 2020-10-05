package script;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pom.BaseTest;
import pom.HomePage;
import pom.LoginPage;
import pom.ProductPage;
import pom.Vtiger_LoginPage;
import pom.Vtiger_LogoutPage;

public class Login_Logout_Test extends BaseTest {

	@Test
	
	public void login_logout_Test()
	{
		LoginPage lp=new LoginPage(driver);
		lp.login("admin", "manager");
		
		HomePage hp=new HomePage(driver);
		hp.clickProductBtn();
		//Assert.fail();
		ProductPage pp=new ProductPage(driver);
		pp.searchProductByNumber("Part Number");
}
}
