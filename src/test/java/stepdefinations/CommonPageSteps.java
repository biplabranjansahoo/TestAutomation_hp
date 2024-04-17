package stepdefinations;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Properties;
import org.junit.Assert;
import com.hp.qa.factory.DriverFactory;
import com.hp.qa.pages.CommonPage;
import com.hp.qa.pages.SupportHome;
import com.hp.qa.util.ConfigReader;
import com.hp.qa.util.DbUtils;
import com.hp.qa.util.ElementUtils;
import apphooks.ApplicationHooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommonPageSteps {

	DbUtils util = new DbUtils();
	private static String title;
	private CommonPage commonPage = new CommonPage(DriverFactory.getDriver());
	private SupportHome homePage = new SupportHome(DriverFactory.getDriver());
	private ConfigReader configReader;
	Properties prop;
	public Properties projectProp;
	String url;
	String browserName;

	public CommonPageSteps() throws IOException {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
		projectProp = new Properties();
		projectProp.load(ApplicationHooks.class.getClassLoader().getResourceAsStream("project.properties"));
		url=projectProp.getProperty("webbaseurl");
		browserName=projectProp.getProperty("webbrowser");
	}

	@When("user check for the headers presence")
	public void user_check_for_the_headers_presence() throws InterruptedException {
		commonPage.validateHeader();
	}

	@When("user check for the footers presence")
	public void user_check_for_the_footers_presence() throws InterruptedException {
		commonPage.validateFooter();
	}

	@And("user accepts cookies")
	public void user_accepts_cookies() {
		commonPage.acceptCookies();
	}
	
	@And("user checks for the presence of the widget")
	public void presence_of_the_widget() {
		commonPage.widget();
	}

	@And("user will see secondary navigation bar")
	public void presence_of_the_sec_nav() {
		commonPage.secNav();
	}

	@Then("the user checks the browser tab title from db for - {string}")
	public void the_user_checks_the_browser_tab_title(String rowID)throws InterruptedException {
		title = commonPage.getTabTitle();
		Assert.assertEquals(title, util.get_Tab_Title(rowID));
	}
	
	@Then("the user checks the browser tab title - {string}")
	public void the_user_checks_the_browser_tabtitle(String actTitle)throws InterruptedException {
		title = commonPage.getTabTitle();
		System.out.println(title);
		Assert.assertEquals(title, actTitle);
	}
	
	@Then("check if clc selector is present")
	public void check_if_clc_selector_is_present() throws InterruptedException {
		boolean clc = commonPage.clc_Selector_visibility();
		Assert.assertEquals(true,clc);
	}
	
	@Then("check if clc selector is working")
	public void check_if_clc_selector_is_working()throws InterruptedException {
		commonPage.clc();
	}
	
	//Common Singed - in
	@When("the user enters username")
	public void user_enters_username() {
		commonPage.enterUserName(prop.getProperty("username"));
	}

	@When("the user clicks on the Next button")
	public void user_clicks_on_next_button() {
		commonPage.clickOnNext();
	}

	@When("the user enters the password")
	public void user_enters_password() {
		commonPage.enterPassword(prop.getProperty("password"));
	}

	@When("the user clicks on Submit button")
	public void user_clicks_on_submit_button() throws InterruptedException {
		commonPage.clickOnSubmit();
	}
	
	//Pfinder
	@When("the user enters a valid serial number in the Pfinder search box - {string}")
	public void the_user_enters_a_valid_serial_number_in_the_pfinder_search_box(String rowID) {
		homePage.pfinderSearchBox( util.get_Serial_Number(rowID));
	}

	@When("the user enters a valid product number in the Pfinder search box - {string}")
	public void enters_a_valid_product_number_in_the_pfinder_search_box(String rowID) {
		homePage.pfinderSearchBox(util.get_Product_Number(rowID));
	}
	
	@When("the user enters a valid product name in the Pfinder search box - {string}")
	public void enters_a_valid_product_name_in_the_pfinder_search_box(String rowID) {
		homePage.pfinderSearchBox(util.get_Product_Number(rowID));
	}

	@When("then clicks on the search button")
	public void clicks_on_the_search_button() {
		homePage.pfinderSearchButton();
	}
	
	//Sec Nav 
	
	//Sec Nav Products Tab
	@When("user checks for the products tab in sec nav")
	public void user_checks_for_the_products_tab_in_sec_nav() {
		boolean dropdown = commonPage.productsdropdown();
		Assert.assertEquals(true,dropdown);
	}
	
	@When("user hover on the products dropdown from sec nav")
	public void user_click_on_the_products_dropdown_from_sec_nav() {
		boolean dropdown = commonPage.productsdropdown();
	}
	
	@Then("the user select printer support - product dropdown")
	public void the_user_will_have_an_option_to_select_printer_support() {
		commonPage.printersupport();
	}
	
	@Then("the user select computer support - product dropdown")
	public void the_user_will_have_an_option_to_select_computer_support() {
		commonPage.computersupport();
	}
	
	@Then("the user select poly collaboration devices - product dropdown")
	public void the_user_will_have_an_option_to_select_poly_collaboration_devices() {
		commonPage.polycolaboration();
	}
	
	@Then("the user select ink and toner cartridges - product dropdown")
	public void the_user_will_have_an_option_to_select_ink_and_toner_cartridges() {
		commonPage.inktonercartridges();
	}
	
	@Then("the user will have an option to select all - product dropdown")
	public void the_user_will_have_an_option_to_select_all() {
		commonPage.selectall();
	}
	
	//Sec Nav SWD Tab
	@When("user checks for the software and drivers tab in sec nav")
	public void user_checks_for_the_software_and_drivers_tab_in_sec_nav() {	
		boolean swd = commonPage.swdtab();
		Assert.assertEquals(true,swd);
	}
	
	@When("user click on the software and drivers tab from sec nav")
	public void user_click_on_the_software_and_drivers_tab_from_sec_nav() throws InterruptedException {
		commonPage.swdtabclick();
		ElementUtils.sleep();
	}
	
	//Sec Nav Diagnostics Tab
	@When("user checks for the diagnostics tab in sec nav")
	public void user_checks_for_the_diagnostics_tab_in_sec_nav() {
		boolean diagnostic = commonPage.diagnostictab();
		Assert.assertEquals(true,diagnostic);
	}
	
	@When("user click on the diagnostics dropdown from sec nav")
	public void user_click_on_the_diagnostics_dropdown_from_sec_nav() {
		commonPage.diagnosticsdropdown();   
	}
	
	@Then("the user select printer diagnostics tools - diagnostics dropdown")
	public void the_user_will_have_an_option_to_select_printer_diagnostics_tools() {
		commonPage.printerdiagnosticstools(); 	
	}
	
	@Then("the user select computer diagnostics tools - diagnostics dropdown")
	public void the_user_will_have_an_option_to_select_computer_diagnostics_tools() {
		commonPage.computerdiagnosticstools();
	}
	
	@Then("the user select windows support - diagnostics dropdown")
	public void the_user_will_have_an_option_to_select_windows_support() {
		commonPage.winsupport();
	}
	
	@Then("the user select print and scan doctor - diagnostics dropdown")
	public void the_user_will_have_an_option_to_select_print_and_scan_doctor() {
		commonPage.printscandoc();
	}
	
	@Then("the user select hp pc hardware diagnostics - diagnostics dropdown")
	public void the_user_will_have_an_option_to_select_hp_pc_hardware_diagnostics() {
		commonPage.pchardwarediag();
	}
	
	//Sec Nav Contact Us
	@When("user checks for the contact us tab in sec nav")
	public void user_checks_for_the_contact_us_tab_in_sec_nav() {
		boolean contact = commonPage.contactustab();
		Assert.assertEquals(true,contact);
	}
	
	@When("user click on the contact us tab from sec nav")
	public void user_click_on_the_contact_us_tab_from_sec_nav() throws InterruptedException {
		commonPage.contactusclick();	    
	}
	
	//Sec Nav Business support
	@When("user checks for the business support tab in sec nav")
	public void user_checks_for_the_business_support_tab_in_sec_nav() {
		boolean business = commonPage.businesstab();
		Assert.assertEquals(true,business);
	}
	
	@Then("the user select manage contracts and warranties - business support")
	public void the_user_will_have_an_option_to_select_manage_contracts_and_warranties() throws InterruptedException {
		commonPage.contractswarranties();
	}
	
	@Then("user checks for the my hp account tab in sec nav")
	public void user_checks_for_the_my_hp_account_tab_in_sec_nav() throws InterruptedException {
		boolean myhp = commonPage.myhpaccounttab();
		Assert.assertEquals(true,myhp);
	}
	
	//Sec Nav My HP Account
	@Then("the contact us tab text should availbale as My HP Account")
	public void the_contact_us_tab_text_should_availbale_as_My_HP_Account() throws InterruptedException {
		commonPage.myhpaccounttabtxt();
	}
	
	@Then("user click on the my hp account dropdown from sec nav")
	public void user_click_on_the_my_hp_account_dropdown_from_sec_nav() throws InterruptedException {
		commonPage.myhpaccounttabclick();
	}
	
	@Then("the user select dashboard - Sec Nav")
	public void the_user_will_have_an_option_to_select_support_dashboard() throws InterruptedException {
		commonPage.supportdashboard();
	}
	
	@Then("the user select hp account benefits - My HP Account")
	public void the_user_will_have_an_option_to_select_hp_account_benefits() throws InterruptedException {
		commonPage.hpaccountbenefits();
	}
	
	//Alerts
	@Then("user checks for the presence of alert icon")
	public void user_checks_for_the_presence_of_alert_icon() throws InterruptedException {
		boolean alert = commonPage.alerticon();
		Assert.assertEquals(true,alert);
	}
	
	@Then("user checks for the notification pop up after clicking alert icon")
	public void user_checks_for_the_notification_pop_up_after_clicking_alert_icon() throws InterruptedException {
		commonPage.alertIconclick();
	}
	
	//Print Icon
	@Then("user checks for the presence of print icon")
	public void user_checks_for_the_presence_of_print_icon() throws InterruptedException {
		boolean print = commonPage.printicon();
		Assert.assertEquals(true,print);
	}
	
	@Then("user checks for the print pop up after clicking print icon")
	public void user_checks_for_the_print_popup_after_clicking_print_icon() throws InterruptedException, AWTException {
		commonPage.printiconclose();
	}
	
	@Then("user checks for the presence of feedback icon")
	public void user_checks_for_the_presence_of_feedback_icon() throws InterruptedException {
	    boolean feedbackEnabled = commonPage.feedbackicon();
	    Assert.assertTrue(feedbackEnabled);
	}

	@When("start {string}")
	public void initDB(String tcNo) {
		commonPage.startScenario(tcNo, browserName,url);
	}

	@And("end {string}")
	public void updateScenarioStatus(String tcNo) {
		commonPage.endScenario(tcNo, browserName,url);
	}
	
	@Then("the user click on the back browser button")
	public void the_user_clicks_browser_back_button() throws InterruptedException {
		commonPage.navigateBack();
	}
}
