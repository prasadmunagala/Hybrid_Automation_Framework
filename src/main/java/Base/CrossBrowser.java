package Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

	public class CrossBrowser {

	    public static WebDriver driver;
	    public static String browserFromXml; 

	    public WebDriver initializeDriver() {
	        if (browserFromXml.equalsIgnoreCase("firefox")) {
	        	return new FirefoxDriver();
	        } else if (browserFromXml.equalsIgnoreCase("safari")) {
	        	return new SafariDriver();
	        } else {
	            System.out.println("browser not found");
	            return null;
	        }

	        
	    }



}
