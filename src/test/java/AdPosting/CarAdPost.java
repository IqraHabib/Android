package AdPosting;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import SettingDriver.AllCommonMethods;
import SettingDriver.SetDesiredCapabilities;
import io.appium.java_client.MobileBy;

public class CarAdPost extends SetDesiredCapabilities
{
	AllCommonMethods CommonMethod = new AllCommonMethods();    
	
	private String CarButton= "//android.widget.TextView[@text= 'Car']";
	private String PostAdByOwn= "//android.widget.Button[@text='Continue']";			
	private String SelectBodyColorButton= "//android.widget.TextView[@text='Body Color']";
	private String SelectColor= "//android.widget.RelativeLayout[@index='2']";
	private String ClickViewAllSuggestions= "//android.widget.TextView[@text= 'View All Suggestions']";
	private String Suggestion1= "//android.widget.CheckBox[@text= 'Auction Sheet Available']";
	private String Suggestion2= "//android.widget.CheckBox[@text= 'Complete Original File']";
	private String Suggestion3= "//android.widget.CheckBox[@text= 'Driven on Petrol']";
	private String Suggestion4= "//android.widget.CheckBox[@text= 'Contact During Office Hours ']";	
	private String SelectEngineType= "//android.widget.TextView[@text= 'Hybrid']";
	private String EnterEngineCapacity= "//android.widget.EditText[@text= 'Specify Engine Capacity']";
	private String SelectTransmission= "//android.widget.CompoundButton[@text= 'Automatic']";
	private String SelectAssembly= "//android.widget.CompoundButton[@text= 'Imported']";
	private String Feature1= "//android.widget.CheckBox[@text= 'Air Bags']";
	private String Feature2= "//android.widget.CheckBox[@text= 'Cool Box']";
	private String Feature3= "//android.widget.CheckBox[@text= 'Immobilizer Key']";
	
	@Test
	public void CarAdPostAfterLogin()
	{	
		ExtentTest test= extent.createTest("Car Ad Post");

		test.log(Status.INFO, "Test Started");	
		CommonMethod.SetApplicationLanguage();                                                  // Set Application language
		test.log(Status.PASS, "Set Application language to English");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                        // Wait for screen to update
		driver.findElement(By.id(CommonMethod.ClickSellButton)).click();                        // Click Sell button
		test.log(Status.PASS, "Tap on Sell Button to select Ad type");
		driver.findElement(By.xpath(CarButton)).click();                                        // Select Car to post Car Ad
		test.log(Status.PASS, "Select Car Ad");
		CommonMethod.Login();                                                                   // Login via Email
		test.log(Status.PASS, "Login via Email");
		driver.findElement(By.xpath(PostAdByOwn)).click();                                      // Select Post your own Ad
		test.log(Status.PASS, "Select Post By Own Option");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                        // Wait for screen to update	
		driver.findElement(By.xpath(CommonMethod.SelectAddPhotos)).click();                     // Select Add photos button
		test.log(Status.PASS, "Select Add Photos");
		driver.findElement(By.xpath(CommonMethod.SelectUploadPhotoFromGallery)).click();        // Select Upload photos from gallery 
		test.log(Status.PASS, "Select Upload Photos from gallery");
		//driver.findElement(By.xpath(CommonMethod.SelectAllowButton)).click();                   // Allow Application to access gallery	
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
		driver.findElement(By.xpath(CommonMethod.SelectCarModelButton)).click();                // Select Car Model button  
		test.log(Status.PASS, "Select Car Model Button to open Listing");
		driver.findElement(By.xpath(CommonMethod.SelectCarYear)).click();                       // Select Car year
		test.log(Status.PASS, "Select Car Year");
		driver.findElement(By.xpath(CommonMethod.SelectCarMakeModel)).click();                  // Select Car make and model
		test.log(Status.PASS, "Select Car Make and Model");
		driver.findElement(By.xpath(CommonMethod.SelectCarVersion)).click();                    // Select Car version
		test.log(Status.PASS, "Select Car Version");
		driver.findElement(By.xpath(CommonMethod.SelectRegisteredInButton)).click();            // Select Car registration year
		test.log(Status.PASS, "Select Registered-In Button to Open Listing");
		driver.findElement(By.xpath(CommonMethod.SelectRegisteredCity)).click();                // Select Car registered City
		test.log(Status.PASS, "Select Registered City");
		driver.findElement(By.xpath(SelectBodyColorButton)).click();                            // Select Color button  
		test.log(Status.PASS, "Select Body Color Button to Open Listing");
		driver.findElement(By.xpath(SelectColor)).click();                                      // Select Car color
		test.log(Status.PASS, "Select Body Color");
		driver.findElement(By.xpath(CommonMethod.EnterMileage)).sendKeys("1200");               // Enter mileage
		test.log(Status.PASS, "Enter Mileage");
		driver.findElement(By.xpath(CommonMethod.EnterPrice)).sendKeys("1500000");              // Enter price	
		test.log(Status.PASS, "Enter Price");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Additional Info\").instance(0))"));
		driver.findElement(By.xpath(CommonMethod.EnterDescription)).sendKeys("Test By Appium"); // Enter description
		test.log(Status.PASS, "Enter Description");
		driver.findElement(By.xpath(ClickViewAllSuggestions)).click();                          // Select view all suggestion
		test.log(Status.PASS, "Click View All Suggestions");
		driver.findElement(By.xpath(Suggestion1)).click();                                      // Select suggestion
		test.log(Status.PASS, "Select 1st Suggestion");
		driver.findElement(By.xpath(Suggestion2)).click();                                      // Select suggestion  
		test.log(Status.PASS, "Select 2nd Suggestion");
		driver.findElement(By.xpath(Suggestion3)).click();                                      // Select suggestion  
		test.log(Status.PASS, "Select 3rd Suggestion");
		driver.findElement(By.xpath(Suggestion4)).click();                                      // Select suggestion  
		test.log(Status.PASS, "Select 4th Suggestion");
		driver.findElement(By.xpath(CommonMethod.ClickDoneButton)).click();                     // Select done button 	
		test.log(Status.PASS, "Click Done Button");
		driver.findElement(By.xpath(CommonMethod.ClickEngineTypeButton)).click();               // Select Engine type button
		test.log(Status.PASS, "Select Engine Type Button to Open Listing");
		driver.findElement(By.xpath(SelectEngineType)).click();                                 // Select engine type
		test.log(Status.PASS, "Select Engine Type");
		driver.findElement(By.xpath(EnterEngineCapacity)).sendKeys("1000");                     // Enter engine capacity
		test.log(Status.PASS, "Select Engine Capacity");
		driver.findElement(By.xpath(SelectTransmission)).click();                               // Select transmission
		test.log(Status.PASS, "Select Transmission");
		driver.findElement(By.xpath(SelectAssembly)).click();                                   // Select assembly
		test.log(Status.PASS, "Select Assembly");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Features\").instance(0))"));
		driver.findElement(By.xpath(CommonMethod.SelectFeaturesButton)).click();                // Select feature button
		test.log(Status.PASS, "Select Feature Button");
		driver.findElement(By.xpath(Feature1)).click();                                         // Select feature
		test.log(Status.PASS, "Select 1st Feature");
		driver.findElement(By.xpath(Feature2)).click();                                         // Select feature
		test.log(Status.PASS, "Select 2nd Feature");
		driver.findElement(By.xpath(Feature3)).click();                                         // Select feature 
		test.log(Status.PASS, "Select 3rd Feature");
		driver.findElement(By.xpath(CommonMethod.ClickDoneButton)).click();                     // Select done button
		test.log(Status.PASS, "Click Done Button");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Contact Information\").instance(0))"));
		CommonMethod.EnterMobileNumber();                                                       // Enter mobile number
		test.log(Status.PASS, "Enter Mobile Number");
		driver.findElement(By.xpath(CommonMethod.ClickPostYourAdButton)).click();  	            // Post Ad
		test.log(Status.PASS, "Click Post Your Ad Button");
		test.log(Status.INFO, "Test Successfully Completed");
	}
}
