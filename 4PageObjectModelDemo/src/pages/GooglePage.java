package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePage {
	
	WebDriver driver;
	
	public By searchTxtBox = By.id("APjFqb");
	public By searchBtn = By.name("btnK");
	
	public GooglePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void searchForText(String searchTxt) {
		driver.findElement(searchTxtBox).clear();
		driver.findElement(searchTxtBox).sendKeys(searchTxt);	
		
		driver.findElement(searchBtn).click();
	}
}
