package VtigerTC;

public class createorgtest {
	package VtigerTC;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	import genericUtlities.ExcelFileUtility;
	import genericUtlities.JavaUtility;
	import genericUtlities.PropertyFileUtility;
	import genericUtlities.WebdriverUtility;
	import objectRepositories.LoginPage;

	public class CreateOrgTest {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=null;
		PropertyFileUtility putil=new PropertyFileUtility();
		ExcelFileUtility eutil=new ExcelFileUtility();
		WebdriverUtility wutil=new WebdriverUtility();
		JavaUtility jutil=new JavaUtility();
		//fetch browser name
		String BROWSER = putil.readDataFromPf("browser");
		System.out.println(BROWSER);
		//Launch browser
		if(BROWSER.equals("edge")) {
			 driver=new EdgeDriver();
		}
		else if(BROWSER.equals("chrome")) {
			 driver=new ChromeDriver();
		}
		else if(BROWSER.equals("firefox")) {
			 driver=new FirefoxDriver();
		}
		else {
			System.out.println("INVALID BROWSER NAME");
		}
		wutil.maximizeWindow(driver);
		wutil.waitForPageLoad(driver);
		//fetch URL
		String URL = putil.readDataFromPf("url");
		driver.get(URL);
		//Login to app
		String UN = putil.readDataFromPf("un");
		String PWD = putil.readDataFromPf("pwd");
		//Create object of Login apge POM class
		LoginPage lp=new LoginPage(driver);
		lp.loginToApp(UN, PWD);
	}




		
	}
}
