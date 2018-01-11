import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationFile
{

	public static void main(String[] args) throws IOException
	{
		//special class called Properties
		// added by SS during review - read from a file
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("/Users/soniya/Documents/Eclipse_workspace/Environment.config");
		prop.load(fis);
		String os = prop.getProperty("OS");
		String browser = prop.getProperty("browser");
		System.out.println("OS:" + os + " browser: " + browser);	
	}
}
