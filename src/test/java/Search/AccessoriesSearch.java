package Search;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import SettingDriver.AllCommonMethods;
import SettingDriver.SetDesiredCapabilities;

public class AccessoriesSearch extends SetDesiredCapabilities
{
	AllCommonMethods CommonMethod = new AllCommonMethods(); 
	@Test(priority = 0)
 	public void AccessoriesSearch_()
 	{
		ExtentTest test= extent.createTest("Accessories Search");	
		test.log(Status.INFO, "Test Started");	
		
		//driver.launchApp();
		CommonMethod.SetApplicationLanguage();
		test.log(Status.PASS, "Set Application language to English");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		test.log(Status.INFO, "Test Successfully Completed");
 	}
}
