package stepdefinations;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.junit.Assert;
import com.hp.qa.api.SitehomeApiHelper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SiteHomeAPISteps {
	
	private SitehomeApiHelper sitehomeAPIHelper = new SitehomeApiHelper();
	
	@When("user invokes site home row icons api")
	public void invoke_sitehome_rowicon_api() throws InterruptedException, IOException, ParseException {
		Assert.assertTrue(sitehomeAPIHelper.invokeAPISiteHomeRowIcons());
	}
	
	@Then("validate site home row icons api")
	public void validate_sitehome_rowicon_api() throws InterruptedException, IOException, ParseException {
		Assert.assertTrue(sitehomeAPIHelper.validateAPISiteHomeRowIcons());
	}
	
	@When("user invokes site home tiles api")
	public void invoke_sitehome_tiles_api() throws InterruptedException, IOException, ParseException {
		Assert.assertTrue(sitehomeAPIHelper.invokeAPISiteHomeTiles());
	}
	
	@Then("validate site home tiles api")
	public void validate_sitehome_tiles_api() throws InterruptedException, IOException, ParseException {
		Assert.assertTrue(sitehomeAPIHelper.validateAPISiteHomeTiles());
	}
	
	@When("user invokes site home carousel api")
	public void invoke_sitehome_carousel_api() throws InterruptedException, IOException, ParseException {
		Assert.assertTrue(sitehomeAPIHelper.invokeAPISiteHomeCarousel());
	}
	
	@Then("validate site home carousel api")
	public void validate_sitehome_carousel_api() throws InterruptedException, IOException, ParseException {
		Assert.assertTrue(sitehomeAPIHelper.validateAPISiteHomeCarousel());
	}
	
	@When("user invokes site home supportresources api")
	public void invoke_sitehome_supportresources_api() throws InterruptedException, IOException, ParseException {
		Assert.assertTrue(sitehomeAPIHelper.invokeAPISiteHomeSupportresources());
	}
	
	@Then("validate site home supportresources api")
	public void validate_sitehome_supportresources_api() throws InterruptedException, IOException, ParseException {
		Assert.assertTrue(sitehomeAPIHelper.validateAPISiteHomeSupportresources());
	}
	
	@When("user invokes site home product type api")
	public void invoke_sitehome_producttype_api() throws InterruptedException, IOException, ParseException {
		Assert.assertTrue(sitehomeAPIHelper.invokeAPISiteHomeProducttype());
	}
	
	@Then("validate site home product type api")
	public void validate_sitehome_producttype_api() throws InterruptedException, IOException, ParseException {
		Assert.assertTrue(sitehomeAPIHelper.validateAPISiteHomeProducttype());
	}
	
	@When("user invokes site home secondary nav api")
	public void invoke_sitehome_secondarynav_api() throws InterruptedException, IOException, ParseException {
		Assert.assertTrue(sitehomeAPIHelper.invokeAPISiteHomeSecondarynav());
	}
	
	@Then("validate site home secondary nav api")
	public void validate_sitehome_secondarynav_api() throws InterruptedException, IOException, ParseException {
		Assert.assertTrue(sitehomeAPIHelper.validateAPISiteHomeSecondarynav());
	}
	
	@When("user invokes site home other product support api")
	public void invoke_sitehome_otherproduct_support_api() throws InterruptedException, IOException, ParseException {
		Assert.assertTrue(sitehomeAPIHelper.invokeAPISiteHomeOtherProductSupport());
	}
	
	@Then("validate site home other product support api")
	public void validate_sitehome_otherproduct_support_api() throws InterruptedException, IOException, ParseException {
		Assert.assertTrue(sitehomeAPIHelper.validateAPISiteHomeOtherProductSupport());
	}
	
	@When("user invokes site home alerts post api")
	public void invoke_sitehome_alerts_post__api() throws InterruptedException, IOException, ParseException {
		Assert.assertTrue(sitehomeAPIHelper.invokeAPISiteHomeAlertsPostAPI());
	}
	
	@Then("validate site home alerts post api")
	public void validate_sitehome_alerts_post_api() throws InterruptedException, IOException, ParseException {
		Assert.assertTrue(sitehomeAPIHelper.validateAPISiteHomeAlertsPostAPI());
	}
}
