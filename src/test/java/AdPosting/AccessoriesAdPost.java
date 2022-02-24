package AdPosting;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import SettingDriver.AllCommonMethods;
import SettingDriver.SetDesiredCapabilities;

public class AccessoriesAdPost extends SetDesiredCapabilities
{
	
	AllCommonMethods CommonMethod = new AllCommonMethods(); 
	private String AccessoriesButton= "//android.widget.TextView[@text= 'Auto Parts']";
	private String SelectCategoryButton= "//android.widget.TextView[@text= 'Category']";
	private String SelectCategory= "//android.widget.TextView[@text= 'Amplifiers']";
	private String EnterTitle= "//android.widget.EditText[@text= 'Enter Title']";
	
	@Test
	public void AccessoriesAdPostAfterLogin()
	{	
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		ExtentTest test= extent.createTest("Accessories Ad Post");
		driver.launchApp();
		test.log(Status.INFO, "Test Started");	
		
		try{
			CommonMethod.SetApplicationLanguage();                                                  
			test.log(Status.PASS, "Verify that user can set application language (Test Data: English)");	
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can set application language (Test Data: English)");		
		}
		     
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		try{
			driver.findElement(By.id(CommonMethod.ClickSellButton)).click();                       
			test.log(Status.PASS, "Verify that user can tap on Sell Button to select Ad type");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can tap on Sell Button to select Ad type");
		}
		
		try{
			driver.findElement(By.xpath(AccessoriesButton)).click();                               
			test.log(Status.PASS, "Verify that user can Select Ad Type (Test Data: Accessories)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can Select Ad Type (Test Data: Accessories)");
		}
		
		try{
			CommonMethod.Login();                                               
			test.log(Status.PASS, "Verify that user can login (Test Data: Email)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can login (Test Data: Email)");
		}
		
		test.log(Status.INFO, "User is navigated to Sell Form");	
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                        	
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
		
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);    
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
	
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                        
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
			driver.findElement(By.xpath(SelectCategoryButton)).click();          
			test.log(Status.PASS, "Verify that user can select category button to open category listing");		
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select category button to open category listing");		
		}
		
		try{
			driver.findElement(By.xpath(SelectCategory)).click();          
			test.log(Status.PASS, "Verify that user can select category (Test Data: Amplifiers)");		
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select category (Test Data: Amplifiers)");		
		}
		
		try{
			driver.findElement(By.xpath(EnterTitle)).sendKeys("Amplifiers"); 
			test.log(Status.PASS, "Verify that user can enter title (Test Data: Amplifiers)");			
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter title (Test Data: Amplifiers)");		
		}
		
		try{
			driver.findElement(By.xpath(CommonMethod.EnterPrice)).sendKeys("1500");            
			test.log(Status.PASS, "Verify that user can enter price (Test Data: 1500)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter price (Test Data: 1500)");	
		}
		
		try{
			driver.findElement(By.xpath(CommonMethod.EnterDescription)).sendKeys("Test By Appium"); 
			test.log(Status.PASS, "Verify that user can enter description (Test Data: Test By Appium)");			
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter description (Test Data: Test By Appium)");		
		}
		
		CommonMethod.Scroll("Post Your Ad");
		try{
			driver.findElement(By.xpath(CommonMethod.ClickPostYourAdButton)).click();  	          
			test.log(Status.PASS, "Verify user can select Post Your Ad button to post Ad");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify user can select Post Your Ad button to post Ad");
		}
		
		test.log(Status.INFO, "Test Completed");
	}
}
