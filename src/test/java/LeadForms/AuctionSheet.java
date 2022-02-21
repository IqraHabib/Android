package LeadForms;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import SettingDriver.AllCommonMethods;
import SettingDriver.SetDesiredCapabilities;
import io.appium.java_client.MobileBy;

public class AuctionSheet extends SetDesiredCapabilities 
{
	AllCommonMethods CommonMethod = new AllCommonMethods(); 
	private String AuctionSheetPage= "(//com.pakwheels.staging:id/marketing_widget_title)[3]";
	private String EnterChasisNumber= "//android.widget.EditText[@text= 'Enter Chassis Number(e.g ZZT240–316982)']";
	private String ClickGetAuctionSheetButton= "//android.widget.Button[@text= 'Get Auction Sheet']";
	private String ClickProceedToCheckOut= "//android.widget.Button[@text= 'Proceed to Checkout']";
	
	@Test(priority = 0)
	public void AuctionSheetRequest_WithoutLogin()
	{
		ExtentTest test= extent.createTest("Auction Sheet Request- Without Login");
		driver.launchApp();
		
		test.log(Status.INFO, "Test Started");	
		CommonMethod.SetApplicationLanguage();		                                         // Set Applications Language
		test.log(Status.PASS, "Set Application language to English");	
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                  // Wait for screen to update
		driver.findElement(By.xpath(CommonMethod.ClickMoreButton)).click();               // Click More Button
		test.log(Status.PASS, "Navigate to menu page by clicking more button");
		driver.findElement(By.xpath(CommonMethod.SelectUsedCars)).click();                // Click on Used Cars button from more screen
		test.log(Status.PASS, "Tap on Used Cars to open Drop-Down");	
		//driver.findElement(By.xpath(AuctionSheetPage)).click();   
		test.log(Status.PASS, "Navigate to Auction Sheet page");
		driver.findElement(By.xpath(EnterChasisNumber)).sendKeys("RU3-1041850");
		test.log(Status.PASS, "Enter Chasis Number");
		driver.findElement(By.xpath(ClickGetAuctionSheetButton)).click();   
		test.log(Status.PASS, "Click on Get Auction Sheet Button");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Mobile Number\").instance(0))"));   //Scroll	
		CommonMethod.EnterName();
		test.log(Status.PASS, "Enter Name");
		CommonMethod.EnterMobileNumber();
		test.log(Status.PASS, "Enter Mobile Number");
		driver.findElement(By.xpath(ClickProceedToCheckOut)).click();  
		test.log(Status.PASS, "Click Proceed To CheckOut");
	}
	
	@Test(priority = 1)
	public void AuctionSheetRequest_WithLogin()
	{
		ExtentTest test= extent.createTest("Auction Sheet Request- With Login");
		driver.launchApp();
		
		test.log(Status.INFO, "Test Started");	
		CommonMethod.SetApplicationLanguage();		                                         // Set Applications Language
		test.log(Status.PASS, "Set Application language to English");
		driver.findElement(By.xpath(CommonMethod.ClickMoreButton)).click();               // Click More Button
		test.log(Status.PASS, "Navigate to menu page by clicking more button");
		driver.findElement(By.xpath(CommonMethod.ClickSignInButton)).click();             // Select Sign-in button
		test.log(Status.PASS, "Tap on Sign-In Button");
		CommonMethod.Login();	                                                          // Login through an email
		test.log(Status.PASS, "Login via Email");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                  // Wait for screen to update	
		driver.findElement(By.xpath(CommonMethod.SelectUsedCars)).click();                // Click on Used Cars button from more screen
		test.log(Status.PASS, "Tap on Used Cars to open Drop-Down");
		//driver.findElement(By.xpath(AuctionSheetPage)).click();   
		test.log(Status.PASS, "Navigate to Auction Sheet page");
		driver.findElement(By.xpath(EnterChasisNumber)).sendKeys("RU3-1041850");
		test.log(Status.PASS, "Enter Chasis Number");
		driver.findElement(By.xpath(ClickGetAuctionSheetButton)).click();   
		test.log(Status.PASS, "Click on Get Auction Sheet Button");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Mobile Number\").instance(0))"));   //Scroll	
		CommonMethod.EnterMobileNumber();
		test.log(Status.PASS, "Enter Mobile Number");
		driver.findElement(By.xpath(ClickProceedToCheckOut)).click();  
		test.log(Status.PASS, "Click Proceed To CheckOut");
	}
}
