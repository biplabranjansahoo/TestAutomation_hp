package com.hp.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.hp.qa.util.ElementUtils;
import com.hp.qa.util.JavaScriptUtils;

public class SWDLanding {

	private WebDriver driver;
	private By identifyBreadcrumb = By.xpath("//a[@id='Identify']");
	private By downloadBreadcrumb = By.xpath("//a[@id='Download']");
	private By installBreadcrumb = By.xpath("//a[@id='Install']");
	private By notsignedinRibbon = By.xpath("//*[@class='not-signedin']");
	private By pageHeading = By.xpath("//*[normalize-space(text())='Welcome to HP Software and Drivers']");
	private By selectyourProductHeading = By.xpath("//*[normalize-space(text())='Select your product type below']");
	private By pritnerTile = By.xpath("//a[@id='Printer']");
	private By laptopTile = By.xpath("//a[@id='Laptop']");
	private By desktopTile = By.xpath("//a[@id='Desktop']");
	private By polyTile = By.xpath("//a[@id='PolyTile']");
	private By otherTile = By.xpath("//a[@id='Other']");
	private By printerpFinderHeading = By.xpath("//*[contains(text(),'identify your printer')]");
	private By headingDeviceSwiper = By
			.xpath("//*[contains(normalize-space(text()),'identify your product to get started')]");
	private By linkViewAllDevices = By.xpath("//*[@id='light-theme-Allproducts']");
	private By carouselContainer = By.xpath("//*[@class='carousel-container']");
	private By addANewProductLink = By.xpath("//*[@id='addproduct']");
	private By headingSearchADifferentProduct = By
			.xpath("//*[contains(normalize-space(text()),'search for a different product')]");
	private By otherpFinderHeading = By.xpath("//span[contains(text(),'identify your product')]");

	public SWDLanding(WebDriver driver) {
		this.driver = driver;
	}

	public String getPageTitle() throws InterruptedException {
		ElementUtils.sleep();
		return driver.getTitle();
	}

	public boolean swdLandingBreadCrumb() {		
			ElementUtils.expliciteWait(driver, identifyBreadcrumb);
			System.out.println("Validating breadcrumb..");
			JavaScriptUtils.highLightElement(driver, driver.findElement(identifyBreadcrumb));
			JavaScriptUtils.highLightElement(driver, driver.findElement(downloadBreadcrumb));
			JavaScriptUtils.highLightElement(driver, driver.findElement(installBreadcrumb));
			System.out.println("Pass: Validate breadcrumb of swd landing page");
			return true;		
	}

	public boolean swdSignInRibbonAnonymous() {		
			System.out.println("Validating sign in ribbon..");
			JavaScriptUtils.highLightElement(driver, driver.findElement(notsignedinRibbon));
			JavaScriptUtils.highLightElement(driver, driver.findElement(pageHeading));
			System.out.println("Pass: Validate sign in ribbon of swd landing page");
			return true;		
	}

	public boolean swdDeviceSwiperSignedIn() {		
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Validating device swiper..");
			JavaScriptUtils.highLightElement(driver, driver.findElement(pageHeading));
			JavaScriptUtils.highLightElement(driver, driver.findElement(headingDeviceSwiper));
			JavaScriptUtils.highLightElement(driver, driver.findElement(linkViewAllDevices));
			JavaScriptUtils.highLightElement(driver, driver.findElement(carouselContainer));
			JavaScriptUtils.highLightElement(driver, driver.findElement(addANewProductLink));
			System.out.println("Pass: Validate device swiper of swd landing page after signed in");
			return true;		
	}

	private void productRowIcons() {
		JavaScriptUtils.highLightElement(driver, driver.findElement(pritnerTile));
		JavaScriptUtils.highLightElement(driver, driver.findElement(laptopTile));
		JavaScriptUtils.highLightElement(driver, driver.findElement(desktopTile));
		JavaScriptUtils.highLightElement(driver, driver.findElement(otherTile));
		System.out.println("Checking presenece of poly tile..");
		JavaScriptUtils.highLightElement(driver, driver.findElement(polyTile));
	}

	public boolean swdProductsRowAnonymous() {		
			System.out.println("Validating products row..");
			JavaScriptUtils.highLightElement(driver, driver.findElement(selectyourProductHeading));
			productRowIcons();
			System.out.println("Pass: Validate products row of swd landing page");
			return true;		
	}

	public boolean swdProductsRowSignedIn() {		
			System.out.println("Validating products row..");
			JavaScriptUtils.highLightElement(driver, driver.findElement(headingSearchADifferentProduct));
			productRowIcons();
			System.out.println("Pass: Validate products row of swd landing page after signed in");
			return true;		
	}

	public boolean clickPrinterTileSwdPage() {		
			ElementUtils.expliciteWait(driver, pritnerTile);
			JavaScriptUtils.highLightElement(driver, driver.findElement(pritnerTile));
			JavaScriptUtils.clickElementByJS(driver, driver.findElement(pritnerTile));
			ElementUtils.expliciteWait(driver, printerpFinderHeading);
			JavaScriptUtils.highLightElement(driver, driver.findElement(printerpFinderHeading));
			System.out.println("Pass: Click printer tile and validate the redirection");
			return true;		
	}

	public boolean clickOtherTileSwdPage() {		
			ElementUtils.expliciteWait(driver, otherTile);
			JavaScriptUtils.highLightElement(driver, driver.findElement(otherTile));
			JavaScriptUtils.clickElementByJS(driver, driver.findElement(otherTile));
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ElementUtils.expliciteWait(driver, otherpFinderHeading);
			JavaScriptUtils.highLightElement(driver, driver.findElement(otherpFinderHeading));
			System.out.println("Pass: Click other product tile and validate the redirection");
			return true;		
	}
}
