package Search;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import SettingDriver.AllCommonMethods;
import SettingDriver.SetDesiredCapabilities;
import io.appium.java_client.MobileBy;

public class UsedCarSearch extends SetDesiredCapabilities
{
	AllCommonMethods CommonMethod = new AllCommonMethods(); 
	private String SelectCar= "//android.widget.TextView[@text= 'Honda City']";
	private String SearchBar= "//android.widget.TextView[@text= 'Search used cars']";
	private String EnterTextInSearchBar= "//android.widget.EditText[@text= 'Search used cars']";
	
	@Test(priority = 0)
 	public void UsedCarSearch_Honda()
 	{
		ExtentTest test= extent.createTest("Used Car Search");	
		test.log(Status.INFO, "Test Started");	
		
		//driver.launchApp();
		CommonMethod.SetApplicationLanguage();
		test.log(Status.PASS, "Set Application language to English");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                  // Wait for screen to update
		driver.findElement(By.xpath(CommonMethod.ClickMoreButton)).click();               // Click More Button
		test.log(Status.PASS, "Navigate to menu page by clicking more button");
		driver.findElement(By.xpath(CommonMethod.ClickSignInButton)).click();             // Select Sign-in button
		test.log(Status.PASS, "Tap on Sign-In Button");
		CommonMethod.Login();	                                                          // Login through an email
		test.log(Status.PASS, "Login via Email");		
		try
		{
			driver.findElement(By.xpath(CommonMethod.ClickHomeButton)).click(); 
			test.log(Status.PASS, "Select Home Button to visit Home screen");
		}
		catch(org.openqa.selenium.NoSuchElementException e)
		{
			test.log(Status.FAIL, "Select Home Button to visit Home screen");
		}
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		try
		{
			driver.findElement(By.xpath(SearchBar)).click();   
			test.log(Status.PASS, "Tap on Search Bar to enter text");
			driver.findElement(By.xpath(EnterTextInSearchBar)).sendKeys("Honda City");   
			test.log(Status.PASS, "Enter Car Make Model in Search Bar");
		}
		catch(org.openqa.selenium.NoSuchElementException e)
		{
			test.log(Status.FAIL, "Tap on Search Bar to enter text");
			test.log(Status.FAIL, "Enter Car Make Model in Search Bar");
		}
		try
		{
			driver.findElement(By.xpath(SelectCar)).click(); 
			test.log(Status.PASS, "Select Car Model from search result (Selected: Honda City)");
		}
		catch(org.openqa.selenium.NoSuchElementException e)
		{
			test.log(Status.FAIL, "Select Car Model from search result (Selected: Honda City)");
		}
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		try  // Navigate to Ad Detail Page
		{
			driver.findElement(By.id(CommonMethod.SelectAd)).click(); 
			test.log(Status.PASS, "Select Ad from Car Listing Page");
		}
		catch(org.openqa.selenium.NoSuchElementException e)
		{
			test.log(Status.FAIL, "Select Ad from Car Listing Page");
		}
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		String menuText= "Similar Ads";
		 driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + menuText + "\").instance(0));")); 
		try   // Check Similar Section
		{
			String text= driver.findElement(By.xpath(CommonMethod.SimilarAdsText)).getText();          
			assertEquals(text, "Similar Ads");
			test.log(Status.PASS, "Check Similar Ads section is displayed");
		}
		catch(AssertionError e)
		{
			test.log(Status.FAIL, "Check Similar Ads section is displayed");
		}	
		test.log(Status.INFO, "Test Successfully Completed");
 	}
}
