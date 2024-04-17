package stepdefinations;

import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import com.hp.qa.factory.DriverFactory;
import com.hp.qa.pages.SWDLanding;
import com.hp.qa.pages.SWDProducts;
import com.hp.qa.util.ConfigReader;

import apphooks.ApplicationHooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SWDProductsPageSteps {

	private SWDLanding swdHomePage = new SWDLanding(DriverFactory.getDriver());
	private SWDProducts swdProductsPage = new SWDProducts(DriverFactory.getDriver());
	private ConfigReader configReader;
	Properties prop;
	public Properties projectProp;
	String url;

	public SWDProductsPageSteps() throws IOException {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
		projectProp = new Properties();
		projectProp.load(ApplicationHooks.class.getClassLoader().getResourceAsStream("project.properties"));
		url=projectProp.getProperty("webbaseurl");
	}

	@Given("user is on the swd products page")
	public void the_user_is_on_the_swd_products_page() {
		DriverFactory.getDriver().get(url + "/drivers/products");
	}

	@Given("the swd products page title should be {string}")
	public void user_gets_the_title_of_the_swdproducts_page(String title) throws InterruptedException {
		String swdProductsTitle = swdProductsPage.getPageTitle();
		Assert.assertTrue(swdProductsTitle.contains(title));
	}

	@Then("user check for the presence of breadcrumb on swd products page")
	public void check_for_the_swd_breadcrumb_presence() throws InterruptedException {
		Assert.assertTrue(swdProductsPage.swdProductsBreadCrumb());
	}

	@Then("user check for the presence of sign in ribbon on swd products page")
	public void check_for_the_swd_signin_ribbon_presence() throws InterruptedException {
		Assert.assertTrue(swdProductsPage.swdProductsSigninRibbonAnonymous());
	}

	@Then("user check for the presence of pFinder section on swd products page")
	public void check_for_the_swd_pFinder_presence() throws InterruptedException {
		Assert.assertTrue(swdProductsPage.swdProductspFinder());
	}

	@Then("user check for the presence of carousel on swd products page")
	public void check_for_the_swd_carousel_presence() throws InterruptedException {
		Assert.assertTrue(swdProductsPage.swdProductsCarousel());
	}

	@Then("user check for the presence of products row on swd products page")
	public void check_for_the_swd_productsrow_presence() throws InterruptedException {
		Assert.assertTrue(swdProductsPage.swdProductsProductsRowAnonymous());
	}

	@Then("user check for the presence of breadcrumb on swd products page after signed in")
	public void check_for_the_swd_products_breadcrumb_presence_signedin() throws InterruptedException {
		Assert.assertTrue(swdProductsPage.swdProductsBreadCrumb());
	}

	@Then("user check for the presence of device swiper on swd products page after signed in")
	public void check_for_the_swd_products_device_swiper_presence_signedin() throws InterruptedException {
		Assert.assertTrue(swdProductsPage.swdProductsDeviceSwiperSignedIn());
	}

	@Then("user check for the presence of pFinder section on swd products page after signed in")
	public void check_for_the_swd_products_pFinder_section_presence_signedin() throws InterruptedException {
		Assert.assertTrue(swdProductsPage.swdProductspFinder());
	}

	@Then("user check for the presence of carousel on swd products page after signed in")
	public void check_for_the_swd_products_carousel_presence_signedin() throws InterruptedException {
		Assert.assertTrue(swdProductsPage.swdProductsCarousel());
	}

	@Then("user check for the presence of products row on swd products page after signed in")
	public void check_for_the_swd_products_productsrow_presence_signedin() throws InterruptedException {
		Assert.assertTrue(swdProductsPage.swdProductsProductsRowSignedIn());
	}
}
