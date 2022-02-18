package LeadForms;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import SettingDriver.AllCommonMethods;
import SettingDriver.SetDesiredCapabilities;

public class AuctionSheet extends SetDesiredCapabilities 
{
	AllCommonMethods CommonMethod = new AllCommonMethods(); 
	private String AuctionSheetPage= "(//com.pakwheels.staging:id/marketing_widget_title)[3]";
	private String EnterChasisNumber= "//android.widget.EditText[@text= 'Enter Chassis Number(e.g ZZT240–316982)']";
	private String ClickGetAuctionSheetButton= "//android.widget.Button[@text= 'Get Auction Sheet']";
	
	@Test(priority = 0)
	public void AuctionSheetRequest_WithoutLogin()
	{
		CommonMethod.SetApplicationLanguage();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                  // Wait for screen to update
		driver.findElement(By.xpath(CommonMethod.ClickMoreButton)).click();               // Click More Button
		driver.findElement(By.xpath(CommonMethod.SelectUsedCars)).click();                // Click on Used Cars button from more screen
		driver.findElement(By.xpath(AuctionSheetPage)).click();   
		driver.findElement(By.xpath(EnterChasisNumber)).sendKeys("RU3-1041850");
		driver.findElement(By.xpath(ClickGetAuctionSheetButton)).click();   
		
	}
	
/*	@Test(priority = 1)
	public void AuctionSheetRequest_WithLogin()
	{

	}*/
}
