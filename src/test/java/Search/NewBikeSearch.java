package Search;
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
	private String SelectNewBikes= "//android.widget.TextView[@text= 'New Bikes']";
	private String SelectBikeMake= "//android.widget.TextView[@text= 'Honda']";
	private String SelectBikeModel= "//android.widget.TextView[@text= 'Honda CD 70']";
	
 	@Test(priority = 0)
 	public void Scroll()
 	{			
 		//driver.launchApp();
		CommonMethod.SetApplicationLanguage();
		ExtentTest test= extent.createTest("New Bike Search");
		
		test.log(Status.INFO, "Logged-In");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath(CommonMethod.SelectBikePage)).click();   
		test.log(Status.PASS, "Clicked Bike Page");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"New Bikes\").instance(0))"));
		driver.findElement(By.xpath(SelectNewBikes)).click();  
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath(SelectBikeMake)).click();  
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath(SelectBikeModel)).click();  
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
 	}
}
