package Search;
import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import SettingDriver.AllCommonMethods;
import SettingDriver.SetDesiredCapabilities;


public class UsedCarSearch extends SetDesiredCapabilities
{
	AllCommonMethods CommonMethod = new AllCommonMethods(); 
	private String SelectCar= "//android.widget.TextView[@text= 'Honda City']";
	private String SearchBar= "//android.widget.TextView[@text= 'Search used cars']";
	private String EnterTextInSearchBar= "//android.widget.EditText[@text= 'Search used cars']";
	private String BrowseUsedCarsText= "//android.widget.TextView[@text= 'Browse Used Cars']";
	private String PakwheelsProductText= "//android.widget.TextView[@text= 'PakWheels Products']";
	private String PakwheelsCertifiedText= "//android.widget.TextView[@text= 'PakWheels Certified']";
	private String ManagedByPakwheelsText= "//android.widget.TextView[@text= 'Managed By PakWheels']";
	private String FeaturedUsedCarsText= "//android.widget.TextView[@text= 'Featured Used Cars']";
	private String LatestVideosText= "//android.widget.TextView[@text= 'Latest Videos']";
	private String LatestNewsText= "//android.widget.TextView[@text= 'Latest News']";
	private String CurrentFuelPricesText= "//android.widget.TextView[@text= 'Latest Videos']";
	private String BrowseMoreText= "//android.widget.TextView[@text= 'Browse More']";
	
	private String ClickSampleAd= "com.pakwheels.staging:id/iv_similar_ad_pic";
	private String SelectBackButton= "com.pakwheels.staging:id/btnBackListingCollapsed";
	
	private String ClickSampleFeaturedAd= "com.pakwheels.staging:id/iv_feature_icon_feature_ads";
	private String SimilarAdsText= "//android.widget.TextView[@text= 'Similar Ads']";
	
	@Test(priority = 0)
 	public void UsedCarSearch_Honda()
 	{
		ExtentTest test= extent.createTest("Used Car Search");	
		//driver.launchApp();
		test.log(Status.INFO, "Test Started");	
		
		try{
			CommonMethod.SetApplicationLanguage();                                                  
			test.log(Status.PASS, "Verify that user can set application language (Test Data: English)");	
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can set application language (Test Data: English)");		
		}
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);              
		/*try{
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
		}*/
		
		CommonMethod.ScrollSecondView("Browse Used Cars");
		try{
			String text= driver.findElement(By.xpath(BrowseUsedCarsText)).getText();          
			assertEquals(text, "Browse Used Cars");
			test.log(Status.PASS, "Verify that Browse Used Cars section is displayed");
		}catch(AssertionError e){
			test.log(Status.FAIL, "Verify that Browse Used Cars section is displayed");
		}
		
		CommonMethod.ScrollSecondView("PakWheels Products");
		try{
			String text= driver.findElement(By.xpath(PakwheelsProductText)).getText();          
			assertEquals(text, "PakWheels Products");
			test.log(Status.PASS, "Verify that PakWheels Products section is displayed");
		}catch(AssertionError e){
			test.log(Status.FAIL, "Verify that PakWheels Products section is displayed");
		}
		
		CommonMethod.ScrollSecondView("PakWheels Certified");
		try{
			String text= driver.findElement(By.xpath(PakwheelsCertifiedText)).getText();          
			assertEquals(text, "PakWheels Certified");
			test.log(Status.PASS, "Verify that PakWheels Certified section is displayed");
		}catch(AssertionError e){
			test.log(Status.FAIL, "Verify that PakWheels Certified section is displayed");
		}
		
		try{
			driver.findElement(By.id(ClickSampleAd)).click();   
			test.log(Status.PASS, "Verify that user can click first ad from PakWheels Certified Carousel and is navigated to Ad detailed page");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can click first ad from PakWheels Certified Carousel and is navigated to Ad detailed page");
		}
		
		try{
			driver.findElement(By.id(SelectBackButton)).click();   
			test.log(Status.PASS, "Verify that user can click back button from Ad detailed page");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can click back button from Ad detailed page");
		}
		
		CommonMethod.ScrollSecondView("Managed By PakWheels");
		try{
			String text= driver.findElement(By.xpath(ManagedByPakwheelsText)).getText();          
			assertEquals(text, "Managed By PakWheels");
			test.log(Status.PASS, "Verify that Managed By PakWheels section is displayed");
		}catch(AssertionError e){
			test.log(Status.FAIL, "Verify that Managed By PakWheels section is displayed");
		}
		
		try{
			driver.findElement(By.id(ClickSampleAd)).click();   
			test.log(Status.PASS, "Verify that user can click first ad from Managed By PakWheels Carousel and is navigated to Ad detailed page");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can click first ad from Managed By PakWheels Carousel and is navigated to Ad detailed page");
		}
	
		try{
			driver.findElement(By.id(SelectBackButton)).click();   
			test.log(Status.PASS, "Verify that user can click back button from Ad detailed page");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can click back button from Ad detailed page");
		}

		
		CommonMethod.ScrollSecondView("Featured Used Cars");
		try{
			String text= driver.findElement(By.xpath(FeaturedUsedCarsText)).getText();          
			assertEquals(text, "Featured Used Cars");
			test.log(Status.PASS, "Verify that Featured Used Cars section is displayed");
		}catch(AssertionError e){
			test.log(Status.FAIL, "Verify that Featured Used Cars section is displayed");
		}
		
		try{
			driver.findElement(By.id(ClickSampleFeaturedAd)).click();   
			test.log(Status.PASS, "Verify that user can click first ad from Featured Used Cars Carousel and is navigated to Ad detailed page");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can click first ad from Featured Used Cars Carousel and is navigated to Ad detailed page");
		}
		
		try{
			driver.findElement(By.id(SelectBackButton)).click();   
			test.log(Status.PASS, "Verify that user can click back button from Ad detailed page");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can click back button from Ad detailed page");
		}
		
		CommonMethod.ScrollForward();
		try{
			String text= driver.findElement(By.xpath(LatestVideosText)).getText();          
			assertEquals(text, "Latest Videos");
			test.log(Status.PASS, "Verify that Latest Videos section is displayed");
		}catch(AssertionError e){
			test.log(Status.FAIL, "Verify that Latest Videos section is displayed");
		}
	
		CommonMethod.ScrollForward();
		try{
			String text= driver.findElement(By.xpath(LatestNewsText)).getText();          
			assertEquals(text, "Latest News");
			test.log(Status.PASS, "Verify that Latest News section is displayed");
		}catch(AssertionError e){
			test.log(Status.FAIL, "Verify that Latest News section is displayed");
		}
		
		CommonMethod.ScrollForward();
		try{
			String text= driver.findElement(By.xpath(CurrentFuelPricesText)).getText();          
			assertEquals(text, "Current Fuel Prices");
			test.log(Status.PASS, "Verify that Current Fuel Prices section is displayed");
		}catch(AssertionError e){
			test.log(Status.FAIL, "Verify that Current Fuel Prices section is displayed");
		}
		
		CommonMethod.ScrollForward();
		try{
			String text= driver.findElement(By.xpath(BrowseMoreText)).getText();          
			assertEquals(text, "Browse More");
			test.log(Status.PASS, "Verify that Browse More section is displayed");
		}catch(AssertionError e){
			test.log(Status.FAIL, "Verify that Browse More section is displayed");
		}
		
		CommonMethod.ScrollToBeginning();
		try{
			driver.findElement(By.xpath(SearchBar)).click();   
			test.log(Status.PASS, "Verify that user can tap on Search Bar to enter text");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can tap on Search Bar to enter text");
		}
		
		try{
			driver.findElement(By.xpath(EnterTextInSearchBar)).sendKeys("Honda City");   
			test.log(Status.PASS, "Verify that user can enter Car Make Model in Search Bar (Test Data: Honda City)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter Car Make Model in Search Bar (Test Data: Honda City)");
		}
		
		try{
			driver.findElement(By.xpath(SelectCar)).click(); 
			test.log(Status.PASS, "Verify that user can select Car Model from search result (Test Data: Honda City)");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Car Model from search result (Test Data: Honda City)");
		}
		
		try{
			driver.findElement(By.id(CommonMethod.SelectAd)).click(); 
			test.log(Status.PASS, "Verify that user can select Ad from Car Listing Page");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select Ad from Car Listing Page");
		}
		
		
		/*CommonMethod.ScrollForward();
		try{
			String text= driver.findElement(By.xpath(CommonMethod.SellerCommentsText)).getText();  
			assertEquals(text, "Seller Comments");
			test.log(Status.PASS, "Verify Seller Comments section is displayed");
	    }catch(AssertionError e){
			test.log(Status.FAIL, "Verify Seller Comments section is displayed");
        }
		
		try{
			String text= driver.findElement(By.xpath(CommonMethod.FeaturesText)).getText();          
			assertEquals(text, "Features");
			test.log(Status.PASS, "Verify Features section is displayed");
		}catch(AssertionError e){
			test.log(Status.FAIL, "Verify Features section is displayed");
		}
		
		
		CommonMethod.ScrollForward();
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
			
		CommonMethod.ScrollForward();
		try{
			String text= driver.findElement(By.xpath(SimilarAdsText)).getText();          
			assertEquals(text, "Similar Ads");
			test.log(Status.PASS, "Verify that Similar Ads section is displayed");
		}catch(AssertionError e){
			test.log(Status.FAIL, "Verify that Similar Ads section is displayed");
		}	*/

		test.log(Status.INFO, "Test Completed");
 	}
}
