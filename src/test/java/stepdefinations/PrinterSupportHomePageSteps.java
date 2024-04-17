package stepdefinations;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;

import com.hp.qa.factory.DriverFactory;
import com.hp.qa.pages.CommonPage;
import com.hp.qa.pages.PrinterHome;
import com.hp.qa.pages.SupportHome;
import com.hp.qa.util.ConfigReader;
import com.hp.qa.util.DbUtils;

import apphooks.ApplicationHooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class PrinterSupportHomePageSteps {

	private PrinterHome printerHome =new PrinterHome(DriverFactory.getDriver());
	private SupportHome homePage = new SupportHome(DriverFactory.getDriver());
	private CommonPage commonPage = new CommonPage(DriverFactory.getDriver());
	private ConfigReader configReader;
	private String title;
	DbUtils util = new DbUtils();
	Properties prop;
	private String url;
	public Properties projectProp;
	

	public PrinterSupportHomePageSteps() throws IOException {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
		projectProp = new Properties();
		projectProp.load(ApplicationHooks.class.getClassLoader().getResourceAsStream("project.properties"));
		url=projectProp.getProperty("webbaseurl");
	}

	@Given("the user is on the Printer Support Home page")
	public void user_is_on_the_printer_support_login_page() {
		DriverFactory.getDriver().get(url + "/printer");	
	}
	
	@Given("the page title should be {string}")
	public void the_page_title_should_be(String string) throws InterruptedException {
		title = printerHome.getPrinterPageTitle();
	}
	
	@Then("the user inspects the hero banner heading")
	public void user_checks_for_the_hero_banner_heading() throws InterruptedException {
		printerHome.heroBanner();
	}
	
	@Then("the hero banner heading should display as {string}")
	public void page_header_text(String expectedTxt) throws InterruptedException {
		String bannerTxt = printerHome.heroBannerTxt(prop.getProperty("HeroBannerTxt"));
		Assert.assertTrue(bannerTxt.contains(expectedTxt));
	}
	
	@Given("the user navigates to the primary option heading arrow links section")
	public void the_user_navigates_to_the_primary_option_heading_arrow_links_section() {
		boolean primary = printerHome.primaryOptionlink();
		Assert.assertEquals(true,primary);
	}
	
	@Then("the user searches for the {string} link")
	public void the_user_searches_for_the_link(String string) {
		boolean drivers = printerHome.downloadDriverslink();
		Assert.assertEquals(true,drivers);
	}
	
	@Then("the user verifies the availability of the {string} link")
	public void the_user_verifies_the_availability_of_the_link(String string) {
		boolean warrenty = printerHome.checkWarrantylink();
		Assert.assertEquals(true,warrenty);
	}
	
	@Then("the user ensures the presence of the {string} link")
	public void the_user_ensures_the_presence_of_the_link(String string) {
		boolean contactUs = printerHome.contactUslink();
		Assert.assertEquals(true,contactUs);
	}
	
	@Then("the user examines the existence of the {string} link")
	public void the_user_examines_the_existence_of_the_link(String string) {
		boolean va = printerHome.virtualAgent();
		Assert.assertEquals(true,va);
	}
	
	@Then("the user click on {string} link")
	public void the_user_attempts_to_find_and_click_on_the_link(String expText) throws InterruptedException {
		if (expText.contains("Download Drivers")) {
			printerHome.clickDownloadDriver();
		} else if (expText.contains("Check Warranty Status")) {
			printerHome.checkWarranty();
		} else if(expText.contains("Contact Us")) {
			printerHome.contactUs();
		}else if(expText.contains("Ask Our Virtual Agent")) {
			printerHome.virtualAgentlink();
		}
	}
 
	@Then("user checks for the printer setup header text as {string}")
	public void user_checks_for_the_printer_setup_header_text(String expectedTxt) throws InterruptedException {
		String actualTxt = printerHome.printerSetupheader();
		Assert.assertTrue(actualTxt.contains(expectedTxt));
	}
	
	@Then("the printer setup button should be available")
	public void the_printer_setup_button_should_be_available() throws InterruptedException{
		printerHome.printerSetupBtn();	
	}
	
	@Then("the user clicks on the printer setup button")
	public void the_user_clicks_on_the_printer_setup_button() throws InterruptedException {
		printerHome.clickPrinterSetupBtn();
	}
	
	@Then("the user checks for the presence of the printer setup {string} link")
	public void the_user_checks_for_the_presence_of_the_printer_setup_link(String expectedURL) throws InterruptedException {
		boolean setupLink = printerHome.printerSetuplink();
		Assert.assertEquals(true,setupLink);
	}
	
	@Then("the user should also check for the presence of the {string} link")
	public void the_user_should_also_check_for_the_presence_of_the_link(String string) throws InterruptedException {
		boolean wireless = printerHome.wirelessSetup();
		Assert.assertEquals(true,wireless);
	}
	
	@Then("the user checks for the functionality of the printer setup {string} link")
	public void the_user_checks_for_the_functionality_of_the_printer_setup_link(String expectedURL) throws InterruptedException {
		String expUrl =  prop.getProperty("SetupVideosUrl");
		String actualUrl = printerHome.printerSetupvideos();
		Assert.assertTrue(actualUrl.contains(expUrl));
		commonPage.navigateBack();
	}
	
	@Then("the user should also check for the functionality of the {string} link")
	public void the_user_should_also_check_for_the_functionality_of_the_link(String string) throws InterruptedException {
		String expUrl = url + prop.getProperty("WirelessPrint");
		String actualUrl = printerHome.wirelessSupport();
		Assert.assertTrue(actualUrl.contains(expUrl));
		commonPage.navigateBack();
	}
 
	@Then("user checks for the windows 11 card")
	public void user_checks_for_the_windows_11_card() throws InterruptedException {
		printerHome.windows11card();	
	}
	
	@Then("the {string} button should be available")
	public void the_button_should_be_available(String string) throws InterruptedException {
		boolean fixScan = printerHome.fixScanbtn_availablity();
		Assert.assertEquals(true,fixScan);
	}
	
	@Then("user clicked on the {string} button")
	public void user_clicked_on_the_button(String string) throws InterruptedException {
		printerHome.fixscanBtn();	
	}
	
	
	@Then("the user verifies {string} link should be available")
	public void the_user_verifies_link_should_be_available(String string) {
		boolean msft = printerHome.MSFTlink();
		Assert.assertEquals(true,msft);
	}
	
	@Then("the user should verify the availability of the {string} link")
	public void the_user_should_verify_the_availability_of_the_link(String string) {
		boolean win11 = printerHome.winSupportlink();
		Assert.assertEquals(true,win11);
	}
 
	
	@Then("the user should verify the functionality of the {string} link")
	public void user_should_also_check_for_the_link(String expectedURLprintersetupvideosURL) throws InterruptedException {
		String expUrl = url + prop.getProperty("Win11supportURL");
		String actualUrl = printerHome.Win11supportURL();
		Assert.assertTrue(actualUrl.contains(expUrl));
		commonPage.navigateBack();
	}
	
	@Then("user checks for the hp ink and toner cartridges card")
	public void hp_ink_and_toner_cartridges_card() throws InterruptedException {
		printerHome.HPinkTonarCartridges();		
	}
	
	
	@Then("check compatible cartridges button should be available")
	public void check_compatible_cartridges_button_should_be_available() {
		boolean cartridges = printerHome.cartridgesBtn_availablity();
		Assert.assertEquals(true,cartridges);
	}
	
	@Then("user check for compatible cartridges button, it should be clickable")
	public void check_compatible_cartridges_button() throws InterruptedException {
		printerHome.compatibleCatridgesbtn();
	}
	
	@Then("user checks for HP instant ink support link should be available")
	public void HP_instant_ink_support_link() {
		boolean hp = printerHome.hpinstantink_availablity();
		Assert.assertEquals(true,hp);
	}
	
	@Then("user checks for the printer offline or print job card")
	public void checks_for_the_Printer_offline_or_print_job_card() throws InterruptedException {
		printerHome.printerOfflinecard();
	}
	
	@Then("check print and scan doctor button should be available")
	public void print_and_scan_doctor_button_should_be_available() {
		boolean docBtn = printerHome.printandScanbtn_availablity();
		Assert.assertEquals(true,docBtn);
	}
	
	@Then("user check for print and scan doctor button, it should be clickable")
	public void print_and_scan_doctor_button_functionality() throws InterruptedException, AWTException {
		printerHome.printScanbtn();
	}
	
	@Then("user check for pfinder section title for printer support")
	public void pfinder_section_title() throws InterruptedException, AWTException {
		printerHome.pfinderTitle();
	}
	@And("the pfinder section title for printer support should be available from db as {string}")
	public void the_pfinder_section_title_should_be_available_from_db_as(String title) throws InterruptedException {
		String pageTitle = printerHome.pfinderTitleTxt();
    	Assert.assertTrue(pageTitle.contains(title));	
	}
	
	@Then("user checks for the print and scan doctor url, it should be available")
	public void user_checks_for_the_print_and_scan_doctor_url() {
		boolean docUrl = printerHome.printScanlink_availablity();
		Assert.assertEquals(true,docUrl);
	}
 
	@And("clicks on the oneBoxsearch button")
	public void clicks_on_the_oneBoxsearch_button() {
		homePage.oneBoxSearchButton();
	}

	@Then("web product detection text should be available as {string}")
	public void web_product_detection_text_should_be_available(String title) throws InterruptedException {	
		String pageTitle = homePage.webProduct();
    	Assert.assertTrue(pageTitle.contains(title));
	}
	@Then("click on the detect button")
	public void click_on_the_detect_button(){	
		homePage.webDetectBtn();
	}
	@Then("user checks for the model to detect the HP product")
	public void the_user_checks_for_the_model_to_detect_the_HP_product(){
		homePage.webDetectModal();
	}
	@Then("model title should be available as {string}")
	public void model_title_should_be_available(String title) throws InterruptedException {
		String pageTitle =homePage.webDetectModalTxt();
    	Assert.assertTrue(pageTitle.contains(title));
	}
	@Then("click on the close button")
	public void click_on_the_close_button(){
		homePage.webdetectModalCloseBtn();
	}
	@Then("user check for sign in link for saved product")
	public void user_check_for_sign_in_link_for_saved_product(){
		homePage.signinLink();	
	}
	@Then("the user clicks on the sign in link to save the product")
	public void the_user_clicks_on_the_sign_in_link_to_save_the_product(){
		homePage.signinLinkClick();	
	}
	@Then("check if user has {string} on the dashboard page")
	public void check_if_user_has_landed_on_the_dashboard_page(String title){
		homePage.dashboardpagetitle();
	}
	
}
 