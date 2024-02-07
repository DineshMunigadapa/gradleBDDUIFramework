package stepDefinitions;

import java.io.IOException;
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
import utils.TestBase;
import utils.TestContextSetup;

public class LandingPageStepDefinitions {
	public WebDriver driver;
	public String landingpageproductName;
	public String offerpageproductname;
	TestContextSetup testcontextsetup;
	LandingPage landingPage;

	public LandingPageStepDefinitions(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup=testcontextsetup;
		this.landingPage =testcontextsetup.pageObjectManager.getLandingPage();
	}
	@Given("User is on GreenCart Landing page")
	public void user_is_on_green_cart_landing_page() throws IOException {
//		testcontextsetup.driver=new ChromeDriver();
//		testcontextsetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//testcontextsetup.testBase.WebDriverManager();
		Assert.assertTrue(landingPage.getLandingPageTitle().contains("GreenKart"));

	}


//	@When("user searched with Shortname {string} and extracted actual name of product")
//	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortName) throws InterruptedException {
//		//testcontextsetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
//		//LandingPage landingpage=testcontextsetup.pageObjectManager.getLandingPage();
//		//LandingPage landingpage=new LandingPage(testcontextsetup.driver);
//		landingPage.searchItem(shortName);
//		Thread.sleep(5000);
//		testcontextsetup.landingpageproductName= landingPage.getProductName().split("-")[0].trim();
//		//testcontextsetup.landingpageproductName= testcontextsetup.driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
//		System.out.println(testcontextsetup.landingpageproductName+ " is Extracted from Homepage");
//	}
	
	@When("^user searched with Shortname (.+) and extracted actual name of product$")
	public void user_searched_with_shortname_beet_and_extracted_actual_name_of_product(String shortName) throws InterruptedException {
		//testcontextsetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
		//LandingPage landingpage=testcontextsetup.pageObjectManager.getLandingPage();
		//LandingPage landingpage=new LandingPage(testcontextsetup.driver);
		landingPage.searchItem(shortName);
		Thread.sleep(5000);
		testcontextsetup.landingpageproductName= landingPage.getProductName().split("-")[0].trim();
		//testcontextsetup.landingpageproductName= testcontextsetup.driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
		System.out.println(testcontextsetup.landingpageproductName+ " is Extracted from Homepage");
	  
	}
	
	@When("Added {string} items of the selected product to cart")
	public void additms(String quantity) throws InterruptedException
	{
		landingPage.incrementquantity(Integer.parseInt(quantity));
//		Thread.sleep(5000);
		landingPage.addtocart();
//		Thread.sleep(5000);
	}
}
