package LeadForms;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import SettingDriver.AllCommonMethods;
import SettingDriver.SetDesiredCapabilities;
import io.appium.java_client.MobileBy;

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
		ExtentTest test= extent.createTest("FinanceRequest_NewCars_FromMenu_WithOutLogin");
		driver.launchApp();

		test.log(Status.INFO, "Test Started");	
		CommonMethod.SetApplicationLanguage();	
		test.log(Status.PASS, "Set Application language to English");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                            // Wait for screen to update
		driver.findElement(By.xpath(CommonMethod.ClickMoreButton)).click();                         // Click More Button
		test.log(Status.PASS, "Navigate to menu page by clicking more button");
		driver.findElement(By.xpath(CarFinancePage)).click();                                       // Navigate to Finance Page
		test.log(Status.PASS, "Navigate to Car Finance page");
		driver.findElement(By.xpath(CommonMethod.SelectCarModelButton)).click();                    // Select Car Model Button
		test.log(Status.PASS, "Tap Car Model button to Select Car Information");
		driver.findElement(By.xpath(CommonMethod.SelectCarMakeModel)).click();                      // Select Car Make and Model
		test.log(Status.PASS, "Select Car Make and Model");
		driver.findElement(By.xpath(CommonMethod.SelectCarVersion)).click();                        // Select Car Version
		test.log(Status.PASS, "Select Car Version");
		driver.findElement(By.xpath(CommonMethod.SelectLocationButton)).click();                    // Select Location
		test.log(Status.PASS, "Select Location button");
		driver.findElement(By.xpath(CommonMethod.SelectCity)).click();                              // Select City
		test.log(Status.PASS, "Select City");
		driver.findElement(By.xpath(SelectTenureButton)).click();                                   // Select Tenure Button
		test.log(Status.PASS, "Select Tenure button");
		driver.findElement(By.xpath(SelectTenure)).click();                                         // Select Tenure
		test.log(Status.PASS, "Select Tenure");
		driver.findElement(By.xpath(SelectDownPaymentButton)).click();                              // Select Down payment Button
		test.log(Status.PASS, "Select Down Payment Button");
		driver.findElement(By.xpath(SelectDownPayment)).click();                                    // Select Down Payment
		test.log(Status.PASS, "Select Down Payment");
		driver.findElement(By.xpath(SelectCalculateButton)).click();                                // Click Calculate Button
		test.log(Status.PASS, "Select Calcuate Button");
		driver.findElement(By.xpath(ClickApplyNowForBank)).click();                                 // Select Apply Button for a Bank
		test.log(Status.PASS, "Tap on Apply Now Button after selecting Bank");
		CommonMethod.EnterName();                                                                   // Enter Name
		test.log(Status.PASS, "Enter Name");
		driver.findElement(By.xpath(EnterEmail)).sendKeys("test@automation.com");                   // Enter Email
		test.log(Status.PASS, "Enter Email");
		CommonMethod.EnterMobileNumber();                                                           // Enter Phone Number
		test.log(Status.PASS, "Enter Mobile Number");
		driver.findElement(By.xpath(EnterAge)).sendKeys("25");                                      // Enter Age
		test.log(Status.PASS, "Enter Age");
		driver.findElement(By.xpath(EnterCNIC)).sendKeys("35202-2106126-9");                        // Enter CNIC
		test.log(Status.PASS, "Enter CNIC");
		driver.findElement(By.xpath(CommonMethod.SelectLocationButton)).click();                    // Select Location
		test.log(Status.PASS, "Select Location button");
		driver.findElement(By.xpath(CommonMethod.SelectCity)).click();                              // Select City
		test.log(Status.PASS, "Select City");
		driver.findElement(By.xpath(CommonMethod.SelectCityArea)).click();                          // Select City Area
		test.log(Status.PASS, "Select City Area");
		driver.findElement(By.xpath(EnterAddress)).sendKeys("Street Testing House Automation");     // Enter Address
		test.log(Status.PASS, "Enter Address");
		driver.findElement(By.xpath(SelectBestTimeToCallButton)).click();
		test.log(Status.PASS, "Select Best Time to Call Button");
		driver.findElement(By.xpath(SelectBestTimeToCall)).click();
		test.log(Status.PASS, "Select Best Time to Call");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"What is Your Source Of Income?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectSourceOfIncome)).click();
		test.log(Status.PASS, "Select Source Of Income");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"What is Your Monthly Income?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectMonthlyIncomeButton)).click();
		test.log(Status.PASS, "Select Monthly Income Button");
		driver.findElement(By.xpath(SelectMonthlyIncome)).click();
		test.log(Status.PASS, "Select Monthly Income");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Where Do You Bank?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectBankButton)).click();
		test.log(Status.PASS, "Tap on Bank button to open listing");
		driver.findElement(By.xpath(SelectBank)).click();
		test.log(Status.PASS, "Select Bank");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"What Is Your Tax Filer Status?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectTaxFilerStatus)).click();
		test.log(Status.PASS, "Select Tax Filer Status");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Do You Have Any Credit Cards Or Loans?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectLoanStatus)).click();
		test.log(Status.PASS, "Select Loan Status");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"How Do You Intend To Use Vehicle?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectIntendToUseVehicle)).click();
		test.log(Status.PASS, "Select Intend to Use Vehicle");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"How Soon Would You Like To Acquire The Loan?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectIntendToAcquireButton)).click();
		test.log(Status.PASS, "Select Intend to Acquire Button");
		driver.findElement(By.xpath(SelectIntendToAcquire)).click();
		test.log(Status.PASS, "Select Intend to Acquire");
		//driver.findElement(By.xpath(CommonMethod.ClickSubmitButton)).click();
		test.log(Status.PASS, "Select Submit Button");
		test.log(Status.INFO, "Test Successfully Completed");
	}
	
	@Test(priority = 1)
	public void FinanceRequest_NewCars_FromMenu_WithLogin()
	{	
		ExtentTest test= extent.createTest("FinanceRequest_NewCars_FromMenu_WithLogin");
		driver.launchApp();

		test.log(Status.INFO, "Test Started");	
		CommonMethod.SetApplicationLanguage();	
		test.log(Status.PASS, "Set Application language to English");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                   // Wait for screen to update
		driver.findElement(By.xpath(CommonMethod.ClickMoreButton)).click();               // Click More Button
		test.log(Status.PASS, "Navigate to menu page by clicking more button");
		driver.findElement(By.xpath(CommonMethod.ClickSignInButton)).click();                // Select Sign-in button
		test.log(Status.PASS, "Tap on Sign-In Button");
		CommonMethod.Login();                                                                // Login from an Email account	
		test.log(Status.PASS, "Login via Email");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                     // Wait for screen to update
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Car Finance\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(CarFinancePage)).click();  
		test.log(Status.PASS, "Navigate to Car Finance page");
		driver.findElement(By.xpath(CommonMethod.SelectCarModelButton)).click();       
		test.log(Status.PASS, "Tap Car Model button to Select Car Information");
		driver.findElement(By.xpath(CommonMethod.SelectCarMakeModel)).click();   
		test.log(Status.PASS, "Select Car Make and Model");
		driver.findElement(By.xpath(CommonMethod.SelectCarVersion)).click();  
		test.log(Status.PASS, "Select Car Version");
		driver.findElement(By.xpath(CommonMethod.SelectLocationButton)).click();                // Select Location
		test.log(Status.PASS, "Select Location button");
		driver.findElement(By.xpath(CommonMethod.SelectCity)).click();                    // Select City
		test.log(Status.PASS, "Select City");
		driver.findElement(By.xpath(SelectTenureButton)).click();
		test.log(Status.PASS, "Select Tenure button");
		driver.findElement(By.xpath(SelectTenure)).click();
		test.log(Status.PASS, "Select Tenure");
		driver.findElement(By.xpath(SelectDownPaymentButton)).click();
		test.log(Status.PASS, "Select Down Payment Button");
		driver.findElement(By.xpath(SelectDownPayment)).click();
		test.log(Status.PASS, "Select Down Payment");
		driver.findElement(By.xpath(SelectCalculateButton)).click();
		test.log(Status.PASS, "Select Calcuate Button");
		driver.findElement(By.xpath(ClickApplyNowForBank)).click();
		test.log(Status.PASS, "Tap on Apply Now Button after selecting Bank");
		CommonMethod.EnterMobileNumber();
		test.log(Status.PASS, "Enter Mobile Number");
		driver.findElement(By.xpath(EnterAge)).sendKeys("25");
		test.log(Status.PASS, "Enter Age");
		driver.findElement(By.xpath(EnterCNIC)).sendKeys("35202-2106126-9");
		test.log(Status.PASS, "Enter CNIC");
		driver.findElement(By.xpath(CommonMethod.SelectLocationButton)).click();          // Select Location
		test.log(Status.PASS, "Select Location button");
		driver.findElement(By.xpath(CommonMethod.SelectCity)).click();                    // Select City
		test.log(Status.PASS, "Select City");
		driver.findElement(By.xpath(CommonMethod.SelectCityArea)).click();                // Select City Area
		test.log(Status.PASS, "Select City Area");
		driver.findElement(By.xpath(EnterAddress)).sendKeys("Street Testing House Automation");
		test.log(Status.PASS, "Enter Address");
		driver.findElement(By.xpath(SelectBestTimeToCallButton)).click();
		test.log(Status.PASS, "Select Best Time to Call Button");
		driver.findElement(By.xpath(SelectBestTimeToCall)).click();
		test.log(Status.PASS, "Select Best Time to Call");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"What is Your Source Of Income?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectSourceOfIncome)).click();
		test.log(Status.PASS, "Select Source Of Income");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"What is Your Monthly Income?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectMonthlyIncomeButton)).click();
		test.log(Status.PASS, "Select Monthly Income Button");
		driver.findElement(By.xpath(SelectMonthlyIncome)).click();
		test.log(Status.PASS, "Select Monthly Income");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Where Do You Bank?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectBankButton)).click();
		test.log(Status.PASS, "Tap on Bank button to open listing");
		driver.findElement(By.xpath(SelectBank)).click();
		test.log(Status.PASS, "Select Bank");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"What Is Your Tax Filer Status?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectTaxFilerStatus)).click();
		test.log(Status.PASS, "Select Tax Filer Status");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Do You Have Any Credit Cards Or Loans?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectLoanStatus)).click();
		test.log(Status.PASS, "Select Loan Status");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"How Do You Intend To Use Vehicle?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectIntendToUseVehicle)).click();
		test.log(Status.PASS, "Select Intend to Use Vehicle");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"How Soon Would You Like To Acquire The Loan?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectIntendToAcquireButton)).click();
		test.log(Status.PASS, "Select Intend to Acquire Button");
		driver.findElement(By.xpath(SelectIntendToAcquire)).click();
		test.log(Status.PASS, "Select Intend to Acquire");
		//driver.findElement(By.xpath(CommonMethod.ClickSubmitButton)).click();
		test.log(Status.PASS, "Select Submit Button");
		test.log(Status.INFO, "Test Successfully Completed");
	}
	
	@Test(priority = 2)
	public void FinanceRequest_UsedCars_FromMenu_WithOutLogin()
	{	
		ExtentTest test= extent.createTest("FinanceRequest_UsedCars_FromMenu_WithOutLogin");
		driver.launchApp();

		test.log(Status.INFO, "Test Started");	
		CommonMethod.SetApplicationLanguage();	
		test.log(Status.PASS, "Set Application language to English");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                   // Wait for screen to update
		driver.findElement(By.xpath(CommonMethod.ClickMoreButton)).click();               // Click More Button
		test.log(Status.PASS, "Navigate to menu page by clicking more button");
		driver.findElement(By.xpath(CarFinancePage)).click();  
		test.log(Status.PASS, "Navigate to Car Finance page");
		driver.findElement(By.xpath(SelectUsedCarsSection)).click(); 
		test.log(Status.PASS, "Select Used Cars Finance Tab");
		driver.findElement(By.xpath(CommonMethod.SelectCarModelButton)).click();       
		test.log(Status.PASS, "Tap Car Model button to Select Car Information");
		driver.findElement(By.xpath(CommonMethod.SelectCarMakeModel)).click();   
		test.log(Status.PASS, "Select Car Make and Model");
		driver.findElement(By.xpath(CommonMethod.SelectCarVersion)).click();  
		test.log(Status.PASS, "Select Car Version");
		driver.findElement(By.xpath(CommonMethod.EnterPrice)).sendKeys("1500000");
		test.log(Status.PASS, "Enter Price");
		driver.findElement(By.xpath(SelectModelYearButton)).click();  
		test.log(Status.PASS, "Select Car Model Year Button");
		driver.findElement(By.xpath(CommonMethod.SelectCarYear)).click();   
		test.log(Status.PASS, "Select Car Model Year");
		driver.findElement(By.xpath(SelectTenureButton)).click();
		test.log(Status.PASS, "Select Tenure button");
		driver.findElement(By.xpath(SelectTenure)).click();
		test.log(Status.PASS, "Select Tenure");
		driver.findElement(By.xpath(SelectDownPaymentButton)).click();
		test.log(Status.PASS, "Select Down Payment Button");
		driver.findElement(By.xpath(SelectDownPayment)).click();
		test.log(Status.PASS, "Select Down Payment");
		driver.findElement(By.xpath(SelectCalculateButton)).click();
		test.log(Status.PASS, "Select Calcuate Button");
		driver.findElement(By.xpath(ClickApplyNowForBank)).click();
		test.log(Status.PASS, "Tap on Apply Now Button after selecting Bank");
		CommonMethod.EnterName();
		test.log(Status.PASS, "Enter Name");
		driver.findElement(By.xpath(EnterEmail)).sendKeys("test@automation.com");
		test.log(Status.PASS, "Enter Email");
		CommonMethod.EnterMobileNumber();
		test.log(Status.PASS, "Enter Mobile Number");
		driver.findElement(By.xpath(EnterAge)).sendKeys("25");
		test.log(Status.PASS, "Enter Age");
		driver.findElement(By.xpath(EnterCNIC)).sendKeys("35202-2106126-9");
		test.log(Status.PASS, "Enter CNIC");
		driver.findElement(By.xpath(CommonMethod.SelectLocationButton)).click();          // Select Location
		test.log(Status.PASS, "Select Location button");
		driver.findElement(By.xpath(CommonMethod.SelectCity)).click();                    // Select City
		test.log(Status.PASS, "Select City");
		driver.findElement(By.xpath(CommonMethod.SelectCityArea)).click();                // Select City Area
		test.log(Status.PASS, "Select City Area");
		driver.findElement(By.xpath(EnterAddress)).sendKeys("Street Testing House Automation");
		test.log(Status.PASS, "Enter Address");
		driver.findElement(By.xpath(SelectBestTimeToCallButton)).click();
		test.log(Status.PASS, "Select Best Time to Call Button");
		driver.findElement(By.xpath(SelectBestTimeToCall)).click();
		test.log(Status.PASS, "Select Best Time to Call");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"What is Your Source Of Income?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectSourceOfIncome)).click();
		test.log(Status.PASS, "Select Source Of Income");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"What is Your Monthly Income?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectMonthlyIncomeButton)).click();
		test.log(Status.PASS, "Select Monthly Income Button");
		driver.findElement(By.xpath(SelectMonthlyIncome)).click();
		test.log(Status.PASS, "Select Monthly Income");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Where Do You Bank?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectBankButton)).click();
		test.log(Status.PASS, "Tap on Bank button to open listing");
		driver.findElement(By.xpath(SelectBank)).click();
		test.log(Status.PASS, "Select Bank");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"What Is Your Tax Filer Status?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectTaxFilerStatus)).click();
		test.log(Status.PASS, "Select Tax Filer Status");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Do You Have Any Credit Cards Or Loans?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectLoanStatus)).click();
		test.log(Status.PASS, "Select Loan Status");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"How Do You Intend To Use Vehicle?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectIntendToUseVehicle)).click();
		test.log(Status.PASS, "Select Intend to Use Vehicle");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"How Soon Would You Like To Acquire The Loan?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectIntendToAcquireButton)).click();
		test.log(Status.PASS, "Select Intend to Acquire Button");
		driver.findElement(By.xpath(SelectIntendToAcquire)).click();
		test.log(Status.PASS, "Select Intend to Acquire");
		//driver.findElement(By.xpath(CommonMethod.ClickSubmitButton)).click();
		test.log(Status.PASS, "Select Submit Button");
		test.log(Status.INFO, "Test Successfully Completed");
	}
	
	@Test(priority = 3)
	public void FinanceRequest_UsedCars_FromMenu_WithLogin()
	{	
		ExtentTest test= extent.createTest("FinanceRequest_UsedCars_FromMenu_WithLogin");
		driver.launchApp();

		test.log(Status.INFO, "Test Started");	
		CommonMethod.SetApplicationLanguage();	
		test.log(Status.PASS, "Set Application language to English");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                   // Wait for screen to update
		driver.findElement(By.xpath(CommonMethod.ClickMoreButton)).click();               // Click More Button
		test.log(Status.PASS, "Navigate to menu page by clicking more button");
		driver.findElement(By.xpath(CommonMethod.ClickSignInButton)).click();                // Select Sign-in button
		test.log(Status.PASS, "Tap on Sign-In Button");
		CommonMethod.Login();                                                                // Login from an Email account	
		test.log(Status.PASS, "Login via Email");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                     // Wait for screen to update
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Car Finance\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(CarFinancePage)).click();  
		test.log(Status.PASS, "Navigate to Car Finance page");
		driver.findElement(By.xpath(SelectUsedCarsSection)).click(); 
		test.log(Status.PASS, "Select Used Cars Finance Tab");
		driver.findElement(By.xpath(CommonMethod.SelectCarModelButton)).click();       
		test.log(Status.PASS, "Tap Car Model button to Select Car Information");
		driver.findElement(By.xpath(CommonMethod.SelectCarMakeModel)).click();   
		test.log(Status.PASS, "Select Car Make and Model");
		driver.findElement(By.xpath(CommonMethod.SelectCarVersion)).click();  
		test.log(Status.PASS, "Select Car Version");
		driver.findElement(By.xpath(CommonMethod.EnterPrice)).sendKeys("1500000");
		test.log(Status.PASS, "Enter Price");
		driver.findElement(By.xpath(SelectModelYearButton)).click();  
		test.log(Status.PASS, "Select Car Model Year Button");
		driver.findElement(By.xpath(CommonMethod.SelectCarYear)).click();   
		test.log(Status.PASS, "Select Car Model Year");
		driver.findElement(By.xpath(SelectTenureButton)).click();
		test.log(Status.PASS, "Select Tenure button");
		driver.findElement(By.xpath(SelectTenure)).click();
		test.log(Status.PASS, "Select Tenure");
		driver.findElement(By.xpath(SelectDownPaymentButton)).click();
		test.log(Status.PASS, "Select Down Payment Button");
		driver.findElement(By.xpath(SelectDownPayment)).click();
		test.log(Status.PASS, "Select Down Payment");
		driver.findElement(By.xpath(SelectCalculateButton)).click();
		test.log(Status.PASS, "Select Calcuate Button");
		driver.findElement(By.xpath(ClickApplyNowForBank)).click();
		test.log(Status.PASS, "Tap on Apply Now Button after selecting Bank");
		CommonMethod.EnterMobileNumber();
		test.log(Status.PASS, "Enter Mobile Number");
		driver.findElement(By.xpath(EnterAge)).sendKeys("25");
		test.log(Status.PASS, "Enter Age");
		driver.findElement(By.xpath(EnterCNIC)).sendKeys("35202-2106126-9");
		test.log(Status.PASS, "Enter CNIC");
		driver.findElement(By.xpath(CommonMethod.SelectLocationButton)).click();          // Select Location
		test.log(Status.PASS, "Select Location button");
		driver.findElement(By.xpath(CommonMethod.SelectCity)).click();                    // Select City
		test.log(Status.PASS, "Select City");
		driver.findElement(By.xpath(CommonMethod.SelectCityArea)).click();                // Select City Area
		test.log(Status.PASS, "Select City Area");
		driver.findElement(By.xpath(EnterAddress)).sendKeys("Street Testing House Automation");
		test.log(Status.PASS, "Enter Address");
		driver.findElement(By.xpath(SelectBestTimeToCallButton)).click();
		test.log(Status.PASS, "Select Best Time to Call Button");
		driver.findElement(By.xpath(SelectBestTimeToCall)).click();
		test.log(Status.PASS, "Select Best Time to Call");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"What is Your Source Of Income?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectSourceOfIncome)).click();
		test.log(Status.PASS, "Select Source Of Income");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"What is Your Monthly Income?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectMonthlyIncomeButton)).click();
		test.log(Status.PASS, "Select Monthly Income Button");
		driver.findElement(By.xpath(SelectMonthlyIncome)).click();
		test.log(Status.PASS, "Select Monthly Income");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Where Do You Bank?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectBankButton)).click();
		test.log(Status.PASS, "Tap on Bank button to open listing");
		driver.findElement(By.xpath(SelectBank)).click();
		test.log(Status.PASS, "Select Bank");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"What Is Your Tax Filer Status?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectTaxFilerStatus)).click();
		test.log(Status.PASS, "Select Tax Filer Status");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Do You Have Any Credit Cards Or Loans?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectLoanStatus)).click();
		test.log(Status.PASS, "Select Loan Status");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"How Do You Intend To Use Vehicle?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectIntendToUseVehicle)).click();
		test.log(Status.PASS, "Select Intend to Use Vehicle");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"How Soon Would You Like To Acquire The Loan?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectIntendToAcquireButton)).click();
		test.log(Status.PASS, "Select Intend to Acquire Button");
		driver.findElement(By.xpath(SelectIntendToAcquire)).click();
		test.log(Status.PASS, "Select Intend to Acquire");
		//driver.findElement(By.xpath(CommonMethod.ClickSubmitButton)).click();
		test.log(Status.PASS, "Select Submit Button");
		test.log(Status.INFO, "Test Successfully Completed");
	}
}
