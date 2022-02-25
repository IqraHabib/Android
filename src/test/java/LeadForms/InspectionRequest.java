package LeadForms;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import SettingDriver.AllCommonMethods;
import SettingDriver.SetDesiredCapabilities;

public class InspectionRequest extends SetDesiredCapabilities
{	
	AllCommonMethods CommonMethod = new AllCommonMethods();                              
	private String InspectionPage= "//android.widget.TextView[@text='PakWheels Car Inspection']";
	private String InspectionFormButton= "//android.widget.Button[@text='Schedule Inspection']";
	
	@Test(priority = 0)
	public void InspectionRequest_FromMenu_WithOutLogin()
	{		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		ExtentTest test= extent.createTest("InspectionRequest_FromMenu_WithOutLogin");
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
			driver.findElement(By.xpath(InspectionPage)).click();                          
			test.log(Status.PASS, "Verify that user can navigate to Inspection page by cliking on Inspection button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can navigate to Inspection page by cliking on Inspection button");	
		}
		
		test.log(Status.INFO, "User is navigated to Inspection page");
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                  
		try{
			driver.findElement(By.xpath(InspectionFormButton)).click();                    
			test.log(Status.PASS, "Verify that user can tap on Schedule Inspection button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can tap on Schedule Inspection button");
		}
		
		test.log(Status.INFO, "User is navigated to Inspection form");
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);               
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
			CommonMethod.EnterName();                                                     
			test.log(Status.PASS, "Verify that user can enter name");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter name");
		}
		
		try{
			CommonMethod.EnterMobileNumber();                                             
			test.log(Status.PASS, "Verify that user can enter mobile number");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter mobile number");	
		}
		
		try{
			CommonMethod.EnterEmail();                                                    
			test.log(Status.PASS, "Verify that user can enter email");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter email");	
		}
		
		try{
			driver.findElement(By.xpath(CommonMethod.ClickSubmitButton)).click();           
			test.log(Status.PASS, "Verify that user can select submit button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select submit button");	
		}
		
		test.log(Status.INFO, "Test Completed");
	}
	
	@Test(priority = 1)
	public void InspectionRequest_FromMenu_WithLogin()
	{	
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		ExtentTest test= extent.createTest("InspectionRequest_FromMenu_WithLogin");
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
		
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		try{
			driver.findElement(By.xpath(CommonMethod.SelectUsedCars)).click();                
			test.log(Status.PASS, "Verify that user can tap on Used Cars button to open Drop-Down");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can tap on Used Cars button to open Drop-Down");	
		}
		
		try{
			driver.findElement(By.xpath(InspectionPage)).click();                          
			test.log(Status.PASS, "Verify that user can navigate to Inspection page by cliking on Inspection button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can navigate to Inspection page by cliking on Inspection button");	
		}
		
		test.log(Status.INFO, "User is navigated to Inspection page");
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                  
		try{
			driver.findElement(By.xpath(InspectionFormButton)).click();                    
			test.log(Status.PASS, "Verify that user can tap on Schedule Inspection button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can tap on Schedule Inspection button");
		}
		
		test.log(Status.INFO, "User is navigated to Inspection form");
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);               
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
			CommonMethod.EnterMobileNumber();                                             
			test.log(Status.PASS, "Verify that user can enter mobile number");
		}catch(org.openqa.selenium.NoSuchElementException e){
		}
		
		try{
			driver.findElement(By.xpath(CommonMethod.ClickSubmitButton)).click();           
			test.log(Status.PASS, "Verify that user can select submit button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select submit button");	
		}
		
		test.log(Status.INFO, "Test Completed");
	}	
}
