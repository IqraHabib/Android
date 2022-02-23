package LeadForms;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import SettingDriver.AllCommonMethods;
import SettingDriver.SetDesiredCapabilities;

public class AuctionSheet extends SetDesiredCapabilities 
{
	AllCommonMethods CommonMethod = new AllCommonMethods(); 
	private String AuctionSheetPage= "com.pakwheels.staging:id/marketing_widget_title";
	private String EnterChasisNumber= "//android.widget.EditText[@text= 'Enter Chassis Number(e.g ZZT240–316982)']";
	private String ClickGetAuctionSheetButton= "//android.widget.Button[@text= 'Get Auction Sheet']";
	private String ClickProceedToCheckOut= "//android.widget.Button[@text= 'Proceed to Checkout']";
	
	@Test(priority = 0)
	public void AuctionSheetRequest_WithoutLogin()
	{
		ExtentTest test= extent.createTest("Auction Sheet Request- Without Login");
		driver.launchApp();	
		test.log(Status.INFO, "Test Started");	
		
		try{
			CommonMethod.SetApplicationLanguage();                                                  
			test.log(Status.PASS, "Verify that user can set application language (Test Data: English)");	
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can set application language (Test Data: English)");		
		}
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                  
		try{
			driver.findElement(By.xpath(CommonMethod.ClickMoreButton)).click();            
			test.log(Status.PASS, "Verify that user can navigate to menu page by clicking more button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can navigate to menu page by clicking more button");
		}
		
		try{
			driver.findElement(By.xpath(CommonMethod.SelectUsedCars)).click();                
			test.log(Status.PASS, "Verify that user can tap on Used Cars button to open Drop-Down");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can tap on Used Cars button to open Drop-Down");	
		}
		
		try{
			driver.findElements(By.id(AuctionSheetPage)).get(7).click();                        
			test.log(Status.PASS, "Verify that user can navigate to Auction Sheet page by cliking on Auction Sheet button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can navigate to Auction Sheet page by cliking on Auction Sheet button");	
		}
		
		try{
			driver.findElement(By.xpath(EnterChasisNumber)).sendKeys("RU3-1041850");
			test.log(Status.PASS, "Verify that user can enter chasis number (Test Data: RU3-1041850)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter chasis number (Test Data: RU3-1041850)");
		}
		
		try{
			driver.findElement(By.xpath(ClickGetAuctionSheetButton)).click();   
			test.log(Status.PASS, "Verify that user can click on Get Auction Sheet Button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can click on Get Auction Sheet Button");	
		}
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		try{
			CommonMethod.EnterName();                                                     
			test.log(Status.PASS, "Verify that user can enter name");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter name");
		}
		
		CommonMethod.Scroll("Proceed To CheckOut");
		try{
			CommonMethod.EnterMobileNumber();                                             
			test.log(Status.PASS, "Verify that user can enter mobile number");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter mobile number");	
		}
		
		try{
			driver.findElement(By.xpath(ClickProceedToCheckOut)).click();  
			test.log(Status.PASS, "Verify that user can click on Proceed To CheckOut button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can click on Proceed To CheckOut button");
		}
		
		test.log(Status.INFO, "Test Completed");
	}
	
	@Test(priority = 1)
	public void AuctionSheetRequest_WithLogin()
	{
		ExtentTest test= extent.createTest("Auction Sheet Request- With Login");
		driver.launchApp();	
		test.log(Status.INFO, "Test Started");	
		
		try{
			CommonMethod.SetApplicationLanguage();                                                  
			test.log(Status.PASS, "Verify that user can set application language (Test Data: English)");	
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can set application language (Test Data: English)");		
		}
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                  
		try{
			driver.findElement(By.xpath(CommonMethod.ClickMoreButton)).click();            
			test.log(Status.PASS, "Verify that user can navigate to menu page by clicking more button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can navigate to menu page by clicking more button");
		}
		
		try{
			driver.findElement(By.xpath(CommonMethod.ClickSignInButton)).click();             
			test.log(Status.PASS, "Verify that user can tap on Sign-In Button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can tap on Sign-In Button");
		}
		
		try{
			CommonMethod.Login();                                               
			test.log(Status.PASS, "Verify that user can login (Test Data: Email)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can login (Test Data: Email)");
		}
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                 
		CommonMethod.Scroll("Blog");
		try{
			driver.findElement(By.xpath(CommonMethod.SelectUsedCars)).click();                
			test.log(Status.PASS, "Verify that user can tap on Used Cars button to open Drop-Down");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can tap on Used Cars button to open Drop-Down");	
		}
		
		try{
			driver.findElements(By.id(AuctionSheetPage)).get(6).click();                           
			test.log(Status.PASS, "Verify that user can navigate to Auction Sheet page by cliking on Auction Sheet button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can navigate to Auction Sheet page by cliking on Auction Sheet button");	
		}
		
		try{
			driver.findElement(By.xpath(EnterChasisNumber)).sendKeys("RU3-1041850");
			test.log(Status.PASS, "Verify that user can enter chasis number (Test Data: RU3-1041850)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter chasis number (Test Data: RU3-1041850)");
		}

		try{
			driver.findElement(By.xpath(ClickGetAuctionSheetButton)).click();   
			test.log(Status.PASS, "Verify that user can click on Get Auction Sheet Button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can click on Get Auction Sheet Button");	
		}
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		CommonMethod.Scroll("Proceed To CheckOut");
		try{
			driver.findElement(By.xpath(ClickProceedToCheckOut)).click();  
			test.log(Status.PASS, "Verify that user can click on Proceed To CheckOut button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can click on Proceed To CheckOut button");
		}
		
		test.log(Status.INFO, "Test Completed");
	}
}
