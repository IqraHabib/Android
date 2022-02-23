package AdPosting;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import SettingDriver.AllCommonMethods;
import SettingDriver.SetDesiredCapabilities;

public class BikeAdPost extends SetDesiredCapabilities
{
	AllCommonMethods CommonMethod = new AllCommonMethods(); 
	private String BikeButton= "//android.widget.TextView[@text= 'Bike']";
	private String SelectBikeInformation= "//android.widget.TextView[@text= 'Bike Information']";
	private String SelectBikeYear= "//android.widget.TextView[@text= '2020']";
	private String SelectBikeMakeModel= "//android.widget.TextView[@text= 'CG 125']";
	private String SelectEngineType= "//android.widget.TextView[@text= '4-stroke']";
	private String Feature1= "//android.widget.CheckBox[@text= 'Disc Break']";
	private String Feature2= "//android.widget.CheckBox[@text= 'Wind Shield']";
	
	@Test
	public void BikeAdPostAfterLogin()
	{	
		ExtentTest test= extent.createTest("Bike Ad Post");
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
			driver.findElement(By.id(CommonMethod.ClickSellButton)).click();                       
			test.log(Status.PASS, "Verify that user can tap on Sell Button to select Ad type");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can tap on Sell Button to select Ad type");
		}
		
		try{
			driver.findElement(By.xpath(BikeButton)).click();                               
			test.log(Status.PASS, "Verify that user can Select Ad Type (Test Data: Bike)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can Select Ad Type (Test Data: Bike)");
		}	
		
		try{
			CommonMethod.Login();                                               
			test.log(Status.PASS, "Verify that user can login (Test Data: Email)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can login (Test Data: Email)");
		}
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                        	
		try{
			driver.findElement(By.xpath(CommonMethod.SelectAddPhotos)).click();                    
			test.log(Status.PASS, "Verify that user can click on add photos button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can click on add photos button");
		}
		
		try{
			driver.findElement(By.xpath(CommonMethod.SelectUploadPhotoFromGallery)).click();     
			test.log(Status.PASS, "Verify that user can select option to upload photos (Test Data: Upload Photos from gallery)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select option to upload photos (Test Data: Upload Photos from gallery)");
		}
		
		try{
			driver.findElement(By.xpath(CommonMethod.SelectAllowButton)).click();         
			test.log(Status.PASS, "Verify that user can select allow button to give access to Gallery");
		}catch(org.openqa.selenium.NoSuchElementException e){
		}
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);    
		try{
			driver.findElement(By.id(CommonMethod.SelectImage1)).click();     
			test.log(Status.PASS, "Verify that user can select image for uploading (Test Data: 1st Image)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select image for uploading (Test Data: 1st Image)");	
		}
		
		try{
			driver.findElement(By.xpath(CommonMethod.SelectImage2)).click();                  
			test.log(Status.PASS, "Verify that user can select image for uploading (Test Data: 2nd Image)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select image for uploading (Test Data: 2nd Image)");	
		}
 
		try{
			driver.findElement(By.xpath(CommonMethod.SelectImage3)).click();               
			test.log(Status.PASS, "Verify that user can select image for uploading (Test Data: 3rd Image)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select image for uploading (Test Data: 3rd Image)");	
		}
		
		try{
			driver.findElement(By.id(CommonMethod.EndPicturesSelection)).click();                  	
			test.log(Status.PASS, "Verify that user can end pictures selection by tapping on Tick Button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can end pictures selection by tapping on Tick Button");
		}
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                        
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
			driver.findElement(By.xpath(CommonMethod.SelectCityArea)).click();               
			test.log(Status.PASS, "Verify that user can select city area (Test Data: Abid Market)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select city area (Test Data: Abid Market)");
		}
		
		try{
			driver.findElement(By.xpath(SelectBikeInformation)).click();          
			test.log(Status.PASS, "Verify that user can select bike information button to open model listing");		
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select bike information button to open model listing");		
		}
		
		try{
			driver.findElement(By.xpath(SelectBikeYear)).click();                   
			test.log(Status.PASS, "Verify that user can select bike year (Test Data: 2020)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select bike year (Test Data: 2020)");
		}
		
		try{
			driver.findElement(By.xpath(SelectBikeMakeModel)).click();              
			test.log(Status.PASS, "Verify that user can select bike make and model (Test Data: CG 125)");	
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select bike make and model (Test Data: CG 125)");		
		}
		
		try{
			driver.findElement(By.xpath(CommonMethod.SelectRegisteredInButton)).click();          
			test.log(Status.PASS, "Verify that user can select registered-in button to open city listing");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select registered-in button to open city listing");	
		}
		
		try{
			driver.findElement(By.xpath(CommonMethod.SelectRegisteredCity)).click();       
			test.log(Status.PASS, "Verify that user can select registered city (Test Data: Punjab)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select registered city (Test Data: Punjab)");
		}

		try{
			driver.findElement(By.xpath(CommonMethod.EnterPrice)).sendKeys("70000");            
			test.log(Status.PASS, "Verify that user can enter price (Test Data: 70000)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter price (Test Data: 70000)");	
		}
	
		try{
			driver.findElement(By.xpath(CommonMethod.EnterMileage)).sendKeys("1200");               
			test.log(Status.PASS, "Verify that user can enter mileage (Test Data: 1200)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter mileage (Test Data: 1200)");	
		}
		
		try{
			driver.findElement(By.xpath(CommonMethod.ClickEngineTypeButton)).click();              
			test.log(Status.PASS, "Verify that user can select engine type button to open engine listing");	
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select engine type button to open engine listing");	
		}
		
		try{
			driver.findElement(By.xpath(SelectEngineType)).click();                             
			test.log(Status.PASS, "Verify that user can select engine type (Test Data: 4-stroke)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select engine type (Test Data: 4-stroke)");	
		}
		
		CommonMethod.Scroll("Features");
		try{
			driver.findElement(By.xpath(CommonMethod.EnterDescription)).sendKeys("Test By Appium"); 
			test.log(Status.PASS, "Verify that user can enter description (Test Data: Test By Appium)");			
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter description (Test Data: Test By Appium)");		
		}
		
		try{
			driver.findElement(By.xpath(CommonMethod.SelectFeaturesButton)).click();                
			test.log(Status.PASS, "Verify user can select feature button to open features listing");	
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify user can select feature button to open features listing");	
		}
		
		try{
			driver.findElement(By.xpath(Feature1)).click();                                    
			test.log(Status.PASS, "Verify user can select feature (Test Data: Disc Break)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify user can select feature (Test Data: Disc Break)");
		}
		
		try{
			driver.findElement(By.xpath(Feature2)).click();                                   
			test.log(Status.PASS, "Verify user can select feature (Test Data: Wind Shield)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify user can select feature (Test Data: Wind Shield)");
		}
		
		try{
			driver.findElement(By.xpath(CommonMethod.ClickDoneButton)).click();                    
			test.log(Status.PASS, "Verify user can select done button to close feature listing");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify user can select done button to close feature listing");	
		}
	
		CommonMethod.Scroll("Contact Information");
		try{
			driver.findElement(By.xpath(CommonMethod.ClickPostYourAdButton)).click();  	          
			test.log(Status.PASS, "Verify user can select Post Your Ad button to post Ad");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify user can select Post Your Ad button to post Ad");
		}
		
		test.log(Status.INFO, "Test Completed");
	}
}
