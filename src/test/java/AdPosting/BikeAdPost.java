package AdPosting;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import SettingDriver.AllCommonMethods;
import SettingDriver.SetDesiredCapabilities;
import io.appium.java_client.MobileBy;

public class BikeAdPost extends SetDesiredCapabilities
{
	AllCommonMethods CommonMethod = new AllCommonMethods(); 
	private String BikeButton= "//android.widget.TextView[@text= 'Bike']";
	private String SelectBikeInformation= "//android.widget.TextView[@text= 'Bike Information']";
	private String SelectBikeYear= "//android.widget.TextView[@text= '2020']";
	private String SelectBikeMakeModel= "//android.widget.TextView[@text= 'CG 125']";
	private String SelectEngineType= "//android.widget.TextView[@text= '4-stroke']";
	private String Feature1= "//android.widget.CheckBox[@text= 'Disc Break']";
	private String Feature2= "//android.widget.CheckBox[@text= 'Wind Shield']";
	
	@Test
	public void BikeAdPostAfterLogin()
	{	
		ExtentTest test= extent.createTest("Bike Ad Post");
		driver.launchApp();

		test.log(Status.INFO, "Test Started");	
		CommonMethod.SetApplicationLanguage();                                                  // Set Application language
		test.log(Status.PASS, "Set Application language to English");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                        // Wait for screen to update
		driver.findElement(By.id(CommonMethod.ClickSellButton)).click();                        // Click Sell button
		test.log(Status.PASS, "Tap on Sell Button to select Ad type");
		driver.findElement(By.xpath(BikeButton)).click();                                       // Select Bike to post Bike Ad
		test.log(Status.PASS, "Select Bike Ad");
		CommonMethod.Login();                                                                   // Login via Email
		test.log(Status.PASS, "Login via Email");
		driver.findElement(By.xpath(CommonMethod.SelectAddPhotos)).click();                     // Select Add photos button
		test.log(Status.PASS, "Select Add Photos");
		driver.findElement(By.xpath(CommonMethod.SelectUploadPhotoFromGallery)).click();        // Select Upload photos from gallery 
		test.log(Status.PASS, "Select Upload Photos from gallery");
		//driver.findElement(By.xpath(CommonMethod.SelectAllowButton)).click();                 // Allow Application to access gallery
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                        // Wait for screen to update  
		driver.findElement(By.id(CommonMethod.SelectImage1)).click();                           // Select Image
		test.log(Status.PASS, "Select 1st Image from gallery");
		driver.findElement(By.xpath(CommonMethod.SelectImage2)).click();                        // Select Image
		test.log(Status.PASS, "Select 2nd Image from gallery");
		driver.findElement(By.xpath(CommonMethod.SelectImage3)).click();                        // Select Image 
		test.log(Status.PASS, "Select 3rd Image from gallery");
		driver.findElement(By.id(CommonMethod.EndPicturesSelection)).click();                   // Click done button to end selection	
		test.log(Status.PASS, "End Picture selection by tapping on Tick Button");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                        // Wait for screen to update		
		driver.findElement(By.xpath(CommonMethod.SelectLocationButton)).click();                // Select Location
		test.log(Status.PASS, "Select Location button to Open Listing");
		driver.findElement(By.xpath(CommonMethod.SelectCity)).click();                          // Select City
		test.log(Status.PASS, "Select City");
		driver.findElement(By.xpath(CommonMethod.SelectCityArea)).click();                      // Select City Area
		test.log(Status.PASS, "Select City Area");
		driver.findElement(By.xpath(SelectBikeInformation)).click();                            // Select Information Button
		test.log(Status.PASS, "Select Bike Information Button to Open Listing");
		driver.findElement(By.xpath(SelectBikeYear)).click();                                   // Select Bike Year
		test.log(Status.PASS, "Select Bike Year");
		driver.findElement(By.xpath(SelectBikeMakeModel)).click();                              // Select Bike Make and model
		test.log(Status.PASS, "Select Bike Make and Model");
		driver.findElement(By.xpath(CommonMethod.SelectRegisteredInButton)).click();            // Select Bike registration year
		test.log(Status.PASS, "Select Registered City Button to open lisiting");
		driver.findElement(By.xpath(CommonMethod.SelectRegisteredCity)).click();                // Select Bike registered City	
		test.log(Status.PASS, "Select Registered City");
		driver.findElement(By.xpath(CommonMethod.EnterPrice)).sendKeys("70000");                // Enter price
		test.log(Status.PASS, "Enter Price");
		driver.findElement(By.xpath(CommonMethod.EnterMileage)).sendKeys("1200");               // Enter mileage
		test.log(Status.PASS, "Enter Mileage");
		driver.findElement(By.xpath(CommonMethod.ClickEngineTypeButton)).click();               // Select engine type button
		test.log(Status.PASS, "Select Engine Type Button to open listing");
		driver.findElement(By.xpath(SelectEngineType)).click();                                 // Select engine type
		test.log(Status.PASS, "Select Engine Type");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Features\").instance(0))"));
		driver.findElement(By.xpath(CommonMethod.EnterDescription)).sendKeys("Test By Appium"); // Enter description
		test.log(Status.PASS, "Enter Description");
		driver.findElement(By.xpath(CommonMethod.SelectFeaturesButton)).click();                // Select feature button
		test.log(Status.PASS, "Select Feature Button");
		driver.findElement(By.xpath(Feature1)).click();                                         // Select feature
		test.log(Status.PASS, "Select 1st Feature");
		driver.findElement(By.xpath(Feature2)).click();                                         // Select feature	
		test.log(Status.PASS, "Select 2nd Feature");
		driver.findElement(By.xpath(CommonMethod.ClickDoneButton)).click();                     // Select done button
		test.log(Status.PASS, "Click Done Button");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Contact Information\").instance(0))"));
		//CommonMethod.EnterMobileNumber();                                                       // Enter mobile number
		driver.findElement(By.xpath(CommonMethod.ClickPostYourAdButton)).click();  	            // Post Ad
		test.log(Status.PASS, "Click Post Your Ad Button");
		test.log(Status.INFO, "Test Successfully Completed");
	}
}
