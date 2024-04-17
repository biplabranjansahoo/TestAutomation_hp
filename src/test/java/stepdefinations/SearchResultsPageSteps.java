package stepdefinations;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.hp.qa.factory.DriverFactory;
import com.hp.qa.pages.CommonPage;
import com.hp.qa.pages.SearchResultPage;
import com.hp.qa.pages.SupportHome;
import com.hp.qa.util.ConfigReader;
import com.hp.qa.util.DbUtils;
import com.hp.qa.util.ElementUtils;
import com.hp.qa.util.JavaScriptUtils;

public class SearchResultsPageSteps {

	private SupportHome homePage = new SupportHome(DriverFactory.getDriver());
	private CommonPage commonPage = new CommonPage(DriverFactory.getDriver());
	private SearchResultPage searchResultPage = null;
	private ConfigReader configReader;
	Properties prop;
	DbUtils util = new DbUtils();
	public WebDriver driver;
	String searchKey = null;
	String excelPath = System.getProperty("user.dir") + "\\TestData.xlsx";
	
	
	public SearchResultsPageSteps() {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
		this.driver= DriverFactory.getDriver();
		homePage = new SupportHome(driver);
		searchResultPage=new SearchResultPage();
	}

	@When("user searches for {string} in OneboxSearch")
	public void user_searches_for_keyword_in_OneboxSearch(String keyword) {
	  
		homePage.SiteHomeOneBoxSearch(keyword);
	}
	
	@Then("the user will be able to see the Recommended Solutions is present")
	public void user_will_see_recommended_solution() throws InterruptedException {
		boolean validateReccommendedSolution= searchResultPage.validateReccommendedSolution(driver);	
		Assert.assertEquals(validateReccommendedSolution,true);
	}
	
	@Then("user checks browser tab title of search result page")
	public void validate_page_title() throws InterruptedException {
		String title= commonPage.getTabTitle();
		Assert.assertEquals(title,prop.getProperty("searchPageTitle"));
	}
	
	@When("user searches for device serial number {string} in OneboxSearch")
	public void searchSN(String keyword) {
		homePage.OneBoxSearchField(prop.getProperty("serialNum"));
	}

	@Then("validate in searchResult page the keyword is present")
	public void validate_in_search_result_page_the_keyword_is_present() throws InterruptedException {
		List<WebElement> titleElement= searchResultPage.validateSearchResultPageKeyword(driver);
		for(WebElement element : titleElement) {
	    	JavaScriptUtils.highLightElement(driver,element);
	    	Assert.assertTrue(element.getText().toLowerCase().contains(prop.getProperty("searchKey")));
	    }
	}
	
	@Then("user is searching non-unique serial number")
	public void user_is_searching_non_unique_serial_number() throws InterruptedException {
		searchResultPage.searchNonUniqueSN(prop.getProperty("searchSN"), driver);
	}

	@Then("system will ask to enter product number")
	public void system_will_ask_to_enter_product_number() throws InterruptedException {
		//searchResultPage=new SearchResultPage(testContext.driver);
		ElementUtils.sleep();
	    searchResultPage.EnterPN(prop.getProperty("searchPN"), driver);
	}

	@Then("user will be navigated to corresponding PDP page")
	public void user_will_be_navigated_to_corresponding_pdp_page() throws InterruptedException {
		//searchResultPage=new SearchResultPage(testContext.driver);
		String actualTxt=searchResultPage.validatePDPWelcomePage(driver);
		Assert.assertEquals(actualTxt,prop.getProperty("pdppagetitle"));
	}

	
	@Then("the user will be able to see {string} string and video description")
	public void the_user_will_be_able_to_see_string(String string) throws InterruptedException {
		ElementUtils.sleep();
	    boolean actualValidateVideoText=searchResultPage.validateVideoText(driver);
	    Assert.assertEquals(actualValidateVideoText, true);
	    boolean validateVideoText=searchResultPage.validateCloseButton(driver);
	    Assert.assertEquals(validateVideoText, true);
	    boolean validateVideoDescription=searchResultPage.validateVideoDescription(driver, prop.getProperty("searchKey"));
	    Assert.assertEquals(validateVideoDescription, true);	
	}

	@Given("a user reaches the search results page")
	public void a_user_that_reaches_the_search_results_page() {
		driver.navigate().to(prop.getProperty("url") + prop.getProperty("searchQueryUrl"));
			System.out.println("Navigated to searchresult page");
	}
	
	@Then("the user will be able to see the Search bar with query the user searched for")
	public void the_user_will_be_able_to_see_the_search_bar_with_query_the_user_searched_for() throws InterruptedException {
		ElementUtils.sleep();
	   String currentURL=searchResultPage.validateURL(driver);
	   Assert.assertEquals(currentURL.contains("q="+prop.getProperty("searchKey")), true);
	}

	@Then("the user will be able to see the Content selector tab - \"Explore\" \"Shop\" \"Support\"")
	public void the_user_will_be_able_to_see_the_explore_shop_support_tabs() throws InterruptedException {
		ElementUtils.sleep();
	    List<String> expectedSupportTab = new ArrayList<String>();
	    expectedSupportTab.add("Explore");
	    expectedSupportTab.add("Shop");
	    expectedSupportTab.add("Support");
	    List<String> listSupportTab= searchResultPage.validateSupportTab(driver);
	    Assert.assertEquals(listSupportTab, expectedSupportTab);
	}

	@Then("the user will be able to see the Content selector tab - \"All\" \"Guides & Documents\" \"Videos\"")
	public void the_user_will_be_able_to_see_the_content_selector_tab() throws InterruptedException {
		ElementUtils.sleep();
	    List<String> expectedContentSelectorTab = new ArrayList<String>();
	    expectedContentSelectorTab.add("All");
	    expectedContentSelectorTab.add("Guides and Documents");
	    expectedContentSelectorTab.add("Videos");
	    List<String> actualContentSelectorTab=searchResultPage.validateContentSelectorTab(driver);
	    Assert.assertEquals(actualContentSelectorTab, expectedContentSelectorTab);
	}

	@Then("the user will be able to see the pagination element \\(if applicable) for document drilldown")
	public void the_user_will_be_able_to_see_the_pagination_element_if_applicable() throws InterruptedException {
	    searchResultPage.clickGuidesAndDocumentLink(driver);
	    boolean validateRightArrow=searchResultPage.validatePagination(driver);
	    Assert.assertEquals(validateRightArrow, true);
	    searchResultPage.clickVideosLink(driver);
	    searchResultPage.validatePagination(driver);  
	}

	@Then("the user will be able to see the Medallia survey")
	public void the_user_will_be_able_to_see_the_medallia_survey() throws InterruptedException {
	    boolean verifyMedaliaFeedback= searchResultPage.verifyMedalliaServey(driver);
	    Assert.assertEquals(verifyMedaliaFeedback,true);
	}

	@Then("the user will be able to see the help section")
	public void the_user_will_be_able_to_see_the_help_section() throws InterruptedException {
	    boolean helpSectionFlag= searchResultPage.verifyHelpSection(driver);
	    Assert.assertEquals(helpSectionFlag, true);
	}
}
