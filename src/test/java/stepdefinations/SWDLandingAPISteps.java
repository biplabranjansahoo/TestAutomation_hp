package stepdefinations;

import java.io.IOException;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import com.hp.qa.api.SWDLandingAPIHelper;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SWDLandingAPISteps {
	
	private SWDLandingAPIHelper swdLandingAPIHelper = new SWDLandingAPIHelper();	
	
	@When("user invokes swd landing page api")
	public void invoke_swdlanding_page_api() throws InterruptedException, IOException, ParseException {
		Assert.assertTrue(swdLandingAPIHelper.invokeAPISWDLandingPage());
	}
	
	@Then("validate swd landing page api")
	public void validate_swdlanding_page_api() throws InterruptedException, IOException, ParseException {
		Assert.assertTrue(swdLandingAPIHelper.validateAPISWDLandingPage());
	}
	
	@When("user invokes swd landing ssc region api")
	public void invoke_swdlanding_sscregion_api() throws InterruptedException, IOException, ParseException {
		Assert.assertTrue(swdLandingAPIHelper.invokeAPISWDLandingSSCRegion());
	}
	
	@Then("validate swd landing ssc region api")
	public void validate_swdlanding_sscregion_api() throws InterruptedException, IOException, ParseException {
		Assert.assertTrue(swdLandingAPIHelper.validateAPISWDLandingSSCRegion());
	}	
	
	@When("user invokes swd landing termbase api")
	public void invoke_swdlanding_termbase_api() throws InterruptedException, IOException, ParseException {
		Assert.assertTrue(swdLandingAPIHelper.invokeAPISWDLandingTermbase());
	}
	
	@Then("validate swd landing termbase api")
	public void validate_swdlanding_termbase_api() throws InterruptedException, IOException, ParseException {
		Assert.assertTrue(swdLandingAPIHelper.validateAPISWDLandingTermbase());
	}
	
	@When("user invokes swd landing config api")
	public void invoke_swdlanding_config_api() throws InterruptedException, IOException, ParseException {
		Assert.assertTrue(swdLandingAPIHelper.invokeAPISWDLandingConfig());
	}
	
	@Then("validate swd landing config api")
	public void validate_swdlanding_config_api() throws InterruptedException, IOException, ParseException {
		Assert.assertTrue(swdLandingAPIHelper.validateAPISWDLandingConfig());
	}
	
}
