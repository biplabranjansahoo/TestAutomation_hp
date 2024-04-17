package com.hp.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.hp.qa.util.DbUtils;
import com.hp.qa.util.ElementUtils;
import com.hp.qa.util.JavaScriptUtils;

public class CommonPage {

	private WebDriver driver;
	private By signinButton = By.xpath("//div[@id='wpr-signin-tablet']/a/span/p[text()='Sign in']");
	private By username = By.xpath("//input[@id='username']");
	private By next = By.xpath("//button[@id='user-name-form-submit']");
	private By password = By.xpath("//input[@id='password']");
	private By submit = By.xpath("//button[@id='sign-in']");
	private By headerExplore = By.xpath("//div[@id='menuitemOne_tab']");
	private By headerShop = By.xpath("//div[@id='menuitemTwo_tab']");
	private By secondaryNavigationBar = By.xpath("//*[@id='nav-secondary']");
	private By clcHeader = By.xpath("//h3[@id='select-country-header']");
	private By clcName = By.xpath("//div[@class='wrapper']//span[@id='country-header']");
	private By clcSelector = By.xpath("//a[@title='Country/Region United States']");
	private By clcRegionAmericas=By.xpath("//h4[text()='Americas']");
	private By clcRegionEMEA=By.xpath("//h4[text()='Europe, Middle East, Africa']");
	private By clcRegionAsia=By.xpath("//h4[text()='Asia Pacific and Oceania']");
	private By taiwanCountry=By.xpath("//a[text()='Hong Kong SAR']/parent::li/following-sibling::*//a[text()='臺灣地區']");
	private By footer = By.xpath("//a[text()='Ways to buy ']");
	private By acceptCookies = By.xpath(
			"//button[contains(text(),'Accept All') or contains(text(),'I ACCEPT') or contains(text(),'Accept')]");
	private By widget = By.xpath("//div[@id='widget_menu']");
	private By productstab = By.xpath("//a[@title='Products']");
	private By printersupport = By.xpath("//a[@id='sec-nav-product-printer']");
	private By computersupport = By.xpath("//a[@id='sec-nav-product-computer']");
	private By polycolaboration = By.xpath("//a[@id='sec-nav-product-poly']");
	private By inktonercartridges = By.xpath("//a[@id='sec-nav-product-ink']");
	private By selectall = By.xpath("//a[@id='sec-nav-product-all']");
	private By swdtab = By.xpath("//a[@id='sec-nav-software-and-drivers']");
	private By diagnosticstab = By.xpath("//a[@title='Diagnostics']");
	private By printerdiag = By.xpath("//a[@id='sec-nav-diag-printer']");
	private By computerdiag = By.xpath("//a[@id='sec-nav-diag-computer']");
	private By windiag = By.xpath("//a[@id='sec-nav-diag-win10']");
	private By printscandoc = By.xpath("//a[@id='sec-nav-diag-psdr']");
	private By pchardwarediag = By.xpath("//a[@id='sec-nav-diag-hw']");
	private By contactus = By.xpath("//a[@title='Contact Us']");
	private By businesstab = By.xpath("//a[@title='Business Support']");
	private By contractswarrenty = By.xpath("//a[@id='hlnkbrowsewarrantyproducts']");
	private By supporthometab = By.xpath("//a[@title='Support Home']");
	private By myhpaccount = By.xpath("//a[@title='My HP Account']");
	private By supportdash = By.xpath("//a[@id='sec-nav-dashboard1']");
	private By accountbenefits = By.xpath("//a[@id='sec-nav-account-details']");
	private By alertClose = By.xpath("//a[@id='closeAlert']");	
	private By alerticon = By.xpath("//a[@title='Notification Icon']");
	private By printicon = By.xpath("//a[@title='print']");
	private By feedbackicon = By.xpath("//a[@class='pfw_feedback_link psf-link']");
	private By shoppingcart = By.xpath("//div[@id='widget_menu']");
	private By headerSupport = By.xpath("//div[@id='menuitemThree_tab']");
	private By countryPopUpBtn = By.xpath("//button[@class='primary-button']");
	private By medalliaSurveyCloseBtn = By.xpath("//div[@class='col-sm-offset-11 col-sm-1']//button[@aria-label='Close Survey']");
	
	DbUtils util = new DbUtils();

	public CommonPage(WebDriver driver) {
		this.driver = driver;
	}

	public void validateHeader() throws InterruptedException {
		ElementUtils.expliciteWait(driver, headerExplore);
		JavaScriptUtils.highLightElement(driver, driver.findElement(headerExplore));
		JavaScriptUtils.highLightElement(driver, driver.findElement(headerShop));
		JavaScriptUtils.highLightElement(driver, driver.findElement(headerSupport));
		JavaScriptUtils.highLightElement(driver, driver.findElement(shoppingcart));	
		ElementUtils.sleep();
	}

	public void validateFooter() throws InterruptedException {
		ElementUtils.expliciteWait(driver, footer);
		JavaScriptUtils.highLightElement(driver, driver.findElement(footer));
	}

	public void acceptCookies() {
		try {
			ElementUtils.expliciteWait(driver, acceptCookies);
			JavaScriptUtils.highLightElement(driver, driver.findElement(acceptCookies));
			driver.findElement(acceptCookies).click();
			System.out.println("Cookies has been accepted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void secNav() {
		try {
			if (secondaryNavigationBar != null) {
				ElementUtils.expliciteWait(driver, secondaryNavigationBar);
				JavaScriptUtils.highLightElement(driver, driver.findElement(secondaryNavigationBar));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void widget() {
		try {
			if (widget != null) {
				ElementUtils.expliciteWait(driver, widget);
				JavaScriptUtils.highLightElement(driver, driver.findElement(widget));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getTabTitle() throws InterruptedException {
		ElementUtils.sleep();
		return driver.getTitle();
	}

	public boolean clc_Selector_visibility() throws InterruptedException {
		ElementUtils.expliciteWait(driver, footer);
		JavaScriptUtils.scrollInToView(driver, driver.findElement(footer));
		JavaScriptUtils.highLightElement(driver, driver.findElement(clcSelector));
		boolean clcSel = driver.findElement(clcSelector).isDisplayed();
		return clcSel;
	}

	public void clc() throws InterruptedException {
		ElementUtils.expliciteWait(driver, footer);
		JavaScriptUtils.scrollInToView(driver, driver.findElement(footer));
		JavaScriptUtils.highLightElement(driver, driver.findElement(clcSelector));
		JavaScriptUtils.clickElementByJS(driver, driver.findElement(clcSelector));
		JavaScriptUtils.highLightElement(driver, driver.findElement(clcHeader));
		JavaScriptUtils.highLightElement(driver, driver.findElement(clcRegionAmericas));
		JavaScriptUtils.highLightElement(driver, driver.findElement(clcRegionEMEA));
		JavaScriptUtils.highLightElement(driver, driver.findElement(clcRegionAsia));
		JavaScriptUtils.highLightElement(driver, driver.findElement(taiwanCountry));
	}

	public void clickOnSignin() {
		ElementUtils.expliciteWait(driver, signinButton);
		driver.findElement(signinButton).click();
	}

	public void enterUserName(String user) {
		ElementUtils.expliciteWait(driver, username);
		driver.findElement(username).sendKeys(user);
	}

	public void enterPassword(String pwd) {
		ElementUtils.expliciteWait(driver, password);
		driver.findElement(password).sendKeys(pwd);
	}

	public void clickOnNext() {
		ElementUtils.expliciteWait(driver, next);
		driver.findElement(next).click();
	}

	public void clickOnSubmit() throws InterruptedException {
		driver.findElement(submit).click();
		ElementUtils.sleep();
	}

	public boolean navigateBack() throws InterruptedException {
		driver.navigate().back();
		return false;
	}

	public void computersupport() {
		ElementUtils.expliciteWait(driver, computersupport);
		JavaScriptUtils.highLightElement(driver, driver.findElement(computersupport));
		driver.findElement(computersupport).click();
	}

	public void polycolaboration() {
		ElementUtils.expliciteWait(driver, polycolaboration);
		JavaScriptUtils.highLightElement(driver, driver.findElement(polycolaboration));
		driver.findElement(polycolaboration).click();
	}

	public void inktonercartridges() {
		ElementUtils.expliciteWait(driver, inktonercartridges);
		JavaScriptUtils.highLightElement(driver, driver.findElement(inktonercartridges));
		driver.findElement(inktonercartridges).click();
	}

	public void selectall() {
		ElementUtils.expliciteWait(driver, selectall);
		JavaScriptUtils.highLightElement(driver, driver.findElement(selectall));
		driver.findElement(selectall).click();
	}

	public boolean productsdropdown() {
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(productstab)).perform();
		JavaScriptUtils.highLightElement(driver, driver.findElement(productstab));
		boolean dropdown = driver.findElement(productstab).isDisplayed();
		return dropdown;
	}

	public void printersupport() {
		ElementUtils.expliciteWait(driver, printersupport);
		JavaScriptUtils.highLightElement(driver, driver.findElement(printersupport));
		driver.findElement(printersupport).click();
	}

	public void swdtabclick() {
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(swdtab)).perform();
		JavaScriptUtils.highLightElement(driver, driver.findElement(swdtab));
		driver.findElement(swdtab).click();
	}

	public boolean swdtab() {
		ElementUtils.expliciteWait(driver, swdtab);
		JavaScriptUtils.highLightElement(driver, driver.findElement(swdtab));
		boolean swd = driver.findElement(swdtab).isDisplayed();
		return swd;
	}

	public boolean diagnostictab() {
		ElementUtils.expliciteWait(driver, diagnosticstab);
		JavaScriptUtils.highLightElement(driver, driver.findElement(diagnosticstab));
		boolean diagnostic = driver.findElement(diagnosticstab).isDisplayed();
		return diagnostic;
	}

	public void diagnosticsdropdown() {
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(diagnosticstab)).perform();
		JavaScriptUtils.highLightElement(driver, driver.findElement(diagnosticstab));
	}

	public void printerdiagnosticstools() {
		ElementUtils.expliciteWait(driver, printerdiag);
		JavaScriptUtils.highLightElement(driver, driver.findElement(printerdiag));
		driver.findElement(printerdiag).click();
	}

	public void computerdiagnosticstools() {
		ElementUtils.expliciteWait(driver, computerdiag);
		JavaScriptUtils.highLightElement(driver, driver.findElement(computerdiag));
		driver.findElement(computerdiag).click();
	}

	public void winsupport() {
		ElementUtils.expliciteWait(driver, windiag);
		JavaScriptUtils.highLightElement(driver, driver.findElement(windiag));
		driver.findElement(windiag).click();
	}

	public void printscandoc() {
		ElementUtils.expliciteWait(driver, printscandoc);
		JavaScriptUtils.highLightElement(driver, driver.findElement(printscandoc));
		driver.findElement(printscandoc).click();
	}

	public void pchardwarediag() {
		ElementUtils.expliciteWait(driver, pchardwarediag);
		JavaScriptUtils.highLightElement(driver, driver.findElement(pchardwarediag));
		driver.findElement(pchardwarediag).click();
	}

	public boolean contactustab() {
		ElementUtils.expliciteWait(driver, contactus);
		JavaScriptUtils.highLightElement(driver, driver.findElement(contactus));
		boolean contact = driver.findElement(contactus).isDisplayed();
		return contact;
	}

	public void contactusclick() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(contactus)).perform();
		JavaScriptUtils.highLightElement(driver, driver.findElement(contactus));
		driver.findElement(contactus).click();
		ElementUtils.sleep();
	}

	public boolean businesstab() {
		ElementUtils.expliciteWait(driver, businesstab);
		JavaScriptUtils.highLightElement(driver, driver.findElement(businesstab));
		boolean business = driver.findElement(businesstab).isDisplayed();
		return business;
	}

	public void contractswarranties() throws InterruptedException {
		ElementUtils.expliciteWait(driver, contractswarrenty);
		JavaScriptUtils.highLightElement(driver, driver.findElement(contractswarrenty));
	}

	public boolean myhpaccounttab() throws InterruptedException {
		ElementUtils.expliciteWait(driver, supporthometab);
		driver.findElement(supporthometab).click();
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, myhpaccount);
		JavaScriptUtils.highLightElement(driver, driver.findElement(myhpaccount));
		boolean myhp = driver.findElement(myhpaccount).isDisplayed();
		return myhp;
	}

	public void myhpaccounttabtxt() {
		ElementUtils.expliciteWait(driver, myhpaccount);
		String tabtxt = driver.findElement(myhpaccount).getText();
		System.out.println("my hp account tab text is: " + tabtxt);
	}

	public void myhpaccounttabclick() {
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(myhpaccount)).perform();
		JavaScriptUtils.highLightElement(driver, driver.findElement(myhpaccount));
	}
	
	public void supportdashboard() throws InterruptedException{	
		ElementUtils.expliciteWait(driver, supportdash);
		JavaScriptUtils.highLightElement(driver, driver.findElement(supportdash));
		driver.findElement(supportdash).click();
		ElementUtils.sleep();
		driver.findElement(alertClose).click();
	}
	public void supportdashboardpage() throws InterruptedException{
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, supportdash);
		JavaScriptUtils.highLightElement(driver, driver.findElement(supportdash));
		driver.findElement(supportdash).click();
	}
	public void hpaccountbenefits() throws InterruptedException{
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, accountbenefits);
		JavaScriptUtils.highLightElement(driver, driver.findElement(accountbenefits));
		driver.findElement(accountbenefits).click();
	}
	public void hpaccountpage() throws InterruptedException{
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, accountbenefits);
		JavaScriptUtils.highLightElement(driver, driver.findElement(accountbenefits));
		driver.findElement(accountbenefits).click();
	}
	
	public boolean alerticon(){
		ElementUtils.expliciteWait(driver, alerticon);
		JavaScriptUtils.highLightElement(driver, driver.findElement(alerticon));
		boolean alert = driver.findElement(alerticon).isDisplayed();
		return alert;
	}
	public void alertIconclick() throws InterruptedException{
		ElementUtils.expliciteWait(driver, alerticon);
		JavaScriptUtils.highLightElement(driver, driver.findElement(alerticon));
		driver.findElement(alerticon).click();
	}
	public boolean printicon(){
		ElementUtils.expliciteWait(driver, printicon);
		JavaScriptUtils.highLightElement(driver, driver.findElement(printicon));
		boolean print = driver.findElement(printicon).isDisplayed();
		return print;
	}
	public void printiconclose() throws InterruptedException, AWTException{
		ElementUtils.expliciteWait(driver, printicon);
		JavaScriptUtils.highLightElement(driver, driver.findElement(printicon));
		driver.findElement(printicon).click();
		ElementUtils.sleep();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.delay(500);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);	
	}
	public boolean feedbackicon() throws InterruptedException {
		
	    boolean isFeedbackEnabled = isFeedbackEnabled();
	    if (isFeedbackEnabled) {
	        try {
	            ElementUtils.expliciteWait(driver, feedbackicon);
	            JavaScriptUtils.highLightElement(driver, driver.findElement(feedbackicon));
	            WebElement feedbackIconElement = driver.findElement(feedbackicon);
	            if (feedbackIconElement.isDisplayed()) {            	
	                feedbackIconElement.click();
	                return true; 
	            } else {
	                System.out.println("Feedback icon is not displayed.");
	                return false; 
	            }
	        } catch (NoSuchElementException e) {
	            System.out.println("Feedback icon not found.");
	            return false;
	        }
	    } else {
	        System.out.println("Feedback option is not available in this environment.");
	        return false;}}
	
	private boolean isFeedbackEnabled() {
	    try {
	        return driver.findElement(feedbackicon).isEnabled();
	    } catch (NoSuchElementException e) {
	        System.out.println("Feedback icon not found.");
	        return false;}
	    }
 
	public void feedbackpopup() throws InterruptedException{
		ElementUtils.expliciteWait(driver, feedbackicon);
		JavaScriptUtils.highLightElement(driver, driver.findElement(feedbackicon));
		driver.findElement(feedbackicon).click();
		ElementUtils.sleep();
	}
	
	public void alertboxClose() {
		try {
			ElementUtils.expliciteWait(driver, alertClose);
			JavaScriptUtils.highLightElement(driver, driver.findElement(alertClose));
			driver.findElement(alertClose).click();
			System.out.println("Alert box has been closed");
		    }
		catch (Exception e)     {
			e.printStackTrace();}
	}
/*Lavanya*/
	
	public boolean verifyElementAvailability(WebDriver driver, WebElement element) {
			if(element != null) {
			JavaScriptUtils.highLightElement(driver,element);
			System.out.println("Element is available");
			return true;
		} else {
			System.out.println("Element is not available");
			return false;
		}
	}
	
	
	public boolean verifyEleValue(WebDriver driver, WebElement element, String eleText) {
			if (element != null) {
				JavaScriptUtils.highLightElement(driver, element);
				String actualText = element.getText();
				if(actualText.contains(eleText)) {
				System.out.println("Element is matching with the expected one");
				return true;
				}
				else {
				System.out.println("Element is not matching with the expected one:  " + actualText);	
				}
			}
			else
				System.out.println("Element is not available");
				return false;
		}


	public boolean verifyHyperlink(WebDriver driver, WebElement element, String url) throws InterruptedException {
		if (element != null) {
			JavaScriptUtils.highLightElement(driver, element);
			String parent = driver.getWindowHandle();
			element.click();
			ElementUtils.sleep();
			String actualURL = driver.getCurrentUrl();
			if (actualURL.contains(url)) {
				System.out.println("Hyperlink is pointing to expected url");			}
			else {
				System.out.println("Hyperlink is not pointing to expected url");			}
			
			CommonPage.switchToMainWindow(driver, parent, url);
			return true;
		} else
			System.out.println("Element is not available");
			return false;
	}

		public static void switchToMainWindow(WebDriver driver, String parentURL, Object object) {
		Set<String> handles = driver.getWindowHandles();
		for (String actual : handles) {
			if (!actual.equalsIgnoreCase(parentURL)) {
				// Switch to the opened tab
				driver.switchTo().window(actual);
				System.out.println(actual);
			}
		}
		driver.switchTo().window(parentURL);
	}
		
		// Method to verify the one box search functionality
		public boolean verifySearchComp(WebDriver driver, WebElement element, String keyword) throws AWTException, InterruptedException {
			if (element != null) {
				JavaScriptUtils.highLightElement(driver, element);
				element.sendKeys(keyword);
				driver.findElement(By.xpath("//img[@alt='search image']")).click();
		        ElementUtils.sleep();
				String url = driver.getCurrentUrl();
				if (url.contains(keyword)) {
					System.out.println("User is directed to the search results page");
				} else
					System.out.println("User is not directed to the search results page");
				return true;
			} else
				System.out.println("Search Element is not available");
			return false;
		}
		
//To handle country Pop-up	
		void handlePopUp() {
		    try {
		    	  WebElement popUpElement = driver.findElement(countryPopUpBtn);
			        if (popUpElement != null && popUpElement.isDisplayed()) {
			            JavaScriptUtils.highLightElement(driver, popUpElement);
			            JavaScriptUtils.clickElementByJS(driver, popUpElement);
			        } else {
			            System.out.println("Pop-Up is not displayed.");
			        }
			    } catch (NoSuchElementException e) {
			        System.out.println("Pop-Up is not available here");
			    }
		}
		
		boolean closeMedalliaSurveyPopUp() throws InterruptedException, AWTException {
		    Robot robot = new Robot();
		    robot.keyPress(KeyEvent.VK_ESCAPE);
		    robot.keyRelease(KeyEvent.VK_ESCAPE);
		    return true; 
		}
	
		public String getTemplateName(String tcNo) {
			if(tcNo.contains("_SH")) {return "site home";}
			else if(tcNo.contains("_CS_CHAT")) {return "contact chat form";}
			else if(tcNo.contains("_CS_CLSR")) {return "contact closure";}
			else if(tcNo.contains("_CS_OPTION")) {return "contact option";}
			else if(tcNo.contains("_CS_NS")) {return "contact landing";}
			else if(tcNo.contains("_CS_SIG")) {return "contact landing";}
			else if(tcNo.contains("_HPALL")) {return "hp all in plan";}
			else if(tcNo.contains("_PL")) {return "printer landing";}
			else if(tcNo.contains("_SR")) {return "search results";}
			else if(tcNo.contains("_SWDL")) {return "swd landing";}
			else if(tcNo.contains("_SWDOS")) {return "swd os selection";}
			else if(tcNo.contains("_SWDPRO")) {return "swd products";}
			else if(tcNo.contains("_SWDRES")) {return "swd results";}
			else {return "enter template name";}
		}

		public void startScenario(String tcNo, String browserName,String url) {
			util.failScenarioInDB(tcNo, getTemplateName(tcNo), browserName,url);
		}
		
		public void endScenario(String tcNo, String browserName,String url) {
			util.passScenarioInDB(tcNo, getTemplateName(tcNo), browserName,url);
		}
}

	

