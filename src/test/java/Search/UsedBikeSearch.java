package Search;
import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import SettingDriver.AllCommonMethods;
import SettingDriver.SetDesiredCapabilities;

public class UsedBikeSearch extends SetDesiredCapabilities
{
	AllCommonMethods CommonMethod = new AllCommonMethods(); 
	private String SelectCityFromSearchBar= "//android.widget.TextView[@text= 'All Cities']";
	private String SelectBike= "//android.widget.TextView[@text= 'Honda CD 70']";
	private String SearchBar= "//android.widget.TextView[@text= 'Search used bikes']";
	private String EnterTextInSearchBar= "//android.widget.EditText[@text= 'Search used bikes']";
	private String SelectFilters= "//android.widget.Button[@text= 'Filter']";
	
	private String EnterKeywords= "//android.widget.EditText[@text= 'Search (e.g Honda Cd 70 in Lahore)']";
	private String EnterMinPrice= "//android.widget.EditText[@text= '0']";
	private String EnterMaxPrice= "//android.widget.EditText[@text= 'Any']";
	private String EnterMinYear= "//android.widget.EditText[@text= '1970']";
	private String EnterMaxYear= "//android.widget.EditText[@text= '2022']";
	private String EnterMinMileage= "//android.widget.EditText[@text= '0']";
	private String EnterMaxMileage= "//android.widget.EditText[@text= 'Any']";
	private String Select2Stroke= "//android.widget.CompoundButton[@text= '2-Stroke']";
	private String Select4Stroke= "//android.widget.CompoundButton[@text= '4-Stroke']";
	private String SelectIndividualsSeller= "//android.widget.CompoundButton[@text= 'Individuals']";
	private String SelectDealersSeller= "//android.widget.CompoundButton[@text= 'Dealers']";
	private String SelectAdProperties= "//android.widget.CompoundButton[@text= 'Picture ads only']";
	private String SelectApplyFilters= "//android.widget.Button[@text= 'Apply Filters']";
	private String SelectSort= "//android.widget.Button[@text= 'Sort']";
	private String ApplySortasPriceHighToLow= "//android.widget.TextView[@text= 'Price (High to Low)']";
	private String SelectStandardBodyType= "//android.widget.TextView[@text= 'Standard']";
	
	private String SaveAd= "com.pakwheels.staging:id/circle";
	private String NotifyMe= "com.pakwheels.staging:id/btn_create_alert";
	private String SelectCreateAlert= "//android.widget.Button[@text= 'Create Alert']";
	
	private String WantToSellBikeText= "//android.widget.TextView[@text= 'Want to Sell Your Bike?']";
	
	@Test(priority = 0)
 	public void UsedBikeSearch_Honda()
 	{	
		ExtentTest test= extent.createTest("Used Bike Search");	
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
		
		try{
			driver.findElement(By.xpath(CommonMethod.ClickHomeButton)).click(); 
			test.log(Status.PASS, "Verify that user can select Home Button to visit Home screen");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Home Button to visit Home screen");
		}
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		try{
			driver.findElement(By.xpath(CommonMethod.SelectBikeTab)).click(); 
			test.log(Status.PASS, "Verify that user can select Bike tab from headers");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Bike tab from headers");
		}
		
		test.log(Status.INFO, "User is navigated to Bike Page");	
		
		
		try{
			driver.findElement(By.xpath(SearchBar)).click();   
			test.log(Status.PASS, "Verify that user can tap on Search Bar to enter text");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can tap on Search Bar to enter text");
		}
		
		try{
			driver.findElement(By.xpath(EnterTextInSearchBar)).sendKeys("Honda CD 70");   
			test.log(Status.PASS, "Verify that user can enter Bike Make Model in Search Bar (Test Data: Honda CD 70)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter Bike Make Model in Search Bar (Test Data: Honda CD 70)");
		}
		
		try{
			driver.findElement(By.xpath(SelectBike)).click(); 
			test.log(Status.PASS, "Verify that user can select Bike Model from search result (Test Data: Honda CD 70)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Bike Model from search result (Test Data: Honda CD 70)");
		}
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		test.log(Status.INFO, "User is navigated to Bike Ad Listing Screen");
		
		try{
			driver.findElement(By.xpath(SelectSort)).click(); 
			test.log(Status.PASS, "Verify that user can select Sort Button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Sort Button");
		}
		
		try{
			driver.findElement(By.xpath(ApplySortasPriceHighToLow)).click(); 
			test.log(Status.PASS, "Verify that user can choose from sort options (Test Data: Price High to Low)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can choose from sort options (Test Data: Price High to Low)");
		}
			
		try {
			driver.findElements(By.id(SaveAd)).get(0).click(); 
			test.log(Status.PASS, "Verify that user can save Ad (Test Data: 1st Ad)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can save Ad (Test Data: 1st Ad)");
		}
		
		try {
			driver.findElements(By.id(SaveAd)).get(1).click(); 
			test.log(Status.PASS, "Verify that user can save Ad (Test Data: 2nd Ad)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can save Ad (Test Data: 2nd Ad)");
		}
		
		try {
			driver.findElements(By.id(SaveAd)).get(2).click(); 
			test.log(Status.PASS, "Verify that user can save Ad (Test Data: 3rd Ad)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can save Ad (Test Data: 3rd Ad)");
		}
		
		try{
			driver.findElement(By.id(NotifyMe)).click(); 
			test.log(Status.PASS, "Verify that user can tap on Alert Button from headers to create alert");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can tap on Alert Button from headers to create alert");
		}
		
		try{
			driver.findElement(By.xpath(SelectCreateAlert)).click(); 
			test.log(Status.PASS, "Verify that user can create Alert (Test Data: Daily)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can create Alert (Test Data: Daily)");
		}
		
		try{
			driver.findElement(By.xpath(SelectFilters)).click(); 
			test.log(Status.PASS, "Verify that user can select Filter button from Bike Listing Page");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Filter button from Bike Listing Page");
		}
		
		test.log(Status.INFO, "User is navigated to Advance Search Filters Screen");
		
		try{
			driver.findElement(By.xpath(EnterKeywords)).sendKeys("Honda CD 70"); 
			test.log(Status.PASS, "Verify that user can enter Keyword (Test Data: Honda CD 70)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter Keyword (Test Data: Honda CD 70)");
		}
		
		try{
			driver.findElement(By.xpath(EnterMinPrice)).sendKeys("80000");   
			test.log(Status.PASS, "Verify that user can enter Min Price (Test Data: 80 Thousand)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter Min Price (Test Data: 80 Thousand)");
		}
		
		try{
			driver.findElement(By.xpath(EnterMaxPrice)).sendKeys("10000000");   
			test.log(Status.PASS, "Verify that user can enter Max Price (Test Data: 1 Crore)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter Max Price (Test Data: 1 Crore)");
		}
		
		CommonMethod.Scroll("Model Year Range");
		try{
			driver.findElement(By.xpath(EnterMinYear)).sendKeys("2012");   
			test.log(Status.PASS, "Verify that user can enter Min Yea (Test Data: 2012)r");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter Min Year (Test Data: 2012)");
		}
		
		try{
			driver.findElement(By.xpath(EnterMaxYear)).sendKeys("2023");   
			test.log(Status.PASS, "Verify that user can enter Max Year (Test Data: 2023)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter Max Year (Test Data: 2023)");
		}
		
		CommonMethod.Scroll("Mileage (KM)");
		try{
			driver.findElement(By.xpath(EnterMinMileage)).sendKeys("1000");   
			test.log(Status.PASS, "Verify that user can enter Min Mileage (Test Data: 1000)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter Min Mileage (Test Data: 1000)");
		}	
		
		try{
			driver.findElement(By.xpath(EnterMaxMileage)).sendKeys("100000");   
			test.log(Status.PASS, "Verify that user can enter Max Mileage (Test Data: 1 Lac)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter Max Mileage (Test Data: 1 Lac)");
		}
		
		CommonMethod.Scroll("Engine Type");
		try {
			driver.findElement(By.xpath(Select2Stroke)).click(); 
			driver.findElement(By.xpath(Select4Stroke)).click(); 
			test.log(Status.PASS, "Verify that user can select Engine Type (Test Data: 2-Stroke + 4-Stroke)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Engine Type (Test Data: 2-Stroke + 4-Stroke)");
		}	
		
		CommonMethod.Scroll("Body Type");
		try {
			driver.findElement(By.xpath(SelectStandardBodyType)).click(); 
			test.log(Status.PASS, "Verify that user can select Standard Body Type (Test Data: Standard)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Standard Body Type (Test Data: Standard)");
		}
		
		CommonMethod.Scroll("Seller Type");
		try {
			driver.findElement(By.xpath(SelectIndividualsSeller)).click(); 
			driver.findElement(By.xpath(SelectDealersSeller)).click(); 
			test.log(Status.PASS, "Verify that user can select Seller Type (Test Data: Individual + Dealer)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Seller Type (Test Data: Individual + Dealer)");
		}
		
		CommonMethod.Scroll("Ad Properties");
		try {
			driver.findElement(By.xpath(SelectAdProperties)).click(); 
			test.log(Status.PASS, "Verify that user can select Ad Properties (Test Data: Pictures Ad Only)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Ad Properties (Test Data: Pictures Ad Only)");
		}
		
		try {
			driver.findElement(By.xpath(SelectApplyFilters)).click(); 
			test.log(Status.PASS, "Verify that user can select Apply Filters button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Apply Filters button");
		}	
		
		try  {
			driver.findElement(By.id(CommonMethod.SelectAd)).click(); 
			test.log(Status.PASS, "Verify that user can select Ad from Bike Listing Page");
		}
		catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Ad from Bike Listing Page");
		}
		
		test.log(Status.INFO, "User is navigated to Ad Detailed Page");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		try{
			String text= driver.findElement(By.xpath(CommonMethod.ModelNameText)).getText(); 
			assertEquals(text, "Honda CD 70");	
			test.log(Status.PASS, "Verify Model Name on Ad detailed Page");
		}catch(AssertionError e){
			test.log(Status.FAIL, "Verify Model Name on Ad detailed Page");
	    }
		
		CommonMethod.Scroll("Seller Comments");
		try{
			String text= driver.findElement(By.xpath(CommonMethod.SellerCommentsText)).getText();  
			assertEquals(text, "Seller Comments");
			test.log(Status.PASS, "Verify Seller Comments section is displayed");
	    }catch(AssertionError e){
			test.log(Status.FAIL, "Verify Seller Comments section is displayed");
        }
		
		CommonMethod.Scroll("Features");
		try{
			String text= driver.findElement(By.xpath(CommonMethod.FeaturesText)).getText();          
			assertEquals(text, "Features");
			test.log(Status.PASS, "Verify Features section is displayed");
		}catch(AssertionError e){
			test.log(Status.FAIL, "Verify Features section is displayed");
		}
		
		CommonMethod.Scroll("Seller Detail");
		try{
			String text= driver.findElement(By.xpath(CommonMethod.SellerDetailText)).getText();          
			assertEquals(text, "Seller Detail");
			test.log(Status.PASS, "Verify Seller Detail section is displayed");
		}catch(AssertionError e){
			test.log(Status.FAIL, "Verify Seller Detail section is displayed");
		}
		
		try{ 
			driver.findElement(By.id(CommonMethod.VisitSellerDetailsPage)).click(); 
			test.log(Status.PASS, "Verify that user can visit Seller Detail Page");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can visit Seller Detail Page");
		}	
		
		try{ 
			driver.findElement(By.xpath(CommonMethod.SelectBackButton)).click(); 
			test.log(Status.PASS, "Verify that user can get back from visiting Seller Details page");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "BVerify that user can get back from visiting Seller Details page");
		}
		
		CommonMethod.Scroll("Sell Your Bike");
		try{
			String text= driver.findElement(By.xpath(WantToSellBikeText)).getText();          
			assertEquals(text, "Want to Sell Your Bike?");
			test.log(Status.PASS, "Verify Want to Sell Your Bike section is displayed");
		}catch(AssertionError e){
			test.log(Status.FAIL, "Verify Want to Sell Your Bike section is displayed");
		}
		
		CommonMethod.Scroll("Post an Ad for Free");
		try{
			String text= driver.findElement(By.xpath(CommonMethod.SimilarAdsText)).getText();          
			assertEquals(text, "Similar Ads");
			test.log(Status.PASS, "Verify Similar Ads section is displayed");
		}catch(AssertionError e){
			test.log(Status.FAIL, "Verify Similar Ads section is displayed");
		}	
		
		test.log(Status.INFO, "Test Completed");
 	}
}
