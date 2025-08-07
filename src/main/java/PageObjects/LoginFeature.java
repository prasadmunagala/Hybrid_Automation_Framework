package PageObjects;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginFeature {
	
	private WebDriver driver;
	
	private WebElement username_textbox;
	private WebElement password_textbox;
	private WebElement login_button;
	private WebElement dasboard_text;
	private Properties properties;
	
	
	
	
	
	public LoginFeature(WebDriver driver)
	{
		this.driver=driver;
		
		properties=new Properties();
		
		try
		{
			FileInputStream fis=new FileInputStream("/Users/balaseshagiriprasadmunagala/eclipse-workspace/Hybrid_Automation_Framework/Configuration/Login.properties");
			properties.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("File not found");
		}
		
	}
	
	

	
	public void username(String username_data)
	{
		By username_by=By.xpath(properties.getProperty("username_xpath"));
		username_textbox=driver.findElement(username_by);
		username_textbox.sendKeys(username_data);
	}
	
	public void password(String password_data)
	{
		By password_by=By.xpath(properties.getProperty("password_xpath"));
		password_textbox=driver.findElement(password_by);
		password_textbox.sendKeys(password_data);
	}
	
	public void login()
	{
		By login_by=By.xpath(properties.getProperty("button_xpath"));
		login_button=driver.findElement(login_by);
		login_button.click();
	}
	
	public String dasboard_text()
	{
		By dasboard_text_by=By.xpath(properties.getProperty("text_xpath"));
		login_button=driver.findElement(dasboard_text_by);
		String text=login_button.getText();
		return text;
		
	}
	

}
