package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactory_GooglePage {

	WebDriver driver;
	
	public PageFactory_GooglePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="APjFqb")
	WebElement searchTxtBox;
	
	@FindBy(name="btnK")
	WebElement searchBtn;
	
	public void searchForText(String searchTxt) {
		searchTxtBox.clear();
		searchTxtBox.sendKeys(searchTxt);		
		searchBtn.click();
	}
}
