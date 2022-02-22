package LeadForms;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import SettingDriver.AllCommonMethods;
import SettingDriver.SetDesiredCapabilities;
import io.appium.java_client.MobileBy;

public class Insurance extends SetDesiredCapabilities
{
	AllCommonMethods CommonMethod = new AllCommonMethods();   
	private String CarInsurancePage= "//android.widget.TextView[@text= 'Car Insurance']";
	private String SelectShowPlans= "//android.widget.Button[@text= 'Show Plans']";
	private String SelectTracker= "com.pakwheels.staging:id/cbAddTrakcer";
	
	
	@Test(priority = 0)
	public void InsuranceRequest_WithoutLogin()
	{
		ExtentTest test= extent.createTest("Insurance Request- Without Login");
		driver.launchApp();
		
		test.log(Status.INFO, "Test Started");	
		CommonMethod.SetApplicationLanguage();		                                         // Set Applications Language
		test.log(Status.PASS, "Set Application language to English");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                     // Wait for screen to update
		driver.findElement(By.xpath(CommonMethod.ClickMoreButton)).click();                  // Click More Button
		test.log(Status.PASS, "Navigate to menu page by clicking more button");
		driver.findElement(By.xpath(CarInsurancePage)).click();                              // Navigate to Insurance Page
		test.log(Status.PASS, "Navigate to Car Insurance Page");
		driver.findElement(By.xpath(CommonMethod.SelectCarModelButton)).click();             // Select Car model Button
		test.log(Status.PASS, "Tap Car Model button to Select Car Information");
		driver.findElement(By.xpath(CommonMethod.SelectCarYear)).click();                    // Select car Year
		test.log(Status.PASS, "Select Car Year");
		driver.findElement(By.xpath(CommonMethod.SelectCarMakeModel)).click();               // Select Car Make and Model
		test.log(Status.PASS, "Select Car Make and Model");
		driver.findElement(By.xpath(CommonMethod.SelectCarVersion)).click();                 // Select Car Version
		test.log(Status.PASS, "Select Car Version");
		driver.findElement(By.xpath(CommonMethod.EnterPrice)).sendKeys("1500000");           // Enter Car Price
		test.log(Status.PASS, "Enter Price");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                     // Wait for screen to update
		driver.findElement(By.xpath(SelectShowPlans)).click();                               // Select Show Plans button
		test.log(Status.PASS, "Tap on Show Plans");
		driver.findElement(By.id(SelectTracker)).click();                                    // Add a tracker
		test.log(Status.PASS, "Add Tracker");
		driver.findElement(By.xpath(CommonMethod.ClickApplyNowButton)).click();              // Select Apply Now button
		test.log(Status.PASS, "Tap on Apply Now Button");
		CommonMethod.EnterName();                                                            // Enter Name
		test.log(Status.PASS, "Enter Name");
		CommonMethod.EnterMobileNumber();                                                    // Enter Phone Number
		test.log(Status.PASS, "Enter Mobile Number");
		driver.findElement(By.xpath(CommonMethod.SelectLocationButton)).click();             // Select Location
		test.log(Status.PASS, "Select Location button");
		driver.findElement(By.xpath(CommonMethod.SelectCity)).click();                       // Select City
		test.log(Status.PASS, "Select City");
		//driver.findElement(By.xpath(CommonMethod.ClickSubmitButton)).click();                // Click on Submit button
		test.log(Status.PASS, "Select Submit Button");
		test.log(Status.INFO, "Test Successfully Completed");
	}	
	
	
	@Test(priority = 1)
	public void InsuranceRequest_WithLogin()
	{
		ExtentTest test= extent.createTest("Insurance Request- Login");
		driver.launchApp();
		
		test.log(Status.INFO, "Test Started");	
		CommonMethod.SetApplicationLanguage();		                                         // Set Applications Language
		test.log(Status.PASS, "Set Application language to English");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                     // Wait for screen to update
		driver.findElement(By.xpath(CommonMethod.ClickMoreButton)).click();                  // Click More Button
		test.log(Status.PASS, "Navigate to menu page by clicking more button");
		driver.findElement(By.xpath(CommonMethod.ClickSignInButton)).click();                // Select Sign-in button
		test.log(Status.PASS, "Tap on Sign-In Button");
		CommonMethod.Login();                                                                // Login from an Email account	
		test.log(Status.PASS, "Login via Email");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                     // Wait for screen to update		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Car Insurance\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(CarInsurancePage)).click();                              // Navigate to Insurance Page
		test.log(Status.PASS, "Navigate to Car Insurance Page");
		driver.findElement(By.xpath(CommonMethod.SelectCarModelButton)).click();             // Select Car model Button
		test.log(Status.PASS, "Tap Car Model button to Select Car Information");
		driver.findElement(By.xpath(CommonMethod.SelectCarYear)).click();                    // Select car Year
		test.log(Status.PASS, "Select Car Year");
		driver.findElement(By.xpath(CommonMethod.SelectCarMakeModel)).click();               // Select Car Make and Model
		test.log(Status.PASS, "Select Car Make and Model");
		driver.findElement(By.xpath(CommonMethod.SelectCarVersion)).click();                 // Select Car Version
		test.log(Status.PASS, "Select Car Version");
		driver.findElement(By.xpath(CommonMethod.EnterPrice)).sendKeys("1500000");           // Enter Car Price
		test.log(Status.PASS, "Enter Price");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                     // Wait for screen to update
		driver.findElement(By.xpath(SelectShowPlans)).click();                               // Select Show Plans button
		test.log(Status.PASS, "Tap on Show Plans");
		driver.findElement(By.id(SelectTracker)).click();                                    // Add a tracker
		test.log(Status.PASS, "Add Tracker");
		driver.findElement(By.xpath(CommonMethod.ClickApplyNowButton)).click();              // Select Apply Now button
		test.log(Status.PASS, "Tap on Apply Now Button");
		driver.findElement(By.xpath(CommonMethod.SelectLocationButton)).click();             // Select Location
		test.log(Status.PASS, "Select Location button");
		driver.findElement(By.xpath(CommonMethod.SelectCity)).click();                       // Select City
		test.log(Status.PASS, "Select City");
		//driver.findElement(By.xpath(CommonMethod.ClickSubmitButton)).click();                // Click on Submit button
		test.log(Status.PASS, "Select Submit Button");
		test.log(Status.INFO, "Test Successfully Completed");
	}
		
}
