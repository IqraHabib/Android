package SettingDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;

public class AllCommonMethods extends SetDesiredCapabilities
{
	public String ClickHomeButton= "//android.widget.TextView[@text='Home']";
	public String ClickMoreButton= "//android.widget.FrameLayout[@index='4']";
	public String ClickSubmitButton= "//android.widget.Button[@text='Submit']";
	public String ClickApplyNowButton= "//android.widget.Button[@text='Apply Now']";
	public String ClickSignInButton= "//android.widget.Button[@text='Sign in']";
	public String SelectUsedCars= "//android.widget.TextView[@text='Used Cars']";         // Used Cars button from more screen
	
	public String SelectLocationButton= "//android.widget.TextView[@text='Location']";
	public String SelectCity= "//android.widget.TextView[@text='Lahore']";
	public String SelectCityArea= "//android.widget.TextView[@text='Abid Market']";
	
	public String SelectCarModelButton= "//android.widget.TextView[@text= 'Car Model']";
	public String SelectCarYear= "//android.widget.TextView[@text= '2021']";
	public String SelectCarMakeModel= "//android.widget.TextView[@text= 'Alto']";
	public String SelectCarVersion= "//android.widget.TextView[@text= 'VX']";
	
	//Ad Posting
	public String ClickSellButton= "com.pakwheels.staging:id/fab_home_layout";
	public String SelectRegisteredInButton= "//android.widget.TextView[@text='Registered In']";
	public String SelectRegisteredCity= "//android.widget.TextView[@text='Punjab']";
	public String EnterMileage= "//android.widget.EditText[@text='Specify Mileage']";
	public String EnterPrice= "//android.widget.EditText[@text='Set a price']";
	public String ClickEngineTypeButton= "//android.widget.TextView[@text= 'Engine Type']";
	public String SelectFeaturesButton= "//android.widget.TextView[@text= 'Features']";
	public String EnterDescription= "//android.widget.EditText[@text= 'For Example: Alloy Rims, First Owner, etc.']";
	public String ClickDoneButton= "//android.widget.Button[@text= 'Done']";
	public String SelectAddPhotos= "//android.widget.TextView[@text= 'Add Photo']";
	public String SelectUploadPhotoFromGallery= "//android.widget.TextView[@text= 'Upload photos from gallery']";
	public String SelectAllowButton= "//android.widget.Button[@text= 'ALLOW']";
	public String EndPicturesSelection= "com.pakwheels.staging:id/_ic_done";
	public String SelectImage1= "com.pakwheels.staging:id/img_image";
	public String SelectImage2= "(//android.widget.ImageView)[3]";
	public String SelectImage3= "(//android.widget.ImageView)[4]";	
	public String ClickPostYourAdButton= "//android.widget.Button[@text= 'Post Your Ad']";
	
	// Bike Search
	public String SelectBikeTab= "//android.widget.CompoundButton[@text= 'Bikes']";
	public String ModelNameText= "//android.widget.TextView[@text= 'Honda CD 70']";
	public String SelectAd= "com.pakwheels.staging:id/txtview_ad_title_search_action_item";
	public String SimilarAdsText= "//android.widget.TextView[@text= 'Similar Ads']";
	
	public void SetApplicationLanguage()
	{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.RadioButton[@index='0']")).click();                  // Setting English language from radio button
		driver.findElement(By.xpath("//android.widget.Button[@text='Next']")).click();                     // Tapping on next button
	}
	public void Login()
	{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                                    // Wait for screen to update
		driver.findElement(By.xpath("//android.widget.Button[@text='Continue with Email']")).click();       // Select Email as Login Option
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                                    // Wait for screen to update
		driver.findElement(By.xpath("//android.widget.EditText[@text='username@email.com']")).sendKeys("testpw152@mailinator.com");  //Enter Email
		driver.findElement(By.xpath("//android.widget.EditText[@text='Enter password']")).sendKeys("1234567");   // Enter Password
		driver.findElement(By.xpath("//android.widget.Button[@text='Sign in']")).click();                   // Select Sign-in button
	}
	public void EnterName()
	{
		driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Name']")).sendKeys("Testing through Appium");   // Enter Name
	}
	public void EnterMobileNumber()
	{
		driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Mobile Number']")).sendKeys("03154954876");     // Enter Phone Number
	}
	public void EnterEmail()
	{
		driver.findElement(By.xpath("//android.widget.EditText[@text='Email (Optional)']")).sendKeys("testpw150@mailinator.com");   // Enter Email
	}
	public void Scroll (String text)
	{
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+text+"\").instance(0))"));
	}
}
