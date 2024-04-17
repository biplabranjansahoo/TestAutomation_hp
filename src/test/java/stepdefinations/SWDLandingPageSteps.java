package stepdefinations;

import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import com.hp.qa.factory.DriverFactory;
import com.hp.qa.pages.SWDLanding;
import com.hp.qa.util.ConfigReader;

import apphooks.ApplicationHooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SWDLandingPageSteps {

	private SWDLanding swdHomePage = new SWDLanding(DriverFactory.getDriver());
	private ConfigReader configReader;
	Properties prop;
	public Properties projectProp;
	String url;

	public SWDLandingPageSteps() throws IOException {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
		projectProp = new Properties();
		projectProp.load(ApplicationHooks.class.getClassLoader().getResourceAsStream("project.properties"));
		url=projectProp.getProperty("webbaseurl");
	}

	@Given("user is on the swd landing page")
	public void the_user_is_on_the_swd_landing_page() {
		DriverFactory.getDriver().get(url + "/drivers");
	}

	@Given("the swd landing page title should be {string}")
	public void user_gets_the_title_of_the_swdlanding_page(String title) throws InterruptedException {
		String swdLandingTitle = swdHomePage.getPageTitle();
		Assert.assertTrue(swdLandingTitle.contains(title));
	}

	@Then("user check for the presence of breadcrumb on swd landing page")
	public void check_for_the_swd_breadcrumb_presence() throws InterruptedException {
		Assert.assertTrue(swdHomePage.swdLandingBreadCrumb());
	}

	@Then("user check for the presence of sign in ribbon on swd landing page")
	public void check_for_the_swd_sign_in_ribbon_presence() throws InterruptedException {
		Assert.assertTrue(swdHomePage.swdSignInRibbonAnonymous());
	}

	@Then("user check for the presence of products row on swd landing page")
	public void check_for_the_swd_products_row_presence() throws InterruptedException {
		Assert.assertTrue(swdHomePage.swdProductsRowAnonymous());
	}

	@Then("check if printer tile is working")
	public void check_if_printer_tile_is_working() throws InterruptedException {
		Assert.assertTrue(swdHomePage.clickPrinterTileSwdPage());
	}

	@Then("user check for the presence of breadcrumb on swd landing page after signed in")
	public void check_for_the_swd_breadcrumb_presence_signedin() throws InterruptedException {
		Assert.assertTrue(swdHomePage.swdLandingBreadCrumb());
	}

	@Then("user check for the presence of device swiper on swd landing page after signed in")
	public void check_for_the_swd_device_swiper_presence_signedin() throws InterruptedException {
		Assert.assertTrue(swdHomePage.swdDeviceSwiperSignedIn());
	}

	@Then("user check for the presence of products row on swd landing page after signed in")
	public void check_for_the_swd_products_row_presence_signedin() throws InterruptedException {
		Assert.assertTrue(swdHomePage.swdProductsRowSignedIn());
	}

	@Then("check if other tile is working")
	public void check_if_other_tile_is_working() throws InterruptedException {
		Assert.assertTrue(swdHomePage.clickOtherTileSwdPage());
	}
}
