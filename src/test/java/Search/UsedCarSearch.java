package Search;
import static org.testng.Assert.assertEquals;

import java.awt.Dimension;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import SettingDriver.AllCommonMethods;
import SettingDriver.SetDesiredCapabilities;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class UsedCarSearch extends SetDesiredCapabilities
{
	AllCommonMethods CommonMethod = new AllCommonMethods(); 
	private String SelectCar= "//android.widget.TextView[@text= 'Honda City']";
	private String SearchBar= "//android.widget.TextView[@text= 'Search used cars']";
	private String EnterTextInSearchBar= "//android.widget.EditText[@text= 'Search used cars']";
	
	@SuppressWarnings("rawtypes")
	@Test(priority = 0)
 	public void UsedCarSearch_Honda()
 	{
		ExtentTest test= extent.createTest("Used Car Search");	
		driver.launchApp();
		test.log(Status.INFO, "Test Started");	
		
		try{
			CommonMethod.SetApplicationLanguage();                                                  
			test.log(Status.PASS, "Verify that user can set application language (Test Data: English)");	
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can set application language (Test Data: English)");		
		}
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);              
		try{
			driver.findElement(By.xpath(CommonMethod.ClickMoreButton)).click();            
			test.log(Status.PASS, "Verify that user can navigate to menu page by clicking more button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can navigate to menu page by clicking more button");
		}
		
		try{
			driver.findElement(By.xpath(CommonMethod.ClickSignInButton)).click();             
			test.log(Status.PASS, "Verify that user can tap on Sign-In Button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can tap on Sign-In Button");
		}
		
		try{
			CommonMethod.Login();                                               
			test.log(Status.PASS, "Verify that user can login (Test Data: Email)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can login (Test Data: Email)");
		}
		
		try{
			driver.findElement(By.xpath(CommonMethod.ClickHomeButton)).click(); 
			test.log(Status.PASS, "Verify that user can select Home Button to visit Home screen");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Home Button to visit Home screen");
		}
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		try{
			driver.findElement(By.xpath(SearchBar)).click();   
			test.log(Status.PASS, "Verify that user can tap on Search Bar to enter text");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can tap on Search Bar to enter text");
		}
		
		try{
			driver.findElement(By.xpath(EnterTextInSearchBar)).sendKeys("Honda City");   
			test.log(Status.PASS, "Verify that user can enter Car Make Model in Search Bar (Test Data: Honda City)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter Car Make Model in Search Bar (Test Data: Honda City)");
		}
		
		try{
			driver.findElement(By.xpath(SelectCar)).click(); 
			test.log(Status.PASS, "Verify that user can select Car Model from search result (Test Data: Honda City)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Car Model from search result (Test Data: Honda City)");
		}
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		try{
			driver.findElement(By.id(CommonMethod.SelectAd)).click(); 
			test.log(Status.PASS, "Verify that user can select Ad from Car Listing Page");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Ad from Car Listing Page");
		}
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().textContains(\"Similar Ads\")).scrollForward()"));
		
		//CommonMethod.Scroll("Seller Comments");
		try{
			String text= driver.findElement(By.xpath(CommonMethod.SimilarAdsText)).getText();          
			assertEquals(text, "Similar Ads");
			test.log(Status.PASS, "Verify that Similar Ads section is displayed");
		}catch(AssertionError e){
			test.log(Status.FAIL, "Verify that Similar Ads section is displayed");
		}	

		test.log(Status.INFO, "Test Completed");
 	}
}
