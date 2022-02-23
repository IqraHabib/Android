package LeadForms;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import SettingDriver.AllCommonMethods;
import SettingDriver.SetDesiredCapabilities;

public class Insurance extends SetDesiredCapabilities
{
	AllCommonMethods CommonMethod = new AllCommonMethods();   
	private String CarInsurancePage= "//android.widget.TextView[@text= 'Car Insurance']";
	private String SelectShowPlans= "//android.widget.Button[@text= 'Show Plans']";
	private String SelectTracker= "com.pakwheels.staging:id/cbAddTrakcer";
	
	
	@Test(priority = 0)
	public void InsuranceRequest_WithoutLogin()
	{
		ExtentTest test= extent.createTest("Insurance Request- Without Login");
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
			driver.findElement(By.xpath(CarInsurancePage)).click();                          
			test.log(Status.PASS, "Verify that user can navigate to Car Insurance page by cliking on Insurance button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can navigate to Car Insurance page by cliking on Insurance button");	
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
			driver.findElement(By.xpath(CommonMethod.EnterPrice)).sendKeys("1500000");            
			test.log(Status.PASS, "Verify that user can enter price (Test Data: 1500000)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter price (Test Data: 1500000)");	
		}
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                     
		try {
			driver.findElement(By.xpath(SelectShowPlans)).click();                   
			test.log(Status.PASS, "Verify that user can tap on show plans button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can tap on show plans button");
		}
		
		try {
			driver.findElement(By.id(SelectTracker)).click();                                   
			test.log(Status.PASS, "Verify that user can add tracker");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can add tracker");
		}

		try {
			driver.findElement(By.xpath(CommonMethod.ClickApplyNowButton)).click();          
			test.log(Status.PASS, "Verify that user can tap on Apply Now button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can tap on Apply Now button");
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
			driver.findElement(By.xpath(CommonMethod.ClickSubmitButton)).click();           
			test.log(Status.PASS, "Verify that user can select submit button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select submit button");	
		}
		
		test.log(Status.INFO, "Test Completed");
	}	
	
	
	@Test(priority = 1)
	public void InsuranceRequest_WithLogin()
	{
		ExtentTest test= extent.createTest("Insurance Request- Login");
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
		CommonMethod.Scroll("Car Insurance");
		try{
			driver.findElement(By.xpath(CarInsurancePage)).click();                          
			test.log(Status.PASS, "Verify that user can navigate to Car Insurance page by cliking on Insurance button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can navigate to Car Insurance page by cliking on Insurance button");	
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
			driver.findElement(By.xpath(CommonMethod.EnterPrice)).sendKeys("1500000");            
			test.log(Status.PASS, "Verify that user can enter price (Test Data: 1500000)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter price (Test Data: 1500000)");	
		}
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                     
		try {
			driver.findElement(By.xpath(SelectShowPlans)).click();                   
			test.log(Status.PASS, "Verify that user can tap on show plans button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can tap on show plans button");
		}
		
		try {
			driver.findElement(By.id(SelectTracker)).click();                                   
			test.log(Status.PASS, "Verify that user can add tracker");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can add tracker");
		}

		try {
			driver.findElement(By.xpath(CommonMethod.ClickApplyNowButton)).click();          
			test.log(Status.PASS, "Verify that user can tap on Apply Now button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can tap on Apply Now button");
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
			driver.findElement(By.xpath(CommonMethod.ClickSubmitButton)).click();           
			test.log(Status.PASS, "Verify that user can select submit button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select submit button");	
		}

		test.log(Status.INFO, "Test Completed");
	}
		
}
