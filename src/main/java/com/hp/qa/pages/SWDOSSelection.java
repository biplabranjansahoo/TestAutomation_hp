package com.hp.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.hp.qa.util.ElementUtils;
import com.hp.qa.util.JavaScriptUtils;

public class SWDOSSelection {

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
	private By buttonSubmit = By.xpath("//*[@class='submit-button']");
	private By signedInButton = By.xpath("//*[@id='wpr-signin-tablet' and @class='wpr-signin signed']");

	public SWDOSSelection(WebDriver driver) {
		this.driver = driver;
	}

	public String getPageTitle() throws InterruptedException {
		ElementUtils.sleep();
		return driver.getTitle();
	}

	public boolean validateWelcomMessageOSSelectionPage() {		
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

	public boolean swdOSSelectionBreadCrumb() {		
			ElementUtils.expliciteWait(driver, identifyBreadcrumb);
			System.out.println("Validating breadcrumb..");
			JavaScriptUtils.highLightElement(driver, driver.findElement(identifyBreadcrumb));
			JavaScriptUtils.highLightElement(driver, driver.findElement(downloadBreadcrumb));
			JavaScriptUtils.highLightElement(driver, driver.findElement(installBreadcrumb));
			System.out.println("Pass: Validate breadcrumb of swd os selection page");
			return true;		
	}

	public boolean swdOSSelectionProductDetails() {		
			System.out.println("Validating product details..");
			JavaScriptUtils.highLightElement(driver, driver.findElement(productImg));
			JavaScriptUtils.highLightElement(driver, driver.findElement(productName));
			JavaScriptUtils.highLightElement(driver, driver.findElement(supportProduct));
			JavaScriptUtils.highLightElement(driver, driver.findElement(differentProduct));
			System.out.println("Pass: Validate product details of swd os selection page");
			return true;		
	}

	public boolean swdOSSelectionOSSelectionSection() {		
			System.out.println("Validating os selection section..");
			JavaScriptUtils.highLightElement(driver, driver.findElement(twoBoxHeading));
			JavaScriptUtils.highLightElement(driver, driver.findElement(osContainer));
			JavaScriptUtils.highLightElement(driver, driver.findElement(osContainerDropdown));
			JavaScriptUtils.highLightElement(driver, driver.findElement(osVersionContainer));
			JavaScriptUtils.highLightElement(driver, driver.findElement(osVersionContainerDropdown));
			JavaScriptUtils.highLightElement(driver, driver.findElement(bottomHeading1));
			JavaScriptUtils.highLightElement(driver, driver.findElement(bottomHeading2Readmore));
			JavaScriptUtils.highLightElement(driver, driver.findElement(buttonSubmit));
			System.out.println("Pass: Validate os selection section of swd os selection page");
			return true;		
	}

	public boolean swdOSSelectionSignedInButton() {		
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Validating signed in button..");
			JavaScriptUtils.highLightElement(driver, driver.findElement(signedInButton));
			System.out.println("Pass: Validate signed in button of swd os selection page after signed in");
			return true;		
	}
}
