package stepdefinations;

import java.io.IOException;
import java.util.Properties;
import org.junit.Assert;
import com.hp.qa.factory.DriverFactory;
import com.hp.qa.pages.ProductHome;
import com.hp.qa.util.ConfigReader;

import apphooks.ApplicationHooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ProductsPageSteps {

	private static String title;
	private ProductHome productHome =new ProductHome(DriverFactory.getDriver());
	private ConfigReader configReader;
	Properties prop;
	public Properties projectProp;
	String url;
	
	public ProductsPageSteps() throws IOException {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
		projectProp = new Properties();
		projectProp.load(ApplicationHooks.class.getClassLoader().getResourceAsStream("project.properties"));
		url=projectProp.getProperty("webbaseurl");
	}

	
	@Given("user is on the product landing page")
	public void user_is_on_the_product_landing_page() {
		DriverFactory.getDriver().get(url + "/products");
	}

	@Given("user gets the title of the product landing page")
	public void user_gets_the_title_of_the_product_landing_page() throws InterruptedException {
		title = productHome.getProductPageTitle();
		System.out.println("Login page title is : " + title);
	}
	
	@Then("product page title should be {string}")
	public void cl_page_title_should_be(String expectedTitleName) {
		Assert.assertTrue(title.contains(expectedTitleName));
	}
}
