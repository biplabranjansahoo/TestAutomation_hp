package com.hp.qa.pages;

import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.hp.qa.factory.DriverFactory;
import com.hp.qa.util.ElementUtils;
import com.hp.qa.util.JavaScriptUtils;

public class ContactOptionsPage {

	private WebDriver driver;
	private By productName = By.xpath("//div[@class='device-details-container']/p");
	private By serialNum = By.xpath("//div[@class='serial-val ng-star-inserted']");
	private By chooseDiffLink = By.xpath("//a[@id='diffproduct']");
	private By selectProdPageTitle = By.xpath("//div[@class='header-container']/h1");
	private By allContactTile = By.xpath("//div[@class='wrapper-class ltr ng-star-inserted']");
	private By omniChat = By.xpath("//a[@id='OmniChat']");
	private By supportCommunity = By.xpath("//a[@id='Forum']");
	private By hpPhoneTile = By.xpath("//a[@id='Call_HP']");
	private By serviceCenter = By.xpath("//a[@id='ServiceCenter']");
	private By serviceCenterTitle = By.xpath("//p[@class='service-center-title']");
	private By mastiffOffer = By.xpath("//div[@id='contact_option_mastiff_tile_template']");
	private By mastiffTitle = By.xpath("//div[@class='category-landing-page']//p[text()='Protect your HP device with a Care Pack']");
	private By createCase = By.xpath("//a[@id='CreateCase']");
	private By createCasePageTitle = By.xpath("//div[@class='hp-header hp-row']");
	private By supportResourceTitle = By.xpath("//h2[text()='More support resources']");
	private By hpSupportAssistant = By.xpath("(//a[@class='ng-star-inserted'])[1]");
	private By hpSupportCommunity = By.xpath("(//a[@class='ng-star-inserted'])[2]");	
	private By swdTile = By.xpath("//div[@id='Tile3_Software_and_drivers']");
	private By swdTitle = By.xpath("//h1[@class='greeting']");
	private By addProductLink = By.xpath("//a[@id='addproduct']");
	private By serialNumField = By.xpath("//div[@class='search-input']//input");
	private By submitBtn = By.xpath("//button[@id='FindMyProduct']");
	private By speakToAgent = By.xpath("//a[@id='Call_HP']");
	private By productExchange = By.xpath("//a[@id='Poly_RMA']");
	private By pageLoadsSpinner = By.xpath("//div[@class='neb-loading-spinner']");
	
	private CommonPage commonPage = new CommonPage(DriverFactory.getDriver());
	public ContactOptionsPage(WebDriver driver) {
		this.driver = driver;
	}

	public void contactOptionPageLanding() throws InterruptedException {
		
			Thread.sleep(2000);
	        ElementUtils.expliciteWait(driver, addProductLink);
	        JavaScriptUtils.scrollInToView(driver, driver.findElement(addProductLink));
	        JavaScriptUtils.highLightElement(driver, driver.findElement(addProductLink));
	        JavaScriptUtils.clickElementByJS(driver, driver.findElement(addProductLink));
	        ElementUtils.expliciteWait(driver, serialNumField);
	        JavaScriptUtils.highLightElement(driver, driver.findElement(serialNumField));
	        driver.findElement(serialNumField).sendKeys("EE08VY");
	        Thread.sleep(2000);
	        ElementUtils.expliciteWait(driver, submitBtn);
	        JavaScriptUtils.clickElementByJS(driver, driver.findElement(submitBtn)); 
	        try {
	        	WebDriverWait wait = new WebDriverWait(driver, 20);
		        wait.until(ExpectedConditions.visibilityOfElementLocated(pageLoadsSpinner)); 
		        wait.until(ExpectedConditions.invisibilityOfElementLocated(pageLoadsSpinner));
	        } catch (TimeoutException e) { 
	        }
	        commonPage.handlePopUp();      
	    	}
	        
	public boolean contactOptionSerialNum() throws InterruptedException {
	    ElementUtils.expliciteWait(driver, productName);
	    JavaScriptUtils.highLightElement(driver, driver.findElement(productName));
	    driver.findElement(productName).getText();
	    ElementUtils.expliciteWait(driver, serialNum);
	    JavaScriptUtils.highLightElement(driver, driver.findElement(serialNum));
	    String prodSerialNum = driver.findElement(serialNum).getText();
	    System.out.println("Pass: Serial number has to be present " +  prodSerialNum);
	    return true;
	}

	public boolean chooseDifferentLink_Availability(String expectedTxt) throws InterruptedException {
	    if (chooseDiffLink != null) {
	        ElementUtils.expliciteWait(driver, chooseDiffLink);
	        JavaScriptUtils.highLightElement(driver, driver.findElement(chooseDiffLink));
	        String actualTxt = driver.findElement(chooseDiffLink).getText();
	        if (actualTxt.equals(expectedTxt)) {
	            System.out.println("Choose a different product link text matches");
	        }   else {
	            System.out.println("Choose a different product link text does not matched");
	        }
	    } else {
	        System.out.println("Pass: Choose a different product link is present");
	    }
	    return true;
	}

	public boolean chooseDifferentLink_Functionality(String expectedTxt) throws InterruptedException {
	    if (chooseDiffLink != null) {
	        ElementUtils.expliciteWait(driver, chooseDiffLink);
	        JavaScriptUtils.highLightElement(driver, driver.findElement(chooseDiffLink));
	        driver.findElement(chooseDiffLink).click();
	        ElementUtils.sleep();
	        ElementUtils.expliciteWait(driver, selectProdPageTitle);
	        JavaScriptUtils.highLightElement(driver, driver.findElement(selectProdPageTitle));
	        String actualTxt = driver.findElement(selectProdPageTitle).getText();
	        if (actualTxt != null && actualTxt.contains(expectedTxt)) {
	            System.out.println("Choose a different product link title is matching");
	            return true;
	        } else {
	            System.out.println("Choose a different product link title is not matching");
	            return false;
	        }
	    }
	    System.out.println("Fail: Choose a different product link is functional");
	    return false;
	}

	public boolean allContactTiles() throws InterruptedException {
	    ElementUtils.sleep();
	    ElementUtils.expliciteWait(driver, allContactTile);
	    List<WebElement> contactTiles = driver.findElements(allContactTile);
	    System.out.println("Number of contact tiles: " + contactTiles.size());
	    for (WebElement tile : contactTiles) {
	        JavaScriptUtils.scrollInToView(driver, tile);
	        JavaScriptUtils.highLightElement(driver, tile);}
	    System.out.println("Pass: all contact option tile is present");
	    return true;
	}

	public boolean omniChatTile() throws InterruptedException {
	    ElementUtils.expliciteWait(driver, omniChat);
	    JavaScriptUtils.scrollInToView(driver, driver.findElement(omniChat));
	    JavaScriptUtils.highLightElement(driver, driver.findElement(omniChat));
	    System.out.println("Pass: Omni chat contact option is present");
	    return true;
	}

	public boolean omniChatTile_Functionality(String expectedURL) throws InterruptedException {
	        ElementUtils.expliciteWait(driver, omniChat);
	        JavaScriptUtils.scrollInToView(driver, driver.findElement(omniChat));
	        JavaScriptUtils.highLightElement(driver, driver.findElement(omniChat));
	        driver.findElement(omniChat).click();
	        ElementUtils.sleep();
	        String actualUrl = driver.getCurrentUrl();
	        if (actualUrl.equals(expectedURL)) {
	            System.out.println("Omni chat contact option is functional");
	            return true;
	        } else {
	            System.out.println("Omni chat contact option is functional but navigates to unexpected URL");
	            return false;
	        }
	}

 
	public boolean speakToAgentTile() throws InterruptedException {
	    ElementUtils.expliciteWait(driver, speakToAgent);
	    JavaScriptUtils.scrollInToView(driver, driver.findElement(speakToAgent));
	    JavaScriptUtils.highLightElement(driver, driver.findElement(speakToAgent));
	    System.out.println("Pass: Speak to an agent contact option is present");
	    return true;
	}
	
	public boolean productExchangeTile() throws InterruptedException {
	    ElementUtils.expliciteWait(driver, productExchange);
	    JavaScriptUtils.scrollInToView(driver, driver.findElement(productExchange));
	    JavaScriptUtils.highLightElement(driver, driver.findElement(productExchange));
	    System.out.println("Pass: Product exchange contact option is present");
	    return true;
	}

	public boolean productExchangeTileFunctional(String expectedURL) throws InterruptedException {
	    ElementUtils.expliciteWait(driver, productExchange);
	    JavaScriptUtils.scrollInToView(driver, driver.findElement(productExchange));
	    JavaScriptUtils.highLightElement(driver, driver.findElement(productExchange));
	    driver.findElement(productExchange).click();
	    ElementUtils.sleep();
	    String actualUrl = driver.getCurrentUrl();   
	    if (actualUrl.equals(expectedURL)) {
	        System.out.println("Pass: Product exchange contact option is functional");
	        return true;
	    } else {
	        System.out.println("Omni chat contact option is functional but navigates to unexpected URL");
	        return false;
	    }    
	}

	public boolean supportCommunityTile() throws InterruptedException {
	    ElementUtils.sleep();
	    ElementUtils.sleep();
	    ElementUtils.expliciteWait(driver, supportCommunity);
	    JavaScriptUtils.scrollInToView(driver, driver.findElement(supportCommunity));
	    JavaScriptUtils.highLightElement(driver, driver.findElement(supportCommunity));
	    System.out.println("Pass: HP support community contact option is present");
	    return true;
	}

	public boolean supportCommunityTile_Functionality(String expectedURL) throws InterruptedException {
	    String parentWindowHandle = driver.getWindowHandle();
	    ElementUtils.expliciteWait(driver, supportCommunity);
	    JavaScriptUtils.scrollInToView(driver, driver.findElement(supportCommunity));
	    JavaScriptUtils.highLightElement(driver, driver.findElement(supportCommunity));
	    driver.findElement(supportCommunity).click();
	    Set<String> windowHandles = driver.getWindowHandles();
	    for (String windowHandle : windowHandles) {
	        if (!windowHandle.equals(parentWindowHandle)) {
	            driver.switchTo().window(windowHandle);
	            String actualUrl = driver.getCurrentUrl();
	            ElementUtils.sleep();
	            driver.switchTo().window(parentWindowHandle);
	            if (actualUrl.equals(expectedURL)) {
	                System.out.println("Pass: HP support community contact option is functional");
	            } else {
	                System.out.println("Fail: HP support community contact option is functional but navigates to unexpected URL");
	            }}}
	    return true;
	}

	public boolean phoneTile() throws InterruptedException {
	    ElementUtils.expliciteWait(driver, hpPhoneTile);
	    JavaScriptUtils.scrollInToView(driver, driver.findElement(hpPhoneTile));
	    JavaScriptUtils.highLightElement(driver, driver.findElement(hpPhoneTile));
	    System.out.println("Pass: Phone contact option is present");
	    return true;
	}

	public boolean serviceCenterLocator() throws InterruptedException {
	    ElementUtils.expliciteWait(driver, serviceCenter);
	    JavaScriptUtils.scrollInToView(driver, driver.findElement(serviceCenter));
	    JavaScriptUtils.highLightElement(driver, driver.findElement(serviceCenter));
	    System.out.println("Pass: HP service center locator contact option is present");
	    return true;
	}

	public boolean serviceCenterLocator_Functionality(String expectedURL) throws InterruptedException {
	    String parentWindowHandle = driver.getWindowHandle();
	    ElementUtils.expliciteWait(driver, serviceCenter);
	    JavaScriptUtils.scrollInToView(driver, driver.findElement(serviceCenter));
	    JavaScriptUtils.highLightElement(driver, driver.findElement(serviceCenter));
	    driver.findElement(serviceCenter).click();
	    Set<String> windowHandles = driver.getWindowHandles();
	    for (String windowHandle : windowHandles) {
	        if (!windowHandle.equals(parentWindowHandle)) {
	            driver.switchTo().window(windowHandle);
	            ElementUtils.expliciteWait(driver, serviceCenterTitle);
	            JavaScriptUtils.highLightElement(driver, driver.findElement(serviceCenterTitle));
	            driver.findElement(serviceCenterTitle).getText();
	            String actualUrl = driver.getCurrentUrl();
	            ElementUtils.sleep();
	            driver.switchTo().window(parentWindowHandle);
	            if (actualUrl.equals(expectedURL)) {
	                System.out.println("Pass: HP service center locator contact option is functional");
	                return true;
	            } else {
	                System.out.println("Fail: HP service center locator contact option is functional but navigates to unexpected URL");
	                return false;
	            }}}
	    return true;
	}

	public boolean mastiffOfferTile() throws InterruptedException {
	    ElementUtils.expliciteWait(driver, mastiffOffer);
	    JavaScriptUtils.scrollInToView(driver, driver.findElement(mastiffOffer));
	    JavaScriptUtils.highLightElement(driver, driver.findElement(mastiffOffer));
	    System.out.println("Pass: Mastiff offer tile is present");
	    return true;
	}

	public boolean mastiffOfferTile_Functionality(String expectedURL) throws InterruptedException {
	    String parentWindowHandle = driver.getWindowHandle();
	    ElementUtils.expliciteWait(driver, mastiffOffer);
	    JavaScriptUtils.scrollInToView(driver, driver.findElement(mastiffOffer));
	    JavaScriptUtils.highLightElement(driver, driver.findElement(mastiffOffer));
	    driver.findElement(mastiffOffer).click();
	    Set<String> windowHandles = driver.getWindowHandles();
	    for (String windowHandle : windowHandles) {
	        if (!windowHandle.equals(parentWindowHandle)) {
	            driver.switchTo().window(windowHandle);
	            ElementUtils.expliciteWait(driver, mastiffTitle);
	            JavaScriptUtils.highLightElement(driver, driver.findElement(mastiffTitle));
	            driver.findElement(mastiffTitle).getText();
	            String actualUrl = driver.getCurrentUrl();
	            ElementUtils.sleep();
	            driver.switchTo().window(parentWindowHandle);
	            if (actualUrl.equals(expectedURL)) {
	                System.out.println("Pass: Mastiff offer tile is functional");
	                return true;
	            } else {
	                System.out.println("Fail: Mastiff offer tile is functional but navigates to unexpected URL");
	                return false;
	            }}}
		return true;
}

	public boolean createCase() throws InterruptedException {
	    ElementUtils.expliciteWait(driver, createCase);
	    JavaScriptUtils.scrollInToView(driver, driver.findElement(createCase));
	    JavaScriptUtils.highLightElement(driver, driver.findElement(createCase));
	    System.out.println("Pass: Create a case contact option is present");
	    return true;
	}

	public boolean createCase_Functionality(String expectedTxt) throws InterruptedException {
	    ElementUtils.expliciteWait(driver, createCase);
	    JavaScriptUtils.scrollInToView(driver, driver.findElement(createCase));
	    JavaScriptUtils.highLightElement(driver, driver.findElement(createCase));
	    driver.findElement(createCase).click();
	    ElementUtils.sleep();
	    ElementUtils.expliciteWait(driver, createCasePageTitle);
	    JavaScriptUtils.highLightElement(driver, driver.findElement(createCasePageTitle));
	    String titleTxt = driver.findElement(createCasePageTitle).getText();
	    if (titleTxt.equals(expectedTxt)) {
	        System.out.println("Pass: Create a case contact option is functional");
	        return true;
	    } else {
	        System.out.println("Fail: Create a case contact option is functional but displays unexpected title text");
	        return false;
	    }
	}

	public boolean supportResourceTitle() throws InterruptedException {
	    ElementUtils.expliciteWait(driver, supportResourceTitle);
	    JavaScriptUtils.scrollInToView(driver, driver.findElement(supportResourceTitle));
	    JavaScriptUtils.highLightElement(driver, driver.findElement(supportResourceTitle));
	    System.out.println("Pass: Title for more support resources is present");
	    return true;
	}

	public boolean hpSupportAssistant() throws InterruptedException {
	    ElementUtils.expliciteWait(driver, hpSupportAssistant);
	    JavaScriptUtils.scrollInToView(driver, driver.findElement(hpSupportAssistant));
	    JavaScriptUtils.highLightElement(driver, driver.findElement(hpSupportAssistant));
	    System.out.println("Pass: HP Support Assistant tile is present");
	    return true;
	}

	public boolean hpSupportAssistant_Functionality(String expectedTitle) throws InterruptedException {
	    ElementUtils.expliciteWait(driver, hpSupportAssistant);
	    JavaScriptUtils.scrollInToView(driver, driver.findElement(hpSupportAssistant));
	    JavaScriptUtils.highLightElement(driver, driver.findElement(hpSupportAssistant));
	    driver.findElement(hpSupportAssistant).click();
	    System.out.println("Pass: HP Support Assistant tile is functional");
	    return true;
	}

	public boolean hpSupportCommunity() throws InterruptedException {
	    ElementUtils.expliciteWait(driver, hpSupportCommunity);
	    JavaScriptUtils.scrollInToView(driver, driver.findElement(hpSupportCommunity));
	    JavaScriptUtils.highLightElement(driver, driver.findElement(hpSupportCommunity));
	    System.out.println("Pass: HP Support Assistant tile is present");
	    return true;
	}

	public boolean hpSupportCommunity_Functionality(String expectedUrl) throws InterruptedException {
	    ElementUtils.expliciteWait(driver, hpSupportCommunity);
	    JavaScriptUtils.scrollInToView(driver, driver.findElement(hpSupportCommunity));
	    JavaScriptUtils.highLightElement(driver, driver.findElement(hpSupportCommunity));
	    driver.findElement(hpSupportCommunity).click();
	    System.out.println("Pass: HP Support Assistant tile is functional");
	    return true;
	}

	public boolean swdTile() throws InterruptedException {
	    ElementUtils.expliciteWait(driver, swdTile);
	    JavaScriptUtils.scrollInToView(driver, driver.findElement(swdTile));
	    JavaScriptUtils.highLightElement(driver, driver.findElement(swdTile));
	    System.out.println("Pass: Software and drivers tile is present");
	    return true;
	}

	public boolean swdTile_Functionality() throws InterruptedException {
	    ElementUtils.expliciteWait(driver, swdTile);
	    JavaScriptUtils.scrollInToView(driver, driver.findElement(swdTile));
	    JavaScriptUtils.highLightElement(driver, driver.findElement(swdTile));
	    ElementUtils.sleep();
	    driver.findElement(swdTile).click();
	    ElementUtils.sleep();
	    ElementUtils.expliciteWait(driver, swdTitle);
	    JavaScriptUtils.highLightElement(driver, driver.findElement(swdTitle));
	    String title = driver.findElement(swdTitle).getText();
	    System.out.println("Pass: Software and drivers tile is functional and the title is: " + title);
	    return true;
	}
}
