package Search;
import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import SettingDriver.AllCommonMethods;
import SettingDriver.SetDesiredCapabilities;
import io.appium.java_client.MobileBy;

public class UsedBikeSearch extends SetDesiredCapabilities
{
	AllCommonMethods CommonMethod = new AllCommonMethods(); 
	private String SelectCityFromSearchBar= "//android.widget.TextView[@text= 'All Cities']";
	private String SelectBike= "//android.widget.TextView[@text= 'Honda CD 70']";
	private String SearchBar= "//android.widget.TextView[@text= 'Search used bikes']";
	private String EnterTextInSearchBar= "//android.widget.EditText[@text= 'Search used bikes']";
	private String SelectFilters= "//android.widget.Button[@text= 'Filter']";
	
	private String EnterKeywords= "//android.widget.EditText[@text= 'Search (e.g Honda Cd 70 in Lahore)']";
	private String EnterMinPrice= "//android.widget.EditText[@text= '0']";
	private String EnterMaxPrice= "//android.widget.EditText[@text= 'Any']";
	private String EnterMinYear= "//android.widget.EditText[@text= '1970']";
	private String EnterMaxYear= "//android.widget.EditText[@text= '2022']";
	private String EnterMinMileage= "//android.widget.EditText[@text= '0']";
	private String EnterMaxMileage= "//android.widget.EditText[@text= 'Any']";
	private String Select2Stroke= "//android.widget.CompoundButton[@text= '2-Stroke']";
	private String Select4Stroke= "//android.widget.CompoundButton[@text= '4-Stroke']";
	private String SelectIndividualsSeller= "//android.widget.CompoundButton[@text= 'Individuals']";
	private String SelectDealersSeller= "//android.widget.CompoundButton[@text= 'Dealers']";
	private String SelectAdProperties= "//android.widget.CompoundButton[@text= 'Picture ads only']";
	private String SelectApplyFilters= "//android.widget.Button[@text= 'Apply Filters']";
	private String SelectSort= "//android.widget.Button[@text= 'Sort']";
	private String ApplySortasPriceHighToLow= "//android.widget.TextView[@text= 'Price (High to Low)']";
	private String SelectStandardBodyType= "//android.widget.TextView[@text= 'Standard']";
	
	private String SaveAd= "com.pakwheels.staging:id/circle";
	private String NotifyMe= "com.pakwheels.staging:id/btn_create_alert";
	private String SelectCreateAlert= "//android.widget.Button[@text= 'Create Alert']";
	
	private String SellerCommentsText= "//android.widget.TextView[@text= 'Seller Comments']";
	private String FeaturesText= "//android.widget.TextView[@text= 'Features']";
	private String SellerDetailText= "//android.widget.TextView[@text= 'Seller Detail']";
	private String VisitSellerDetailsPage= "com.pakwheels.staging:id/iv_email_verified_detail_page";
	private String SelectBackButton= "//android.widget.ImageButton";
	private String WantToSellBikeText= "//android.widget.TextView[@text= 'Want to Sell Your Bike?']";
	
	@Test(priority = 0)
 	public void UsedBikeSearch_Honda()
 	{	
		ExtentTest test= extent.createTest("Used Bike Search");	
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
			driver.findElement(By.xpath(CommonMethod.SelectBikeTab)).click(); 
			test.log(Status.PASS, "Select Bike Tab from Headers");
		}
		catch(org.openqa.selenium.NoSuchElementException e)
		{
			test.log(Status.FAIL, "Select Bike Tab from Headers");
		}
		/*try  // Select City from Search Bar
		{ 
			driver.findElement(By.xpath(SelectCityFromSearchBar)).click();   
			test.log(Status.PASS, "Select All-City to update City from Search Bar");
			driver.findElement(By.xpath(CommonMethod.SelectCity)).click();                 
			test.log(Status.PASS, "Select City from drop-down");
		}
		catch(org.openqa.selenium.NoSuchElementException e)
		{
			test.log(Status.FAIL, "Select All-City to update City from Search Bar");
			test.log(Status.FAIL, "Select City from drop-down");
		}*/
		try
		{
			driver.findElement(By.xpath(SearchBar)).click();   
			test.log(Status.PASS, "Tap on Search Bar to enter text");
			driver.findElement(By.xpath(EnterTextInSearchBar)).sendKeys("Honda CD 70");   
			test.log(Status.PASS, "Enter Bike Make Model in Search Bar");
		}
		catch(org.openqa.selenium.NoSuchElementException e)
		{
			test.log(Status.FAIL, "Tap on Search Bar to enter text");
			test.log(Status.FAIL, "Enter Bike Make Model in Search Bar");
		}
		try
		{
			driver.findElement(By.xpath(SelectBike)).click(); 
			test.log(Status.PASS, "Select Bike Model from search result (Selected: Honda CD 70)");
		}
		catch(org.openqa.selenium.NoSuchElementException e)
		{
			test.log(Status.FAIL, "Select Bike Model from search result (Selected: Honda CD 70)");
		}
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		//************************************************** Ad Listing *****************************************************
		
		/*try  // Apply Sort
		{
			driver.findElement(By.xpath(SelectSort)).click(); 
			test.log(Status.PASS, "Select Sort Button");
			driver.findElement(By.xpath(ApplySortasPriceHighToLow)).click(); 
			test.log(Status.PASS, "Sort listing on the basis of Price High to Low");
		}
		catch(org.openqa.selenium.NoSuchElementException e)
		{
			test.log(Status.FAIL, "Select Sort Button");
			test.log(Status.FAIL, "Sort listing on the basis of Price High to Low");
		}
		try   // Save Ad
		{
			driver.findElements(By.id(SaveAd)).get(0).click(); 
			test.log(Status.PASS, "Save 1st Ad");
			driver.findElements(By.id(SaveAd)).get(1).click(); 
			test.log(Status.PASS, "Save 2nd Ad");
			driver.findElements(By.id(SaveAd)).get(2).click(); 
			test.log(Status.PASS, "Save 3rd Ad");
		}
		catch(org.openqa.selenium.NoSuchElementException e)
		{
			test.log(Status.FAIL, "Save 1st Ad");
			test.log(Status.FAIL, "Save 2nd Ad");
			test.log(Status.FAIL, "Save 3rd Ad");
		}
		try   // Alert Creation
		{
			driver.findElement(By.id(NotifyMe)).click(); 
			test.log(Status.PASS, "Tap on Alert Button from headers");
			driver.findElement(By.xpath(SelectCreateAlert)).click(); 
			test.log(Status.PASS, "Create Alert");
		}
		catch(org.openqa.selenium.NoSuchElementException e)
		{
			test.log(Status.FAIL, "Tap on Alert Button from headers");
			test.log(Status.FAIL, "Create Alert");
		}
		
		try
		{
			driver.findElement(By.xpath(SelectFilters)).click(); 
			test.log(Status.PASS, "Select Filters from Bike Listing Page");
		}
		catch(org.openqa.selenium.NoSuchElementException e)
		{
			test.log(Status.FAIL, "Select Filters from Bike Listing Page");
		}
		
		//************************************************** Advance Search ****************************************************
		try
		{
			driver.findElement(By.xpath(EnterKeywords)).sendKeys("Honda CD 70"); 
			test.log(Status.PASS, "Enter Keyword");
		}
		catch(org.openqa.selenium.NoSuchElementException e)
		{
			test.log(Status.FAIL, "Enter Keyword");
		}
		try
		{
			driver.findElement(By.xpath(EnterMinPrice)).sendKeys("80000");   
			test.log(Status.PASS, "Enter Min Price");
			driver.findElement(By.xpath(EnterMaxPrice)).sendKeys("10000000");   
			test.log(Status.PASS, "Enter Max Price");
		}
		catch(org.openqa.selenium.NoSuchElementException e)
		{
			test.log(Status.FAIL, "Enter Min Price");
			test.log(Status.FAIL, "Enter Max Price");
		}
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Model Year Range\").instance(0))"));   //Scroll	
		try
		{
			driver.findElement(By.xpath(EnterMinYear)).sendKeys("2012");   
			test.log(Status.PASS, "Enter Min Year");
			driver.findElement(By.xpath(EnterMaxYear)).sendKeys("2023");   
			test.log(Status.PASS, "Enter Max Year");
		}
		catch(org.openqa.selenium.NoSuchElementException e)
		{
			test.log(Status.FAIL, "Enter Min Year");
			test.log(Status.FAIL, "Enter Max Year");
		}
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Mileage (KM)\").instance(0))"));   //Scroll	
		try
		{
			driver.findElement(By.xpath(EnterMinMileage)).sendKeys("1000");   
			test.log(Status.PASS, "Enter Min Mileage");
			driver.findElement(By.xpath(EnterMaxMileage)).sendKeys("100000");   
			test.log(Status.PASS, "Enter Max Mileage");
		}
		catch(org.openqa.selenium.NoSuchElementException e)
		{
			test.log(Status.FAIL, "Enter Min Mileage");
			test.log(Status.FAIL, "Enter Max Mileage");
		}	
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Engine Type\").instance(0))"));   //Scroll	
		try 
		{
			driver.findElement(By.xpath(Select2Stroke)).click(); 
			driver.findElement(By.xpath(Select4Stroke)).click(); 
			test.log(Status.PASS, "Select Engine Type");
		}
		catch(org.openqa.selenium.NoSuchElementException e)
		{
			test.log(Status.FAIL, "Select Engine Type");
		}		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Body Type\").instance(0))"));   //Scroll	
		try 
		{
			driver.findElement(By.xpath(SelectStandardBodyType)).click(); 
			test.log(Status.PASS, "Select Standard Body Type");
		}
		catch(org.openqa.selenium.NoSuchElementException e)
		{
			test.log(Status.FAIL, "Select Standard Body Type");
		}
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Seller Type\").instance(0))"));   //Scroll	
		try 
		{
			driver.findElement(By.xpath(SelectIndividualsSeller)).click(); 
			driver.findElement(By.xpath(SelectDealersSeller)).click(); 
			test.log(Status.PASS, "Select Seller Type");
		}
		catch(org.openqa.selenium.NoSuchElementException e)
		{
			test.log(Status.FAIL, "Select Seller Type");
		}
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Ad Properties\").instance(0))"));   //Scroll	
		try 
		{
			driver.findElement(By.xpath(SelectAdProperties)).click(); 
			test.log(Status.PASS, "Select Ad Properties");
		}
		catch(org.openqa.selenium.NoSuchElementException e)
		{
			test.log(Status.FAIL, "Select Ad Properties");
		}
		try 
		{
			driver.findElement(By.xpath(SelectApplyFilters)).click(); 
			test.log(Status.PASS, "Select Apply Filters Buttons");
		}
		catch(org.openqa.selenium.NoSuchElementException e)
		{
			test.log(Status.FAIL, "Select Apply Filters Buttons");
		}	*/
			
		// ********************************************* Ad Detail Page ***********************************************
		try  // Navigate to Ad Detail Page
		{
			driver.findElement(By.id(CommonMethod.SelectAd)).click(); 
			test.log(Status.PASS, "Select Ad from Bike Listing Page");
		}
		catch(org.openqa.selenium.NoSuchElementException e)
		{
			test.log(Status.FAIL, "Select Ad from Bike Listing Page");
		}
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		/*try  // Check Model Name
		{
			String text= driver.findElement(By.xpath(CommonMethod.ModelNameText)).getText(); 
			assertEquals(text, "Honda CD 70");	
			test.log(Status.PASS, "Check Model Name");
		}
		catch(AssertionError e)
	    {
			test.log(Status.FAIL, "Check Model Name");
	    }
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Seller Comments\").instance(0))"));   //Scroll	        
		try  // Check Seller Comments
		{
			String text= driver.findElement(By.xpath(SellerCommentsText)).getText();  
			assertEquals(text, "Seller Comments");
			test.log(Status.PASS, "Check Seller Comments section is displayed");
	    }
		catch(AssertionError e)
	    {
			test.log(Status.FAIL, "Check Seller Comments section is displayed");
        }		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Features\").instance(0))"));   //Scroll	
		try  // Check Features Section
		{
			String text= driver.findElement(By.xpath(FeaturesText)).getText();          
			assertEquals(text, "Features");
			test.log(Status.PASS, "Check Features section is displayed");
		}
		catch(AssertionError e)
		{
			test.log(Status.FAIL, "Check Features section is displayed");
		}
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Seller Detail\").instance(0))"));   //Scroll			
	/*	try  // Check Seller Details Section
		{
			String text= driver.findElement(By.xpath(SellerDetailText)).getText();          
			assertEquals(text, "Seller Detail");
			test.log(Status.PASS, "Check Seller Detail section is displayed");
		}
		catch(AssertionError e)
		{
			test.log(Status.FAIL, "Check Seller Detail section is displayed");
		}	
		try   // Check Seller Details Page
		{ 
			driver.findElement(By.id(VisitSellerDetailsPage)).click(); 
			test.log(Status.PASS, "Visit Seller Detail Page");
			driver.findElement(By.xpath(SelectBackButton)).click(); 
			test.log(Status.PASS, "Back from visiting Seller Details");
		}
		catch(org.openqa.selenium.NoSuchElementException e)
		{
			test.log(Status.FAIL, "Check Seller Detail section is displayed");
			test.log(Status.FAIL, "Visit Seller Detail Page");
			test.log(Status.FAIL, "Back from visiting Seller Details");
		}	
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Sell Your Bike\").instance(0))"));   //Scroll	
		try  // Check Sell Your Bike Section
		{
			String text= driver.findElement(By.xpath(WantToSellBikeText)).getText();          
			assertEquals(text, "Want to Sell Your Bike?");
			test.log(Status.PASS, "Check Want to Sell Your Bike section is displayed");
		}
		catch(AssertionError e)
		{
			test.log(Status.FAIL, "Check Want to Sell Your Bike section is displayed");
		}*/
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Post an Ad for Free\").instance(0))"));   //Scroll	        
		
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
