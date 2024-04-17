package stepdefinations;

import java.io.IOException;
import java.util.Properties;
import org.junit.Assert;
import com.hp.qa.factory.DriverFactory;
import com.hp.qa.pages.ContactChatFormPage;
import com.hp.qa.util.ConfigReader;
import com.hp.qa.util.DbUtils;

import apphooks.ApplicationHooks;
import io.cucumber.java.en.Then;


public class ContactChatFormSteps {

	private ContactChatFormPage chatFormPage =new ContactChatFormPage(DriverFactory.getDriver());
	private ConfigReader configReader;
	private String url;
	public Properties projectProp;
	Properties prop;
	DbUtils util = new DbUtils();
	

	public ContactChatFormSteps() throws IOException {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
		projectProp = new Properties();
		projectProp.load(ApplicationHooks.class.getClassLoader().getResourceAsStream("project.properties"));
		url=projectProp.getProperty("webbaseurl");	
	}	

	
	@Then("the title of the chat form page should be visible")
    public void chat_form_page_title_visible() throws InterruptedException {
        boolean isTitleVisible = chatFormPage.isTitleVisible();
        Assert.assertEquals(true, isTitleVisible);
    }

    @Then("the input field for entering the name should be visible")
    public void name_input_field_visible() throws InterruptedException {
        boolean isNameInputVisible = chatFormPage.isNameInputFieldVisible();
        Assert.assertEquals(true, isNameInputVisible);
    }

    @Then("the input field for entering the email address should be visible")
    public void email_input_field_visible() throws InterruptedException {
        boolean isEmailInputVisible = chatFormPage.isEmailInputFieldVisible();
        Assert.assertEquals(true, isEmailInputVisible);
    }

    @Then("the input field for entering the phone number should be visible")
    public void phone_number_input_field_visible() throws InterruptedException {
        boolean isPhoneNumberInputVisible = chatFormPage.isPhoneNumberInputFieldVisible();
        Assert.assertEquals(true, isPhoneNumberInputVisible);
    }

    @Then("the input field for entering the phone number should accept the phone number format")
    public void phone_number_format_accepted() {
        boolean isPhoneNumberFormatAccepted = chatFormPage.enterPhoneNumber();
        Assert.assertEquals(true, isPhoneNumberFormatAccepted);
    }

    @Then("the input field for entering the alternate email address should be visible")
    public void alternate_email_input_field_visible() {
        boolean isAlternateEmailInputVisible = chatFormPage.isAlternateEmailInputFieldVisible();
        Assert.assertEquals(true, isAlternateEmailInputVisible);
    }

    @Then("the input field for entering the alternate email address should accept the email format")
    public void alternate_email_format_accepted() {
        boolean isAlternateEmailFormatAccepted = chatFormPage.enterAlternateEmail();
        Assert.assertEquals(true, isAlternateEmailFormatAccepted);
    }

    @Then("the title or label for the issue description field should be visible")
    public void issue_description_title_visible() {
        boolean isIssueDescriptionTitleVisible = chatFormPage.isIssueDescriptionTitleVisible();
        Assert.assertEquals(true, isIssueDescriptionTitleVisible);
    }

    @Then("the dropdown menu for selecting the operating system in the issue description section should be visible")
    public void os_dropdown_visible() {
        boolean isOsDropdownVisible = chatFormPage.isOsDropdownVisible();
        Assert.assertEquals(true, isOsDropdownVisible);
    }

    @Then("the dropdown menu for selecting the operating system should display available options")
    public void os_dropdown_options_available() {
        boolean areOsDropdownOptionsAvailable = chatFormPage.getOsDropdownOptions();
        Assert.assertEquals(true, areOsDropdownOptionsAvailable);
    }

    @Then("the input field for entering an error code in the issue description section should be visible")
    public void error_code_input_field_visible() {
        boolean isErrorCodeInputVisible = chatFormPage.isErrorCodeInputFieldVisible();
        Assert.assertEquals(true, isErrorCodeInputVisible);
    }

    @Then("the input field for entering a case ID in the issue description section should be visible")
    public void case_id_input_field_visible() {
        boolean isCaseIdInputVisible = chatFormPage.isCaseIdInputFieldVisible();
        Assert.assertEquals(true, isCaseIdInputVisible);
    }

    @Then("the input field for entering additional details or description of the issue should be visible")
    public void additional_description_input_field_visible() {
        boolean isAdditionalDescriptionInputVisible = chatFormPage.isAdditionalDescriptionInputFieldVisible();
        Assert.assertEquals(true, isAdditionalDescriptionInputVisible);
    }

    @Then("the input field for entering additional description should accept text input")
    public void additional_description_accepts_text_input() {
        boolean doesAdditionalDescriptionAcceptText = chatFormPage.enterAdditionalDescription();
        Assert.assertEquals(true, doesAdditionalDescriptionAcceptText);
    }

    @Then("the privacy policy link should be visible")
    public void privacy_policy_link_visible() {
        boolean isPrivacyPolicyLinkVisible = chatFormPage.isPrivacyPolicyLinkVisible();
        Assert.assertEquals(true, isPrivacyPolicyLinkVisible);
    }

    @Then("clicking on the privacy policy link should redirect to the privacy policy page")
    public void clicking_privacy_policy_redirects_to_privacy_policy_page() throws InterruptedException {
        boolean isPrivacyPolicyPageLoaded = chatFormPage.isPrivacyPolicyPageLoaded(prop.getProperty("PrivacyPageTitle"));
        Assert.assertEquals(false, isPrivacyPolicyPageLoaded);
    }

    @Then("the submit button should be visible")
    public void submit_button_visible() {
        boolean isSubmitButtonVisible = chatFormPage.isSubmitButtonVisible();
        Assert.assertEquals(true, isSubmitButtonVisible);
    }

    @Then("the link to navigate back to contact options should be visible")
    public void back_to_contact_options_visible() {
        boolean isBackToContactOptionsVisible = chatFormPage.isBackToContactOptionsVisible();
        Assert.assertEquals(true, isBackToContactOptionsVisible);
    }	
	

    @Then("click on back to contact options link navigate back to contact options page")
    public void clicking_back_to_contact_options_navigates_back_to_contact_options_page() throws InterruptedException {
        boolean isBackToContactOptionsNavigated = chatFormPage.clickBackToContactOptions(prop.getProperty("ContactOptionTitle"));
        Assert.assertEquals(true, isBackToContactOptionsNavigated);
    }
}