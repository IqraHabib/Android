package Search;
import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import SettingDriver.AllCommonMethods;
import SettingDriver.SetDesiredCapabilities;
import io.appium.java_client.MobileBy;

public class NewBikeSearch extends SetDesiredCapabilities
{	
	AllCommonMethods CommonMethod = new AllCommonMethods();   
	String text;
	private String SelectNewBikes= "//android.widget.TextView[@text= 'New Bikes']";
	private String SelectBikeMake= "//android.widget.TextView[@text= 'Honda']";
	private String SelectBikeModel= "//android.widget.TextView[@text= 'Honda CD 70']";
	private String SpecificationsText= "//android.widget.TextView[@text= 'Specifications']";
	private String VideosText= "//android.widget.TextView[@text= 'Videos']";
	private String ShareButtonText= "//android.widget.Button[@text= 'Share']";
	
 	@Test(priority = 0)
 	public void NewBikeSearch_Honda()
 	{			
		ExtentTest test= extent.createTest("New Bike Search");	
		test.log(Status.INFO, "Test Started");	
		
		//driver.launchApp();
		CommonMethod.SetApplicationLanguage();
		test.log(Status.PASS, "Set Application language to English");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	
		try 
		{ 
			driver.findElement(By.xpath(CommonMethod.SelectBikeTab)).click();   
			test.log(Status.PASS, "Clicked Bike Page");
		}
		catch(org.openqa.selenium.NoSuchElementException e)
		{
			test.log(Status.FAIL, "Clicked Bike Page");
		}
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"New Bikes\").instance(0))"));
		driver.findElement(By.xpath(SelectNewBikes)).click();  
		test.log(Status.PASS, "Navigate to New Bikes Page by selecting New Bikes Button");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath(SelectBikeMake)).click();  
		test.log(Status.PASS, "Select Bike Make");
		text= driver.findElement(By.xpath(CommonMethod.ModelNameText)).getText();              // Check Model Name 
		assertEquals(text, "Honda CD 70");	
		test.log(Status.PASS, "Check Text of Model Name to be selected");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Videos\").instance(0))"));
		text= driver.findElement(By.xpath(VideosText)).getText();                 // Check Videos section
		assertEquals(text, "Videos");
		test.log(Status.PASS, "Check if Videos section is displayed");
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Honda CD 70\").instance(0))"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath(SelectBikeModel)).click();  
		test.log(Status.PASS, "Select Bike Model");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);		
		text= driver.findElement(By.xpath(CommonMethod.ModelNameText)).getText();              // Check Model Name 
		assertEquals(text, "Honda CD 70");	
		test.log(Status.PASS, "Check text of Model Name");
		text= driver.findElement(By.xpath(SpecificationsText)).getText();         // Check Specifications section
		assertEquals(text, "Specifications");
		test.log(Status.PASS, "Check if Specifications section is displayed");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Videos\").instance(0))"));
		text= driver.findElement(By.xpath(VideosText)).getText();                 // Check Videos section
		assertEquals(text, "Videos");
		test.log(Status.PASS, "Check if Videos section is displayed");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Share\").instance(0))"));
		text= driver.findElement(By.xpath(ShareButtonText)).getText();            // Check Share Button
		assertEquals(text, "Share");
		test.log(Status.PASS, "Check text of Share button");
		
		test.log(Status.INFO, "Test Successfully Completed");
 	}
}
