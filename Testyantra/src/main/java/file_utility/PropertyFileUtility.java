package file_utility;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertyFileUtility {
@Test
	public String readDataFromProperty(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\Siva\\eclipse-workspace\\Testyantra\\utilityproperty.txt");
		Properties pf=new Properties();
		pf.load(fis);
		String value = pf.getProperty(key);
		return value;
		
	}
}
