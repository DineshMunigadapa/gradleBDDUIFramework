package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	
	public WebDriver driver;
	
	public CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By cartbag=By.xpath("//*[@alt='Cart']");
	By checkoutButton=By.xpath("//*[text()='PROCEED TO CHECKOUT']");
	By promoBtn=By.xpath("//*[text()='Apply']");
	By placeorder=By.xpath("//*[text()='Place Order']");

	
	public void CheckoutItems() throws InterruptedException
	{
		driver.findElement(cartbag).click();
//		Thread.sleep(5000);
		driver.findElement(checkoutButton).click();
//		Thread.sleep(5000);
	}
	
	public Boolean verifypromoBtn()
	{
		return driver.findElement(promoBtn).isDisplayed();
	}
	
	public Boolean verifyplaceorder()
	{
		return driver.findElement(placeorder).isDisplayed();
	}
	
	
	
}
