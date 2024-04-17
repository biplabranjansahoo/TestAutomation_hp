package com.hp.qa.pages;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.hp.qa.util.ElementUtils;
import com.hp.qa.util.JavaScriptUtils;

public class PrinterHome {

	private WebDriver driver;

	private By printerHomeTitle = By.xpath("//h1[text()='HP Printer Support']");
	private By helpSection = By.xpath("//app-primary-options/div/div/div/div/div/div/div");
	private By printerHeroBanner = By.xpath("//h1[@class='heroBannerHeading']");
	private By printersetupheader = By.xpath("//div[@class='mainTopicBodyContainer']/h2[text()='How to setup your printer']");
	private By printersetupBtn = By.xpath("//a[@id='Top_0_Solution_Button']");
	private By setupVideoslink = By.xpath("//a[@title='View unboxing and printer setup videos']");
	private By wirelessSetup = By.xpath("//a[@id='Top_0_Solution_Link1']");
	private By windows11card = By.xpath("//div[@id='topic_options_1']");
	private By fixscanBtn = By.xpath("//a[@title='Fix Scan/Print']");
	private By MSFTurl = By.xpath("//a[@title='Fix issues with MSFT updates']");
	private By Windows11SupportURL = By.xpath("//a[@title='Windows 11 support page']");
	private By HPinkTonercard = By.xpath("//div[@id='topic_options_2']");
	private By HPinkTonercardTxt = By.xpath("//h2[@class='h2card'][text()='HP Ink & Toner Cartridges']");
	private By CompatibleBtn = By.xpath("//a[@title='Check Compatible Cartridges']");
	private By primaryOption = By.xpath("//div[@class='primary-options-container mB10']");
	private By downloadDrivers = By.xpath("//a[@title='Download drivers']");
	private By checkWarranty = By.xpath("//a[@title='Check warranty status']");
	private By contactUs = By.xpath("(//a[@title='Contact us'])[2]");
	private By virtualAgent = By.xpath("//a[@title='Ask our Virtual Assistant']");
	private By hpInstantink = By.xpath("//a[@title='HP Instant Ink Support']");
	private By printerOffline = By.xpath("//div[@id='topic_options_3']");
	private By printScan = By.xpath("//a[@title='Print and Scan Doctor']");
	private By printScanurl = By.xpath("//a[@id='Top_3_Solution_Link0']");
	private By pFindertitle = By.xpath("//h2[text()='Identify your printer for manuals and specific product information']");
	private By PfinderBox = By.xpath("//input[@id='searchQueryField']");
	private By searchButton = By.xpath("//button[@id='FindMyProduct']");
	private By pfinderAutoSearch = By.xpath("//button[contains(@id,'ngb-t')][1]");
	private By oneBoxSearch = By.xpath("//input[@id='oneboxtextsearch']");
	private By oneBoxSearchButton = By.xpath("//button[@id='Oneboxsearch']");

	public PrinterHome(WebDriver driver) {
		this.driver = driver;
	}

	public int getPringterhelpSectionCount() {
		return driver.findElements(helpSection).size();
	}

	public List<String> getPrinterhelpSectionList() {

		List<String> helpList = new ArrayList<>();
		List<WebElement> computerhelpList = driver.findElements(helpSection);

		for (WebElement e : computerhelpList) {
			String text = e.getText();
			System.out.println(text);
			helpList.add(text);
		}
		return helpList;
	}

	public String getPrinterBrowserTabTitle() throws InterruptedException {
		ElementUtils.sleep();
		return driver.getTitle();
	}

	public String getPrinterPageTitle() throws InterruptedException {
		ElementUtils.expliciteWait(driver, printerHomeTitle);
		String printerTitle = driver.findElement(printerHomeTitle).getText();
		return printerTitle;
	}

	public void heroBanner() throws InterruptedException {
		ElementUtils.expliciteWait(driver, printerHeroBanner);
		String actualTxt = driver.findElement(printerHeroBanner).getText();
		System.out.println("Printer support page header text is: " + actualTxt);
		JavaScriptUtils.highLightElement(driver, driver.findElement(printerHeroBanner));
		ElementUtils.sleep();
	}

	public String heroBannerTxt(String expectedTxt) throws InterruptedException {
		ElementUtils.expliciteWait(driver, printerHeroBanner);
		String bannerTxt = driver.findElement(printerHeroBanner).getText();
		JavaScriptUtils.highLightElement(driver, driver.findElement(printerHeroBanner));
		return bannerTxt;
	}

	public boolean primaryOptionlink() {
		ElementUtils.expliciteWait(driver, primaryOption);
		JavaScriptUtils.scrollInToView(driver, driver.findElement(primaryOption));
		JavaScriptUtils.highLightElement(driver, driver.findElement(primaryOption));
		boolean primary = driver.findElement(primaryOption).isDisplayed();
		return primary;
	}

	public boolean downloadDriverslink() {
		ElementUtils.expliciteWait(driver, downloadDrivers);
		JavaScriptUtils.highLightElement(driver, driver.findElement(downloadDrivers));
		boolean drivers = driver.findElement(downloadDrivers).isDisplayed();
		return drivers;
	}

	public boolean checkWarrantylink() {
		ElementUtils.expliciteWait(driver, checkWarranty);
		JavaScriptUtils.highLightElement(driver, driver.findElement(checkWarranty));
		boolean warranty = driver.findElement(checkWarranty).isDisplayed();
		return warranty;
	}

	public boolean contactUslink() {
		ElementUtils.expliciteWait(driver, contactUs);
		JavaScriptUtils.highLightElement(driver, driver.findElement(contactUs));
		boolean contact = driver.findElement(contactUs).isDisplayed();
		return contact;
	}

	public boolean virtualAgent() {
		ElementUtils.expliciteWait(driver, virtualAgent);
		JavaScriptUtils.highLightElement(driver, driver.findElement(virtualAgent));
		boolean va = driver.findElement(virtualAgent).isDisplayed();
		return va;
	}

	public void clickDownloadDriver() throws InterruptedException {
		ElementUtils.expliciteWait(driver, downloadDrivers);
		JavaScriptUtils.highLightElement(driver, driver.findElement(downloadDrivers));
		driver.findElement(downloadDrivers).click();
	}

	public void checkWarranty( ) throws InterruptedException {
		ElementUtils.expliciteWait(driver, checkWarranty);
		JavaScriptUtils.highLightElement(driver, driver.findElement(checkWarranty));
		driver.findElement(checkWarranty).click();
	}

	public void contactUs( ) throws InterruptedException {
		ElementUtils.expliciteWait(driver, contactUs);
		JavaScriptUtils.highLightElement(driver, driver.findElement(contactUs));
		driver.findElement(contactUs).click();
	}

	public void virtualAgentlink( ) throws InterruptedException {
		ElementUtils.expliciteWait(driver, virtualAgent);
		JavaScriptUtils.highLightElement(driver, driver.findElement(virtualAgent));
		driver.findElement(virtualAgent).click();
	}

	public String printerSetupheader() throws InterruptedException {
		ElementUtils.expliciteWait(driver, printersetupheader);
		String actualTxt = driver.findElement(printersetupheader).getText();
		JavaScriptUtils.highLightElement(driver, driver.findElement(printersetupheader));
		return actualTxt;
	}

	public void printerSetupBtn() throws InterruptedException {
		ElementUtils.expliciteWait(driver, printersetupBtn);
		JavaScriptUtils.scrollInToView(driver, driver.findElement(printersetupBtn));
		JavaScriptUtils.highLightElement(driver, driver.findElement(printersetupBtn));
	}

	public void clickPrinterSetupBtn() throws InterruptedException {
		ElementUtils.expliciteWait(driver, printersetupBtn);
		JavaScriptUtils.scrollInToView(driver, driver.findElement(printersetupBtn));
		JavaScriptUtils.highLightElement(driver, driver.findElement(printersetupBtn));
		driver.findElement(printersetupBtn).click();
	}

	public boolean printerSetuplink() {
		ElementUtils.expliciteWait(driver, setupVideoslink);
		JavaScriptUtils.highLightElement(driver, driver.findElement(setupVideoslink));
		boolean setUp = driver.findElement(setupVideoslink).isDisplayed();
		return setUp;
	}

	public boolean wirelessSetup() {
		ElementUtils.expliciteWait(driver, wirelessSetup);
		JavaScriptUtils.highLightElement(driver, driver.findElement(wirelessSetup));
		boolean wireless = driver.findElement(wirelessSetup).isDisplayed();
		return wireless;
	}


	public String printerSetupvideos() throws InterruptedException {
		ElementUtils.expliciteWait(driver, setupVideoslink);
		JavaScriptUtils.scrollInToView(driver, driver.findElement(setupVideoslink));
		JavaScriptUtils.highLightElement(driver, driver.findElement(setupVideoslink));
		driver.findElement(setupVideoslink).click();
		String actualUrl = driver.getCurrentUrl();
		return actualUrl;
	}

	public String wirelessSupport() throws InterruptedException {
		ElementUtils.expliciteWait(driver, wirelessSetup);
		JavaScriptUtils.scrollInToView(driver, driver.findElement(wirelessSetup));
		JavaScriptUtils.highLightElement(driver, driver.findElement(wirelessSetup));
		driver.findElement(wirelessSetup).click();
		ElementUtils.sleep();
		String actualUrl = driver.getCurrentUrl();
		return actualUrl;

	}

	public void windows11card() throws InterruptedException {
		ElementUtils.expliciteWait(driver, windows11card);
		JavaScriptUtils.scrollInToView(driver, driver.findElement(windows11card));
		JavaScriptUtils.highLightElement(driver, driver.findElement(windows11card));
	}

	public boolean fixScanbtn_availablity() {
		ElementUtils.expliciteWait(driver, fixscanBtn);
		JavaScriptUtils.scrollInToView(driver, driver.findElement(fixscanBtn));
		JavaScriptUtils.highLightElement(driver, driver.findElement(fixscanBtn));
		boolean fixscan = driver.findElement(fixscanBtn).isDisplayed();
		return fixscan;
	}

	public void fixscanBtn() throws InterruptedException {
		ElementUtils.expliciteWait(driver, fixscanBtn);
		JavaScriptUtils.scrollInToView(driver, driver.findElement(fixscanBtn));
		JavaScriptUtils.highLightElement(driver, driver.findElement(fixscanBtn));
		driver.findElement(fixscanBtn).click();
	}


	public boolean MSFTlink() {
		ElementUtils.expliciteWait(driver, MSFTurl);
		JavaScriptUtils.scrollInToView(driver, driver.findElement(MSFTurl));
		JavaScriptUtils.highLightElement(driver, driver.findElement(MSFTurl));
		boolean msft = driver.findElement(MSFTurl).isDisplayed();
		return msft;
	}

	public boolean winSupportlink() {
		ElementUtils.expliciteWait(driver, Windows11SupportURL);
		JavaScriptUtils.scrollInToView(driver, driver.findElement(Windows11SupportURL));
		JavaScriptUtils.highLightElement(driver, driver.findElement(Windows11SupportURL));
		boolean win11 = driver.findElement(Windows11SupportURL).isDisplayed();
		return win11;
	}


	public String Win11supportURL() throws InterruptedException {
		ElementUtils.expliciteWait(driver, Windows11SupportURL);
		JavaScriptUtils.scrollInToView(driver, driver.findElement(Windows11SupportURL));
		JavaScriptUtils.highLightElement(driver, driver.findElement(Windows11SupportURL));
		driver.findElement(Windows11SupportURL).click();
		ElementUtils.sleep();
		String actualUrl = driver.getCurrentUrl();
		return actualUrl;
	}

	public void HPinkTonarCartridges() throws InterruptedException {
		ElementUtils.expliciteWait(driver, HPinkTonercard);
		JavaScriptUtils.highLightElement(driver, driver.findElement(HPinkTonercard));
		System.out.println("HP Ink & Toner Cartridges card has been identified");
	}


	public boolean cartridgesBtn_availablity() {
		ElementUtils.expliciteWait(driver, CompatibleBtn);
		JavaScriptUtils.highLightElement(driver, driver.findElement(CompatibleBtn));
		boolean btn = driver.findElement(CompatibleBtn).isDisplayed();
		return btn;
	}

	public boolean hpinstantink_availablity() {
		ElementUtils.expliciteWait(driver, hpInstantink);
		JavaScriptUtils.highLightElement(driver, driver.findElement(hpInstantink));
		boolean ink = driver.findElement(hpInstantink).isDisplayed();
		return ink;
	}

	public void compatibleCatridgesbtn() throws InterruptedException {
		ElementUtils.expliciteWait(driver, CompatibleBtn);
		JavaScriptUtils.scrollInToView(driver, driver.findElement(CompatibleBtn));
		JavaScriptUtils.highLightElement(driver, driver.findElement(CompatibleBtn));
		driver.findElement(CompatibleBtn).click();
	}

	public void printerOfflinecard() throws InterruptedException {
		ElementUtils.expliciteWait(driver, printerOffline);
		JavaScriptUtils.highLightElement(driver, driver.findElement(printerOffline));
	}

	public boolean printandScanbtn_availablity() {
		ElementUtils.expliciteWait(driver, printScan);
		JavaScriptUtils.highLightElement(driver, driver.findElement(printScan));
		boolean doc = driver.findElement(printScan).isDisplayed();
		return doc;
	}

	public void printScanbtn() throws InterruptedException, AWTException {
		ElementUtils.expliciteWait(driver, printScan);
		JavaScriptUtils.scrollInToView(driver, driver.findElement(printScan));
		JavaScriptUtils.highLightElement(driver, driver.findElement(printScan));
		ElementUtils.sleep();
		driver.findElement(printScan).click();
		ElementUtils.sleep();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public void pfinderTitle() {
		ElementUtils.expliciteWait(driver, pFindertitle);
		JavaScriptUtils.scrollInToView(driver, driver.findElement(pFindertitle));
		JavaScriptUtils.highLightElement(driver, driver.findElement(pFindertitle));
	}

	public String pfinderTitleTxt() {
		ElementUtils.expliciteWait(driver, pFindertitle);
		String txt = driver.findElement(pFindertitle).getText();
		return txt;
	}

	public boolean printScanlink_availablity() {
		ElementUtils.expliciteWait(driver, printScanurl);
		JavaScriptUtils.highLightElement(driver, driver.findElement(printScanurl));
		boolean doc = driver.findElement(printScanurl).isDisplayed();
		return doc;
	}


}
