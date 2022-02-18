package LeadForms;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
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
		//driver.launchApp();
		CommonMethod.SetApplicationLanguage();		                                      // Set Applications Language
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                  // Wait for screen to update
		driver.findElement(By.xpath(CommonMethod.ClickMoreButton)).click();               // Click More Button	
		driver.findElement(By.xpath(CommonMethod.SelectUsedCars)).click();                // Click on Used Cars button from more screen
		driver.findElement(By.xpath(InspectionPage)).click();                             // Navigate to Inspection page
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                  // Wait for screen to update
		driver.findElement(By.xpath(InspectionFormButton)).click();                       // Click on Schedule inspection button
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                  // Wait for screen to update
		driver.findElement(By.xpath(CommonMethod.SelectCarModelButton)).click();          // Select Car model
		driver.findElement(By.xpath(CommonMethod.SelectCarYear)).click();                 // Select Car Year
		driver.findElement(By.xpath(CommonMethod.SelectCarMakeModel)).click();            // Select Car Make-Model
		driver.findElement(By.xpath(CommonMethod.SelectLocationButton)).click();          // Select Location
		driver.findElement(By.xpath(CommonMethod.SelectCity)).click();                    // Select City
		driver.findElement(By.xpath(CommonMethod.SelectCityArea)).click();                // Select City Area
		CommonMethod.EnterName();                                                         // Enter Name
		CommonMethod.EnterMobileNumber();                                                 // Enter Mobile Number
		CommonMethod.EnterEmail();                                                        // Enter Email
		//driver.findElement(By.xpath(CommonMethod.ClickSubmitButton)).click();           // Click on Submit button
	}
	
	@Test(priority = 1)
	public void InspectionRequest_FromMenu_WithLogin()
	{	
		//driver.launchApp();
		CommonMethod.SetApplicationLanguage();		                                       // Set Applications Language
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                   // Wait for screen to update
		driver.findElement(By.xpath(CommonMethod.ClickMoreButton)).click();                // Click More Button
		driver.findElement(By.xpath(CommonMethod.ClickSignInButton)).click();              // Select Sign-in button
		CommonMethod.Login();	
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                   // Wait for screen to update
		driver.findElement(By.xpath(CommonMethod.SelectUsedCars)).click();                 // Click on Used Cars button from more screen
		driver.findElement(By.xpath(InspectionPage)).click();                              // Navigate to Inspection page
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                   // Wait for screen to update
		driver.findElement(By.xpath(InspectionFormButton)).click();                        // Click on Schedule inspection button
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                   // Wait for screen to update
		driver.findElement(By.xpath(CommonMethod.SelectCarModelButton)).click();           // Select Car model
		driver.findElement(By.xpath(CommonMethod.SelectCarYear)).click();                  // Select Car Year
		driver.findElement(By.xpath(CommonMethod.SelectCarMakeModel)).click();             // Select Car Make-Model
		driver.findElement(By.xpath(CommonMethod.SelectLocationButton)).click();           // Select Location
		driver.findElement(By.xpath(CommonMethod.SelectCity)).click();                     // Select City
		driver.findElement(By.xpath(CommonMethod.SelectCityArea)).click();                 // Select City Area
		CommonMethod.EnterMobileNumber();                                                  // Enter Mobile Number
		//driver.findElement(By.xpath(CommonMethod.ClickSubmitButton)).click();            // Click on Submit button
	}	
}
