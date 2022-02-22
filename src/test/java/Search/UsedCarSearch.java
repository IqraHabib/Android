package Search;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import SettingDriver.AllCommonMethods;
import SettingDriver.SetDesiredCapabilities;

public class UsedCarSearch extends SetDesiredCapabilities
{
	AllCommonMethods CommonMethod = new AllCommonMethods(); 
	@Test(priority = 0)
 	public void UsedCarSearch_Honda()
 	{
		ExtentTest test= extent.createTest("Used Car Search");	
		test.log(Status.INFO, "Test Started");	
		
		//driver.launchApp();
		CommonMethod.SetApplicationLanguage();
		test.log(Status.PASS, "Set Application language to English");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		test.log(Status.INFO, "Test Successfully Completed");
 	}
}
