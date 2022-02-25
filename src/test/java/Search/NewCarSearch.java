package Search;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import SettingDriver.AllCommonMethods;
import SettingDriver.SetDesiredCapabilities;

public class NewCarSearch extends SetDesiredCapabilities
{
	AllCommonMethods CommonMethod = new AllCommonMethods(); 
	private String ClickNewCarsButton= "//android.widget.CompoundButton[@text= 'New Cars']";
	private String SelectCarMake= "//android.widget.TextView[@text= 'Suzuki']";
	private String SelectCarModel= "//android.widget.TextView[@text= 'Suzuki Alto']";
	private String ClickOnRoadPrice= "//android.widget.Button[@text= 'Get On Road Price']";	
	private String SelectVersionButton= "//android.widget.TextView[@text= 'Version']";
	private String SelectBookThisCarNowButton= "//android.widget.Button[@text= 'Book This Car Now']";
	private String SelectCash= "//android.widget.RadioButton[@text= 'Cash']";
	
	//private String PopularNewCars= "//android.widget.TextView[@text= 'Popular New Cars']";
	//private String NewlyLaunchedCars= "//android.widget.TextView[@text= 'Newly Launched Cars']";
	//private String UpcomingNewCars= "//android.widget.TextView[@text= 'Upcoming New Cars']";
	
	@Test(priority = 0)
 	public void NewCarsSearch()
 	{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);  
		ExtentTest test= extent.createTest("New Car Search");	
		//driver.launchApp();
		test.log(Status.INFO, "Test Started");	
		
		try{
			CommonMethod.SetApplicationLanguage();                                                  
			test.log(Status.PASS, "Verify that user can set application language (Test Data: English)");	
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can set application language (Test Data: English)");		
		}
		
		try{
			driver.findElement(By.xpath(ClickNewCarsButton)).click();                                                            
			test.log(Status.PASS, "Verify that user can click New Cars tab from headers");	
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can click New Cars tab from headers");		
		}
		
		/*try{
			String text= driver.findElement(By.xpath(PopularNewCars)).getText();          
			assertEquals(text, "Popular New Cars");
			test.log(Status.PASS, "Verify Popular New Cars section is displayed");
		}catch(AssertionError e){
			test.log(Status.FAIL, "Verify Popular New Cars section is displayed");
		}
		
		CommonMethod.Scroll("Newly Launched Cars");
		try{
			String text= driver.findElement(By.xpath(NewlyLaunchedCars)).getText();          
			assertEquals(text, "Newly Launched Cars");
			test.log(Status.PASS, "Verify Popular New Cars section is displayed");
		}catch(AssertionError e){
			test.log(Status.FAIL, "Verify Popular New Cars section is displayed");
		}
		
		CommonMethod.Scroll("Upcoming New Cars");
		try{
			String text= driver.findElement(By.xpath(UpcomingNewCars)).getText();          
			assertEquals(text, "Upcoming New Cars");
			test.log(Status.PASS, "Verify Popular New Cars section is displayed");
		}catch(AssertionError e){
			test.log(Status.FAIL, "Verify Popular New Cars section is displayed");
		}*/
		
		
		try{
			driver.findElement(By.xpath(SelectCarMake)).click();                                                            
			test.log(Status.PASS, "Verify that user can select car make (Test Data: Suzuki)");	
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select car make (Test Data: Suzuki)");		
		}
		
		try{
			driver.findElement(By.xpath(SelectCarModel)).click();                                                            
			test.log(Status.PASS, "Verify that user can select car model (Test Data: Suzuki Alto)");	
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select car model (Test Data: Suzuki Alto)");		
		}
		
		try{
			driver.findElement(By.xpath(ClickOnRoadPrice)).click();                                                            
			test.log(Status.PASS, "Verify that user can select on road price button");	
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select on road price button");		
		}
		
		try{
			driver.findElement(By.xpath(SelectVersionButton)).click();                                                            
			test.log(Status.PASS, "Verify that user can select version button to open version listing");	
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select version button to open version listing");		
		}
		
		try{
			driver.findElement(By.xpath(CommonMethod.SelectCarVersion)).click();                                                            
			test.log(Status.PASS, "Verify that user can select version");	
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select version");		
		}
		
		try{
			driver.findElement(By.xpath(CommonMethod.SelectLocationButton)).click();                
			test.log(Status.PASS, "Verify that user can select location button to open cities listing");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select location button to open cities listing");	
		}
		
		try{
			driver.findElement(By.xpath(CommonMethod.SelectCity)).click();                       
			test.log(Status.PASS, "Verify that user can select city (Test Data: Lahore)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select city (Test Data: Lahore)");
		}
		
		try{
			driver.findElement(By.xpath(CommonMethod.ClickDoneButton)).click();                    
			test.log(Status.PASS, "Verify user can select done button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify user can select done button");	
		}
		
		try{
			driver.findElement(By.xpath(SelectBookThisCarNowButton)).click();                    
			test.log(Status.PASS, "Verify user can select Book This Car Now button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify user can select Book This Car Now button");	
		}
		
		try{
			driver.findElement(By.xpath(SelectCash)).click();                    
			test.log(Status.PASS, "Verify user can select Cash radio button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify user can select Cash radio button");	
		}
		
		try{
			CommonMethod.EnterName();                                                     
			test.log(Status.PASS, "Verify that user can enter name");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter name");
		}
		
		try{
			driver.findElement(By.xpath(CommonMethod.EnterUserName)).sendKeys(CommonMethod.Email);                
			test.log(Status.PASS, "Verify that user can enter email");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter email");
		}
		
		try{
			CommonMethod.EnterMobileNumber();                                             
			test.log(Status.PASS, "Verify that user can enter mobile number");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter mobile number");	
		}
		
		try{
			driver.findElement(By.xpath(SelectBookThisCarNowButton)).click();                    
			test.log(Status.PASS, "Verify user can select Book This Car Now button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify user can select Book This Car Now button");	
		}
		
		test.log(Status.INFO, "Test Completed");
 	}
}
