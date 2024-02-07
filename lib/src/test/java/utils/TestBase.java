package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {

	public WebDriver driver;

	public WebDriver WebDriverManager() throws IOException
	{
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src//test/resources//global.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String url=prop.getProperty("QAurl");
		String browser_prop=prop.getProperty("browser");
		String browser_maven=System.getProperty("browser");
		String browser=browser_maven!=null?browser_maven:browser_prop;
		if(driver==null)
		{
			if(browser.equalsIgnoreCase("chrome"))
			{
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				
			}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			driver.manage().window().maximize();

		}
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
		return driver;
	}

}
