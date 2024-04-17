package stepdefinations;

import java.io.IOException;
import java.util.Properties;
import org.junit.Assert;
import com.hp.qa.factory.DriverFactory;
import com.hp.qa.pages.ContactSupport;
import com.hp.qa.util.ConfigReader;
import com.hp.qa.util.DbUtils;
import com.hp.qa.util.ElementUtils;

import apphooks.ApplicationHooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactSupportPageStep {

	private ContactSupport contact = new ContactSupport(DriverFactory.getDriver());
	private static String title;
	private ConfigReader configReader;
	Properties prop;
	public Properties projectProp;
	String url;
	ApplicationHooks testContext;
	DbUtils util = new DbUtils();


	public ContactSupportPageStep() throws IOException {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
		projectProp = new Properties();
		projectProp.load(ApplicationHooks.class.getClassLoader().getResourceAsStream("project.properties"));
		url=projectProp.getProperty("webbaseurl");
	}

	@Given("the user is on the contact support landing page")
	public void user_is_on_the_contact_support_landing_page() {
		DriverFactory.getDriver().get(url + "/contact");
	}

	@Given("contact page title should be {string}")
	public void user_gets_the_title_of_the_contact_page(String expPageTitle) throws InterruptedException {
		title = contact.getContactPageTitle();
		System.out.println("Contact page title is : " + title);
		Assert.assertTrue(title.contains(expPageTitle));
	}

	@Given("non-signedin contact page title should be {string}")
	public void non_signedin_contact_page_title(String expPageTitle) throws InterruptedException {
		title = contact.getNonSignedContactPageTitle();
		System.out.println("Contact page title is : " + title);
		Assert.assertTrue(title.contains(expPageTitle));
	}

	@Then("I should see a prominent option or button labeled {string}")
	public void I_should_see_prominent_buttonlabeled(String expectedButtonTxt) throws InterruptedException {
		String buttonTxt = contact.getSignButtonText();
		Assert.assertTrue(buttonTxt.contains(expectedButtonTxt));
	}

	@Then("the user checks for the tooltip why should I signin text {string}")
	public void user_checks_for_the_tooltip_text(String whySignin) throws InterruptedException {
		String whySignInTxt = contact.whyShouldISignInLink();
		Assert.assertTrue(whySignInTxt.contains(whySignin));
	}

	@Then("the user sees the contact support welcome message {string}")
	public void page_welcome_text(String welcomeMes) throws InterruptedException {
		String welcomeTxt = contact.welcomeTxt();
		Assert.assertTrue(welcomeTxt.contains(welcomeMes));
	}

	@When("then user clicks on quick link tiles")
	public void quick_tiles_functionslity_check() throws InterruptedException {
		contact.quickLinksTilesClick();
	}

	@Then("the user checks for signIn button {string}")
	public void user_checks_for_the_row_titles(String btnText) throws InterruptedException {
		String btnTxt = contact.validateSigninBtn();
		Assert.assertTrue(btnTxt.contains(btnText));
	}

	@Then("the user check for create an account button {string}")
	public void user_check_for_create_an_account_button(String btnText) throws InterruptedException {
		String btnTxt = contact.validateCreateAccountBtn();
		Assert.assertTrue(btnTxt.contains(btnText));
	}

	@And("the user click on create an account button")
	public void user_click_on_create_an_account_button() throws InterruptedException {
		contact.clickCreateAccBtn();
	}

	@Given("the create account page title should be {string}")
	public void user_gets_the_title_of_the_accounts_page(String title) throws InterruptedException {
		String accountPageTitle = contact.getAccountPageTitle();
		Assert.assertTrue(accountPageTitle.contains(title));
	}

	@Then("the user check for get started before sign in link {string}")
	public void user_check_for_Get_Started_Before_Sign_In_link(String getStarted) throws InterruptedException {
		String getStartedTxt = contact.validateGetStartedlink();
		Assert.assertTrue(getStartedTxt.contains(getStarted));
	}

	@And("the user clicks on get started before sigin link")
	public void the_user_clicks_on_get_started_before_sigin_link() {
		contact.clickGetStartedBeforeSignin();
	}

	@Given("the choose products page title should be from db TC {string}")
	public void user_gets_the_title_of_the_choose_products_page(String title) throws InterruptedException {
		String chooseProductsTitle = contact.chooseProdcuctsPageTitle();
		Assert.assertTrue(chooseProductsTitle.contains(title));
	}

	@Then("quick link title is present {string}")
	public void quick_link_title(String quickLinkTxt) throws InterruptedException {
		String quickLinkText = contact.quickLinksText();
		Assert.assertTrue(quickLinkText.contains(quickLinkTxt));
	}

	@Then("user successfully sign in with the credentials of {string}")
	public void correct_credentials(String rowID) throws InterruptedException {
		contact.userCredentials(util.get_username(rowID), util.get_password(rowID));
	}

	@Then("the user sees the {string}")
	public void sub_heading_check(String subheading) throws InterruptedException {
		String subheading1 = contact.subHeadingText();
		Assert.assertTrue(subheading1.contains(subheading1));
	}

	@Then("the user can see the {string} link")
	public void sub_heading_products_(String expText) throws InterruptedException {
		if (expText.contains("View all of my product")) {
			String viewProductLinkTxt1 = contact.viewAllMyProductAvailbility();
			Assert.assertTrue(viewProductLinkTxt1.contains(viewProductLinkTxt1));
		} else if (expText.contains("Add a New Product")) {
			String addNewProductLinkText = contact.addNewProductLinkAvailibilty();
			Assert.assertTrue(addNewProductLinkText.contains(addNewProductLinkText));
		}
	}

	@Then("the user click on the {string} link")
	public void sub_heading_products_click(String expText) throws InterruptedException {
		if (expText.contains("View all of my product")) {
			contact.viewAllMyProductClick();
		} else if (expText.contains("Add a New Product")) {
			contact.addNewProductLinkClick();
		} else if (expText.contains("Choose a different product")) {
			contact.ChooseProductTypeFunctionality();
		}
	}

	@Then("the user can see the left {string} button")
	public void leftSwipperBtnAvailibility(String leftSwipperBtn) throws InterruptedException {
		contact.leftCarousalBtnAvailibility();
	}

	@Then("the user can see the right {string} button")
	public void rightSwipperBtnAvailibility(String s) throws InterruptedException {
		contact.rightCarousalBtnAvailibility();
	}

	@Then("the user can click the left Swipper button")
	public void leftSwipperBtnFunctionality() throws InterruptedException {
		contact.leftCarousalBtnFunctionality();
	}

	@Then("the user can click the right Swipper button")
	public void rightSwipperBtnFunctionality() throws InterruptedException {
		contact.rightCarousalBtnFunctionality();
	}

	@Then("the user can see the tile {string}")
	public void subscriptionTileAvailibility(String tile) throws InterruptedException {
		String sasTileBtn = contact.sAsTileAvailibility();
		Assert.assertTrue(sasTileBtn.contains(sasTileBtn));
	}

	@Then("the user can click the tile {string}")
	public void tileFunctionality(String tile) throws InterruptedException {
		if (tile.equalsIgnoreCase("Subscription,Apps and Services")) {
			contact.sAsTileFunctionality();
		} else if (tile.equalsIgnoreCase("Printers")) {
			contact.printerTileFunctionality();
		} else if (tile.equalsIgnoreCase("Laptops")) {
			contact.laptopTileFunctionality();
		} else if (tile.equalsIgnoreCase("Desktops")) {
			contact.desktopTileFunctionality();
		} else if (tile.equalsIgnoreCase("Monitor")) {
			contact.monitorMiceHardwareTileFunctionality();
		} else if (tile.equalsIgnoreCase("HP+")) {
			contact.HpPlusFunctionality();
		} else if (tile.equalsIgnoreCase("Learn more about Instant Ink")) {
			contact.HpInstantInkClick();
		} else if (tile.equalsIgnoreCase("Printer Setup")) {
			contact.printerSetupTileClick();
		} else if (title.equalsIgnoreCase("Other")) {
			contact.OtherTileClick();
		} else if (title.equalsIgnoreCase("Problem with battery or adapter")) {
			contact.BatteryIssuesFunctionality();
		}

	}

	@Then("the user should navigated to the page having header {string}")
	public void subscriptionPage(String subscriptionHeader) throws InterruptedException {
		String sasHeaderTxt = contact.subscriptionHeaderCheck();
		Assert.assertTrue(sasHeaderTxt.contains(sasHeaderTxt));
	}

	@Then("the user check for {string} tile")
	public void printerPageavailibility(String printerTile) throws InterruptedException {
		String printerTileBtn = contact.printerTileAvailibility();
		Assert.assertTrue(printerTileBtn.contains(printerTileBtn));
	}

	@Then("the user should be navigated to the printer page having header {string}")
	public void printerPage(String printerPageHeader) throws InterruptedException {
		String printerPageHeaderText = contact.printerPageHeaderCheck();
		Assert.assertTrue(printerPageHeaderText.contains(printerPageHeader));
	}
	

	@Then("the user check for {string}")
	public void laptopTileAvailibility(String laptopTile) throws InterruptedException {
		String laptopTileBtn = contact.laptopTileAvailibility();
		Assert.assertTrue(laptopTileBtn.contains(laptopTileBtn));
	}

	@Then("the user should be to the printer page having header {string}")
	public void laptopPage(String laptopTile) throws InterruptedException {
		String laptopPageHeader = contact.laptopPageHeaderCheck();
		Assert.assertTrue(laptopTile.contains(laptopPageHeader));
	}

	@Then("the user sees the tile {string}")
	public void desktopTileAvailibility(String desktopTile) throws InterruptedException {
		String desktopTileText = contact.desktopTileAvailibility();
		Assert.assertTrue(desktopTileText.contains(desktopTileText));
		System.out.println(desktopTileText);
	}

	@Then("the user should be navigated to the desktop page having header {string}")
	public void desktopPage(String desktopTile) throws InterruptedException {
		String desktopPageHeader = contact.desktopPageHeaderCheck();
		Assert.assertTrue(desktopTile.contains(desktopPageHeader));
	}

	@Then("user sees the tile {string}")
	public void monitorMiceHardwarePageAvailibility(String monitorMiceHardwareTile) throws InterruptedException {
		String monitorMiceHardwareTileText = contact.monitorMiceHardwareTileAvailibility();
		Assert.assertTrue(monitorMiceHardwareTileText.contains(monitorMiceHardwareTileText));
		System.out.println(monitorMiceHardwareTileText);
	}

	@Then("the user should be navigated to the Monitors,mice and other hardware page having header {string}")
	public void monitorMiceHardwarePage(String monitorMiceHardwareTile) throws InterruptedException {
		String monitorMiceHardwareTilePageHeader = contact.monitorMiceHardwarePageHeaderCheck();
		Assert.assertTrue(monitorMiceHardwareTilePageHeader.contains(monitorMiceHardwareTilePageHeader));
	}

	@Then("the user checks for {string}")
	public void PolyPageAvailibility(String polyPageTile) throws InterruptedException {
		String polyPageTileTileText = contact.polyTileAvailibility();
		Assert.assertTrue(polyPageTile.contains(polyPageTileTileText));
		System.out.println(polyPageTile);
	}

	@Then("the user clicks on {string} tile")
	public void polyTileFunctionality(String polyPageTile) throws InterruptedException {
		contact.polyTileFunctionality();
	}

	@Then("the user should be navigated to the Poly products {string}")
	public void polyPage(String polyPageTile) throws InterruptedException {
		String polyTilePageHeader = contact.polyPageHeaderCheck();
		Assert.assertTrue(polyTilePageHeader.contains(polyPageTile));
	}

	@Then("the A user can see the {string} Product card")
	public void hpAllInPlanAvailibility_(String hpAllInPlan) throws InterruptedException {
		String hpAllInPlanTtileCheck = contact.HpAllInPlanAvailibility();
		Assert.assertTrue(hpAllInPlanTtileCheck.contains(hpAllInPlanTtileCheck));
	}

	@Then("the user can click the {string} Product card")
	public void hpAllInPlanFunctionality(String hpAllInPlan) throws InterruptedException {
		contact.hpAllInPlanFunctionality();
	}

	@Then("the user can see the {string} Product card")
	public void hpInstantavailibility(String hpInstantInk) throws InterruptedException {
		String hpInstantInkTtileCheck = contact.HpInstantInkAvailibility();
		Assert.assertTrue(hpInstantInkTtileCheck.contains(hpInstantInkTtileCheck));
	}

	@Then("the user should navigated {string}")
	public void hpInstantPage(String HpInstant) throws InterruptedException {
		String hpInstantInkcontact = contact.HpInstant();
		Assert.assertTrue(hpInstantInkcontact.contains(hpInstantInkcontact));
	}

	@Then("the user can locate {string}")
	public void hpPlusavailibility(String hpPlus) throws InterruptedException {
		String hpPlusTile = contact.HpPlusAvailibility();
		Assert.assertTrue(hpPlusTile.contains(hpPlusTile));
	}

	@Then("user should go to {string}")
	public void hpPlusHeader(String hpPlusHeader) throws InterruptedException {
		String hpPlusHeaderCheck = contact.HpPlusHeaderCheck();
		Assert.assertTrue(hpPlusHeaderCheck.contains(hpPlusHeader));
	}

	@And("the user can see the {string} Instant link")
	public void HpInstantInkLink(String instantLink) throws InterruptedException {
		String hpInstantInk = contact.hpInstantInk();
		Assert.assertTrue(hpInstantInk.contains(hpInstantInk));
	}

	@And("then the user can see the all service container")
	public void dropDown() throws InterruptedException {
		contact.selectDropDown();
	}

	@Then("user check for {string} Button")
	public void submitBtn(String submitBtn) throws InterruptedException {
		String submitBtnCheck = contact.submitBtnCheck();
		Assert.assertTrue(submitBtnCheck.contains(submitBtnCheck));
	}

	@Then("user click for {string} Button")
	public void submitBtnClick(String SubmitBtn) throws InterruptedException {
		contact.submitBtnClick();
	}

	@Then("user can see the {string} link")
	public void diffProductLink(String diffProduct) throws InterruptedException {
		String diffProductText = contact.chooseDifferentProductTypeCheck();
		Assert.assertTrue(diffProductText.contains(diffProductText));
	}

	@Then("user can click the {string} link")
	public void diffProductLinkClick(String diffProductClick) throws InterruptedException {
		contact.chooseDifferentProductTypeClick();
	}

	@Then("user can see {string} Tile")
	public void printerSetupTileAvailibility(String printerTile) throws InterruptedException {
		String prinTerTileText = contact.printerSetupTileAvailable();
		Assert.assertTrue(prinTerTileText.contains(prinTerTileText));
	}

	@Then("will be navigated to {string} Header")
	public void printerHeaderCheck(String printerHeader) throws InterruptedException {
		String printerHeaderTxt = contact.printerSetupHeaderCheck();
		Assert.assertTrue(printerHeaderTxt.contains(printerHeaderTxt));
	}

	@Then("the user can see {string} tile")
	public void otherIconVisibility(String OtherTile) throws InterruptedException {
		String OtherTileTxt = contact.OtherTileVisible();
		Assert.assertTrue(OtherTileTxt.contains(OtherTileTxt));
	}

	@Then("the user checks availibility of {string} link")
	public void ChooseDifferentProductTypeAvailable(String ChooseDifferentProduct) throws InterruptedException {
		String ChooseDifferentProductTxt = contact.ChooseProductTypeAvailibility();
		Assert.assertTrue(ChooseDifferentProductTxt.contains(ChooseDifferentProductTxt));
	}

	@Then("user can see {string} issue tile")
	public void batteryIssueTileAvailable(String batteryIssueTile) throws InterruptedException {
		String BatteryTileTxt = contact.BatteryIssuesAvailibility();
		Assert.assertTrue(BatteryTileTxt.contains(BatteryTileTxt));
	}

	@Then("will be navigated to header of {string}")
	public void BatteryIssuePageHeader(String batteryIssue) throws InterruptedException {
		String BatteryIssueTxt = contact.BatteryIssueHeaderCheck();
		Assert.assertTrue(BatteryIssueTxt.contains(BatteryIssueTxt));

	}

	@Then("the user can see {string} tile icon")
	public void LaptopOtherIssueAvailble(String otherIssue) throws InterruptedException {
		String OtherIssueTxt = contact.OtherIssuesAvailibility();
		Assert.assertTrue(OtherIssueTxt.contains(OtherIssueTxt));

	}

	@Then("the user can click {string} tile icon")
	public void OtherIssueClick(String otherIssueClick) throws InterruptedException {
		contact.OtherIssuesFunctionality();
	}

	@Then("will be navigated to other page having header of {string}")
	public void LaptopOtherIssuePageHeaderCheck(String otherPageHeaderCheck) throws InterruptedException {
		String OtherIssuePageHeaderTxt = contact.OtherIssueHeaderCheck();
		Assert.assertTrue(OtherIssuePageHeaderTxt.contains(OtherIssuePageHeaderTxt));
	}

	@Then("user can see desktop issue {string} tile")
	public void StorageIssueTypeAvailable(String StorageIssue) throws InterruptedException {
		String StorageIssueTxt = contact.storageIssuesAvailibility();
		Assert.assertTrue(StorageIssueTxt.contains(StorageIssueTxt));
	}

	@Then("user can click on issue {string} Tile")
	public void StorageIssueTypeFunctional(String StorageIssueClick) throws InterruptedException {
		contact.storageIssuesFunctionality();
	}

	@Then("will be navigated to issue header of {string}")
	public void StorageIssueTypeHeaderCheck(String storageIssueHeader) throws InterruptedException {
		String StorageIssueHeaderTxt = contact.StorageIssueHeaderCheck();
		Assert.assertTrue(StorageIssueHeaderTxt.contains(StorageIssueHeaderTxt));
	}

	@Then("will be navigated to desktop other page having header of {string}")
	public void OtherDesktopHeader(String OtherDesktopHeader) throws InterruptedException {
		String otherDesktopIssueHeaderTxt = contact.OtherDesktopIssueHeaderCheck();
		Assert.assertTrue(otherDesktopIssueHeaderTxt.contains(otherDesktopIssueHeaderTxt));
	}

	@Then("user can see monitor {string} Tile")
	public void lcdIssueTileAvailibility(String lcdIssue) throws InterruptedException {
		String lcdIssueTxt = contact.lcdIssuesAvailibility();
		Assert.assertTrue(lcdIssueTxt.contains(lcdIssueTxt));
	}

	@Then("user can click on the monitor {string} Tile")
	public void lcdIssueTileClick(String lcdIssueClick) throws InterruptedException {
		contact.lcdIssuesFunctionality();
	}

	@Then("will be navigated to monitor {string} Header")
	public void lcdIssueHeader(String lcdHeader) throws InterruptedException {
		String lcdIssueHeaderTxt = contact.lcdIssueHeaderCheck();
		Assert.assertTrue(lcdIssueHeaderTxt.contains(lcdIssueHeaderTxt));
	}

}
