package AdPosting;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
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
		//driver.launchApp();
		CommonMethod.SetApplicationLanguage();                                                  // Set Application language
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                        // Wait for screen to update
		driver.findElement(By.id(CommonMethod.ClickSellButton)).click();                        // Click Sell button
		driver.findElement(By.xpath(CarButton)).click();                                        // Select Car to post Car Ad
		CommonMethod.Login();                                                                   // Login via Email
		driver.findElement(By.xpath(PostAdByOwn)).click();                                      // Select Post your own Ad
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                        // Wait for screen to update	
		driver.findElement(By.xpath(CommonMethod.SelectAddPhotos)).click();                     // Select Add photos button
		driver.findElement(By.xpath(CommonMethod.SelectUploadPhotoFromGallery)).click();        // Select Upload photos from gallery 
		//driver.findElement(By.xpath(CommonMethod.SelectAllowButton)).click();                   // Allow Application to access gallery
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                        // Wait for screen to update  
		driver.findElement(By.id(CommonMethod.SelectImage1)).click();                           // Select Image
		driver.findElement(By.xpath(CommonMethod.SelectImage2)).click();                        // Select Image
		driver.findElement(By.xpath(CommonMethod.SelectImage3)).click();                        // Select Image 
		driver.findElement(By.id(CommonMethod.EndPicturesSelection)).click();                   // Click done button to end selection	
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                        // Wait for screen to update
		driver.findElement(By.xpath(CommonMethod.SelectLocationButton)).click();                // Select Location
		driver.findElement(By.xpath(CommonMethod.SelectCity)).click();                          // Select City
		driver.findElement(By.xpath(CommonMethod.SelectCityArea)).click();                      // Select City Area
		driver.findElement(By.xpath(CommonMethod.SelectCarModelButton)).click();                // Select Car Model button  
		driver.findElement(By.xpath(CommonMethod.SelectCarYear)).click();                       // Select Car year
		driver.findElement(By.xpath(CommonMethod.SelectCarMakeModel)).click();                  // Select Car make and model
		driver.findElement(By.xpath(CommonMethod.SelectCarVersion)).click();                    // Select Car version
		driver.findElement(By.xpath(CommonMethod.SelectRegisteredInButton)).click();            // Select Car registration year
		driver.findElement(By.xpath(CommonMethod.SelectRegisteredCity)).click();                // Select Car registered City
		driver.findElement(By.xpath(SelectBodyColorButton)).click();                            // Select Color button  
		driver.findElement(By.xpath(SelectColor)).click();                                      // Select Car color
		driver.findElement(By.xpath(CommonMethod.EnterMileage)).sendKeys("1200");               // Enter mileage
		driver.findElement(By.xpath(CommonMethod.EnterPrice)).sendKeys("1500000");              // Enter price	
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Additional Info\").instance(0))"));
		driver.findElement(By.xpath(CommonMethod.EnterDescription)).sendKeys("Test By Appium"); // Enter description
		driver.findElement(By.xpath(ClickViewAllSuggestions)).click();                          // Select view all suggestion
		driver.findElement(By.xpath(Suggestion1)).click();                                      // Select suggestion
		driver.findElement(By.xpath(Suggestion2)).click();                                      // Select suggestion  
		driver.findElement(By.xpath(Suggestion3)).click();                                      // Select suggestion  
		driver.findElement(By.xpath(Suggestion4)).click();                                      // Select suggestion  
		driver.findElement(By.xpath(CommonMethod.ClickDoneButton)).click();                     // Select done button 	
		driver.findElement(By.xpath(CommonMethod.ClickEngineTypeButton)).click();               // Select Engine type button
		driver.findElement(By.xpath(SelectEngineType)).click();                                 // Select engine type
		driver.findElement(By.xpath(EnterEngineCapacity)).sendKeys("1000");                     // Enter engine capacity
		driver.findElement(By.xpath(SelectTransmission)).click();                               // Select transmission
		driver.findElement(By.xpath(SelectAssembly)).click();                                   // Select assembly
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Features\").instance(0))"));
		driver.findElement(By.xpath(CommonMethod.SelectFeaturesButton)).click();                // Select feature button
		driver.findElement(By.xpath(Feature1)).click();                                         // Select feature
		driver.findElement(By.xpath(Feature2)).click();                                         // Select feature
		driver.findElement(By.xpath(Feature3)).click();                                         // Select feature 
		driver.findElement(By.xpath(CommonMethod.ClickDoneButton)).click();                     // Select done button
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Contact Information\").instance(0))"));
		CommonMethod.EnterMobileNumber();                                                       // Enter mobile number
		driver.findElement(By.xpath(CommonMethod.ClickPostYourAdButton)).click();  	            // Post Ad
	}
}
