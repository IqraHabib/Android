package AdPosting;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
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
		driver.launchApp();
		CommonMethod.SetApplicationLanguage();                                                  // Set Application language
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                        // Wait for screen to update
		driver.findElement(By.id(CommonMethod.ClickSellButton)).click();                        // Click Sell button
		driver.findElement(By.xpath(BikeButton)).click();                                       // Select Bike to post Bike Ad
		CommonMethod.Login();                                                                   // Login via Email
		driver.findElement(By.xpath(CommonMethod.SelectAddPhotos)).click();                     // Select Add photos button
		driver.findElement(By.xpath(CommonMethod.SelectUploadPhotoFromGallery)).click();        // Select Upload photos from gallery 
		//driver.findElement(By.xpath(CommonMethod.SelectAllowButton)).click();                 // Allow Application to access gallery
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                        // Wait for screen to update  
		driver.findElement(By.id(CommonMethod.SelectImage1)).click();                           // Select Image
		driver.findElement(By.xpath(CommonMethod.SelectImage2)).click();                        // Select Image
		driver.findElement(By.xpath(CommonMethod.SelectImage3)).click();                        // Select Image 
		driver.findElement(By.id(CommonMethod.EndPicturesSelection)).click();                   // Click done button to end selection	
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                        // Wait for screen to update		
		driver.findElement(By.xpath(CommonMethod.SelectLocationButton)).click();                // Select Location
		driver.findElement(By.xpath(CommonMethod.SelectCity)).click();                          // Select City
		driver.findElement(By.xpath(CommonMethod.SelectCityArea)).click();                      // Select City Area
		driver.findElement(By.xpath(SelectBikeInformation)).click();                            // Select Information Button
		driver.findElement(By.xpath(SelectBikeYear)).click();                                   // Select Bike Year
		driver.findElement(By.xpath(SelectBikeMakeModel)).click();                              // Select Bike Make and model
		driver.findElement(By.xpath(CommonMethod.SelectRegisteredInButton)).click();            // Select Bike registration year
		driver.findElement(By.xpath(CommonMethod.SelectRegisteredCity)).click();                // Select Bike registered City	
		driver.findElement(By.xpath(CommonMethod.EnterPrice)).sendKeys("70000");                // Enter price
		driver.findElement(By.xpath(CommonMethod.EnterMileage)).sendKeys("1200");               // Enter mileage
		driver.findElement(By.xpath(CommonMethod.ClickEngineTypeButton)).click();               // Select engine type button
		driver.findElement(By.xpath(SelectEngineType)).click();                                 // Select engine type
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Features\").instance(0))"));
		driver.findElement(By.xpath(CommonMethod.EnterDescription)).sendKeys("Test By Appium"); // Enter description
		driver.findElement(By.xpath(CommonMethod.SelectFeaturesButton)).click();                // Select feature button
		driver.findElement(By.xpath(Feature1)).click();                                         // Select feature
		driver.findElement(By.xpath(Feature2)).click();                                         // Select feature	
		driver.findElement(By.xpath(CommonMethod.ClickDoneButton)).click();                     // Select done button
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Contact Information\").instance(0))"));
	//	CommonMethod.EnterMobileNumber();                                                       // Enter mobile number
		driver.findElement(By.xpath(CommonMethod.ClickPostYourAdButton)).click();  	            // Post Ad
	}
}
