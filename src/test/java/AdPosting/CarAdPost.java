package AdPosting;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import SettingDriver.AllCommonMethods;
import SettingDriver.SetDesiredCapabilities;

public class CarAdPost extends SetDesiredCapabilities
{
	AllCommonMethods CommonMethod = new AllCommonMethods();    
	
	private String CarButton= "//android.widget.TextView[@text= 'Car']";
	private String PostAdByOwn= "//android.widget.Button[@text='Continue']";			
	private String SelectBodyColorButton= "//android.widget.TextView[@text='Body Color']";
	private String SelectColor= "//android.widget.RelativeLayout[@index='2']";
	private String ClickViewAllSuggestions= "//android.widget.TextView[@text= 'View All Suggestions']";
	private String Suggestion1= "//android.widget.CheckBox[@text= 'Auction Sheet Available']";
	private String Suggestion2= "//android.widget.CheckBox[@text= 'Complete Original File']";
	private String Suggestion3= "//android.widget.CheckBox[@text= 'Driven on Petrol']";
	private String Suggestion4= "//android.widget.CheckBox[@text= 'Contact During Office Hours ']";	
	private String SelectEngineType= "//android.widget.TextView[@text= 'Hybrid']";
	private String EnterEngineCapacity= "//android.widget.EditText[@text= 'Specify Engine Capacity']";
	private String SelectTransmission= "//android.widget.CompoundButton[@text= 'Automatic']";
	private String SelectAssembly= "//android.widget.CompoundButton[@text= 'Imported']";
	private String Feature1= "//android.widget.CheckBox[@text= 'Air Bags']";
	private String Feature2= "//android.widget.CheckBox[@text= 'Cool Box']";
	private String Feature3= "//android.widget.CheckBox[@text= 'Immobilizer Key']";
	
	@Test
	public void CarAdPostAfterLogin()
	{	
		ExtentTest test= extent.createTest("Car Ad Post");
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
			driver.findElement(By.xpath(CarButton)).click();                               
			test.log(Status.PASS, "Verify that user can Select Ad Type (Test Data: Car)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can Select Ad Type (Test Data: Car)");
		}	
		
		try{
			CommonMethod.Login();                                               
			test.log(Status.PASS, "Verify that user can login (Test Data: Email)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can login (Test Data: Email)");
		}
				
		try{
			driver.findElement(By.xpath(PostAdByOwn)).click();                                  
			test.log(Status.PASS, "Verify that user can select option for Car Ad (Test Data: Post By Own)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select option for Car Ad (Test Data: Post By Own)");
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
			driver.findElement(By.xpath(CommonMethod.SelectCarModelButton)).click();          
			test.log(Status.PASS, "Verify that user can select car model button to open model listing");		
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select car model button to open model listing");		
		}
		
		try{
			driver.findElement(By.xpath(CommonMethod.SelectCarYear)).click();                   
			test.log(Status.PASS, "Verify that user can select car year (Test Data: 2021)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select car year (Test Data: 2021)");
		}
		
		try{
			driver.findElement(By.xpath(CommonMethod.SelectCarMakeModel)).click();              
			test.log(Status.PASS, "Verify that user can select car make and model (Test Data: Alto)");	
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select car make and model (Test Data: Alto)");		
		}
		
		try{
			driver.findElement(By.xpath(CommonMethod.SelectCarVersion)).click();               
			test.log(Status.PASS, "Verify that user can select car version (Test Data: VX)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select car version (Test Data: VX)");
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
			driver.findElement(By.xpath(SelectBodyColorButton)).click();                    
			test.log(Status.PASS, "Verify that user can select body color button to open color listing");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select body color button to open color listing");	
		}
		
		try{
			driver.findElement(By.xpath(SelectColor)).click();                            
			test.log(Status.PASS, "Verify that user can select body color (Test Data: Black)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select body color (Test Data: Black)");	
		}
		
		try{
			driver.findElement(By.xpath(CommonMethod.EnterMileage)).sendKeys("1200");               
			test.log(Status.PASS, "Verify that user can enter mileage (Test Data: 1200)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter mileage (Test Data: 1200)");	
		}
		
		try{
			driver.findElement(By.xpath(CommonMethod.EnterPrice)).sendKeys("1500000");            
			test.log(Status.PASS, "Verify that user can enter price (Test Data: 1500000)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter price (Test Data: 1500000)");	
		}
		
		CommonMethod.Scroll("Additional Info");
		try{
			driver.findElement(By.xpath(CommonMethod.EnterDescription)).sendKeys("Test By Appium"); 
			test.log(Status.PASS, "Verify that user can enter description (Test Data: Test By Appium)");			
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter description (Test Data: Test By Appium)");		
		}
		
		try{
			driver.findElement(By.xpath(ClickViewAllSuggestions)).click();    
			test.log(Status.PASS, "Verify that user can tap on view all suggestions button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can tap on view all suggestions button");	
		}
		
		try{
			driver.findElement(By.xpath(Suggestion1)).click();                                      
			test.log(Status.PASS, "Verify that user can select suggestion (Test Data: Auction Sheet Available)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select suggestion (Test Data: Auction Sheet Available)");
		}
		
		try{
			driver.findElement(By.xpath(Suggestion2)).click();                                     
			test.log(Status.PASS, "Verify that user can select suggestion (Test Data: Complete Original File)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select suggestion (Test Data: Complete Original File)");
		}
		
		try{
			driver.findElement(By.xpath(Suggestion3)).click();                                   
			test.log(Status.PASS, "Verify that user can select suggestion (Test Data: Driven on Petrol)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select suggestion (Test Data: Driven on Petrol)");
		}
		
		try{
			driver.findElement(By.xpath(Suggestion4)).click();                                    
			test.log(Status.PASS, "Verify that user can select suggestion (Test Data: Contact During Office Hours)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select suggestion (Test Data: Contact During Office Hours)");
		}
		
		try{
			driver.findElement(By.xpath(CommonMethod.ClickDoneButton)).click();                   
			test.log(Status.PASS, "Verify that user can select click on done button");			
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select click on done button");	
		}
		
		try{
			driver.findElement(By.xpath(CommonMethod.ClickEngineTypeButton)).click();              
			test.log(Status.PASS, "Verify that user can select engine type button to open engine listing");	
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select engine type button to open engine listing");	
		}
		
		try{
			driver.findElement(By.xpath(SelectEngineType)).click();                             
			test.log(Status.PASS, "Verify that user can select engine type (Test Data: Hybrid)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select engine type (Test Data: Hybrid)");	
		}
		
		try{
			driver.findElement(By.xpath(EnterEngineCapacity)).sendKeys("1000");                 
			test.log(Status.PASS, "Verify that user can enter engine capacity (Test Data: 1000)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter engine capacity (Test Data: 1000)");	
		}
	
		try{
			driver.findElement(By.xpath(SelectTransmission)).click();                     
			test.log(Status.PASS, "Verify that user can select transmission (Test Data: Automatic)");	
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select transmission (Test Data: Automatic)");		
		}
		
		try{
			driver.findElement(By.xpath(SelectAssembly)).click();                              
			test.log(Status.PASS, "Verify that user can select assembly (Test Data: Imported)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select assembly (Test Data: Imported)");	
		}
		
		CommonMethod.Scroll("Features");
		try{
			driver.findElement(By.xpath(CommonMethod.SelectFeaturesButton)).click();                
			test.log(Status.PASS, "Verify user can select feature button to open features listing");	
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify user can select feature button to open features listing");	
		}
		
		try{
			driver.findElement(By.xpath(Feature1)).click();                                    
			test.log(Status.PASS, "Verify user can select feature (Test Data: Air Bags)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify user can select feature (Test Data: Air Bags)");
		}
		
		try{
			driver.findElement(By.xpath(Feature2)).click();                                   
			test.log(Status.PASS, "Verify user can select feature (Test Data: Cool Box)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify user can select feature (Test Data: Cool Box)");
		}
		
		try{
			driver.findElement(By.xpath(Feature3)).click();                                        
			test.log(Status.PASS, "Verify user can select feature (Test Data: Immobilizer Key)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify user can select feature (Test Data: Immobilizer Key)");
		}
		
		try{
			driver.findElement(By.xpath(CommonMethod.ClickDoneButton)).click();                    
			test.log(Status.PASS, "Verify user can select done button to close feature listing");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify user can select done button to close feature listing");	
		}
		
		CommonMethod.Scroll("Contact Information");
		try{
			CommonMethod.EnterMobileNumber();                                                      
			test.log(Status.PASS, "Verify user can enter mobile number (Test Data: 03154954876)");	
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify user can enter mobile number (Test Data: 03154954876)");		
		}
		
		try{
			driver.findElement(By.xpath(CommonMethod.ClickPostYourAdButton)).click();  	          
			test.log(Status.PASS, "Verify user can select Post Your Ad button to post Ad");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify user can select Post Your Ad button to post Ad");
		}
		
		test.log(Status.INFO, "Test Completed");
	}
}
