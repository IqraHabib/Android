package Search;
import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import SettingDriver.AllCommonMethods;
import SettingDriver.SetDesiredCapabilities;
import io.appium.java_client.MobileBy;

public class UsedBikeSearch extends SetDesiredCapabilities
{
	AllCommonMethods CommonMethod = new AllCommonMethods(); 
	private String SelectCityFromSearchBar= "//android.widget.TextView[@text= 'All Cities']";
	private String SearchBar= "//android.widget.TextView[@text= 'Search used bikes']";
	private String EnterTextInSearchBar= "//android.widget.EditText[@text= 'Search used bikes']";
	private String SelectBike= "//android.widget.TextView[@text= 'Honda CD 70']";
	private String SelectAd= "com.pakwheels.staging:id/txtview_ad_title_search_action_item";
	private String BikeTitle= "//android.widget.TextView[@text= 'Honda CD 70']";
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
	private String SelectStandardBodyType= "//android.widget.TextView[@text= 'Standard']";
	
	@Test(priority = 0)
 	public void UsedBikeSearch_Honda()
 	{	
		//driver.launchApp();
		CommonMethod.SetApplicationLanguage();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath(CommonMethod.SelectBikePage)).click();   
		driver.findElement(By.xpath(SelectCityFromSearchBar)).click();   
		driver.findElement(By.xpath(CommonMethod.SelectCity)).click();                       // Select City
		driver.findElement(By.xpath(SearchBar)).click();   
		driver.findElement(By.xpath(EnterTextInSearchBar)).sendKeys("Honda CD 70");   
		driver.findElement(By.xpath(SelectBike)).click(); 
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath(SelectFilters)).click(); 
		
		driver.findElement(By.xpath(EnterKeywords)).sendKeys("Honda CD 70"); 
		driver.findElement(By.xpath(EnterMinPrice)).sendKeys("80000");   
		driver.findElement(By.xpath(EnterMaxPrice)).sendKeys("10000000");   
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Model Year Range\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(EnterMinYear)).sendKeys("2012");   
		driver.findElement(By.xpath(EnterMaxYear)).sendKeys("2023");   
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Mileage (KM)\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(EnterMinMileage)).sendKeys("1000");   
		driver.findElement(By.xpath(EnterMaxMileage)).sendKeys("100000");   
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Engine Type\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(Select2Stroke)).click(); 
		driver.findElement(By.xpath(Select4Stroke)).click(); 
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Body Type\").instance(0))"));   //Scroll	
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Standard\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectStandardBodyType)).click(); 
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Seller Type\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectIndividualsSeller)).click(); 
		driver.findElement(By.xpath(SelectDealersSeller)).click(); 
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Ad Properties\").instance(0))"));   //Scroll	
		driver.findElement(By.xpath(SelectAdProperties)).click(); 
		driver.findElement(By.xpath(SelectApplyFilters)).click(); 
		//driver.findElement(By.id(SelectAd)).click(); 
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//String Text= driver.findElement(By.xpath(BikeTitle)).getText(); 
		//assertEquals(Text, "Honda CD 70");
 	}
}
