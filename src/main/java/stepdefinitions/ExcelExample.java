package stepdefinitions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import HelperClasses.ExcelHelper;
import PageObjects.LoginFeature;

public class ExcelExample {
	
	@Test(dataProvider="xl_data",dataProviderClass=ExcelHelper.class)
	public void app(Object data[])
	{	
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		LoginFeature lg=new LoginFeature(driver);
		lg.username(data[0].toString());
		lg.password(data[1].toString());
		lg.login();
		driver.quit();
	}


}
