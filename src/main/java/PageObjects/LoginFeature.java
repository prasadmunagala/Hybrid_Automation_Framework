package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginFeature {
	
	private WebDriver driver;
	
	private WebElement username_textbox;
	private WebElement password_textbox;
	private WebElement login_button;
	private WebElement dasboard_text;
	
	
	
	public LoginFeature(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void username(String username_data)
	{
		By username_by=By.xpath("//input[@name='username']");
		username_textbox=driver.findElement(username_by);
		username_textbox.sendKeys(username_data);
	}
	
	public void password(String password_data)
	{
		By password_by=By.xpath("//input[@name='password']");
		password_textbox=driver.findElement(password_by);
		password_textbox.sendKeys(password_data);
	}
	
	public void login()
	{
		By login_by=By.xpath("//button[@type='submit']");
		login_button=driver.findElement(login_by);
		login_button.click();
	}
	
	public String dasboard_text()
	{
		By dasboard_text_by=By.xpath("//p[text()='Time at Work']");
		login_button=driver.findElement(dasboard_text_by);
		String text=login_button.getText();
		return text;
		
	}
	

}
