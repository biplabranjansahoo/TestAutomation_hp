package stepdefinations;

import java.io.IOException;
import java.util.Properties;
import org.junit.Assert;
import com.hp.qa.factory.DriverFactory;
import com.hp.qa.pages.ContactOptionsPage;
import com.hp.qa.util.ConfigReader;
import com.hp.qa.util.DbUtils;

import apphooks.ApplicationHooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactOptionsPageSteps {

	private ContactOptionsPage contactOption =new ContactOptionsPage(DriverFactory.getDriver());
	private ConfigReader configReader;
	private String url;
	Properties prop;
	public Properties projectProp;
	DbUtils util = new DbUtils();

	public ContactOptionsPageSteps() throws IOException {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
		projectProp = new Properties();
		projectProp.load(ApplicationHooks.class.getClassLoader().getResourceAsStream("project.properties"));
		url=projectProp.getProperty("webbaseurl");
	}

	@When("the user navigates to the contact options page")
	public void the_user_navigates_to_the_contact_options_page() throws InterruptedException { 
	    contactOption.contactOptionPageLanding();
	}

	@Given("the serial number has to be present")
	public void the_serial_number_is_validated_to_be_present() throws InterruptedException {
	    boolean contactOptionSerialNum = contactOption.contactOptionSerialNum();
	    Assert.assertEquals(true, contactOptionSerialNum);
	}

	@When("the choose a different product link is present")
	public void the_choose_a_different_product_link_is_present() throws InterruptedException {
	    boolean chooseDifferentLinkAvailability = contactOption.chooseDifferentLink_Availability(prop.getProperty("DiffrentProduct"));
	    Assert.assertEquals(true, chooseDifferentLinkAvailability);
	}

	@Then("the choose a different product link is functional")
	public void the_choose_a_different_product_link_is_functional() throws InterruptedException {
	    boolean chooseDifferentLinkFunctionality = contactOption.chooseDifferentLink_Functionality(prop.getProperty("SelectPageTitle"));
	    Assert.assertEquals(true, chooseDifferentLinkFunctionality);
	}

	@When("all contact option tile is present")
	public void all_contact_option_tile_is_present() throws InterruptedException {
	    boolean allContactTilesPresent = contactOption.allContactTiles();
	    Assert.assertEquals(true, allContactTilesPresent);
	}

	@When("the omni chat contact option is present")
	public void the_chat_contact_option_is_present() throws InterruptedException {
	    boolean omniChatTilePresent = contactOption.omniChatTile();
	    Assert.assertEquals(true, omniChatTilePresent);
	}

	@Then("the omni chat contact option is functional")
	public void the_chat_contact_option_is_functional() throws InterruptedException {
	    boolean omniChatTileFunctional = contactOption.omniChatTile_Functionality(url + prop.getProperty("OmniChatUrl"));
	    Assert.assertEquals(true, omniChatTileFunctional);
	}

	@Given("the speak to an agent contact option is present")
	public void the_speak_to_agent_contact_option_is_present() throws InterruptedException {
	    boolean speakToAgentTilePresent = contactOption.speakToAgentTile();
	    Assert.assertEquals(true, speakToAgentTilePresent);
	}

	@When("the product exchange contact option is present")
	public void the_product_exchange_contact_option_is_present() throws InterruptedException {
	    boolean productExchangeTilePresent = contactOption.productExchangeTile();
	    Assert.assertEquals(true, productExchangeTilePresent);
	}

	@Then("the product exchange contact option is functional")
	public void the_product_exchange_contact_option_is_functional() throws InterruptedException {
	    boolean productExchangeTileFunctional = contactOption.productExchangeTileFunctional(url + prop.getProperty("ProductExchangeURL"));
	    Assert.assertEquals(true, productExchangeTileFunctional);
	}

	@When("the hp support community contact option is present")
	public void the_hp_support_community_contact_option_is_present() throws InterruptedException {
	    boolean supportCommunityTilePresent = contactOption.supportCommunityTile();
	    Assert.assertEquals(true, supportCommunityTilePresent);
	}

	@Then("the hp support community contact option is functional")
	public void the_hp_support_community_contact_option_is_functional() throws InterruptedException {
	    boolean supportCommunityTileFunctional = contactOption.supportCommunityTile_Functionality(prop.getProperty("SupportCommunityURL"));
	    Assert.assertEquals(true, supportCommunityTileFunctional);
	}

	@When("the phone contact option is present")
	public void the_phone_contact_option_is_present() throws InterruptedException {
	    boolean phoneTilePresent = contactOption.phoneTile();
	    Assert.assertEquals(true, phoneTilePresent);
	}

	@When("the hp service center locator contact option is present")
	public void the_hp_service_center_locator_contact_option_is_present() throws InterruptedException {
	    boolean serviceCenterLocatorPresent = contactOption.serviceCenterLocator();
	    Assert.assertEquals(true, serviceCenterLocatorPresent);
	}

	@Then("the hp service center locator contact option is functional")
	public void the_hp_service_center_locator_contact_option_is_functional() throws InterruptedException {
	    boolean serviceCenterLocatorFunctional = contactOption.serviceCenterLocator_Functionality(url + prop.getProperty("ServiceCenter"));
	    Assert.assertEquals(true, serviceCenterLocatorFunctional);
	}

	@When("the mastiff offer tile is present")
	public void the_mastiff_offer_tile_is_present() throws InterruptedException {
	    boolean mastiffOfferTilePresent = contactOption.mastiffOfferTile();
	    Assert.assertEquals(true, mastiffOfferTilePresent);
	}

	@Then("the mastiff offer tile is functional")
	public void the_mastiff_offer_tile_is_functional() throws InterruptedException {
	    boolean mastiffOfferTileFunctional = contactOption.mastiffOfferTile_Functionality(prop.getProperty("MastiffOfferUrl"));
	    Assert.assertEquals(true, mastiffOfferTileFunctional);
	}

	@When("the create a case contact option is present")
	public void the_create_a_case_contact_option_is_present() throws InterruptedException {
	    boolean createCasePresent = contactOption.createCase();
	    Assert.assertEquals(true, createCasePresent);
	}

	@Then("the create a case contact option is functional")
	public void the_create_a_case_contact_option_is_functional() throws InterruptedException {
	    boolean createCaseFunctional = contactOption.createCase_Functionality(prop.getProperty("CreateCaseUrl"));
	    Assert.assertEquals(true, createCaseFunctional);
	}

	@And("the title for more support resources is present")
	public void the_title_for_additional_support_resources_is_present() throws InterruptedException {
	    boolean supportResourceTitlePresent = contactOption.supportResourceTitle();
	    Assert.assertEquals(true, supportResourceTitlePresent);
	}

	@When("the hp support assistant tile is present")
	public void the_hp_support_assistant_tile_is_present() throws InterruptedException {
	    boolean hpSupportAssistantTilePresent = contactOption.hpSupportAssistant();
	    Assert.assertEquals(true, hpSupportAssistantTilePresent);
	}

	@And("the hp support assistant tile is functional")
	public void the_hp_support_assistant_tile_is_functional() throws InterruptedException {
	    boolean hpSupportAssistantTileFunctional = contactOption.hpSupportAssistant_Functionality(url + prop.getProperty("HPSupportAssistant"));
	    Assert.assertEquals(true, hpSupportAssistantTileFunctional);
	}

	@When("the hp support community tile is present")
	public void the_hp_support_community_tile_is_present() throws InterruptedException {
	    boolean hpSupportCommunityTilePresent = contactOption.hpSupportCommunity();
	    Assert.assertEquals(true, hpSupportCommunityTilePresent);
	}

	@And("the hp support community tile is functional")
	public void the_hp_support_community_tile_is_functional() throws InterruptedException {
	    boolean hpSupportCommunityTileFunctional = contactOption.hpSupportCommunity_Functionality(prop.getProperty("HPsupportCommunity"));
	    Assert.assertEquals(true, hpSupportCommunityTileFunctional);
	}

	@When("the software and drivers tile is present")
	public void whenTileIsPresent() throws InterruptedException {
	    boolean swdTilePresent = contactOption.swdTile();
	    Assert.assertEquals(true, swdTilePresent);
	}

	@When("the software and drivers tile is functional")
	public void whenTileIsFunctional() throws InterruptedException {
	    boolean swdTileFunctional = contactOption.swdTile_Functionality();
	    Assert.assertEquals(true, swdTileFunctional);
	}
}