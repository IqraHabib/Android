package LeadForms;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import SettingDriver.AllCommonMethods;
import SettingDriver.SetDesiredCapabilities;

public class InspectionRequest extends SetDesiredCapabilities
{	
	AllCommonMethods CommonMethod = new AllCommonMethods();                               // Accessing All common methods class
	private String InspectionPage= "//android.widget.TextView[@text='PakWheels Car Inspection']";
	private String InspectionFormButton= "//android.widget.Button[@text='Schedule Inspection']";
	
	@Test(priority = 0)
	public void InspectionRequest_FromMenu_WithOutLogin()
	{		
		ExtentTest test= extent.createTest("InspectionRequest_FromMenu_WithOutLogin");
		driver.launchApp();
		
		test.log(Status.INFO, "Test Started");	
		CommonMethod.SetApplicationLanguage();		                                      // Set Applications Language
		test.log(Status.PASS, "Set Application language to English");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                  // Wait for screen to update
		driver.findElement(By.xpath(CommonMethod.ClickMoreButton)).click();               // Click More Button	
		test.log(Status.PASS, "Navigate to menu page by clicking more button");
		driver.findElement(By.xpath(CommonMethod.SelectUsedCars)).click();                // Click on Used Cars button from more screen
		test.log(Status.PASS, "Tap on Used Cars to open Drop-Down");
		driver.findElement(By.xpath(InspectionPage)).click();                             // Navigate to Inspection page
		test.log(Status.PASS, "Navigate to Inspection request page");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                  // Wait for screen to update
		driver.findElement(By.xpath(InspectionFormButton)).click();                       // Click on Schedule inspection button
		test.log(Status.PASS, "Tap on Schedule Inspection Button");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                  // Wait for screen to update
		driver.findElement(By.xpath(CommonMethod.SelectCarModelButton)).click();          // Select Car model
		test.log(Status.PASS, "Tap Car Model button to Select Car Information");
		driver.findElement(By.xpath(CommonMethod.SelectCarYear)).click();                 // Select Car Year
		test.log(Status.PASS, "Select Car Year");
		driver.findElement(By.xpath(CommonMethod.SelectCarMakeModel)).click();            // Select Car Make-Model
		test.log(Status.PASS, "Select Car Make and Model");
		driver.findElement(By.xpath(CommonMethod.SelectLocationButton)).click();          // Select Location
		test.log(Status.PASS, "Select Location button");
		driver.findElement(By.xpath(CommonMethod.SelectCity)).click();                    // Select City
		test.log(Status.PASS, "Select City");
		driver.findElement(By.xpath(CommonMethod.SelectCityArea)).click();                // Select City Area
		test.log(Status.PASS, "Select City Area");
		CommonMethod.EnterName();                                                         // Enter Name
		test.log(Status.PASS, "Enter Name");
		CommonMethod.EnterMobileNumber();                                                 // Enter Mobile Number
		test.log(Status.PASS, "Enter Mobile Number");
		CommonMethod.EnterEmail();                                                        // Enter Email
		test.log(Status.PASS, "Enter Email");
		//driver.findElement(By.xpath(CommonMethod.ClickSubmitButton)).click();           // Click on Submit button
		test.log(Status.PASS, "Select Submit Button");
		test.log(Status.INFO, "Test Successfully Completed");
	}
	
	@Test(priority = 1)
	public void InspectionRequest_FromMenu_WithLogin()
	{	
		ExtentTest test= extent.createTest("InspectionRequest_FromMenu_WithLogin");
		driver.launchApp();
		
		test.log(Status.INFO, "Test Started");	
		CommonMethod.SetApplicationLanguage();                                             // Set Applications Language
		test.log(Status.PASS, "Set Application language to English");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                   // Wait for screen to update
		driver.findElement(By.xpath(CommonMethod.ClickMoreButton)).click();                // Click More Button
		test.log(Status.PASS, "Navigate to menu page by clicking more button");
		driver.findElement(By.xpath(CommonMethod.ClickSignInButton)).click();              // Select Sign-in button
		test.log(Status.PASS, "Tap on Sign-In Button");
		CommonMethod.Login();	
		test.log(Status.PASS, "Login via Email");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                   // Wait for screen to update
		driver.findElement(By.xpath(CommonMethod.SelectUsedCars)).click();                 // Click on Used Cars button from more screen
		test.log(Status.PASS, "Tap on Used Cars to open Drop-Down");
		driver.findElement(By.xpath(InspectionPage)).click();                              // Navigate to Inspection page
		test.log(Status.PASS, "Navigate to Inspection request page");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                   // Wait for screen to update
		driver.findElement(By.xpath(InspectionFormButton)).click();                        // Click on Schedule inspection button
		test.log(Status.PASS, "Tap on Schedule Inspection Button");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                   // Wait for screen to update
		driver.findElement(By.xpath(CommonMethod.SelectCarModelButton)).click();           // Select Car model
		test.log(Status.PASS, "Tap Car Model button to Select Car Information");
		driver.findElement(By.xpath(CommonMethod.SelectCarYear)).click();                  // Select Car Year
		test.log(Status.PASS, "Select Car Year");
		driver.findElement(By.xpath(CommonMethod.SelectCarMakeModel)).click();             // Select Car Make-Model
		test.log(Status.PASS, "Select Car Make and Model");
		driver.findElement(By.xpath(CommonMethod.SelectLocationButton)).click();           // Select Location
		test.log(Status.PASS, "Select Location button");
		driver.findElement(By.xpath(CommonMethod.SelectCity)).click();                     // Select City
		test.log(Status.PASS, "Select City");
		driver.findElement(By.xpath(CommonMethod.SelectCityArea)).click();                 // Select City Area
		test.log(Status.PASS, "Select City Area");
		CommonMethod.EnterMobileNumber();                                                  // Enter Mobile Number
		test.log(Status.PASS, "Enter Mobile Number");
		//driver.findElement(By.xpath(CommonMethod.ClickSubmitButton)).click();            // Click on Submit button
		test.log(Status.PASS, "Select Submit Button");
		test.log(Status.INFO, "Test Successfully Completed");
	}	
}
