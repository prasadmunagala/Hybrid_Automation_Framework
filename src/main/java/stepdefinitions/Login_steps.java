package stepdefinitions;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import API_Testing_Code.APITesting;
import Base.CrossBrowser;
import HelperClasses.ExcelHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import utilities.ExcelData;

import PageObjects.LoginFeature;


public class Login_steps {
	
	WebDriver driver;
	
	
	@Test()
	@Given("Browser has launched")
	public void browser_launch()
	{
		ChromeOptions ops=new ChromeOptions();
		ops.addArguments("--headless");
		
		CrossBrowser cb=new CrossBrowser();
		driver=cb.initializeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Test(dependsOnMethods="browser_launch")
	@When("the app url enters it has to open")
	public void open_url()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(dependsOnMethods="open_url")
	@Then("if user enters valid username {string}")
	public void valid_username(String username)
	{
		
//		APITesting ap=new APITesting();
//		String api_username=ap.api_username();
		
		LoginFeature lg=new LoginFeature(driver);
		lg.username(username);
		
	
		
	}


	@Test(dependsOnMethods="open_url")
	@Then("if user enters valid password {string}")
	public void valid_password(String password)
	{
		
		LoginFeature lg=new LoginFeature(driver);
		lg.password(password);
	}
	
	@Then("if user enters username {string}")
	public void username(String username)
	{
		LoginFeature lg=new LoginFeature(driver);
		lg.username(username);
	}
	
	@And("if user enters password {string}")
	public void password(String password)
	{
		LoginFeature lg=new LoginFeature(driver);
		lg.password(password);
	}
	
	@Test(dependsOnMethods="open_url")
	@And("if user clicks on login button")
	public void login()
	{
		LoginFeature lg=new LoginFeature(driver);
		lg.login();
	}
	
	@Test(dependsOnMethods="login")
	@Then("homepage shoud be displayed")
	public void homepage()
	{
		LoginFeature lg=new LoginFeature(driver);
		String actual_text=lg.dasboard_text();
		String expected_text="Time at Work";
		
		Assert.assertEquals(expected_text, actual_text);
		
	}
	
	@Test(dependsOnMethods="login")
	@Then("homepage shoud not be displayed")
	public void invalid_credentials()
	{
		String expected_url=driver.getCurrentUrl();
		String actual_url="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		
		Assert.assertNotSame(expected_url, actual_url);
		
	}
	
	@Test(dependsOnMethods="browser_launch")
	@Then("close the browser")
	public void close_browser()
	{
		driver.quit();
	}
	

}
