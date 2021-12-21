package baseclass;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import file_utility.PropertyFileUtility;

public class logout  {
	
	public void tc_logout(WebDriver driver)
	{
		
		PropertyFileUtility p=new PropertyFileUtility();
		WebElement ele = driver.findElement(By.xpath("(//td[@class='small'])[2]"));
		Actions action=new Actions(driver);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	}

}