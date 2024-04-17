package stepdefinations;

import java.util.List;
import java.util.Properties;

import org.junit.Assert;

import com.hp.qa.factory.DriverFactory;
import com.hp.qa.pages.SoftwareDriver;
import com.hp.qa.util.ConfigReader;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SoftwareDriverPageSteps {
	
	private static String title;
	private SoftwareDriver swdPage = new SoftwareDriver(DriverFactory.getDriver());
	private ConfigReader configReader;
	Properties prop;
	public Properties projectProp;
	String url;

	public SoftwareDriverPageSteps() {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
	}

	@Then("user gets product type section count")
	public void user_gets_product_type_section_count(DataTable dataTable) {
		List<String> expHelpList = dataTable.asList();
		System.out.println("Expected product type List" + expHelpList);
		List<String> actHelpList = swdPage.getSWDProductTypeList();
		System.out.println("Actual product type List" + actHelpList);

		Assert.assertTrue(expHelpList.containsAll(actHelpList));

	}
	
	@Then("product type section count should be {int}")
	public void help_section_count_should_be(Integer int1) {
		Assert.assertTrue(swdPage.getSWDProductTypeCount() == int1);
	}
	
    @And("the swd page title should be {string}")
    public void user_checks_for_the_swd_tile(String title) throws InterruptedException {
    	String swdPageTitle = swdPage.getSWDPageTitle();
    	Assert.assertTrue(swdPageTitle.contains(title));
    }



}
