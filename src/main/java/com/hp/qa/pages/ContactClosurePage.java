package com.hp.qa.pages;


import java.awt.AWTException;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.hp.qa.factory.DriverFactory;
import com.hp.qa.util.ElementUtils;
import com.hp.qa.util.JavaScriptUtils;

public class ContactClosurePage {

	private WebDriver driver;
	private By submitBtn = By.xpath("//button[@id='Omnichat-form-submit']");
	private By chatHeading = By.xpath("//h3[@id='chat-heading']");
	private By attachmentBtn = By.xpath("//a[@id='attach-doc-btn']");
	private By saveBtn = By.xpath("//a[@id='save-btn']");
	private By printBtn = By.xpath("//a[@id='print-btn']");
	private By textBox = By.xpath("//div[@class='input-box']//textarea");
	private By sendBtn = By.xpath("//a[@id='send-btn']");
	private By chatText = By.xpath("//div[@class='customer-message message-ui']");
	private By closeBtn = By.xpath("//button[@id='MS-chat-close-btn']");
	private By goBackToChat = By.xpath("//button[@class='secondary-btn']");
	private By endChatTranscript = By.xpath("//div[@class='bottom-section']//button");
	private By endChatBtn = By.xpath("//div[@class='top-section']//button[@class='primary-button']");
	private By heading = By.xpath("//div[@class='summary-card-content']//h1");
	private By dashboardLink = By.xpath("//a[@id='Mydashboard']");
	private By dashboardPageTitle = By.xpath("//div[@class='col-lg-12 col-md-12 col-sm-12 col-12']//h1");
	private By serialNumCoulmn = By.xpath("//div[@class='td serial-number']//span");
	private By serialNum = By.xpath("//div[@class='td serial-number' and text()='EE08VY']");
	private By backToAllContact = By.xpath("//a[@id='ContactOptions']");
	private By allContactOptionsTitle = By.xpath("//div[@class='ng-tns-c125-0 ng-star-inserted']//h1");
	private By closureTitle = By.xpath("//div[@class='omni-chat-close-body']//h5");
	private By phoneNum = By.xpath("//input[@id='phone-number']");
	private By additionalDescription = By.xpath("//textarea[@id='issue-desc']");
	
	private CommonPage commonPage = new CommonPage(DriverFactory.getDriver());
	public ContactClosurePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean isSubmitBtnFunctional() throws InterruptedException {
	    ElementUtils.expliciteWait(driver, phoneNum);
	    JavaScriptUtils.scrollInToView(driver, driver.findElement(phoneNum));
	    JavaScriptUtils.highLightElement(driver, driver.findElement(phoneNum));
	    driver.findElement(phoneNum).sendKeys("1234567890");
	    ElementUtils.expliciteWait(driver, additionalDescription);
	    JavaScriptUtils.highLightElement(driver, driver.findElement(additionalDescription));
	    driver.findElement(additionalDescription).sendKeys("Testing");
	    ElementUtils.expliciteWait(driver, submitBtn);
	    JavaScriptUtils.highLightElement(driver, driver.findElement(submitBtn));
	    driver.findElement(submitBtn).click();
	    System.out.println("Pass: Title of the chat form page should be visible");
	    return true;
	} 
	
	public boolean isPopUpTitleAvailable(String expectedTitle) throws InterruptedException, AWTException {
		    ElementUtils.sleep();
	        ElementUtils.expliciteWait(driver, chatHeading);
	        JavaScriptUtils.highLightElement(driver, driver.findElement(chatHeading));
	        ElementUtils.sleep();
	        String actualTitle = driver.findElement(chatHeading).getText();
	        if (actualTitle.equals(expectedTitle)) {
	            System.out.println("Pass: Title is available");
	        } else {
	            System.out.println("Fail: Title is not available or does not match the expected title");
	        }
	        return true;
	    } 

	public boolean isTitleAvailable(String expectedTitle) throws InterruptedException, AWTException {
		
		Thread.sleep(7000);
		System.out.println("Medallia survey pop-up detected. Attempting to close...");
        boolean surveyPopUp = commonPage.closeMedalliaSurveyPopUp();
        System.out.println(surveyPopUp + " Medallia survey got handled");
	    ElementUtils.expliciteWait(driver, chatHeading);
	    JavaScriptUtils.highLightElement(driver, driver.findElement(chatHeading));
	    ElementUtils.expliciteWait(driver, attachmentBtn);
	    JavaScriptUtils.highLightElement(driver, driver.findElement(attachmentBtn));
	    ElementUtils.expliciteWait(driver, saveBtn);
	    JavaScriptUtils.highLightElement(driver, driver.findElement(saveBtn));
	    ElementUtils.expliciteWait(driver, printBtn);
	    JavaScriptUtils.highLightElement(driver, driver.findElement(printBtn));
	    ElementUtils.expliciteWait(driver, textBox);
	    JavaScriptUtils.highLightElement(driver, driver.findElement(textBox));
	    driver.findElement(textBox).sendKeys("Testing");
	    ElementUtils.expliciteWait(driver, sendBtn);
	    JavaScriptUtils.highLightElement(driver, driver.findElement(sendBtn));
	    driver.findElement(sendBtn).click();
	    ElementUtils.sleep();
	    ElementUtils.expliciteWait(driver, chatText);
	    JavaScriptUtils.scrollInToView(driver, driver.findElement(chatText));
	    JavaScriptUtils.highLightElement(driver, driver.findElement(chatText));
	    System.out.println("Pass: Title is available");
	    return true;
	}
		           
	public boolean isClosurePopUpFunctional() throws InterruptedException, AWTException {
		
	    ElementUtils.expliciteWait(driver, closeBtn);
	    JavaScriptUtils.highLightElement(driver, driver.findElement(closeBtn));
	    JavaScriptUtils.clickElementByJS(driver, driver.findElement(closeBtn));
	    ElementUtils.expliciteWait(driver, closureTitle);
	    JavaScriptUtils.highLightElement(driver, driver.findElement(closureTitle));
	    ElementUtils.expliciteWait(driver, goBackToChat);
	    JavaScriptUtils.highLightElement(driver, driver.findElement(goBackToChat));
	    ElementUtils.expliciteWait(driver, endChatTranscript);
	    JavaScriptUtils.highLightElement(driver, driver.findElement(endChatTranscript));
	    ElementUtils.expliciteWait(driver, endChatBtn);
	    JavaScriptUtils.highLightElement(driver, driver.findElement(endChatBtn));
	    JavaScriptUtils.clickElementByJS(driver, driver.findElement(endChatBtn));
	    System.out.println("Pass: Close button is functional");
	    return true;
		} 

	public boolean isGoToDashboardLinkAvailable() throws InterruptedException {
		
	    ElementUtils.expliciteWait(driver, heading);
	    JavaScriptUtils.highLightElement(driver, driver.findElement(heading));
	    ElementUtils.expliciteWait(driver, dashboardLink);
	    JavaScriptUtils.highLightElement(driver, driver.findElement(dashboardLink));
	    System.out.println("Pass: 'Go to dashboard' link is available");
	    return true;
	} 

	public boolean isGoToDashboardLinkFunctional(String expectedSerial) throws InterruptedException {
	    String parentWindowHandle = driver.getWindowHandle();
	    ElementUtils.expliciteWait(driver, dashboardLink);
	    JavaScriptUtils.highLightElement(driver, driver.findElement(dashboardLink));
	    JavaScriptUtils.clickElementByJS(driver, driver.findElement(dashboardLink));
	    Set<String> windowHandles = driver.getWindowHandles();
	    for (String windowHandle : windowHandles) {
	        if (!windowHandle.equals(parentWindowHandle)) {
	            driver.switchTo().window(windowHandle);
	            ElementUtils.expliciteWait(driver, dashboardPageTitle);
	            JavaScriptUtils.highLightElement(driver, driver.findElement(dashboardPageTitle));
	            ElementUtils.expliciteWait(driver, serialNumCoulmn);
	            JavaScriptUtils.scrollInToView(driver, driver.findElement(serialNumCoulmn));
	            JavaScriptUtils.highLightElement(driver, driver.findElement(serialNumCoulmn)); 
	            Thread.sleep(2000);
	            JavaScriptUtils.highLightElement(driver, driver.findElement(serialNum));
	    	    String actualSerialNum = driver.findElement(serialNum).getText();
	    	    if (actualSerialNum.equals(expectedSerial)) {
	    	        System.out.println("Pass: Serial number matched");
	    	        return true;
	    	    } else {
	    	        System.out.println("Fail: Serial number not matched");
	    	        return false;
	    	    }}
	            driver.switchTo().window(parentWindowHandle);
	            }
	    return true;
	}

	public boolean isBackToAllContactOptionsLinkAvailable() throws InterruptedException {
		ElementUtils.sleep();
	    ElementUtils.expliciteWait(driver, backToAllContact);
	    JavaScriptUtils.highLightElement(driver, driver.findElement(backToAllContact));
	    System.out.println("Pass: 'Go to dashboard' link is functional");
	    return true;
	} 


	public boolean isBackToAllContactOptionsLinkFunctional(String expectedTitle) throws InterruptedException {
		
	    ElementUtils.expliciteWait(driver, backToAllContact);
	    JavaScriptUtils.highLightElement(driver, driver.findElement(backToAllContact));
	    JavaScriptUtils.clickElementByJS(driver, driver.findElement(backToAllContact));
	    ElementUtils.sleep();
	    ElementUtils.expliciteWait(driver, allContactOptionsTitle);
	    JavaScriptUtils.highLightElement(driver, driver.findElement(allContactOptionsTitle));
	    String actualTitle = driver.findElement(allContactOptionsTitle).getText();
	    if (actualTitle.equals(expectedTitle)) {
	        System.out.println("Pass: 'Go to dashboard' link is functional");
	        return true;
	    } else {
	        System.out.println("Fail: 'Go to dashboard' link is functional but the title does not match the expected title");
	        return false;
	    }
	} 
}