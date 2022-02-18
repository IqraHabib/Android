package Resources;
import org.testng.IReporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG implements IReporter 
{
    public ExtentReports extent;
    ExtentSparkReporter htmlReporter;
    public ExtentTest test;
    
    @BeforeSuite
    public void reportSetup() 
    {
    	htmlReporter = new ExtentSparkReporter("htmlreport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);	     
    }
    
    @AfterSuite
    public void reportTeardown() 
    {
        extent.flush();        
    }
}