package LeadForms;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
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
	private String SelectModelYear= "//android.widget.TextView[@text= 'Model Year']";	
	
	
	@Test(priority = 0)
	public void FinanceRequest_NewCars_FromMenu_WithOutLogin()
	{	
		//driver.launchApp();
		CommonMethod.SetApplicationLanguage();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                            // Wait for screen to update
		driver.findElement(By.xpath(CommonMethod.ClickMoreButton)).click();                         // Click More Button
		driver.findElement(By.xpath(CarFinancePage)).click();                                       // Navigate to Finance Page
		driver.findElement(By.xpath(CommonMethod.SelectCarModelButton)).click();                    // Select Car Model Button
		driver.findElement(By.xpath(CommonMethod.SelectCarMakeModel)).click();                      // Select Car Make and Model
		driver.findElement(By.xpath(CommonMethod.SelectCarVersion)).click();                        // Select Car Version
		driver.findElement(By.xpath(CommonMethod.SelectLocationButton)).click();                    // Select Location
		driver.findElement(By.xpath(CommonMethod.SelectCity)).click();                              // Select City
		driver.findElement(By.xpath(SelectTenureButton)).click();                                   // Select Tenure Button
		driver.findElement(By.xpath(SelectTenure)).click();                                         // Select Tenure
		driver.findElement(By.xpath(SelectDownPaymentButton)).click();                              // Select Down payment Button
		driver.findElement(By.xpath(SelectDownPayment)).click();                                    // Select Down Payment
		driver.findElement(By.xpath(SelectCalculateButton)).click();                                // Click Calculate Button
		driver.findElement(By.xpath(ClickApplyNowForBank)).click();                                 // Select Apply Button for a Bank
		CommonMethod.EnterName();                                                                   // Enter Name
		driver.findElement(By.xpath(EnterEmail)).sendKeys("test@automation.com");                   // Enter Email
		CommonMethod.EnterMobileNumber();                                                           // Enter Phone Number
		driver.findElement(By.xpath(EnterAge)).sendKeys("25");                                      // Enter Age
		driver.findElement(By.xpath(EnterCNIC)).sendKeys("35202-2106126-9");                        // Enter CNIC
		driver.findElement(By.xpath(CommonMethod.SelectLocationButton)).click();                    // Select Location
		driver.findElement(By.xpath(CommonMethod.SelectCity)).click();                              // Select City
		driver.findElement(By.xpath(CommonMethod.SelectCityArea)).click();                          // Select City Area
		driver.findElement(By.xpath(EnterAddress)).sendKeys("Street Testing House Automation");     // Enter Address
		driver.findElement(By.xpath(SelectBestTimeToCallButton)).click();
		driver.findElement(By.xpath(SelectBestTimeToCall)).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"What is Your Source Of Income?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectSourceOfIncome)).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"What is Your Monthly Income?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectSourceOfIncome)).click();
		driver.findElement(By.xpath(SelectMonthlyIncomeButton)).click();
		driver.findElement(By.xpath(SelectMonthlyIncome)).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Where Do You Bank?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectBankButton)).click();
		driver.findElement(By.xpath(SelectBank)).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"What Is Your Tax Filer Status?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectTaxFilerStatus)).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Do You Have Any Credit Cards Or Loans?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectLoanStatus)).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"How Do You Intend To Use Vehicle?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectIntendToUseVehicle)).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"How Soon Would You Like To Acquire The Loan?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectIntendToAcquireButton)).click();
		driver.findElement(By.xpath(SelectIntendToAcquire)).click();
		//driver.findElement(By.xpath(CommonMethod.ClickSubmitButton)).click();
	}
	
	@Test(priority = 1)
	public void FinanceRequest_NewCars_FromMenu_WithLogin()
	{	
		driver.launchApp();
		CommonMethod.SetApplicationLanguage();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                   // Wait for screen to update
		driver.findElement(By.xpath(CommonMethod.ClickMoreButton)).click();               // Click More Button
		driver.findElement(By.xpath(CommonMethod.ClickSignInButton)).click();                // Select Sign-in button
		CommonMethod.Login();                                                                // Login from an Email account	
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                     // Wait for screen to update
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Car Finance\").instance(0))"));   //Scroll	
		
		driver.findElement(By.xpath(CarFinancePage)).click();  
		driver.findElement(By.xpath(CommonMethod.SelectCarModelButton)).click();       
		driver.findElement(By.xpath(CommonMethod.SelectCarMakeModel)).click();   
		driver.findElement(By.xpath(CommonMethod.SelectCarVersion)).click();  
		driver.findElement(By.xpath(CommonMethod.SelectLocationButton)).click();                // Select Location
		driver.findElement(By.xpath(CommonMethod.SelectCity)).click();                    // Select City
		driver.findElement(By.xpath(SelectTenureButton)).click();
		driver.findElement(By.xpath(SelectTenure)).click();
		driver.findElement(By.xpath(SelectDownPaymentButton)).click();
		driver.findElement(By.xpath(SelectDownPayment)).click();
		driver.findElement(By.xpath(SelectCalculateButton)).click();
		driver.findElement(By.xpath(ClickApplyNowForBank)).click();
		CommonMethod.EnterMobileNumber();
		driver.findElement(By.xpath(EnterAge)).sendKeys("25");
		driver.findElement(By.xpath(EnterCNIC)).sendKeys("35202-2106126-9");
		driver.findElement(By.xpath(CommonMethod.SelectLocationButton)).click();          // Select Location
		driver.findElement(By.xpath(CommonMethod.SelectCity)).click();                    // Select City
		driver.findElement(By.xpath(CommonMethod.SelectCityArea)).click();                // Select City Area
		driver.findElement(By.xpath(EnterAddress)).sendKeys("Street Testing House Automation");
		driver.findElement(By.xpath(SelectBestTimeToCallButton)).click();
		driver.findElement(By.xpath(SelectBestTimeToCall)).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"What is Your Source Of Income?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectSourceOfIncome)).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"What is Your Monthly Income?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectSourceOfIncome)).click();
		driver.findElement(By.xpath(SelectMonthlyIncomeButton)).click();
		driver.findElement(By.xpath(SelectMonthlyIncome)).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Where Do You Bank?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectBankButton)).click();
		driver.findElement(By.xpath(SelectBank)).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"What Is Your Tax Filer Status?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectTaxFilerStatus)).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Do You Have Any Credit Cards Or Loans?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectLoanStatus)).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"How Do You Intend To Use Vehicle?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectIntendToUseVehicle)).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"How Soon Would You Like To Acquire The Loan?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectIntendToAcquireButton)).click();
		driver.findElement(By.xpath(SelectIntendToAcquire)).click();
		//driver.findElement(By.xpath(CommonMethod.ClickSubmitButton)).click();
	}
	
	@Test(priority = 2)
	public void FinanceRequest_UsedCars_FromMenu_WithOutLogin()
	{	
		driver.launchApp();
		CommonMethod.SetApplicationLanguage();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                   // Wait for screen to update
		driver.findElement(By.xpath(CommonMethod.ClickMoreButton)).click();               // Click More Button
		driver.findElement(By.xpath(CarFinancePage)).click();  
		driver.findElement(By.xpath(SelectUsedCarsSection)).click(); 
		
		driver.findElement(By.xpath(CommonMethod.SelectCarModelButton)).click();       
		driver.findElement(By.xpath(CommonMethod.SelectCarMakeModel)).click();   
		driver.findElement(By.xpath(CommonMethod.SelectCarVersion)).click();  
		driver.findElement(By.xpath(CommonMethod.EnterPrice)).sendKeys("1500000");
		driver.findElement(By.xpath(SelectModelYear)).click();  
		driver.findElement(By.xpath(CommonMethod.SelectCarYear)).click();   
		driver.findElement(By.xpath(SelectTenureButton)).click();
		driver.findElement(By.xpath(SelectTenure)).click();
		driver.findElement(By.xpath(SelectDownPaymentButton)).click();
		driver.findElement(By.xpath(SelectDownPayment)).click();
		driver.findElement(By.xpath(SelectCalculateButton)).click();
		driver.findElement(By.xpath(ClickApplyNowForBank)).click();
		CommonMethod.EnterName();
		driver.findElement(By.xpath(EnterEmail)).sendKeys("test@automation.com");
		CommonMethod.EnterMobileNumber();
		driver.findElement(By.xpath(EnterAge)).sendKeys("25");
		driver.findElement(By.xpath(EnterCNIC)).sendKeys("35202-2106126-9");
		driver.findElement(By.xpath(CommonMethod.SelectLocationButton)).click();          // Select Location
		driver.findElement(By.xpath(CommonMethod.SelectCity)).click();                    // Select City
		driver.findElement(By.xpath(CommonMethod.SelectCityArea)).click();                // Select City Area
		driver.findElement(By.xpath(EnterAddress)).sendKeys("Street Testing House Automation");
		driver.findElement(By.xpath(SelectBestTimeToCallButton)).click();
		driver.findElement(By.xpath(SelectBestTimeToCall)).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"What is Your Source Of Income?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectSourceOfIncome)).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"What is Your Monthly Income?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectSourceOfIncome)).click();
		driver.findElement(By.xpath(SelectMonthlyIncomeButton)).click();
		driver.findElement(By.xpath(SelectMonthlyIncome)).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Where Do You Bank?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectBankButton)).click();
		driver.findElement(By.xpath(SelectBank)).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"What Is Your Tax Filer Status?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectTaxFilerStatus)).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Do You Have Any Credit Cards Or Loans?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectLoanStatus)).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"How Do You Intend To Use Vehicle?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectIntendToUseVehicle)).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"How Soon Would You Like To Acquire The Loan?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectIntendToAcquireButton)).click();
		driver.findElement(By.xpath(SelectIntendToAcquire)).click();
		//driver.findElement(By.xpath(CommonMethod.ClickSubmitButton)).click();
	}
	
	@Test(priority = 3)
	public void FinanceRequest_UsedCars_FromMenu_WithLogin()
	{	
		driver.launchApp();
		CommonMethod.SetApplicationLanguage();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                   // Wait for screen to update
		driver.findElement(By.xpath(CommonMethod.ClickMoreButton)).click();               // Click More Button
		driver.findElement(By.xpath(CommonMethod.ClickSignInButton)).click();                // Select Sign-in button
		CommonMethod.Login();                                                                // Login from an Email account	
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);                     // Wait for screen to update
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Car Finance\").instance(0))"));   //Scroll	
		
		driver.findElement(By.xpath(CarFinancePage)).click();  
		driver.findElement(By.xpath(SelectUsedCarsSection)).click(); 
		
		driver.findElement(By.xpath(CommonMethod.SelectCarModelButton)).click();       
		driver.findElement(By.xpath(CommonMethod.SelectCarMakeModel)).click();   
		driver.findElement(By.xpath(CommonMethod.SelectCarVersion)).click();  
		driver.findElement(By.xpath(CommonMethod.EnterPrice)).sendKeys("1500000");
		driver.findElement(By.xpath(SelectModelYear)).click();  
		driver.findElement(By.xpath(CommonMethod.SelectCarYear)).click();   
		driver.findElement(By.xpath(SelectTenureButton)).click();
		driver.findElement(By.xpath(SelectTenure)).click();
		driver.findElement(By.xpath(SelectDownPaymentButton)).click();
		driver.findElement(By.xpath(SelectDownPayment)).click();
		driver.findElement(By.xpath(SelectCalculateButton)).click();
		driver.findElement(By.xpath(ClickApplyNowForBank)).click();
		CommonMethod.EnterMobileNumber();
		driver.findElement(By.xpath(EnterAge)).sendKeys("25");
		driver.findElement(By.xpath(EnterCNIC)).sendKeys("35202-2106126-9");
		driver.findElement(By.xpath(CommonMethod.SelectLocationButton)).click();          // Select Location
		driver.findElement(By.xpath(CommonMethod.SelectCity)).click();                    // Select City
		driver.findElement(By.xpath(CommonMethod.SelectCityArea)).click();                // Select City Area
		driver.findElement(By.xpath(EnterAddress)).sendKeys("Street Testing House Automation");
		driver.findElement(By.xpath(SelectBestTimeToCallButton)).click();
		driver.findElement(By.xpath(SelectBestTimeToCall)).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"What is Your Source Of Income?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectSourceOfIncome)).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"What is Your Monthly Income?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectSourceOfIncome)).click();
		driver.findElement(By.xpath(SelectMonthlyIncomeButton)).click();
		driver.findElement(By.xpath(SelectMonthlyIncome)).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Where Do You Bank?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectBankButton)).click();
		driver.findElement(By.xpath(SelectBank)).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"What Is Your Tax Filer Status?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectTaxFilerStatus)).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Do You Have Any Credit Cards Or Loans?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectLoanStatus)).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"How Do You Intend To Use Vehicle?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectIntendToUseVehicle)).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"How Soon Would You Like To Acquire The Loan?\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectIntendToAcquireButton)).click();
		driver.findElement(By.xpath(SelectIntendToAcquire)).click();
		//driver.findElement(By.xpath(CommonMethod.ClickSubmitButton)).click();
	}
}
