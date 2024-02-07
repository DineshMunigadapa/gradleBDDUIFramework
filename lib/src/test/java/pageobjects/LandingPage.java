package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	public WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By search=By.xpath("//input[@type='search']");
	By productname=By.cssSelector("h4.product-name");
	By deals=By.linkText("Top Deals");
	By increment=By.xpath("//*[@class='increment']");
	By addtocart=By.xpath("//*[text()='ADD TO CART']");
	public void searchItem(String name)
	{
		driver.findElement(search).sendKeys(name);
	}
	
	public void getSearchText()
	{
		driver.findElement(search).getText();
	}
	
	public String getProductName()
	{
		return driver.findElement(productname).getText();
	}
	
	public void selecttopDealsPage()
	{
		driver.findElement(deals).click();
	}
	
	public String getLandingPageTitle()
	{
		return driver.getTitle();
	}
	
	public void incrementquantity(int quantity)
	{
		int i=quantity-1;
		while(i>0)
		{
			driver.findElement(increment).click();
			i--;
		}
	}
	
	public void addtocart()
	{
		driver.findElement(addtocart).click();
	}
	
	
}
