package Search;
import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import SettingDriver.AllCommonMethods;
import SettingDriver.SetDesiredCapabilities;

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
 	public void NewBikesSearch()
 	{			
 		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		ExtentTest test= extent.createTest("New Bike Search");		
		driver.launchApp();
		test.log(Status.INFO, "Test Started");
		
		try{
			CommonMethod.SetApplicationLanguage();                                                  
			test.log(Status.PASS, "Verify that user can set application language (Test Data: English)");	
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can set application language (Test Data: English)");		
		}
		
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	
		try { 
			driver.findElement(By.xpath(CommonMethod.SelectBikeTab)).click();   
			test.log(Status.PASS, "Verify that user can select Bike tab from headers");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Bike tab from headers");
		}
		
		CommonMethod.Scroll("New Bikes");
		try { 
			driver.findElement(By.xpath(SelectNewBikes)).click();  
			test.log(Status.PASS, "Verify that user can navigate to New Bikes Page by selecting New Bikes Button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can navigate to New Bikes Page by selecting New Bikes Button");
		}
			
		test.log(Status.INFO, "User is navigated to Bike Make Listing Page");
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);		
		try {
			driver.findElement(By.xpath(SelectBikeMake)).click();  
			test.log(Status.PASS, "Verify that user can select Bike Make (Test Data: Honda)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Bike Make (Test Data: Honda)");
		}
			
		test.log(Status.INFO, "User is navigated to Bike Models Listing Page");
		try{
			String text= driver.findElement(By.xpath(CommonMethod.ModelNameText)).getText();   
			assertEquals(text, "Honda CD 70");	
			test.log(Status.PASS, "Verify that model is displayed (Test Data: Honda CD 70)");
	    }catch(AssertionError e){
			test.log(Status.FAIL, "Verify that model is displayed (Test Data: Honda CD 70)");
        }
		
		CommonMethod.Scroll("Videos");
		try {
			String text= driver.findElement(By.xpath(VideosText)).getText();          
			assertEquals(text, "Videos");
			test.log(Status.PASS, "Verify that Videos section is displayed");
		}catch(AssertionError e){
			test.log(Status.FAIL, "Verify that Videos section is displayed");
		}
		
		CommonMethod.Scroll("Honda CD 70");
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		try {
			driver.findElement(By.xpath(SelectBikeModel)).click();  
			test.log(Status.PASS, "Verify that user can select Bike Model (Test Data: Honda CD 70)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Bike Model (Test Data: Honda CD 70)");
		}
		
		test.log(Status.INFO, "User is navigated to Bike Model Detail Page");
		
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	
		try {
			String text= driver.findElement(By.xpath(CommonMethod.ModelNameText)).getText();           
			assertEquals(text, "Honda CD 70");	
			test.log(Status.PASS, "Verify text of Model Name is same as the one selected on model detail page");
		}catch(AssertionError e){
			test.log(Status.FAIL, "Verify text of Model Name is same as the one selected on model detail page");
		}
	
		try {
			String text= driver.findElement(By.xpath(SpecificationsText)).getText();        
			assertEquals(text, "Specifications");
			test.log(Status.PASS, "Verify that Specifications section is displayed");
		}catch(AssertionError e){
			test.log(Status.FAIL, "Verify that Specifications section is displayed");
		}
		
		CommonMethod.Scroll("Videos");
		try {
			String text= driver.findElement(By.xpath(VideosText)).getText();          
			assertEquals(text, "Videos");
			test.log(Status.PASS, "Verify that Videos section is displayed");
		}catch(AssertionError e){
			test.log(Status.FAIL, "Verify that Videos section is displayed");
		}
		
		CommonMethod.Scroll("Share");
		try {
			String text= driver.findElement(By.xpath(ShareButtonText)).getText();         
			assertEquals(text, "Share");
			test.log(Status.PASS, "Verify that Share button is displayed");
		}catch(AssertionError e){
			test.log(Status.FAIL, "Verify that Share button is displayed");
		}
		
		test.log(Status.INFO, "Test Completed");
 	}
}
