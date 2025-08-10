
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import Base.CrossBrowser;
import io.cucumber.testng.AbstractTestNGCucumberTests; 
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="/Users/balaseshagiriprasadmunagala/eclipse-workspace/Hybrid_Automation_Framework/Features/LoginFeature.feature",glue="stepdefinitions")
public class Hybrid_Test_Runner extends AbstractTestNGCucumberTests{
	
	
	@BeforeTest
    @Parameters("browser")
    public void getBrowser(String browser) {
        CrossBrowser.browserFromXml = browser; 
    }
	

}


