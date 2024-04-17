package stepdefinations;

import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;

import com.hp.qa.factory.DriverFactory;
import com.hp.qa.pages.PrinterSetup;
import com.hp.qa.util.ConfigReader;

import apphooks.ApplicationHooks;
import io.cucumber.java.en.And;

public class PrinterSetupPageSteps {

	private PrinterSetup printersetup = new PrinterSetup(DriverFactory.getDriver());
	private ConfigReader configReader;
	Properties prop;
	public Properties projectProp;
	String url;

	public PrinterSetupPageSteps() throws IOException {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
		projectProp = new Properties();
		projectProp.load(ApplicationHooks.class.getClassLoader().getResourceAsStream("project.properties"));
		url=projectProp.getProperty("webbaseurl");
	}

	@And("the printer setup page title should be {string}")
	public void user_checks_for_the_printer_setup_page_tile(String title) throws InterruptedException {
		String swdPageTitle = printersetup.getPrinterSetUpPageTitle();
		Assert.assertTrue(swdPageTitle.contains(title));
	}

}
