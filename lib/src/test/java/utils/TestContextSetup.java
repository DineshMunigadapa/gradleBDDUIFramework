package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageobjects.PageObjectManager;

public class TestContextSetup {
	
	public WebDriver driver;
	public String landingpageproductName;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public GenericUtils genericutils;
	
	public TestContextSetup() throws IOException
	{
		testBase = new TestBase();
		pageObjectManager=new PageObjectManager(testBase.WebDriverManager());
		genericutils=new GenericUtils(testBase.WebDriverManager());
	}

}
