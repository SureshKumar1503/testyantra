package logINtest;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import file_utility.PropertyFileUtility;



public class LoginUsingProperty {

	@Test
	public void readLoginData() throws IOException
	{
		PropertyFileUtility pf=new PropertyFileUtility();
	
		String u = pf.readDataFromProperty("url");
		String un = pf.readDataFromProperty("username");
		String pw = pf.readDataFromProperty("password");
		WebDriver driver=new ChromeDriver();
		driver.get(u);
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(pw);
		
		
	}
}
