package SettingDriver;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import Resources.ExtentReporterNG;

public class SetDesiredCapabilities extends ExtentReporterNG
{
	public static AppiumDriver<MobileElement> driver;
	@BeforeTest
	public void SetCapabilities() throws MalformedURLException 
	{
			try 
			{
				DesiredCapabilities cap =  new DesiredCapabilities();
				
				/*File appDir = new File ("src");
				File app = new File(appDir, "Android_Stagging_112.apk");   // apk file name	
				cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());*/
				
				cap.setCapability("platformName", "Android");
				cap.setCapability("deviceName", "Samsung");
				cap.setCapability("udid", "ce11160bc0d3852a02");
				cap.setCapability("automationName", "UiAutomator2");
				cap.setCapability("platformVersion", "10.0.0");
				cap.setCapability("appPackage", "com.pakwheels.staging");
				cap.setCapability("appActivity", "com.pakwheels.activities.other.SplashScreenActivity");
			//	cap.setCapability("unicodeKeyboard", true);
			//	cap.setCapability("resetKeyboard", true);
				//cap.setCapability(MobileCapabilityType.NO_RESET, "true");
				//cap.setCapability(MobileCapabilityType.FULL_RESET, "false");
				driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
			}
			catch(Exception exp) 
			{
				System.out.println("Cause is: "+ exp.getCause());
				System.out.println("Message is: "+ exp.getMessage());
				exp.printStackTrace();
			}
	}
	
	public static void getScreenshot(String s) throws IOException
	{
		File scrfile=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrfile,new File(System.getProperty("user.dir")+"\\"+s+".png"));
	
	}

}

