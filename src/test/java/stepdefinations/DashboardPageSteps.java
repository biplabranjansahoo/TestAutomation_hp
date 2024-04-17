package stepdefinations;

import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;

import com.hp.qa.factory.DriverFactory;
import com.hp.qa.pages.Dashboard;
import com.hp.qa.util.ConfigReader;
import com.hp.qa.util.ElementUtils;

import apphooks.ApplicationHooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DashboardPageSteps {
	
	private Dashboard contact = new Dashboard(DriverFactory.getDriver());
	private static String title;
	private ConfigReader configReader;
	Properties prop;
	public Properties projectProp;
	String url;

	public DashboardPageSteps() throws IOException {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
		projectProp = new Properties();
		projectProp.load(ApplicationHooks.class.getClassLoader().getResourceAsStream("project.properties"));
		url=projectProp.getProperty("webbaseurl");
	}
	
	@Given("the user is on the Dashboard Home page")
	public void user_is_on_the_contact_support_landing_page() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.sleep();
		DriverFactory.getDriver().get(url + "/dashboard");
	}

	@Given("user gets the title of the dashboard page")
	public void user_gets_the_title_of_the_contact_page() throws InterruptedException {
		title = contact.getDashboardPageTitle();
		System.out.println("Contact page title is : " + title);
	}
	
	@Then("dashboard page title should be {string}")
	public void contact_page_title_should_be(String expectedTitleName) {
		Assert.assertTrue(title.contains(expectedTitleName));
	}
	

}
