package LeadForms;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import SettingDriver.AllCommonMethods;
import SettingDriver.SetDesiredCapabilities;

public class Finance extends SetDesiredCapabilities
{
	AllCommonMethods CommonMethod = new AllCommonMethods(); 
	private String CarFinancePage= "//android.widget.TextView[@text= 'Car Finance']";
	private String SelectTenureButton= "//android.widget.TextView[@text= 'Tenure']";
	private String SelectTenure= "//android.widget.TextView[@text= '4 Year']";
	private String SelectDownPaymentButton= "//android.widget.TextView[@text= 'Down Payment']";
	private String SelectDownPayment= "//android.widget.TextView[@text= '35%']";
	private String SelectCalculateButton= "//android.widget.Button[@text= 'Calculate']";
	private String ClickApplyNowForBank= "//android.widget.TextView[@text= 'Apply Now']";
	private String EnterEmail= "//android.widget.EditText[@text= 'Enter Email']";
	private String EnterAge= "//android.widget.EditText[@text= 'Enter Your Age']";
	private String EnterCNIC= "//android.widget.EditText[@text= 'xxxxx-xxxxxxx-x']";
	private String EnterAddress= "//android.widget.EditText[@text= 'Enter Address']";
	private String SelectBestTimeToCallButton= "//android.widget.TextView[@text= 'Best Time To Call']";
	private String SelectBestTimeToCall= "//android.widget.TextView[@text= 'Office Hours']";
	private String SelectSourceOfIncome= "//android.widget.CompoundButton[@text= 'Salaried']";
	private String SelectMonthlyIncomeButton= "//android.widget.TextView[@text= 'What is Your Monthly Income?']";
	private String SelectMonthlyIncome= "//android.widget.TextView[@text= 'Above 55,000']";
	private String SelectBankButton= "//android.widget.TextView[@text= 'Where Do You Bank?']";
	private String SelectBank= "//android.widget.TextView[@text= 'Allied Bank Limited']";
	private String SelectTaxFilerStatus= "//android.widget.CompoundButton[@text= 'Filer']";
	private String SelectLoanStatus= "//android.widget.CompoundButton[@text= 'No']";
	private String SelectIntendToUseVehicle= "//android.widget.CompoundButton[@text= 'Personal']";
	private String SelectIntendToAcquireButton= "//android.widget.TextView[@text= 'How Soon Would You Like To Acquire The Loan?']";
	private String SelectIntendToAcquire= "//android.widget.TextView[@text= 'Next 2 weeks']";
	private String SelectUsedCarsSection= "//android.widget.TextView[@text= 'USED CARS']";
	private String SelectModelYearButton= "//android.widget.TextView[@text= 'Model Year']";	
	
	
	@Test(priority = 0)
	public void FinanceRequest_NewCars_FromMenu_WithOutLogin()
	{	
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		ExtentTest test= extent.createTest("FinanceRequest_NewCars_FromMenu_WithOutLogin");
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
		
		try {
			driver.findElement(By.xpath(CarFinancePage)).click();                              
			test.log(Status.PASS, "Verify that user can navigate to Car Finance page by cliking on Finance button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can navigate to Car Finance page by cliking on Finance button");
		}
		
		test.log(Status.INFO, "User is navigated to Finance page");	
		
		try{
			driver.findElement(By.xpath(CommonMethod.SelectCarModelButton)).click();          
			test.log(Status.PASS, "Verify that user can select car model button to open model listing");		
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select car model button to open model listing");		
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
			driver.findElement(By.xpath(SelectTenureButton)).click();                          
			test.log(Status.PASS, "Verify that user can select Tenure button to open tenure listing");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Tenure button to open tenure listing");
		}
		
		try{
			driver.findElement(By.xpath(SelectTenure)).click();          
			test.log(Status.PASS, "Verify that user can select Tenure");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Tenure");
		}
		
		try{
			driver.findElement(By.xpath(SelectDownPaymentButton)).click();                  
			test.log(Status.PASS, "Verify that user can select Down Payment button to open down-payment listing");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Down Payment button to open down-payment listing");	
		}
		
		try{
			driver.findElement(By.xpath(SelectDownPayment)).click();                               
			test.log(Status.PASS, "Verify that user can select Down Payment");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Down Payment");
		}
		
		try{
			driver.findElement(By.xpath(SelectCalculateButton)).click();             
			test.log(Status.PASS, "Verify that user can select Calcuate button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Calcuate button");
		}
		
		test.log(Status.INFO, "User is navigated to Bank packages listing");	
		try{
			driver.findElement(By.xpath(ClickApplyNowForBank)).click();                        
			test.log(Status.PASS, "Verify that user can tap on Apply Now button after selecting Bank");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can tap on Apply Now button after selecting Bank");
		}

		test.log(Status.INFO, "User is navigated to Finance form");	
		try{
			CommonMethod.EnterName();                                                     
			test.log(Status.PASS, "Verify that user can enter name");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter name");
		}
		
		try{
			driver.findElement(By.xpath(EnterEmail)).sendKeys(CommonMethod.Email);                
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
			driver.findElement(By.xpath(EnterAge)).sendKeys("25");                                  
			test.log(Status.PASS, "Verify that user can enter age");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter age");	
		}
			
		try{
			driver.findElement(By.xpath(EnterCNIC)).sendKeys("35202-2106126-9");                       
			test.log(Status.PASS, "Verify that user can enter CNIC");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter CNIC");
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
			driver.findElement(By.xpath(EnterAddress)).sendKeys("Street Testing House Automation");    
			test.log(Status.PASS, "Verify that user can enter address");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter address");
		}
		
		try{
			driver.findElement(By.xpath(SelectBestTimeToCallButton)).click();
			test.log(Status.PASS, "Verify that user can select Best Time to Call button to open time listing");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Best Time to Call button to open time listing");
		}
	
		try{
			driver.findElement(By.xpath(SelectBestTimeToCall)).click();
			test.log(Status.PASS, "Verify that user can select Best Time to Call");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Best Time to Call");
		}
		
		CommonMethod.Scroll("What is Your Source Of Income?");
		try{
			driver.findElement(By.xpath(SelectSourceOfIncome)).click();
			test.log(Status.PASS, "Verify that user can select Source Of Income");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Source Of Income");
		}
		
		CommonMethod.Scroll("What is Your Monthly Income?");
		try{
			driver.findElement(By.xpath(SelectMonthlyIncomeButton)).click();
			test.log(Status.PASS, "Verify that user can select Monthly Income Button to open income listing");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Monthly Income Button to open income listing");
		}
				
		try{
			driver.findElement(By.xpath(SelectMonthlyIncome)).click();
			test.log(Status.PASS, "Verify that user can select Monthly Income");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Monthly Income");
		}	
		
		CommonMethod.Scroll("Where Do You Bank?");
		try{
			driver.findElement(By.xpath(SelectBankButton)).click();
			test.log(Status.PASS, "Verify that user can tap on Bank button to open bank listing");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can tap on Bank button to open bank listing");	
		}
			
		try{
			driver.findElement(By.xpath(SelectBank)).click();
			test.log(Status.PASS, "Verify that user can select bank");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select bank");
		}
		
		CommonMethod.Scroll("What Is Your Tax Filer Status?");
		try{
			driver.findElement(By.xpath(SelectTaxFilerStatus)).click();
			test.log(Status.PASS, "Verify that user can select Tax Filer Status");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Tax Filer Status");	
		}
		
		CommonMethod.Scroll("Do You Have Any Credit Cards Or Loans?");
		try{
			driver.findElement(By.xpath(SelectLoanStatus)).click();
			test.log(Status.PASS, "Verify that user can select Loan status");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Loan status");
		}
		
		CommonMethod.Scroll("How Do You Intend To Use Vehicle?");
		try{
			driver.findElement(By.xpath(SelectIntendToUseVehicle)).click();
			test.log(Status.PASS, "Verify that user can select Intend to Use Vehicle");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Intend to Use Vehicle");
		}
		
		CommonMethod.Scroll("How Soon Would You Like To Acquire The Loan?");
		try{
			driver.findElement(By.xpath(SelectIntendToAcquireButton)).click();
			test.log(Status.PASS, "Verify that user can select Intend to Acquire Button to open listing");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Intend to Acquire Button to open listing");
		}
			
		try{
			driver.findElement(By.xpath(SelectIntendToAcquire)).click();
			test.log(Status.PASS, "Verify that user can select Intend to Acquire");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Intend to Acquire");
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
	public void FinanceRequest_NewCars_FromMenu_WithLogin()
	{	 
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		ExtentTest test= extent.createTest("FinanceRequest_NewCars_FromMenu_WithLogin");
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
		CommonMethod.Scroll("Car Finance");
		
		try {
			driver.findElement(By.xpath(CarFinancePage)).click();                              
			test.log(Status.PASS, "Verify that user can navigate to Car Finance page by cliking on Finance button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can navigate to Car Finance page by cliking on Finance button");
		}
		
		test.log(Status.INFO, "User is navigated to Finance page");	
		try{
			driver.findElement(By.xpath(CommonMethod.SelectCarModelButton)).click();          
			test.log(Status.PASS, "Verify that user can select car model button to open model listing");		
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select car model button to open model listing");		
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
			driver.findElement(By.xpath(SelectTenureButton)).click();                          
			test.log(Status.PASS, "Verify that user can select Tenure button to open tenure listing");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Tenure button to open tenure listing");
		}
		
		try{
			driver.findElement(By.xpath(SelectTenure)).click();          
			test.log(Status.PASS, "Verify that user can select Tenure");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Tenure");
		}
		
		try{
			driver.findElement(By.xpath(SelectDownPaymentButton)).click();                  
			test.log(Status.PASS, "Verify that user can select Down Payment button to open down-payment listing");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Down Payment button to open down-payment listing");	
		}
		
		try{
			driver.findElement(By.xpath(SelectDownPayment)).click();                               
			test.log(Status.PASS, "Verify that user can select Down Payment");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Down Payment");
		}
		
		try{
			driver.findElement(By.xpath(SelectCalculateButton)).click();             
			test.log(Status.PASS, "Verify that user can select Calcuate button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Calcuate button");
		}
		
		test.log(Status.INFO, "User is navigated to Bank packages listing");	
		try{
			driver.findElement(By.xpath(ClickApplyNowForBank)).click();                        
			test.log(Status.PASS, "Verify that user can tap on Apply Now button after selecting Bank");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can tap on Apply Now button after selecting Bank");
		}
		
		test.log(Status.INFO, "User is navigated to Finance form");	
		
		try{
			CommonMethod.EnterMobileNumber();                                             
			test.log(Status.PASS, "Verify that user can enter mobile number");
		}catch(org.openqa.selenium.NoSuchElementException e){
		}
		
		try{
			driver.findElement(By.xpath(EnterAge)).sendKeys("25");                                  
			test.log(Status.PASS, "Verify that user can enter age");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter age");	
		}
			
		try{
			driver.findElement(By.xpath(EnterCNIC)).sendKeys("35202-2106126-9");                       
			test.log(Status.PASS, "Verify that user can enter CNIC");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter CNIC");
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
			driver.findElement(By.xpath(EnterAddress)).sendKeys("Street Testing House Automation");    
			test.log(Status.PASS, "Verify that user can enter address");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter address");
		}
		
		try{
			driver.findElement(By.xpath(SelectBestTimeToCallButton)).click();
			test.log(Status.PASS, "Verify that user can select Best Time to Call button to open time listing");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Best Time to Call button to open time listing");
		}
	
		try{
			driver.findElement(By.xpath(SelectBestTimeToCall)).click();
			test.log(Status.PASS, "Verify that user can select Best Time to Call");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Best Time to Call");
		}
		
		CommonMethod.Scroll("What is Your Source Of Income?");
		try{
			driver.findElement(By.xpath(SelectSourceOfIncome)).click();
			test.log(Status.PASS, "Verify that user can select Source Of Income");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Source Of Income");
		}
		
		CommonMethod.Scroll("What is Your Monthly Income?");
		try{
			driver.findElement(By.xpath(SelectMonthlyIncomeButton)).click();
			test.log(Status.PASS, "Verify that user can select Monthly Income Button to open income listing");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Monthly Income Button to open income listing");
		}
		
		try{
			driver.findElement(By.xpath(SelectMonthlyIncome)).click();
			test.log(Status.PASS, "Verify that user can select Monthly Income");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Monthly Income");
		}	
		
		CommonMethod.Scroll("Where Do You Bank?");
		try{
			driver.findElement(By.xpath(SelectBankButton)).click();
			test.log(Status.PASS, "Verify that user can tap on Bank button to open bank listing");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can tap on Bank button to open bank listing");	
		}
			
		try{
			driver.findElement(By.xpath(SelectBank)).click();
			test.log(Status.PASS, "Verify that user can select bank");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select bank");
		}
		
		CommonMethod.Scroll("What Is Your Tax Filer Status?");
		try{
			driver.findElement(By.xpath(SelectTaxFilerStatus)).click();
			test.log(Status.PASS, "Verify that user can select Tax Filer Status");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Tax Filer Status");	
		}
		
		CommonMethod.Scroll("Do You Have Any Credit Cards Or Loans?");
		try{
			driver.findElement(By.xpath(SelectLoanStatus)).click();
			test.log(Status.PASS, "Verify that user can select Loan status");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Loan status");
		}
		
		CommonMethod.Scroll("How Do You Intend To Use Vehicle?");
		try{
			driver.findElement(By.xpath(SelectIntendToUseVehicle)).click();
			test.log(Status.PASS, "Verify that user can select Intend to Use Vehicle");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Intend to Use Vehicle");
		}
		
		CommonMethod.Scroll("How Soon Would You Like To Acquire The Loan?");
		try{
			driver.findElement(By.xpath(SelectIntendToAcquireButton)).click();
			test.log(Status.PASS, "Verify that user can select Intend to Acquire Button to open listing");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Intend to Acquire Button to open listing");
		}
			
		try{
			driver.findElement(By.xpath(SelectIntendToAcquire)).click();
			test.log(Status.PASS, "Verify that user can select Intend to Acquire");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Intend to Acquire");
		}
		
		try{
			driver.findElement(By.xpath(CommonMethod.ClickSubmitButton)).click();           
			test.log(Status.PASS, "Verify that user can select submit button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select submit button");	
		}
	
		test.log(Status.INFO, "Test Completed");
	}
	
	@Test(priority = 2)
	public void FinanceRequest_UsedCars_FromMenu_WithOutLogin()
	{	
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		ExtentTest test= extent.createTest("FinanceRequest_UsedCars_FromMenu_WithOutLogin");
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
		
		try {
			driver.findElement(By.xpath(CarFinancePage)).click();                              
			test.log(Status.PASS, "Verify that user can navigate to Car Finance page by cliking on Finance button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can navigate to Car Finance page by cliking on Finance button");
		}
		
		test.log(Status.INFO, "User is navigated to Finance page");	
		try {
			driver.findElement(By.xpath(SelectUsedCarsSection)).click(); 
			test.log(Status.PASS, "Verify that user can select Used Cars tab on finance page");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Used Cars tab on finance page");
		}
		
		try{
			driver.findElement(By.xpath(CommonMethod.SelectCarModelButton)).click();          
			test.log(Status.PASS, "Verify that user can select car model button to open model listing");		
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select car model button to open model listing");		
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
		
		try {
			driver.findElement(By.xpath(SelectModelYearButton)).click();  
			test.log(Status.PASS, "Verify that user can select Car Model Year button to open year listing");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Car Model Year button to open year listing");
		}
		
		try {
			driver.findElement(By.xpath(CommonMethod.SelectCarYear)).click();   
			test.log(Status.PASS, "Verify that user can select Car Model Year");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Car Model Year");
		}
		
		try{
			driver.findElement(By.xpath(SelectTenureButton)).click();                          
			test.log(Status.PASS, "Verify that user can select Tenure button to open tenure listing");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Tenure button to open tenure listing");
		}
		
		try{
			driver.findElement(By.xpath(SelectTenure)).click();          
			test.log(Status.PASS, "Verify that user can select Tenure");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Tenure");
		}
		
		try{
			driver.findElement(By.xpath(SelectDownPaymentButton)).click();                  
			test.log(Status.PASS, "Verify that user can select Down Payment button to open down-payment listing");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Down Payment button to open down-payment listing");	
		}
		
		try{
			driver.findElement(By.xpath(SelectDownPayment)).click();                               
			test.log(Status.PASS, "Verify that user can select Down Payment");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Down Payment");
		}
		
		try{
			driver.findElement(By.xpath(SelectCalculateButton)).click();             
			test.log(Status.PASS, "Verify that user can select Calcuate button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Calcuate button");
		}
		
		test.log(Status.INFO, "User is navigated to Bank packages listing");	
		try{
			driver.findElement(By.xpath(ClickApplyNowForBank)).click();                        
			test.log(Status.PASS, "Verify that user can tap on Apply Now button after selecting Bank");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can tap on Apply Now button after selecting Bank");
		}
		
		test.log(Status.INFO, "User is navigated to Finance form");	
		try{
			CommonMethod.EnterName();                                                     
			test.log(Status.PASS, "Verify that user can enter name");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter name");
		}
		
		try{
			driver.findElement(By.xpath(EnterEmail)).sendKeys(CommonMethod.Email);                
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
			driver.findElement(By.xpath(EnterAge)).sendKeys("25");                                  
			test.log(Status.PASS, "Verify that user can enter age");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter age");	
		}
			
		try{
			driver.findElement(By.xpath(EnterCNIC)).sendKeys("35202-2106126-9");                       
			test.log(Status.PASS, "Verify that user can enter CNIC");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter CNIC");
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
			driver.findElement(By.xpath(EnterAddress)).sendKeys("Street Testing House Automation");    
			test.log(Status.PASS, "Verify that user can enter address");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter address");
		}
		
		try{
			driver.findElement(By.xpath(SelectBestTimeToCallButton)).click();
			test.log(Status.PASS, "Verify that user can select Best Time to Call button to open time listing");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Best Time to Call button to open time listing");
		}
	
		try{
			driver.findElement(By.xpath(SelectBestTimeToCall)).click();
			test.log(Status.PASS, "Verify that user can select Best Time to Call");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Best Time to Call");
		}
		
		CommonMethod.Scroll("What is Your Source Of Income?");
		try{
			driver.findElement(By.xpath(SelectSourceOfIncome)).click();
			test.log(Status.PASS, "Verify that user can select Source Of Income");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Source Of Income");
		}
		
		CommonMethod.Scroll("What is Your Monthly Income?");
		try{
			driver.findElement(By.xpath(SelectMonthlyIncomeButton)).click();
			test.log(Status.PASS, "Verify that user can select Monthly Income Button to open income listing");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Monthly Income Button to open income listing");
		}
		
		try{
			driver.findElement(By.xpath(SelectMonthlyIncome)).click();
			test.log(Status.PASS, "Verify that user can select Monthly Income");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Monthly Income");
		}	
		
		CommonMethod.Scroll("Where Do You Bank?");
		try{
			driver.findElement(By.xpath(SelectBankButton)).click();
			test.log(Status.PASS, "Verify that user can tap on Bank button to open bank listing");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can tap on Bank button to open bank listing");	
		}
			
		try{
			driver.findElement(By.xpath(SelectBank)).click();
			test.log(Status.PASS, "Verify that user can select bank");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select bank");
		}
		
		CommonMethod.Scroll("What Is Your Tax Filer Status?");
		try{
			driver.findElement(By.xpath(SelectTaxFilerStatus)).click();
			test.log(Status.PASS, "Verify that user can select Tax Filer Status");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Tax Filer Status");	
		}
		
		CommonMethod.Scroll("Do You Have Any Credit Cards Or Loans?");
		try{
			driver.findElement(By.xpath(SelectLoanStatus)).click();
			test.log(Status.PASS, "Verify that user can select Loan status");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Loan status");
		}
		
		CommonMethod.Scroll("How Do You Intend To Use Vehicle?");
		try{
			driver.findElement(By.xpath(SelectIntendToUseVehicle)).click();
			test.log(Status.PASS, "Verify that user can select Intend to Use Vehicle");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Intend to Use Vehicle");
		}
		
		CommonMethod.Scroll("How Soon Would You Like To Acquire The Loan?");
		try{
			driver.findElement(By.xpath(SelectIntendToAcquireButton)).click();
			test.log(Status.PASS, "Verify that user can select Intend to Acquire Button to open listing");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Intend to Acquire Button to open listing");
		}
			
		try{
			driver.findElement(By.xpath(SelectIntendToAcquire)).click();
			test.log(Status.PASS, "Verify that user can select Intend to Acquire");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Intend to Acquire");
		}
		
		try{
			driver.findElement(By.xpath(CommonMethod.ClickSubmitButton)).click();           
			test.log(Status.PASS, "Verify that user can select submit button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select submit button");	
		}
		
		test.log(Status.INFO, "Test Completed");
	}
	
	@Test(priority = 3)
	public void FinanceRequest_UsedCars_FromMenu_WithLogin()
	{	
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		ExtentTest test= extent.createTest("FinanceRequest_UsedCars_FromMenu_WithLogin");
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
		CommonMethod.Scroll("Car Finance");
		
		try {
			driver.findElement(By.xpath(CarFinancePage)).click();                              
			test.log(Status.PASS, "Verify that user can navigate to Car Finance page by cliking on Finance button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can navigate to Car Finance page by cliking on Finance button");
		}
		
		test.log(Status.INFO, "User is navigated to Finance page");	
		try {
			driver.findElement(By.xpath(SelectUsedCarsSection)).click(); 
			test.log(Status.PASS, "Verify that user can select Used Cars tab on finance page");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Used Cars tab on finance page");
		}
		
		try{
			driver.findElement(By.xpath(CommonMethod.SelectCarModelButton)).click();          
			test.log(Status.PASS, "Verify that user can select car model button to open model listing");		
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select car model button to open model listing");		
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
		
		try {
			driver.findElement(By.xpath(SelectModelYearButton)).click();  
			test.log(Status.PASS, "Verify that user can select Car Model Year button to open year listing");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Car Model Year button to open year listing");
		}
		
		try {
			driver.findElement(By.xpath(CommonMethod.SelectCarYear)).click();   
			test.log(Status.PASS, "Verify that user can select Car Model Year");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Car Model Year");
		}
		
		try{
			driver.findElement(By.xpath(SelectTenureButton)).click();                          
			test.log(Status.PASS, "Verify that user can select Tenure button to open tenure listing");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Tenure button to open tenure listing");
		}
		
		try{
			driver.findElement(By.xpath(SelectTenure)).click();          
			test.log(Status.PASS, "Verify that user can select Tenure");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Tenure");
		}
		
		try{
			driver.findElement(By.xpath(SelectDownPaymentButton)).click();                  
			test.log(Status.PASS, "Verify that user can select Down Payment button to open down-payment listing");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Down Payment button to open down-payment listing");	
		}
		
		try{
			driver.findElement(By.xpath(SelectDownPayment)).click();                               
			test.log(Status.PASS, "Verify that user can select Down Payment");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Down Payment");
		}
		
		try{
			driver.findElement(By.xpath(SelectCalculateButton)).click();             
			test.log(Status.PASS, "Verify that user can select Calcuate button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Calcuate button");
		}
		
		test.log(Status.INFO, "User is navigated to Bank packages listing");	
		try{
			driver.findElement(By.xpath(ClickApplyNowForBank)).click();                        
			test.log(Status.PASS, "Verify that user can tap on Apply Now button after selecting Bank");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can tap on Apply Now button after selecting Bank");
		}
		
		test.log(Status.INFO, "User is navigated to Finance form");	
		
		try{
			CommonMethod.EnterMobileNumber();                                             
			test.log(Status.PASS, "Verify that user can enter mobile number");
		}catch(org.openqa.selenium.NoSuchElementException e){
		}
		
		try{
			driver.findElement(By.xpath(EnterAge)).sendKeys("25");                                  
			test.log(Status.PASS, "Verify that user can enter age");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter age");	
		}
			
		try{
			driver.findElement(By.xpath(EnterCNIC)).sendKeys("35202-2106126-9");                       
			test.log(Status.PASS, "Verify that user can enter CNIC");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter CNIC");
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
			driver.findElement(By.xpath(EnterAddress)).sendKeys("Street Testing House Automation");    
			test.log(Status.PASS, "Verify that user can enter address");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter address");
		}
		
		try{
			driver.findElement(By.xpath(SelectBestTimeToCallButton)).click();
			test.log(Status.PASS, "Verify that user can select Best Time to Call button to open time listing");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Best Time to Call button to open time listing");
		}
	
		try{
			driver.findElement(By.xpath(SelectBestTimeToCall)).click();
			test.log(Status.PASS, "Verify that user can select Best Time to Call");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Best Time to Call");
		}
		
		CommonMethod.Scroll("What is Your Source Of Income?");
		try{
			driver.findElement(By.xpath(SelectSourceOfIncome)).click();
			test.log(Status.PASS, "Verify that user can select Source Of Income");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Source Of Income");
		}
		
		CommonMethod.Scroll("What is Your Monthly Income?");
		try{
			driver.findElement(By.xpath(SelectMonthlyIncomeButton)).click();
			test.log(Status.PASS, "Verify that user can select Monthly Income Button to open income listing");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Monthly Income Button to open income listing");
		}
		
		try{
			driver.findElement(By.xpath(SelectMonthlyIncome)).click();
			test.log(Status.PASS, "Verify that user can select Monthly Income");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Monthly Income");
		}	
		
		CommonMethod.Scroll("Where Do You Bank?");
		try{
			driver.findElement(By.xpath(SelectBankButton)).click();
			test.log(Status.PASS, "Verify that user can tap on Bank button to open bank listing");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can tap on Bank button to open bank listing");	
		}
			
		try{
			driver.findElement(By.xpath(SelectBank)).click();
			test.log(Status.PASS, "Verify that user can select bank");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select bank");
		}
		
		CommonMethod.Scroll("What Is Your Tax Filer Status?");
		try{
			driver.findElement(By.xpath(SelectTaxFilerStatus)).click();
			test.log(Status.PASS, "Verify that user can select Tax Filer Status");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Tax Filer Status");	
		}
		
		CommonMethod.Scroll("Do You Have Any Credit Cards Or Loans?");
		try{
			driver.findElement(By.xpath(SelectLoanStatus)).click();
			test.log(Status.PASS, "Verify that user can select Loan status");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Loan status");
		}
		
		CommonMethod.Scroll("How Do You Intend To Use Vehicle?");
		try{
			driver.findElement(By.xpath(SelectIntendToUseVehicle)).click();
			test.log(Status.PASS, "Verify that user can select Intend to Use Vehicle");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Intend to Use Vehicle");
		}
		
		CommonMethod.Scroll("How Soon Would You Like To Acquire The Loan?");
		try{
			driver.findElement(By.xpath(SelectIntendToAcquireButton)).click();
			test.log(Status.PASS, "Verify that user can select Intend to Acquire Button to open listing");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Intend to Acquire Button to open listing");
		}
			
		try{
			driver.findElement(By.xpath(SelectIntendToAcquire)).click();
			test.log(Status.PASS, "Verify that user can select Intend to Acquire");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Intend to Acquire");
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
