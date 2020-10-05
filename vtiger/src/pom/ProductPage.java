package pom;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import generic.Generic_Dropdown_Selectclass;
import generic.Generic_Screenshot;

public class ProductPage {

	@FindBy(name = "search_text")
	private WebElement searchInput;
	
	@FindBy(id = "bas_searchfield")
	private WebElement serachField;
	
	@FindBy(name = "submit")
	private WebElement searchButton;
	
	public ProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void searchProductByNumber(String value)
	{
		searchInput.sendKeys("101");
		Generic_Dropdown_Selectclass.selecttext(serachField, value);
		
		searchButton.click();
	
	}
}
