package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.LandingPage;
import pageobjects.OffersPage;
import utils.TestContextSetup;

public class OffersPageStepDefinitions {
	public WebDriver driver;
	public String landingpageproductName;
	public String offerpageproductname;
	TestContextSetup testcontextsetup;
	public OffersPageStepDefinitions(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup=testcontextsetup;
	}
//	@Then("user searched for {string} shortname in offers page to check if product exist with same name")
//	public void user_searched_for_same_shortname_in_offers_page_to_check_if_product_exist(String shortname) throws InterruptedException {
//
//		switchToOffersPage();
//		OffersPage offerspage=testcontextsetup.pageObjectManager.getOffersPage();
//		//OffersPage offerspage=new OffersPage(testcontextsetup.driver);
//		offerspage.searchItem(shortname);
//		
//		
//
//		//testcontextsetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortname);
//
//		Thread.sleep(5000);
//
//		//offerpageproductname = testcontextsetup.driver.findElement(By.xpath("//table/tbody/tr/td[1]")).getText();
//		offerpageproductname=offerspage.getProductName();
//
//		Assert.assertEquals(testcontextsetup.landingpageproductName, offerpageproductname);
//
//	}
	public void switchToOffersPage()
	{
		//testcontextsetup.driver.findElement(By.linkText("Top Deals")).click();
		
		LandingPage landingPage=testcontextsetup.pageObjectManager.getLandingPage();
		landingPage.selecttopDealsPage();
		testcontextsetup.genericutils.switchWindowToChild();
		
	
	}
	@Then("^user searched for (.+) shortname in offers page to check if product exist with same name$")
	public void user_searched_for_same_shortname_in_offers_page_to_check_if_product_exist1(String shortname) throws InterruptedException {

		switchToOffersPage();
		OffersPage offerspage=testcontextsetup.pageObjectManager.getOffersPage();
		//OffersPage offerspage=new OffersPage(testcontextsetup.driver);
		offerspage.searchItem(shortname);
		
		

		//testcontextsetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortname);

		Thread.sleep(5000);

		//offerpageproductname = testcontextsetup.driver.findElement(By.xpath("//table/tbody/tr/td[1]")).getText();
		offerpageproductname=offerspage.getProductName();

		Assert.assertEquals(testcontextsetup.landingpageproductName, offerpageproductname);

	}

}
