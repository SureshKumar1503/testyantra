package baseclass;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import file_utility.WebDriverUtility;

public class Base__Class {
	
	public WebDriver driver;
	file_utility.PropertyFileUtility pLib=new file_utility.PropertyFileUtility();
	WebDriverUtility wLib=new WebDriverUtility();
	login log=new login();
	logout out=new logout();
	
	
	/*@BeforeSuite
	public void configBs() throws Throwable
	{
		System.out.println("*******DB Connection is Established******");
		dbLib.connect_to_database();
	}*/
	@BeforeClass
	public void configBc()
	{
		System.out.println("***********Browser is Lanched and Maximized**********");
		
		driver=new ChromeDriver();
		wLib.waitUntilPageLoad(driver);
		driver.manage().window().maximize();
	
		
	}
	
		
	@BeforeMethod
	public void login() throws IOException

	{
		System.out.println("******LogIn*****");
		log.tc_login(driver);
		}
	
	
	
	@AfterMethod
	public void logout()
	{
		System.out.println("Page Logged Out");
		out.tc_logout(driver);
		
	}
	
	@AfterClass
	public void close_brow()
	{
		System.out.println("Close the Browser");
		driver.close();
	
		
	}
	
/*	@AfterSuite
	public void db_close() throws Throwable
	{
		System.out.println("DB connection closed");
		dbLib.closeconnection();
	}*/

}
