package stepdefinations;

import java.io.IOException;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import com.hp.qa.api.PDPApiHelper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PdpAPISteps {
	
	private PDPApiHelper pdpHomeAPIHelper = new PDPApiHelper();
	
	@When("user invokes pdp categories api")
	public void invoke_pdp_category_api() throws InterruptedException, IOException, ParseException {
		Assert.assertTrue(pdpHomeAPIHelper.invokeApiPdpCategoryPostAPI());
	}
	
	@Then("validate pdp categories api")
	public void validate_pdp_category_api() throws InterruptedException, IOException, ParseException {
		Assert.assertTrue(pdpHomeAPIHelper.validateApiPdpCategoryPostAPI());
	}
	
	@When("user invokes pdp categories details api")
	public void invoke_pdp_category_details_api() throws InterruptedException, IOException, ParseException {
		Assert.assertTrue(pdpHomeAPIHelper.invokeApiPdpCategoryDetailsPostAPI());
	}
	
	@Then("validate pdp categories details api")
	public void validate_pdp_category_details_api() throws InterruptedException, IOException, ParseException {
		Assert.assertTrue(pdpHomeAPIHelper.validateApiPdpCategoryDetailsPostAPI());
	}
	
	@When("user invokes pdp security alerts details api")
	public void invoke_pdp_security_alerts_api() throws InterruptedException, IOException, ParseException {
		Assert.assertTrue(pdpHomeAPIHelper.invokeApiPdpSecurityAlertsGetAPI());
	}
	
	@Then("validate pdp security alerts details api")
	public void validate_pdp_security_alerts_api() throws InterruptedException, IOException, ParseException {
		Assert.assertTrue(pdpHomeAPIHelper.validateApiPdpSecurityAlertsGetAPI());
	}


}
