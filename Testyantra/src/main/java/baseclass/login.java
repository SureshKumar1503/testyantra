package baseclass;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import file_utility.PropertyFileUtility;

public class login  {
	
	
	public void tc_login(WebDriver driver) throws IOException
	{
		
	PropertyFileUtility p=new PropertyFileUtility();
	driver.get(p.readDataFromProperty("url"));
	driver.findElement(By.name("user_name")).sendKeys(p.readDataFromProperty("username"));
	driver.findElement(By.name("user_password")).sendKeys(p.readDataFromProperty("password"));
	driver.findElement(By.id("submitButton")).click();
	}
	

}
