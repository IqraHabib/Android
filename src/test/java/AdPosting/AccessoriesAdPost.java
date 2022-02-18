package AdPosting;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import SettingDriver.AllCommonMethods;
import SettingDriver.SetDesiredCapabilities;
import io.appium.java_client.MobileBy;

public class AccessoriesAdPost extends SetDesiredCapabilities
{
	AllCommonMethods CommonMethod = new AllCommonMethods(); 
	private String AccessoriesButton= "//android.widget.TextView[@text= 'Auto Parts']";
	private String SelectCategoryButton= "//android.widget.TextView[@text= 'Category']";
	private String SelectCategory= "//android.widget.TextView[@text= 'Amplifiers']";
	private String EnterTitle= "//android.widget.EditText[@text= 'Enter Title']";
	
	@Test
	public void AccessoriesAdPostAfterLogin()
	{	
		//driver.launchApp();
		CommonMethod.SetApplicationLanguage();                                                  // Set Application language
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                        // Wait for screen to update
		driver.findElement(By.id(CommonMethod.ClickSellButton)).click();                        // Click Sell button
		driver.findElement(By.xpath(AccessoriesButton)).click();                                // Select auto-part to post auto-part Ad
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
		driver.findElement(By.xpath(SelectCategoryButton)).click();                             // Select Category button
		driver.findElement(By.xpath(SelectCategory)).click();                                   // Select category
		driver.findElement(By.xpath(EnterTitle)).sendKeys("Amplifiers");                        // Enter title
		driver.findElement(By.xpath(CommonMethod.EnterPrice)).sendKeys("1500");                 // Enter price
		driver.findElement(By.xpath(CommonMethod.EnterDescription)).sendKeys("Testing From Appium");   // Enter description
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Post Your Ad\").instance(0))"));
		//	CommonMethod.EnterMobileNumber();                                                   // Enter mobile number
		driver.findElement(By.xpath(CommonMethod.ClickPostYourAdButton)).click();  	            // Post Ad
	}
}
