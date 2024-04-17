package stepdefinations;

import java.io.IOException;
import java.util.List;
import java.util.Properties;
import org.junit.Assert;
import com.hp.qa.factory.DriverFactory;
import com.hp.qa.pages.ComputerHome;
import com.hp.qa.util.ConfigReader;
import com.hp.qa.util.ElementUtils;

import apphooks.ApplicationHooks;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ComputerHomePageSteps {

	private ComputerHome computerHome = new ComputerHome(DriverFactory.getDriver());
	private ConfigReader configReader;
	Properties prop;
	public Properties projectProp;
	String url;

	public ComputerHomePageSteps() throws IOException {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
		projectProp = new Properties();
		projectProp.load(ApplicationHooks.class.getClassLoader().getResourceAsStream("project.properties"));
		url=projectProp.getProperty("webbaseurl");
	}

	@Given("user is on the computer support login page")
	public void user_is_on_the_computer_support_login_page() {
		DriverFactory.getDriver().get(url + "/computer");
	}

	@And("the computer page title should be {string}")
	public void user_checks_for_the_printer_tile(String title) throws InterruptedException {
		String swdPageTitle = computerHome.getComputerPageTitle();
		Assert.assertTrue(swdPageTitle.contains(title));
	}

	@Then("user gets help section count")
	public void user_gets_help_section_count(DataTable dataTable) throws InterruptedException {
		ElementUtils.sleep();
		List<String> expHelpList = dataTable.asList();
		List<String> actHelpList = computerHome.getComputerhelpSectionList();
		Assert.assertTrue(expHelpList.containsAll(actHelpList));
	}

	@Then("help section count should be {int}")
	public void help_section_count_should_be(Integer int1) {
		Assert.assertTrue(computerHome.getComputerhelpSectionCount() == int1);
	}

}
