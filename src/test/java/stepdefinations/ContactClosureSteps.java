package stepdefinations;

import java.awt.AWTException;
import java.util.Properties;
import org.junit.Assert;
import com.hp.qa.factory.DriverFactory;
import com.hp.qa.pages.ContactClosurePage;
import com.hp.qa.util.ConfigReader;
import com.hp.qa.util.DbUtils;
import io.cucumber.java.en.Then;


public class ContactClosureSteps {

	private ContactClosurePage contactClosure =new ContactClosurePage(DriverFactory.getDriver());
	private ConfigReader configReader;
	private String url;
	Properties prop;
	DbUtils util = new DbUtils();
	

	public ContactClosureSteps() {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
		url = prop.getProperty("urlCucumber");
	}
	 @Then("clicks on the submit button")
	    public void clicks_on_the_submit_button() throws InterruptedException {
	        boolean submitBtnFunctional = contactClosure.isSubmitBtnFunctional();
	        Assert.assertEquals(true, submitBtnFunctional);
	    }

	    @Then("customer support pop-up availability")
	    public void customer_support_popup_availability() throws InterruptedException, AWTException {
	        boolean popUpTitleAvailable = contactClosure.isPopUpTitleAvailable(prop.getProperty("ChatHeading"));
	        Assert.assertEquals(true, popUpTitleAvailable);
	    }

	    @Then("customer support pop-up functionality")
	    public void customer_support_popup_functionality() throws InterruptedException, AWTException {
	        boolean titleAvailable = contactClosure.isTitleAvailable(prop.getProperty("ChatHeading"));
	        Assert.assertEquals(true, titleAvailable);
	    }

	    @Then("customer support pop-up closure pop-up functionality")
	    public void customer_support_popup_closure_popup_title_functionality() throws InterruptedException, AWTException {
	        boolean closurePopUpFunctional = contactClosure.isClosurePopUpFunctional();
	        Assert.assertEquals(true, closurePopUpFunctional);
	    }

	    @Then("contact closure page go to dashboard link availability")
	    public void contact_closure_page_go_to_dashboard_link_availability() throws InterruptedException {
	        boolean goToDashboardLinkAvailable = contactClosure.isGoToDashboardLinkAvailable();
	        Assert.assertEquals(true, goToDashboardLinkAvailable);
	    }

	    @Then("contact closure page go to dashboard link functionality")
	    public void contact_closure_page_go_to_dashboard_link_functionality() throws InterruptedException {
	        boolean goToDashboardLinkFunctional = contactClosure.isGoToDashboardLinkFunctional(prop.getProperty("DashboardSerialNum"));
	        Assert.assertEquals(true, goToDashboardLinkFunctional);
	    }

	    @Then("contact closure page back to all contact options link availability")
	    public void contact_closure_page_back_to_all_contact_options_link_availability() throws InterruptedException {
	        boolean backToAllContactOptionsLinkAvailable = contactClosure.isBackToAllContactOptionsLinkAvailable();
	        Assert.assertEquals(true, backToAllContactOptionsLinkAvailable);
	    }

	    @Then("contact closure page back to all contact options link functionality")
	    public void contact_closure_page_back_to_all_contact_options_link_functionality() throws InterruptedException {
	        boolean backToAllContactOptionsLinkFunctional = contactClosure.isBackToAllContactOptionsLinkFunctional(prop.getProperty("AllContactTitle"));
	        Assert.assertEquals(true, backToAllContactOptionsLinkFunctional);
	    }
	}