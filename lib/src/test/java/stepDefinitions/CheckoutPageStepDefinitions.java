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
import pageobjects.CheckoutPage;
import pageobjects.LandingPage;
import pageobjects.OffersPage;
import utils.TestContextSetup;

public class CheckoutPageStepDefinitions {
	public WebDriver driver;
	public String landingpageproductName;
	public String offerpageproductname;
	TestContextSetup testcontextsetup;
	CheckoutPage checkoutpage;
	public CheckoutPageStepDefinitions(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup=testcontextsetup;
		this.checkoutpage=testcontextsetup.pageObjectManager.getCheckoutPage();
	}
	
	@Then("verify user has ability to enter promo code and place the order")
	public void verify_user_has_ability_to_enter_promo_code_and_place_the_order()
	{
		
		Assert.assertTrue(checkoutpage.verifyplaceorder());
		Assert.assertTrue(checkoutpage.verifypromoBtn());
	}
	
	@Then("^User proceeds to Checkout and validate the (.+) items in checkout page$")
	public void checkout(String name) throws InterruptedException
	{
		checkoutpage.CheckoutItems();
	}
}
