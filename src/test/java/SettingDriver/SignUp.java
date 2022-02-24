package SettingDriver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class SignUp extends SetDesiredCapabilities
{
	AllCommonMethods CommonMethod = new AllCommonMethods(); 
	private String SignUpLink= "com.pakwheels.staging:id/signUpContainer";
	private String EnterEmail= "//android.widget.EditText[@text='Enter Email']";
	public String ClickSignUpButton= "//android.widget.Button[@text='Sign up']";
	public String ClickCancelButton= "//android.widget.Button[@text= 'CANCEL']";
	
	@Test
	public void SignUpViaEmail()
	{
		ExtentTest test= extent.createTest("Sign Up Via Email");
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
		
		CommonMethod.Scroll("Continue with Email");
		try{
			driver.findElement(By.xpath(CommonMethod.ContinueWithEmail)).click();  
			test.log(Status.PASS, "Verify that user can tap on Continue with Email option");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can tap on Continue with Email option");
		}
			
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		try{
			driver.findElement(By.id(SignUpLink)).click();
			test.log(Status.PASS, "Verify that user can select sign-up link");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can select sign-up link");
		}
		
		try{
			driver.findElement(By.xpath(ClickCancelButton)).click();
			test.log(Status.PASS, "Verify that user can cancel choosing account");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can cancel choosing account");
		}
		
		try{
			driver.findElement(By.xpath(EnterEmail)).sendKeys(CommonMethod.Email);
			test.log(Status.PASS, "Verify that user can enter email");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter email");
		}
		
		try{
			CommonMethod.EnterName();
			test.log(Status.PASS, "Verify that user can enter name");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter name");
		}
		
		try{
			driver.findElement(By.xpath(CommonMethod.EnterPassword)).sendKeys(CommonMethod.Password);
			test.log(Status.PASS, "Verify that user can enter password");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can enter password");
		}
		
		try{
			driver.findElement(By.xpath(ClickSignUpButton)).click();             
			test.log(Status.PASS, "Verify that user can tap on Sign-Up Button");
		}catch(org.openqa.selenium.NoSuchElementException e){
			test.log(Status.FAIL, "Verify that user can tap on Sign-Up Button");
		}
		
		test.log(Status.INFO, "Test Completed");
	}
}
