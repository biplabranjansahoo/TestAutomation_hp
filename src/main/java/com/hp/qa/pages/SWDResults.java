package com.hp.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.hp.qa.util.ElementUtils;
import com.hp.qa.util.JavaScriptUtils;

public class SWDResults {

	private WebDriver driver;
	private By identifyBreadcrumb = By.xpath("//a[@id='Identify']");
	private By downloadBreadcrumb = By.xpath("//a[@id='Download']");
	private By installBreadcrumb = By.xpath("//a[@id='Install']");
	private By headingSWDForProduct = By
			.xpath("//*[contains(normalize-space(text()),'Welcome to Software and Drivers for')]");
	private By productImg = By.xpath("//*[@class='product-img']");
	private By productName = By.xpath("//*[@class='product-name']");
	private By supportProduct = By.xpath("//*[@class='support-product']");
	private By differentProduct = By.xpath("//*[@class='different-product']");
	private By twoBoxHeading = By.xpath("//*[@class='two-box-heading']");
	private By osContainer = By.xpath("//*[@class='two-box-container'][1]");
	private By osContainerDropdown = By.xpath("//*[@id='os-container']");
	private By osVersionContainer = By.xpath("//*[@class='two-box-container'][2]");
	private By osVersionContainerDropdown = By.xpath("//*[@id='version-container']");
	private By bottomHeading1 = By.xpath("//*[@class='two-box-bottom-heading']/*[@class='bottom-txt'][1]");
	private By bottomHeading2Readmore = By.xpath("//*[@class='two-box-bottom-heading']/*[@class='bottom-txt'][2]/a");
	private By buttonSubmit = By.xpath("//*[@class='btn']");
	private By signedInButton = By.xpath("//*[@id='wpr-signin-tablet' and @class='wpr-signin signed']");
	private By optionWindows8 = By.xpath("//*[@id='Windows_8']");
	private By optionWindows8Version = By.xpath("//*[@id='Windows_8_-64-bit-']");
	private By chooseDiffOS = By.xpath("//*[@title='Choose a different OS']");
	private By driverDetailSection = By.xpath("//*[@class='driver-detail-container']");
	private By driverVideosSection = By.xpath("//*[@class='videos-wrapper']");

	public SWDResults(WebDriver driver) {
		this.driver = driver;
	}

	public String getPageTitle() throws InterruptedException {
		ElementUtils.sleep();
		return driver.getTitle();
	}

	public boolean validateWelcomMessageResultsPage() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ElementUtils.expliciteWait(driver, headingSWDForProduct);
		JavaScriptUtils.highLightElement(driver, driver.findElement(headingSWDForProduct));
		System.out.println("Pass: Validate welecome message of swd os selection page");
		return true;
	}

	public boolean selectOSAndVersionAndSubmit() {
		ElementUtils.expliciteWait(driver, osContainerDropdown);
		JavaScriptUtils.highLightElement(driver, driver.findElement(osContainerDropdown));
		JavaScriptUtils.clickElementByJS(driver, driver.findElement(osContainerDropdown));
		ElementUtils.sleep(500);
		JavaScriptUtils.clickElementByJS(driver, driver.findElement(optionWindows8));
		ElementUtils.sleep(500);
		JavaScriptUtils.highLightElement(driver, driver.findElement(osVersionContainerDropdown));
		JavaScriptUtils.clickElementByJS(driver, driver.findElement(osVersionContainerDropdown));
		ElementUtils.sleep(500);
		JavaScriptUtils.clickElementByJS(driver, driver.findElement(optionWindows8Version));
		ElementUtils.sleep(500);
		JavaScriptUtils.clickElementByJS(driver, driver.findElement(buttonSubmit));
		System.out.println("Pass: user selects the required os and version");
		ElementUtils.sleep(500);
		return true;
	}

	public boolean swdResultsPageBreadCrumb() {
		ElementUtils.expliciteWait(driver, identifyBreadcrumb);
		System.out.println("Validating breadcrumb..");
		JavaScriptUtils.highLightElement(driver, driver.findElement(identifyBreadcrumb));
		JavaScriptUtils.highLightElement(driver, driver.findElement(downloadBreadcrumb));
		JavaScriptUtils.highLightElement(driver, driver.findElement(installBreadcrumb));
		System.out.println("Pass: Validate breadcrumb of swd results page");
		return true;
	}

	public boolean swdResultsProductDetails() {
		System.out.println("Validating product details..");
		JavaScriptUtils.highLightElement(driver, driver.findElement(productImg));
		JavaScriptUtils.highLightElement(driver, driver.findElement(productName));
		JavaScriptUtils.highLightElement(driver, driver.findElement(supportProduct));
		JavaScriptUtils.highLightElement(driver, driver.findElement(differentProduct));
		JavaScriptUtils.highLightElement(driver, driver.findElement(chooseDiffOS));
		System.out.println("Pass: Validate product details of swd results page");
		return true;
	}

	public boolean swdResultsSection() {
		JavaScriptUtils.highLightElement(driver, driver.findElement(driverDetailSection));
		JavaScriptUtils.highLightElement(driver, driver.findElement(driverVideosSection));
		System.out.println("Pass: Validate results section of swd results page");
		return true;
	}
}
