package stepdefinations;

import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import com.hp.qa.factory.DriverFactory;
import com.hp.qa.pages.SWDLanding;
import com.hp.qa.pages.SWDOSSelection;
import com.hp.qa.pages.SWDProducts;
import com.hp.qa.pages.SupportHome;
import com.hp.qa.util.ConfigReader;

import apphooks.ApplicationHooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SWDOSSelctionPageSteps {

	private SupportHome homePage = new SupportHome(DriverFactory.getDriver());
	private SWDOSSelection swdOSSelectionPage = new SWDOSSelection(DriverFactory.getDriver());
	private ConfigReader configReader;
	Properties prop;
	public Properties projectProp;
	String url;

	public SWDOSSelctionPageSteps() throws IOException {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
		projectProp = new Properties();
		projectProp.load(ApplicationHooks.class.getClassLoader().getResourceAsStream("project.properties"));
		url=projectProp.getProperty("webbaseurl");
	}

	@When("navigate to os selection page")
	public void navigate_to_osselection_page() {
		homePage.pfinderSearchBox(prop.getProperty("HPserialNum"));
		homePage.pfinderSearchButton();
	}

	@Then("user check for the welcome message on os selection page")
	public void user_check_for_welcomemsg_on_os_selectionpage() {
		Assert.assertTrue(swdOSSelectionPage.validateWelcomMessageOSSelectionPage());
	}

	@Then("user check for the presence of breadcrumb on swd os selection page")
	public void check_for_the_swd_breadcrumb_presence() throws InterruptedException {
		Assert.assertTrue(swdOSSelectionPage.swdOSSelectionBreadCrumb());
	}

	@Then("user check for the presence of product details on swd os selection page")
	public void check_for_the_swd_productdetails_presence() throws InterruptedException {
		Assert.assertTrue(swdOSSelectionPage.swdOSSelectionProductDetails());
	}

	@Then("user check for the presence of OS selection section on swd os selection page")
	public void check_for_the_swd_OSSection_presence() throws InterruptedException {
		Assert.assertTrue(swdOSSelectionPage.swdOSSelectionOSSelectionSection());
	}

	@Then("user check for the presence of breadcrumb on swd os selection page after signed in")
	public void check_for_the_swd_osselection_breadcrumb_presence_signedin() throws InterruptedException {
		Assert.assertTrue(swdOSSelectionPage.swdOSSelectionBreadCrumb());
	}

	@Then("user check for the presence of product details on swd os selection page after signed in")
	public void check_for_the_swd_osselection_productdetails_presence_signedin() throws InterruptedException {
		Assert.assertTrue(swdOSSelectionPage.swdOSSelectionProductDetails());
	}

	@Then("user check for the presence of os selection section on swd os selection page after signed in")
	public void check_for_the_swd_osselection_ossection_presence_signedin() throws InterruptedException {
		Assert.assertTrue(swdOSSelectionPage.swdOSSelectionOSSelectionSection());
	}
	
	@Then("user check for the presence of signed in button")
	public void check_for_the_swd_osselection_signedin_button() throws InterruptedException {
		Assert.assertTrue(swdOSSelectionPage.swdOSSelectionSignedInButton());
	}
}
