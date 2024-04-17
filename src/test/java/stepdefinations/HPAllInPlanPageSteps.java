package stepdefinations;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Properties;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import com.hp.qa.factory.DriverFactory;
import com.hp.qa.pages.CommonPage;
import com.hp.qa.pages.HPAllInPage;
import com.hp.qa.util.ConfigReader;
import com.hp.qa.util.DbUtils;
import com.hp.qa.util.ElementUtils;
import apphooks.ApplicationHooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HPAllInPlanPageSteps {
	
	public WebDriver driver;
	private CommonPage commonPage = new CommonPage(DriverFactory.getDriver());
	private ConfigReader configReader;
	Properties prop;
	public Properties projectProp;
	String url;
	private static String title;
	public HPAllInPage hp;
	DbUtils util = new DbUtils();

	public HPAllInPlanPageSteps() throws IOException {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
		projectProp = new Properties();
		projectProp.load(ApplicationHooks.class.getClassLoader().getResourceAsStream("project.properties"));
		url=projectProp.getProperty("webbaseurl");
		this.driver= DriverFactory.getDriver();
		this.hp=new HPAllInPage(driver);
	}

	@Given("the user is on the HPAllinPlan landing page")
	public void the_user_is_on_the_HP_all_in_plan_landing_page() {
		DriverFactory.getDriver().get(url +prop.getProperty("pageurl"));
		System.out.println("Navigated to HP All In Plan Page");
	}

	@Then("the user checks for the browser tab title")
	public void the_user_checks_for_the_title_of_the_page() throws InterruptedException {
		title = commonPage.getTabTitle();
		Assert.assertEquals(title,prop.getProperty("pagetitle"));
	}

	@Then("the user checks for the herosection")
	public void the_user_checks_for_the_hero_section() {
		//commonPage.verifyElementAvailability(driver, hp.heroSection);
		Assert.assertTrue(commonPage.verifyElementAvailability(driver,hp.heroSection));

	}

	@Then("the user checks for the title and subtitle in the hero section")
	public void the_user_checks_for_the_title_and_subtitle_in_the_hero_section() {

		Assert.assertTrue(commonPage.verifyEleValue(driver,hp.heading, prop.getProperty("heading")));
		Assert.assertTrue(commonPage.verifyEleValue(driver,hp.subHeading, prop.getProperty("subHeading")));

	}

	@Then("the user checks for the text and link")
	public void the_user_checks_for_the_text_and_link_under_the_hero_section() throws InterruptedException {

		Assert.assertTrue(commonPage.verifyEleValue(driver,hp.heroText, prop.getProperty("heroText")));
		Assert.assertTrue(commonPage.verifyElementAvailability(driver, hp.heroLink));
		//Assert.assertTrue(commonPage.verifyHyperlink(driver,hp.heroLink, prop.getProperty("heroLink")));

	}

	@And("the user perform checks for the image in the hero section")
	public void the_user_checks_for_the_image_in_the_hero_section_availability() {
		Assert.assertTrue(commonPage.verifyElementAvailability(driver,hp.heroImage));

	}

	@Then("the user checks for the support categories section")
	public void the_user_checks_for_the_support_categories_section() {

		Assert.assertTrue(commonPage.verifyElementAvailability(driver,hp.supportCatSection));
		Assert.assertTrue(commonPage.verifyEleValue(driver,hp.supportCatHeading, prop.getProperty("supportCatHeading")));

	}

	@Then("the user perform checks for the support articles by topic section")
	public void the_user_checks_for_the_support_articles_by_topic_section_availability() {
		Assert.assertTrue(commonPage.verifyElementAvailability(driver,hp.supportArticleSection));
		Assert.assertTrue(commonPage.verifyEleValue(driver,hp.supportArticleHeading, prop.getProperty("supportArticlesHeading")));
	}

	@Then("the user perform checks for the Additonal support section")
	public void the_user_checks_for_the_additonal_support_section_availability() {
		Assert.assertTrue(commonPage.verifyElementAvailability(driver,hp.addSupportSection));
		Assert.assertTrue(commonPage.verifyEleValue(driver,hp.addSupportHeading, prop.getProperty("additionalSupportHeading")));
	}

	@Then("the user perform checks for the knowledgesearch section")
	public void the_user_checks_for_the_knowledge_search_section_availability() {
		Assert.assertTrue(commonPage.verifyElementAvailability(driver,hp.searchSection));
		Assert.assertTrue(commonPage.verifyEleValue(driver,hp.searchSectionHeading, prop.getProperty("searchHeading")));

	}
	@Then("the user checks for the tiles")
	public void the_user_checks_for_the_tiles_availability() {
		Assert.assertTrue(commonPage.verifyElementAvailability(driver,hp.threeTiles));
	}

	@Given("the user checks for the Your All in Plan tile title")
	public void the_user_checks_for_the_your_all_in_plan_tile_title() {
		
		Assert.assertTrue(commonPage.verifyElementAvailability(driver,hp.firstTile));
		Assert.assertTrue(commonPage.verifyEleValue(driver,hp.firstTileTitle, prop.getProperty("firstTileTitle")));
	}

	@Then("the user clicks on the Your All in Plan tile under support Category")
	public void the_user_clicks_on_the_your_all_in_plan_tile_under_support_category() throws InterruptedException {
			hp.firstTile.click();
			ElementUtils.sleep();
			Assert.assertTrue(commonPage.verifyElementAvailability(driver,hp.firstTileArrow));
			System.out.println("Your All In plan tile Arrow is shownig up as expected");
	}

	@Then("the user checks for the three sections under Your all in Plan tile")
	public void the_user_checks_for_the_three_sections_under_your_all_in_plan_tile() {
		Assert.assertTrue(commonPage.verifyElementAvailability(driver,hp.tileFirstCard));
		Assert.assertTrue(commonPage.verifyElementAvailability(driver,hp.tileSecondCard));
		Assert.assertTrue(commonPage.verifyElementAvailability(driver,hp.tileThirdCard));
	}

	@Then("the user checks for the Manage box title and content")
	public void the_user_checks_for_the_manage_box() {
		Assert.assertTrue(commonPage.verifyEleValue(driver,hp.tileFirstCardTitle, prop.getProperty("firstTileFirstCardTitle")));
		Assert.assertTrue(commonPage.verifyElementAvailability(driver,hp.tileFirstCardContent));
	}

	@And("the user checks for the Manage Box CTA button link")
	public void the_user_checks_for_the_manage_box_title_and_cta_button_link() throws InterruptedException {
		
		Assert.assertTrue(commonPage.verifyEleValue(driver,hp.firstTileFirstCardBtn, prop.getProperty("firstTileFirstCardBtnText")));
		Assert.assertTrue(commonPage.verifyHyperlink(driver,hp.firstTileFirstCardBtn, prop.getProperty("firstTileFirstCardBtnurl")));
		
	}

	@Then("the user checks for the Change box title and content")
	public void the_user_checks_for_the_change_box() {
		Assert.assertTrue(commonPage.verifyEleValue(driver,hp.tileSecondCardTitle, prop.getProperty("firstTileSecondCardTitle")));
		Assert.assertTrue(commonPage.verifyElementAvailability(driver,hp.tileSecondCardContent));
		

	}

	@And("the user checks for the Change Box CTA button link")
	public void the_user_checks_for_the_change_box_title_and_cta_button_link() throws InterruptedException {
		Assert.assertTrue(commonPage.verifyEleValue(driver,hp.firstTileSecondCardBtn, prop.getProperty("firstTileSecondCardBtnText")));
		Assert.assertTrue(commonPage.verifyHyperlink(driver,hp.firstTileSecondCardBtn, prop.getProperty("firstTileSecondCardBtnurl")));
			}

	@Then("the user checks for the Get box title and content")
	public void the_user_checks_for_the_get_box() {
		
		Assert.assertTrue(commonPage.verifyEleValue(driver,hp.tileThirdCardTitle, prop.getProperty("firstTileThirdCardTitle")));
		Assert.assertTrue(commonPage.verifyElementAvailability(driver,hp.tileThirdCardContent));
		
	}

	@And("the user checks for the Get Box CTA button link")
	public void the_user_checks_for_the_get_box_title_and_cta_button_link() throws InterruptedException {
		Assert.assertTrue(commonPage.verifyEleValue(driver,hp.firstTileThirdCardBtn, prop.getProperty("firstTileThirdCardBtnText")));
		Assert.assertTrue(commonPage.verifyHyperlink(driver,hp.firstTileThirdCardBtn, prop.getProperty("firstTileThirdCardBtnurl")));
		
	}

	@Given("the user checks for the Your Ink tile title")
	public void the_user_checks_for_the_your_ink_tile_title() {
		Assert.assertTrue(commonPage.verifyElementAvailability(driver,hp.secondTile));
		Assert.assertTrue(commonPage.verifyEleValue(driver,hp.secondTileTitle, prop.getProperty("secondTileTitle")));
		
	}

	@Then("the user clicks on the Your Ink tile under support Category")
	public void the_user_clicks_on_the_your_ink_tile_under_support_category() throws InterruptedException {
			hp.secondTile.click();
			ElementUtils.sleep();
			Assert.assertTrue(commonPage.verifyElementAvailability(driver,hp.secondTileArrow));
			System.out.println("Your Ink tile Arrow is shownig up as expected");
		

	}

	@And("the user checks for the three sections under Your Ink tile")
	public void the_user_checks_for_the_three_sections_under_your_ink_tile() throws InterruptedException {
			hp.secondTile.click();
			ElementUtils.sleep();
			Assert.assertTrue(commonPage.verifyElementAvailability(driver,hp.tileFirstCard));
			Assert.assertTrue(commonPage.verifyElementAvailability(driver,hp.tileSecondCard));
			Assert.assertTrue(commonPage.verifyElementAvailability(driver,hp.tileThirdCard));
	}

	@Then("the user checks for the Shipping box title and content")
	public void the_user_checks_for_the_shipping_box() {
		Assert.assertTrue(commonPage.verifyEleValue(driver,hp.tileFirstCardTitle, prop.getProperty("secondTileFirstCardTitle")));
		Assert.assertTrue(commonPage.verifyElementAvailability(driver,hp.tileFirstCardContent));
	}

	@And("the user checks for the Shipping Box CTA button link")
	public void the_user_checks_for_the_shipping_box_title_and_cta_button_link() throws InterruptedException {
		
		Assert.assertTrue(commonPage.verifyEleValue(driver,hp.secondTileFirstCardBtn, prop.getProperty("secondTileFirstCardBtnText")));
		Assert.assertTrue(commonPage.verifyHyperlink(driver,hp.secondTileFirstCardBtn, prop.getProperty("secondTileFirstCardBtnurl")));
		
	}

	@Then("the user checks for the Why box title and content")
	public void the_user_checks_for_the_why_box() throws InterruptedException {
		
		Assert.assertTrue(commonPage.verifyEleValue(driver,hp.tileSecondCardTitle, prop.getProperty("secondTileSecondCardTitle")));
		Assert.assertTrue(commonPage.verifyElementAvailability(driver,hp.tileSecondCardContent));
		Assert.assertTrue(commonPage.verifyHyperlink(driver,hp.videoLink, prop.getProperty("videourl")));
			}

	@And("the user checks for the Why Box CTA button link")
	public void the_user_checks_for_the_why_box_title_and_cta_button_link() throws InterruptedException {
		Assert.assertTrue(commonPage.verifyEleValue(driver,hp.secondTileSecondCardBtn, prop.getProperty("secondTileSecondCardBtnText")));
		Assert.assertTrue(commonPage.verifyHyperlink(driver,hp.secondTileSecondCardBtn, prop.getProperty("secondTileSecondCardBtnurl")));
	
	}

	@Then("the user checks for the Related Topics box title")
	public void the_user_checks_for_the_related_topics_box() {
		Assert.assertTrue(commonPage.verifyEleValue(driver,hp.relatedTopicsCard, prop.getProperty("secondTileThirdCardTitle")));
	}

	@And("the user checks for the Related Topics links")
	public void the_user_checks_for_the_related_topics_links() throws InterruptedException {
		Assert.assertTrue(commonPage.verifyEleValue(driver,hp.relatedLinkOne, prop.getProperty("relatedLinkFirstTitle")));
		Assert.assertTrue(commonPage.verifyHyperlink(driver,hp.relatedLinkOne, prop.getProperty("relatedLinkFirsturl")));
		
		Assert.assertTrue(commonPage.verifyEleValue(driver,hp.relatedLinkTwo, prop.getProperty("relatedLinkSecondTitle")));
		Assert.assertTrue(commonPage.verifyHyperlink(driver,hp.relatedLinkTwo, prop.getProperty("relatedLinkSecondurl")));
		
		//Assert.assertTrue(commonPage.verifyEleValue(hp.relatedLinkThree, prop.getProperty("relatedLinkThirdTitle")));
		Assert.assertTrue(commonPage.verifyHyperlink(driver,hp.relatedLinkThree, prop.getProperty("relatedLinkThirdurl")));
		
	}

	@Given("the user checks for the Your Printer tile title")
	public void the_user_checks_for_the_your_printer_tile_title() {
		
		Assert.assertTrue(commonPage.verifyElementAvailability(driver,hp.thirdTile));
		Assert.assertTrue(commonPage.verifyEleValue(driver,hp.thirdTileTitle, prop.getProperty("thirdTileTitle")));
		
	}

	@Then("the user clicks on the Your Printer tile under support Category")
	public void the_user_clicks_on_the_your_printer_tile_under_support_category() throws InterruptedException {
			hp.thirdTile.click();
			ElementUtils.sleep();
			Assert.assertTrue(commonPage.verifyElementAvailability(driver,hp.thirdTileArrow));
			System.out.println("Your Printer tile Arrow is shownig up as expected");
			}

	@And("the user checks for the three sections under Your Printer tile")
	public void the_user_checks_for_the_three_sections_under_your_printer_tile() {
			hp.thirdTile.click();
			Assert.assertTrue(commonPage.verifyElementAvailability(driver,hp.tileFirstCard));
			Assert.assertTrue(commonPage.verifyElementAvailability(driver,hp.tileSecondCard));
			Assert.assertTrue(commonPage.verifyElementAvailability(driver,hp.thirdTileThirdCard));
	}

	@Then("the user checks for the Setup box title and content")
	public void the_user_checks_for_the_setup_box() {
		Assert.assertTrue(commonPage.verifyEleValue(driver,hp.tileFirstCardTitle, prop.getProperty("thirdTileFirstCardTitle")));
		Assert.assertTrue(commonPage.verifyElementAvailability(driver,hp.tileFirstCardContent));
		}

	@And("the user checks for the Setup Box CTA button link")
	public void the_user_checks_for_the_setup_box_title_and_cta_button_link() throws InterruptedException {
		Assert.assertTrue(commonPage.verifyEleValue(driver,hp.thirdTileFirstCardBtn, prop.getProperty("thirdTileFirstCardBtnText")));
		Assert.assertTrue(commonPage.verifyHyperlink(driver,hp.thirdTileFirstCardBtn, prop.getProperty("thirdTileFirstCardBtnurl")));
		
	}

	@Then("the user checks for the Connect box title and content")
	public void the_user_checks_for_the_connect_box() {
		Assert.assertTrue(commonPage.verifyEleValue(driver,hp.tileSecondCardTitle, prop.getProperty("thirdTileSecondCardTitle")));
		Assert.assertTrue(commonPage.verifyElementAvailability(driver,hp.tileSecondCardContent));
			}

	
	@Then("the user checks for the link in the connect box")
	public void the_user_checks_for_the_link_in_the_connect_box() throws InterruptedException {
		Assert.assertTrue(commonPage.verifyEleValue(driver,hp.connectBoxLink, prop.getProperty("connectBoxLinkText")));
		Assert.assertTrue(commonPage.verifyHyperlink(driver,hp.connectBoxLink, prop.getProperty("connectBoxLink")));
	}


	@Then("the user checks for the About box title and content")
	public void the_user_checks_for_the_about_box() {
		
		Assert.assertTrue(commonPage.verifyEleValue(driver,hp.thirdtileThirdCardTitle, prop.getProperty("thirdTileThirdCardTitle")));
		Assert.assertTrue(commonPage.verifyElementAvailability(driver,hp.thirdtileThirdCardContent));

	}

	@Then("the user checks for the links in the About box")
	public void the_user_checks_for_the_links_in_the_about_box() throws InterruptedException {
		
		Assert.assertTrue(commonPage.verifyEleValue(driver,hp.aboutBoxLinkOne, prop.getProperty("aboutBoxLinkOneText")));
		Assert.assertTrue(commonPage.verifyHyperlink(driver,hp.aboutBoxLinkOne, prop.getProperty("aboutBoxLinkOne")));
		
		Assert.assertTrue(commonPage.verifyEleValue(driver,hp.aboutBoxLinkTwo, prop.getProperty("aboutBoxLinkTwoText")));
		Assert.assertTrue(commonPage.verifyHyperlink(driver,hp.aboutBoxLinkTwo, prop.getProperty("aboutBoxLinkTwo")));
		
		Assert.assertTrue(commonPage.verifyEleValue(driver,hp.aboutBoxLinkThree, prop.getProperty("aboutBoxLinkThreeText")));
		Assert.assertTrue(commonPage.verifyHyperlink(driver,hp.aboutBoxLinkThree, prop.getProperty("aboutBoxLinkThree")));
			
	}

	@And("the user checks for the About Box CTA button link")
	public void the_user_checks_for_the_about_box_title_and_cta_button_link() throws InterruptedException {
		Assert.assertTrue(commonPage.verifyEleValue(driver,hp.thirdTileThirdCardBtn, prop.getProperty("thirdTileThirdCardBtnText")));
		Assert.assertTrue(commonPage.verifyHyperlink(driver,hp.thirdTileThirdCardBtn, prop.getProperty("thirdTileThirdCardBtnurl")));

	}

	@Then("the user checks for the support articles content")
	public void the_user_checks_for_the_support_articles_content_availability() {
		//Assert.assertTrue(commonPage.verifyEleValue(driver,hp.supportArticleNoContent, prop.getProperty("supportArticleNoContentMsg")));
		hp.verifySearchSectionContent(prop.getProperty("supportArticleNoContentMsg"));
	}

	@Then("the user checks for the viewmore link availablity")
	public void the_user_checks_for_the_viewmore_link_availablity() throws InterruptedException {

		hp.verifyArticleList(prop.getProperty("viewmorelink"));
	}

	@Then("the user clicks on any of the Hyperlink")
	public void the_user_clicks_on_any_of_the_hyperlink() throws InterruptedException {
		Assert.assertTrue(commonPage.verifyHyperlink(driver,hp.articleFirstLink, prop.getProperty("articleFirstLinkText")));
	}

	@Then("the user perform checks for the two sections under additional support section")
	public void the_user_checks_for_the_two_sections_under_additional_support_section() {
		Assert.assertTrue(commonPage.verifyElementAvailability(driver,hp.addSupportTwoSections));
	}

	@When("the user checks for the title of ContactHP Support tile")
	public void the_user_checks_for_the_title_of_contact_hp_support_tile() {
		Assert.assertTrue(commonPage.verifyElementAvailability(driver,hp.contactSupportTitle));
	}

	@Then("the user checks for the Contact Support Icon")
	public void the_user_checks_for_the_contact_support_icon() {
		Assert.assertTrue(commonPage.verifyElementAvailability(driver,hp.contactIcon));

	}

	@Then("the user checks for the ContactSupport description and arrow")
	public void the_user_checks_for_the_contact_support_description_and_arrow() {
		Assert.assertTrue(commonPage.verifyElementAvailability(driver,hp.contactSupportDesc));
		Assert.assertTrue(commonPage.verifyElementAvailability(driver,hp.contactSupportArrowImg));
	}

	@Then("the user clicks on the Contact Support Tile")
	public void the_user_clicks_on_the_contact_support_tile() throws InterruptedException {
		
		Assert.assertTrue(commonPage.verifyHyperlink(driver,hp.contactSupportLink, prop.getProperty("contactHPSupport")));
	}

	@When("the user checks for the title of Use VirtualAssistant tile")
	public void the_user_checks_for_the_title_of_use_virtual_assistant_tile() {
		Assert.assertTrue(commonPage.verifyElementAvailability(driver,hp.vATitle));
	}

	@Then("the user checks for the Virtual Assistant Icon")
	public void the_user_checks_for_the_virtual_assistant_icon() {
		Assert.assertTrue(commonPage.verifyElementAvailability(driver,hp.vAIcon));

	}

	@Then("the user checks for the VirtualAssistant description and arrow")
	public void the_user_checks_for_the_virtual_assistant_description_and_arrow() {
		Assert.assertTrue(commonPage.verifyElementAvailability(driver,hp.vADesc));
		Assert.assertTrue(commonPage.verifyElementAvailability(driver,hp.vAArrowImg));

	}

	@Then("the user clicks on the Use Virtual Assistant tile")
	public void the_user_clicks_on_the_use_virtual_assistant_tile() throws InterruptedException {
		Assert.assertTrue(commonPage.verifyHyperlink(driver,hp.vALink, prop.getProperty("virtualAssLink")));
	}

	@Then("the user checks for the gray text in the search text field")
	public void the_user_checks_for_the_gray_text_in_the_search_text_field() {
		Assert.assertTrue(commonPage.verifyElementAvailability(driver,hp.searchGrayText));

	}
	
	@Then("the user perform search by passing the keyword")
	public void the_user_perform_search_by_passing_the_keyword() throws AWTException, InterruptedException {
		Assert.assertTrue(commonPage.verifySearchComp(driver,hp.searchTextField ,prop.getProperty("searchKeyword")));
		Assert.assertTrue(commonPage.verifyElementAvailability(driver,hp.searchResultsComp));
	}


	@When("the user checks for the country dropdown availablity for united states region")
	public void the_user_checks_for_the_country_dropdown_availablity_for_united_states_region() {
        String url = driver.getCurrentUrl();
        boolean isCLCVisible = hp.verifyCLC(url);
        Assert.assertEquals(true, isCLCVisible);
	}

}
