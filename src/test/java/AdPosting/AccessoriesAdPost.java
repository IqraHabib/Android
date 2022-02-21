package AdPosting;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

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
		ExtentTest test= extent.createTest("Accessories Ad Post");
		driver.launchApp();

		test.log(Status.INFO, "Test Started");	
		CommonMethod.SetApplicationLanguage();                                                  // Set Application language
		test.log(Status.PASS, "Set Application language to English");                                                 // Set Application language
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                        // Wait for screen to update
		driver.findElement(By.id(CommonMethod.ClickSellButton)).click();                        // Click Sell button
		test.log(Status.PASS, "Tap on Sell Button to select Ad type");
		driver.findElement(By.xpath(AccessoriesButton)).click();                                // Select auto-part to post auto-part Ad
		test.log(Status.PASS, "Select Accessories Ad");
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
		driver.findElement(By.xpath(SelectCategoryButton)).click();                             // Select Category button
		test.log(Status.PASS, "Select Category Button to Open Listing");
		driver.findElement(By.xpath(SelectCategory)).click();                                   // Select category
		test.log(Status.PASS, "Select Category");
		driver.findElement(By.xpath(EnterTitle)).sendKeys("Amplifiers");                        // Enter title
		test.log(Status.PASS, "Enter Title");
		driver.findElement(By.xpath(CommonMethod.EnterPrice)).sendKeys("1500");                 // Enter price
		test.log(Status.PASS, "Enter Price");
		driver.findElement(By.xpath(CommonMethod.EnterDescription)).sendKeys("Testing From Appium");   // Enter description
		test.log(Status.PASS, "Enter Description");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Post Your Ad\").instance(0))"));
		//CommonMethod.EnterMobileNumber();                                                   // Enter mobile number
		driver.findElement(By.xpath(CommonMethod.ClickPostYourAdButton)).click();  	            // Post Ad
		test.log(Status.PASS, "Click Post Your Ad Button");
		test.log(Status.INFO, "Test Successfully Completed");
	}
}
