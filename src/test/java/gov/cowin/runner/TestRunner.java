package gov.cowin.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cowin.baseClass.BaseClass;
import com.cowin.managers.FileReaderManager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/Feature/FilterTest.feature",
		// tags = "@test",
		monochrome = true, 
		glue = "gov.cowin.stepDefinition", 
		dryRun = false, 
		stepNotifications = true)

public class TestRunner {

	public static WebDriver driver = null;

	@BeforeClass
	public static void setUP() throws IOException {
		
		String BrowserName = FileReaderManager.getInstance().getConfigReader().getBrowser();
		System.out.println(BrowserName);
		driver = BaseClass.browserlaunch(BrowserName);
		
				
	}

	@AfterClass
	public static void tearDown() {
		
		//driver.quit();
		
	}
}
