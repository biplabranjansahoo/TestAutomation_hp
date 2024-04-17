package com.hp.qa.pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hp.qa.util.ElementUtils;
import com.hp.qa.util.JavaScriptUtils;

public class ContactChatFormPage {

	private WebDriver driver;
	private By chatFormTitle = By.xpath("//div[@id='contact-form']//h1");
	private By userName = By.xpath("//div[@class='user-name form-row']");
	private By eMail = By.xpath("//div[@class='user-email form-row']");
	private By phoneNum = By.xpath("//input[@id='phone-number']");
	private By alternateEmail = By.xpath("//input[@id='alt-email']");
	private By issueDiscriptionTitle = By.xpath("//h2[@class='form-heading']//label");
	private By osDropdown = By.xpath("//button[@id='osdetails']");
	private By issueErrorCode = By.xpath("//input[@id='issue-error-code']");
	private By caseID = By.xpath("//input[@id='case-id']");
	private By additionalDescription = By.xpath("//textarea[@id='issue-desc']");
	private By privacyLink = By.xpath("//a[@id='Privacy Policy']");
	private By submitBtn = By.xpath("//button[@id='Omnichat-form-submit']");
	private By backToContactOptions = By.xpath("//a[@id='ContactOptions']");
	private By dropDownListItem = By.xpath("//button[@id='MAC_OS']");
	
	

	public ContactChatFormPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean isTitleVisible() throws InterruptedException {
	    ElementUtils.expliciteWait(driver, chatFormTitle);
	    JavaScriptUtils.highLightElement(driver, driver.findElement(chatFormTitle));
	    System.out.println("Pass: Title of the chat form page should be visible");
	    return true;
	}

	public boolean isNameInputFieldVisible() throws InterruptedException {
	    ElementUtils.expliciteWait(driver, userName);
	    JavaScriptUtils.highLightElement(driver, driver.findElement(userName));
	    System.out.println("Pass: The name should be visible");
	    return true;
	}

	public boolean isEmailInputFieldVisible() throws InterruptedException {
	    ElementUtils.expliciteWait(driver, eMail);
	    JavaScriptUtils.highLightElement(driver, driver.findElement(eMail));
	    System.out.println("Pass: The email should be visible");
	    return true;
	}

	public boolean isPhoneNumberInputFieldVisible() throws InterruptedException {
	    ElementUtils.expliciteWait(driver, phoneNum);
	    JavaScriptUtils.highLightElement(driver, driver.findElement(phoneNum));
	    System.out.println("Pass: The phone number input field should be visible");
	    return true;
	}

	public boolean enterPhoneNumber() {
	    ElementUtils.expliciteWait(driver, phoneNum);
	    JavaScriptUtils.highLightElement(driver, driver.findElement(phoneNum));
	    driver.findElement(phoneNum).sendKeys("1234567890");
	    System.out.println("Pass: Phone number entered successfully");
	    return true;
	}
    
    public boolean isAlternateEmailInputFieldVisible() {
        ElementUtils.expliciteWait(driver, alternateEmail);
        JavaScriptUtils.highLightElement(driver, driver.findElement(alternateEmail));
        System.out.println("Pass: The alternate email input field should be visible");
        return true;
    }

    public boolean enterAlternateEmail() {
        ElementUtils.expliciteWait(driver, alternateEmail);
        JavaScriptUtils.highLightElement(driver, driver.findElement(alternateEmail));
        driver.findElement(alternateEmail).sendKeys("xyz@gmail.com");
        System.out.println("Pass: Alternate email entered successfully");
        return true;
    }

    public boolean isIssueDescriptionTitleVisible() {
        ElementUtils.expliciteWait(driver, issueDiscriptionTitle);
        JavaScriptUtils.highLightElement(driver, driver.findElement(issueDiscriptionTitle));
        String discriptionTxt = driver.findElement(issueDiscriptionTitle).getText();
        System.out.println("Pass: The issue description title should be visible" + discriptionTxt);
        return true;
    }

    public boolean isOsDropdownVisible() {
        ElementUtils.expliciteWait(driver, osDropdown);
        JavaScriptUtils.scrollInToView(driver, driver.findElement(osDropdown));
        JavaScriptUtils.highLightElement(driver, driver.findElement(osDropdown));
        System.out.println("Pass: The OS dropdown should be visible");
        return true;
    }

    public boolean getOsDropdownOptions() {
        ElementUtils.expliciteWait(driver, osDropdown);
        JavaScriptUtils.scrollInToView(driver, driver.findElement(osDropdown));
        JavaScriptUtils.highLightElement(driver, driver.findElement(osDropdown));
        driver.findElement(osDropdown).click();
        ElementUtils.expliciteWait(driver, dropDownListItem);
        JavaScriptUtils.highLightElement(driver, driver.findElement(dropDownListItem));
        driver.findElement(dropDownListItem).click();        
        System.out.println("Pass: OS dropdown options retrieved successfully");
        return true;
    }

    public boolean isErrorCodeInputFieldVisible() {
        ElementUtils.expliciteWait(driver, issueErrorCode);
        JavaScriptUtils.highLightElement(driver, driver.findElement(issueErrorCode));
        System.out.println("Pass: The error code input field should be visible");
        return true;
    }

    public boolean isCaseIdInputFieldVisible() {
        ElementUtils.expliciteWait(driver, caseID);
        JavaScriptUtils.highLightElement(driver, driver.findElement(caseID));
        System.out.println("Pass: The case ID input field should be visible");
        return true;
    }

    public boolean isAdditionalDescriptionInputFieldVisible() {
        ElementUtils.expliciteWait(driver, additionalDescription);
        JavaScriptUtils.highLightElement(driver, driver.findElement(additionalDescription));
        System.out.println("Pass: The additional description input field should be visible");
        return true;
    }

    public boolean enterAdditionalDescription() {
        ElementUtils.expliciteWait(driver, additionalDescription);
        JavaScriptUtils.highLightElement(driver, driver.findElement(additionalDescription));
        driver.findElement(additionalDescription).sendKeys("Testing");
        System.out.println("Pass: Additional description entered successfully");
        return true;
    }

    public boolean isPrivacyPolicyLinkVisible() {
        ElementUtils.expliciteWait(driver, privacyLink);
        JavaScriptUtils.highLightElement(driver, driver.findElement(privacyLink));
        String linkTxt = driver.findElement(privacyLink).getText();
        System.out.println("Pass: The privacy policy link should be visible" + linkTxt);
        return true;
    }
  
    public boolean isPrivacyPolicyPageLoaded(String expectedTitle) throws InterruptedException {

        String parentWindowHandle = driver.getWindowHandle();
	    ElementUtils.expliciteWait(driver, privacyLink);
	    JavaScriptUtils.scrollInToView(driver, driver.findElement(privacyLink));
	    JavaScriptUtils.highLightElement(driver, driver.findElement(privacyLink));
	    JavaScriptUtils.clickElementByJS(driver, driver.findElement(privacyLink));
	    Set<String> windowHandles = driver.getWindowHandles();
	    for (String windowHandle : windowHandles) {
	        if (!windowHandle.equals(parentWindowHandle)) {
	            driver.switchTo().window(windowHandle);
	            String actualTitle = driver.getTitle();
	            ElementUtils.sleep();
	            driver.switchTo().window(parentWindowHandle);
	            if (actualTitle.equals(expectedTitle)) {
	                return true;
	            } else {
	                return false;
	            }}}
	    return false;
	}


    public boolean isSubmitButtonVisible() {
        ElementUtils.expliciteWait(driver, submitBtn);
        JavaScriptUtils.scrollInToView(driver, driver.findElement(submitBtn));
        JavaScriptUtils.highLightElement(driver, driver.findElement(submitBtn));
        System.out.println("Pass: The submit button should be visible");
        return true;
    }

    public boolean isBackToContactOptionsVisible() {
        ElementUtils.expliciteWait(driver, backToContactOptions);
        JavaScriptUtils.highLightElement(driver, driver.findElement(backToContactOptions));
        String contactOptionsTxt = driver.findElement(backToContactOptions).getText();
        System.out.println("Pass: The 'Back to Contact Options' link should be visible" + contactOptionsTxt);
        return true;
    }

    public boolean clickBackToContactOptions(String expectedTitle) throws InterruptedException {
        ElementUtils.expliciteWait(driver, backToContactOptions);
        JavaScriptUtils.highLightElement(driver, driver.findElement(backToContactOptions));
        JavaScriptUtils.clickElementByJS(driver, driver.findElement(backToContactOptions));
        ElementUtils.sleep();
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Pass: Clicked 'Back to Contact Options' and landed on expected page");
            return true;
        } else {
            System.out.println("Fail: Clicked 'Back to Contact Options' but did not land on expected page");
            return false;
        }
    }
}