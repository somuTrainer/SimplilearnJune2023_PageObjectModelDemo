package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.GooglePage;
import pages.PageFactory_GooglePage;

public class PageFactory_GoogleSearchTest {

	WebDriver driver;
	PageFactory_GooglePage gpage;
	
	@Test
	public void test1() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		gpage = new PageFactory_GooglePage(driver);
		//driver.findElement(gpage.searchTxtBox).sendKeys("Apple");
		
		gpage.searchForText("Apple");
	}
}
