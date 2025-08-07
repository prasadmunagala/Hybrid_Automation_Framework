package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public static WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String browser)
	{
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
			
		}
		else if(browser.equals("edge"))
		{
			driver=new EdgeDriver();
			
		}
		else if(browser.equals("safari"))
		{
			driver=new SafariDriver();
			
		}
		else if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
			
		}
	}

}
