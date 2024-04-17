package stepdefinations;

import java.io.IOException;
import java.util.Properties;
import org.junit.Assert;
import com.hp.qa.factory.DriverFactory;
import com.hp.qa.pages.CommonPage;
import com.hp.qa.pages.PdpPage;
import com.hp.qa.pages.PrinterHome;
import com.hp.qa.pages.SearchResultPage;
import com.hp.qa.pages.SupportHome;
import com.hp.qa.util.ConfigReader;
import com.hp.qa.util.DbUtils;
import apphooks.ApplicationHooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SupportHomePageSteps {

	private static String title;
	private SupportHome homePage = new SupportHome(DriverFactory.getDriver());
	private PrinterHome printerHome =new PrinterHome(DriverFactory.getDriver());
	private PdpPage pdpPage = new PdpPage(DriverFactory.getDriver());
	private CommonPage commonPage = new CommonPage(DriverFactory.getDriver());
	private SearchResultPage SearchResultPage = new SearchResultPage();
	private ConfigReader configReader;
	Properties prop;
	public Properties projectProp;
	String url;
	DbUtils util = new DbUtils();

	public SupportHomePageSteps() throws IOException {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
		projectProp = new Properties();
		projectProp.load(ApplicationHooks.class.getClassLoader().getResourceAsStream("project.properties"));
		url=projectProp.getProperty("webbaseurl");
	}

	@Given("the user is on the HP Support Home page")
	public void the_user_is_on_the_hp_support_home_page() {
		DriverFactory.getDriver().get(url);
	}

	@When("then user clicks on signin button")
	public void user_clicks_on_signin_button() {
		commonPage.clickOnSignin();
	}

	@When("the page {string} welcome text should match the expected value: {string}")
	public void page_welcome_text(String welcome, String str) throws InterruptedException {
		if (welcome == "signedin") {
			String welcomeText = homePage.wlcmTextSignedin();
			System.out.println(welcomeText);
			Assert.assertTrue(welcomeText.contains(title));
		}
		if (welcome == "nonsignedin") {
			String welcomeText = homePage.wlcmTextNonSignedin();
			System.out.println(welcomeText);
			Assert.assertTrue(welcomeText.contains(title));
		}
	}

	// SWD TILE
	@And("the user checks for the swd tile")
	public void user_checks_for_the_swd_tile() {
		homePage.swdTilePresence();
	}
	
	@When("the user click on the swd tile")
	public void user_click_on_the_swd_tile() throws InterruptedException {
		homePage.swdTileClick();
	}
	
	// PRINTER TILE
	@And("the user checks for the printer tile")
	public void checks_for_the_printer_tile() {
		homePage.printerTilePresence();
	}

	@When("the user clicks on the printer tile")
	public void user_click_on_the_printer_tile() throws InterruptedException {
		homePage.printerTileClick();
	}
	@And("the printer page title should be {string}")
	public void printer_page_title(String title) throws InterruptedException {
		String printerPageTitle = printerHome.getPrinterPageTitle();
		Assert.assertTrue(printerPageTitle.contains(title));
	}

	// COMPUTER TILE
	@And("the user checks for the computer tile")
	public void checks_for_the_computer_tile() {
		homePage.computerTilePresence();
	}

	@When("the user clicks on the computer tile")
	public void user_click_on_the_computer_tile() throws InterruptedException {
		homePage.computerTileClick();
	}

	@And("the user should be navigated to the pdp page or search result page with page title from either of the two from db {string} {string}")
	public void the_searched_result_page_should_match_as_per_the_provided_product_number(String title1, String title2) throws InterruptedException {
		String url = prop.getProperty("url");	
	    	
	    	if(url.contains("uat")) {
	    		String pageTitle = SearchResultPage.searchPageSupportTab().trim();
		    	Assert.assertTrue(pageTitle.contains(title1)|| pageTitle.contains(title2));
	    	}
	    	else if(url.contains("qa")){
	    		String pageTitle = SearchResultPage.searchPageSupportTab().trim();
		    	Assert.assertTrue(pageTitle.contains(title1)|| pageTitle.contains(title2));
	    	}
	    	else if(url.equals("https://uat.support.hp.com/us-en")){
	    		String pageTitle = pdpPage.getPdpPageTitle().trim();
		    	Assert.assertTrue(pageTitle.contains(title1)|| pageTitle.contains(title2));
	    	}
	}

	@Then("the user should be navigated to the pdp page with page title from db for {string}")
	public void the_searched_result_page_should_match_as_per_the_provided_hp_product_number(String title) throws InterruptedException {
		String pageTitle = pdpPage.getPdpPageTitle().trim();
    	Assert.assertTrue(pageTitle.contains(title));
	}

	@When("the user selects a product from the auto-suggest box")
	public void the_user_selects_a_product_from_the_auto_suggest_box() throws InterruptedException {
		homePage.selectautoSuggestProductName();
	}

	// ONE BOX SEARCH
	
	@When("the user enters a valid serial number in the one box search field - {string}")
	public void the_user_enters_a_valid_serial_number_in_the_onebox_search_field_from_bd(String rowID){
		homePage.OneBoxSearchField(util.get_Serial_Number(rowID));
	}
	
	@When("the user enters a valid product number in the one box search field - {string}")
	public void the_user_enters_a_valid_product_number_in_the_onebox_search_field_from_bd(String rowID){
		homePage.OneBoxSearchField(util.get_Product_Number(rowID));
	}
	
	@When("the user enters a valid product name in the one box search field- {string}")
	public void the_user_enters_a_valid_product_name_in_the_onebox_search_field_from_bd(String rowID){
		homePage.OneBoxSearchField(util.get_Product_Name(rowID));
	}
	
	@When("the user enters a valid series name in the one box search field from DB for Test case - {string}")
	public void the_user_enters_a_valid_series_name_in_the_onebox_search_field_from_bd(String rowID){
		homePage.OneBoxSearchField(util.get_Product_Series_Name(rowID));
	}

	@And("then clicks on the oneBoxsearch button")
	public void clicks_on_the_oneBoxsearch_button() {
		homePage.oneBoxSearchButton();
	}
	
	
	@Then("check if carousel banner is present")
    public void carousel_Banner_Presence() {
		boolean carousal = homePage.carousalBanner();
		Assert.assertEquals(true,carousal);
    }
	
	@Then("check if carousel banner swiper is working")
    public void check_if_carousel_banner_swipper_is_working() throws InterruptedException {
		homePage.carousalBannerSwipper();
	}
	
	
}
