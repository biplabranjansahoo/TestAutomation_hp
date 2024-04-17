package apphooks;

import com.hp.qa.factory.DriverFactory;
import com.hp.qa.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ApplicationHooks {

	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	public Properties prop;
	public Properties projectProp;
	Properties propAPI;
	public String browserName;
	
	public ApplicationHooks(){
		
		try{	
			projectProp = new Properties();
			projectProp.load(ApplicationHooks.class.getClassLoader().getResourceAsStream("project.properties"));
			browserName=projectProp.getProperty("webbrowser");
		}catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}catch (IOException e){
			System.out.println(e.getMessage());
		}
	}
	
	@Before(order = 0)
	public void getProperty() {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
		propAPI=configReader.initAPIProperties();
	}

	@Before(order = 1)
	public void lunchBrowser() {
		driverFactory = new DriverFactory();
		driver = driverFactory.init_driver(browserName);
	}

	@After(order = 0)
	public void quitBrowser() {
		driver.quit();
	}

	@After(order = 1)
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			// take screenshot
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);
		}
	}
	

}
