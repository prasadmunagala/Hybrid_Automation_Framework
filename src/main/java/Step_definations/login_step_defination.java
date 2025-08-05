package Step_definations;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.login_feature;

import io.cucumber.java.en.*;

public class login_step_defination {
	 ChromeDriver driver;
	 @Test
	@Given("browser has launched")
public void browswe_lunch() {
	 driver= new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
	@Test(dependsOnMethods="browser has launched")
	@When("the app url enters it has to open")
public void open_url() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}
	@Test(dependsOnMethods="open_url")
	@Then("if user enters username {string}")
public void user_name(String username){
	login_feature lg= new login_feature(driver);
	lg.username(username);
}
	@Test(dependsOnMethods="open_url")
	@And("if user enters password {string}")
public void password(String password){
		login_feature lg= new login_feature(driver);
		lg.password(password);
}
	@Test(dependsOnMethods="open_url")
	@And("user clicks on login button")
public void login(){
		login_feature lg= new login_feature(driver);
		lg.login();
}
	@Test(dependsOnMethods="login")
	@Then("home page will be displayed")
public void home_page() {
		String url=driver.getCurrentUrl();
		String acturl ="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		Assert.assertEquals(url,acturl);
}
	//@Test(dependsOnMethods="open_url")
	//@Then("close the browser")
	//public void close_browser() {
	//driver.close();
	//}
}
