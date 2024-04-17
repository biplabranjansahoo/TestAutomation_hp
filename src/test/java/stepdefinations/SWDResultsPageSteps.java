package stepdefinations;

import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import com.hp.qa.factory.DriverFactory;
import com.hp.qa.pages.SWDLanding;
import com.hp.qa.pages.SWDOSSelection;
import com.hp.qa.pages.SWDProducts;
import com.hp.qa.pages.SWDResults;
import com.hp.qa.pages.SupportHome;
import com.hp.qa.util.ConfigReader;

import apphooks.ApplicationHooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SWDResultsPageSteps {

	private SupportHome homePage = new SupportHome(DriverFactory.getDriver());
	private SWDOSSelection swdOSSelectionPage = new SWDOSSelection(DriverFactory.getDriver());
	private SWDResults swdResultsPage = new SWDResults(DriverFactory.getDriver());
	private ConfigReader configReader;
	Properties prop;
	public Properties projectProp;
	String url;

	public SWDResultsPageSteps() throws IOException {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
		projectProp = new Properties();
		projectProp.load(ApplicationHooks.class.getClassLoader().getResourceAsStream("project.properties"));
		url = projectProp.getProperty("webbaseurl");
	}

	@Then("user selects the required os and version")
	public void user_selects_the_required_os_version() {
		Assert.assertTrue(swdResultsPage.selectOSAndVersionAndSubmit());
	}

	@Then("user check for the welcome message on os results page")
	public void user_check_for_welcomemsg_on_os_selectionpage() {
		Assert.assertTrue(swdResultsPage.validateWelcomMessageResultsPage());
	}

	@Then("user check for the presence of breadcrumb on swd results page")
	public void check_for_the_swd_breadcrumb_presence() throws InterruptedException {
		Assert.assertTrue(swdResultsPage.swdResultsPageBreadCrumb());
	}

	@Then("user check for the presence of product details on swd results page")
	public void check_for_the_swd_productdetails_presence() throws InterruptedException {
		Assert.assertTrue(swdResultsPage.swdResultsProductDetails());
	}

	@Then("user check for the presence of results section on swd os results page")
	public void check_for_the_swd_resultssection_presence() throws InterruptedException {
		Assert.assertTrue(swdResultsPage.swdResultsSection());
	}
}
