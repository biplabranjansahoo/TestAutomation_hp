package stepdefinations;

import org.junit.Assert;

import com.hp.qa.api.CommonAPIHelper;

import io.cucumber.java.en.Given;

public class CommonAPISteps {
	
	CommonAPIHelper helper = new CommonAPIHelper();
	
	@Given("the api env")
	public void get_api_env() throws InterruptedException {
		Assert.assertTrue(helper.getENV());
	}

}
