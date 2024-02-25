package demo99.testscripts;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import demo99.pages.RegisterPage;
import demo99.utilities.ExcelDataProvider;

public class RegisterTest extends TestHelper{
	
	RegisterPage registerpage;
	ExtentReports extent;
	
	
	@BeforeMethod																								
	@Parameters({"browser"})																									
	public void initialization(String browser) {																									
	driver = launchBrowser(browser);
	}
//	@BeforeMethod
//	public void config() {
//		String path=System.getProperty("user.dir")+"\\reports\\index.html";
//		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
//		reporter.config().setReportName("Web automation report");
//		reporter.config().setDocumentTitle("test result");
//		
//		
//		 extent  = new ExtentReports();
//		extent.attachReporter(reporter);
//		extent.setSystemInfo("tester", "harsha");
//	}
	
	@DataProvider(name="register")																								
	public Object[][]getData(){																								
		String excelpath="C:\\Users\\HP\\Documents\\tourregform.xlsx";																							
		ExcelDataProvider exceldataProvider	=new ExcelDataProvider();																				
		Object data[][]=exceldataProvider.testData(excelpath, "Sheet1");																							
		return data;																							
	}		
	
	
	@Test(dataProvider="register")
	public void getUrl(String firstname, String lastname, String phone, String email, String address, String city, String state, String postalcode, String country, String username, String password, String confirmpassword) throws InterruptedException {
//		ExtentTest test=extent.createTest("getUrl");
		
		registerpage = new RegisterPage(driver);
//		registerpage.registerDetails("aru", "p", "4455661122", "aa@gmail.com", "sdds", "ssdd", "dfdsf", "789562", "ALBANIA", "aru123", "789632", "789632");
		registerpage.registerDetails(firstname, lastname, phone, email, address, city, state, postalcode, country, username, password, confirmpassword);
		extent.flush();
	}
	@Test
	public void secondTest() {
//		ExtentTest test=extent.createTest("secondTest");
		registerpage = new RegisterPage(driver);
		registerpage.clickSignOnBtn();
	}
	

}
