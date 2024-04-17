package com.hp.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.hp.qa.util.DbUtils;
import com.hp.qa.util.ElementUtils;
import com.hp.qa.util.JavaScriptUtils;

public class SupportHome {

	private WebDriver driver;
	
	DbUtils dbUtils = new DbUtils();
	
	private By swdTile = By.xpath("//a[@title='Software and Drivers']//h2[text()='Software and Drivers']");
	private By printerSupportTile = By.xpath("//a[@title='Printer Support']//h2[text()='Printer Support']");
	private By computerSupportTile = By.xpath("//a[@title='Computer Support']//h2");
	// prinder search
	private By PfinderBox = By.xpath("//input[contains(@placeholder,'Example') or @id='searchQueryField']");
	private By searchButton = By.xpath("//button[@id='FindMyProduct']");
	private By pfinderAutoSearch = By.xpath("//button[contains(@id,'ngb-t')][1]");
	private By oneBoxSearch = By.xpath("//input[@id='oneboxtextsearch']");
	private By oneBoxSearchButton = By.xpath("//button[@id='Oneboxsearch']");
	private By wlcmTextNonSignedin = By.xpath("//h1[text()=' Welcome to HP Customer Support ']");
	private By wlcmTextSignedin = By.xpath("//h1[text()=' Welcome']");
	private By carosualBanner = By.xpath("//div[@class='container mob-no-pad-RL']//app-slider");
	private By carosualBannerSwip = By.xpath("//a[@class='swiper-button-prev-unique arrows-outside']");
	private By webDetect= By.xpath("//button[@id='detect-now']");
	private By webDetectModal= By.xpath("//h4[@class='modal-title']");
	private By webDetectModalClose= By.xpath("//button[@title='Close']");
	private By signinLink= By.xpath("//a[@id='Sign-in']");
	private By dashboardtitle= By.xpath("//div[@class='row']//h1");


	// 2.constructor of the page
	public SupportHome(WebDriver driver) {
		this.driver = driver;
	}

	public String getPageTitle() throws InterruptedException {
		ElementUtils.sleep();
		return driver.getTitle();
	}

	public String wlcmTextNonSignedin() throws InterruptedException {
		ElementUtils.sleep();
        String welcomeText =  driver.findElement(wlcmTextNonSignedin).getText();
        return welcomeText;
	}
	
	public String wlcmTextSignedin() throws InterruptedException {
		ElementUtils.sleep();
        String welcomeText =  driver.findElement(wlcmTextSignedin).getText();
        return welcomeText;
	}

	public void swdTilePresence() {
		Boolean enable = driver.findElement(swdTile).isEnabled();
	}

	public void printerTilePresence() {
		Boolean enable = driver.findElement(printerSupportTile).isEnabled();
	}

	public void computerTilePresence() {
		Boolean enable = driver.findElement(computerSupportTile).isEnabled();
	}

	public void swdTileClick() throws InterruptedException {
		driver.findElement(swdTile).click();
		Thread.sleep(5000);
	}

	public void printerTileClick() throws InterruptedException {
		driver.findElement(printerSupportTile).click();
		ElementUtils.sleep();
	}

	public void computerTileClick() throws InterruptedException {
		WebElement wel = driver.findElement(computerSupportTile);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", wel);
		ElementUtils.sleep();
	}

	public void pfinderSearchBox(String serialNumber) {
		ElementUtils.expliciteWait(driver, PfinderBox);
		driver.findElement(PfinderBox).sendKeys(serialNumber);
	}
	

	public void pfinderSearchButton() {
		ElementUtils.expliciteWait(driver, searchButton);
		driver.findElement(searchButton).click();
	}

	public String autoSuggestRelevantSearch() throws InterruptedException {
		ElementUtils.sleep();
		String actualproductName = driver.findElement(pfinderAutoSearch).getText();
		return actualproductName;
	}

	public void selectautoSuggestProductName() throws InterruptedException {
		ElementUtils.sleep();
		driver.findElement(pfinderAutoSearch).click();
	}

	public void oneBoxSearch(String serialNumber) {
		ElementUtils.expliciteWait(driver, oneBoxSearch);
		driver.findElement(oneBoxSearch).sendKeys(serialNumber);
	}

	public void oneBoxSearchButton() {
		ElementUtils.expliciteWait(driver, oneBoxSearchButton);
		driver.findElement(oneBoxSearchButton).click();
	}
	
	public void OneBoxSearchField(String polyserialnumber) {
		ElementUtils.expliciteWait(driver, oneBoxSearch);
		driver.findElement(oneBoxSearch).sendKeys(polyserialnumber);
	}
	public void SiteHomeOneBoxSearch(String strSearchValue) {
		try {
			ElementUtils.expliciteWait(driver, oneBoxSearch);
			driver.findElement(oneBoxSearch).sendKeys(strSearchValue);
			ElementUtils.sleep();
			driver.findElement(oneBoxSearch).sendKeys(Keys.ENTER);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String searchResultPageNavigation() throws InterruptedException {
		ElementUtils.sleep();
		String actualURL = driver.getCurrentUrl();
		return actualURL;
	}
	
	public boolean carousalBanner() {
		try {
			ElementUtils.expliciteWait(driver, carosualBanner);
			JavaScriptUtils.highLightElement(driver, driver.findElement(carosualBanner));
			boolean corousal = driver.findElement(carosualBanner).isDisplayed();
			return corousal;
		}
		catch(Throwable t) {
			t.printStackTrace();
			return false;
		}
	}
	
	public void carousalBannerSwipper() throws InterruptedException {
			ElementUtils.sleep();
			ElementUtils.expliciteWait(driver, carosualBannerSwip);
			JavaScriptUtils.highLightElement(driver, driver.findElement(carosualBannerSwip));
			ElementUtils.sleep();
			//driver.findElement(carosualBannerSwip).click();
			JavaScriptUtils.clickElementByJS(driver,driver.findElement(carosualBannerSwip));
			
	}
	
	public String webProduct() {
		ElementUtils.expliciteWait(driver, webDetect);
		String txt = driver.findElement(webDetect).getText();
		return txt;
	}
	
	public void webDetectBtn() {
		ElementUtils.expliciteWait(driver, webDetect);
		JavaScriptUtils.highLightElement(driver, driver.findElement(webDetect));
		driver.findElement(webDetect).click();
	}
	
	public void webDetectModal() {
		ElementUtils.expliciteWait(driver, webDetectModal);
		JavaScriptUtils.highLightElement(driver, driver.findElement(webDetectModal));	
	}
	
	public String webDetectModalTxt() {
		ElementUtils.expliciteWait(driver, webDetectModal);
		String txt = driver.findElement(webDetectModal).getText();
		return txt;
	}
	
	public void webdetectModalCloseBtn() {
		ElementUtils.expliciteWait(driver, webDetectModalClose);
		JavaScriptUtils.highLightElement(driver, driver.findElement(webDetectModalClose));
		driver.findElement(webDetectModalClose).click();
	}
	
	public void signinLink() {
		ElementUtils.expliciteWait(driver, signinLink);
		JavaScriptUtils.highLightElement(driver, driver.findElement(signinLink));
	}
	
	public void signinLinkClick() {
		ElementUtils.expliciteWait(driver, signinLink);
		JavaScriptUtils.highLightElement(driver, driver.findElement(signinLink));
		driver.findElement(signinLink).click();
	}
	
	public String dashboardpagetitle() {
		ElementUtils.expliciteWait(driver, dashboardtitle);
		String txt = driver.findElement(dashboardtitle).getText();
		return txt;
	}
	
}
