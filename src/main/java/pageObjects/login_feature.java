package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class login_feature {
	private WebElement username_textbox,password_textbox,login_button;
	private ChromeDriver driver;
	public login_feature(ChromeDriver driver){
		this.driver= driver;
	}
	public void username(String username_data) {
		username_textbox=driver.findElement(By.xpath("//input[@name='username']"));
		username_textbox.sendKeys(username_data);
	}
	public void password(String password_data) {
		password_textbox=driver.findElement(By.xpath("///input[@name='password']"));
		password_textbox.sendKeys(password_data);
	}
	public void login() {
		login_button=driver.findElement(By.xpath("//button[@type='submit']"));
		login_button.click();
	}
}
