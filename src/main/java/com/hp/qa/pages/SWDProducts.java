package com.hp.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.hp.qa.util.ElementUtils;
import com.hp.qa.util.JavaScriptUtils;

public class SWDProducts {

	private WebDriver driver;
	private By identifyBreadcrumb = By.xpath("//a[@id='Identify']");
	private By downloadBreadcrumb = By.xpath("//a[@id='Download']");
	private By installBreadcrumb = By.xpath("//a[@id='Install']");
	private By notsignedinRibbon = By.xpath("//*[@class='not-signedin']");
	private By pageHeading = By.xpath("//*[normalize-space(text())='Welcome to HP Software and Drivers']");
	private By selectyourProductHeading = By.xpath("//*[normalize-space(text())='Select a different product type:']");
	private By pritnerTile = By.xpath("//a[@id='Printer']");
	private By laptopTile = By.xpath("//a[@id='Laptop']");
	private By desktopTile = By.xpath("//a[@id='Desktop']");
	private By polyTile = By.xpath("//a[@id='Poly']");
	private By otherTile = By.xpath("//a[@id='Other']");
	private By otherpFinderHeading = By.xpath("//span[contains(text(),'identify your product')]");
	private By pFinderSWDProducts = By.xpath("//*[@class='master-pfinder swdLanding-pfinder']");
	private By locateProductInfo = By.xpath("//*[@id='tooltip_labelinfo_others']");
	private By watchAVideo = By.xpath("//*[@id='tooltip_video_others']");
	private By carousel = By.xpath("//*[@class='section-wrapper swd-configurable-banner']");
	private By headingDeviceSwiper = By
			.xpath("//*[contains(normalize-space(text()),'identify your product to get started')]");
	private By linkViewAllDevices = By.xpath("//*[@id='light-theme-Allproducts']");
	private By carouselContainer = By.xpath("//*[@class='carousel-container']");
	private By addANewProductLink = By.xpath("//*[@id='addproduct']");
	private By headingSearchADifferentProduct = By
			.xpath("//*[contains(normalize-space(text()),'Select a different product type')]");

	public SWDProducts(WebDriver driver) {
		this.driver = driver;
	}

	public String getPageTitle() throws InterruptedException {
		ElementUtils.sleep();
		return driver.getTitle();
	}

	public boolean swdProductsBreadCrumb() {		
			ElementUtils.expliciteWait(driver, identifyBreadcrumb);
			System.out.println("Validating breadcrumb..");
			JavaScriptUtils.highLightElement(driver, driver.findElement(identifyBreadcrumb));
			JavaScriptUtils.highLightElement(driver, driver.findElement(downloadBreadcrumb));
			JavaScriptUtils.highLightElement(driver, driver.findElement(installBreadcrumb));
			System.out.println("Pass: Validate breadcrumb of swd products page");
			return true;		
	}

	public boolean swdProductsSigninRibbonAnonymous() {		
			System.out.println("Validating sign in ribbon..");
			JavaScriptUtils.highLightElement(driver, driver.findElement(notsignedinRibbon));
			JavaScriptUtils.highLightElement(driver, driver.findElement(pageHeading));
			System.out.println("Pass: Validate sign in ribbon of swd products page");
			return true;		
	}

	public boolean swdProductsDeviceSwiperSignedIn() {		
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
			System.out.println("Pass: Validate device swiper of swd products page after signed in");
			return true;		
	}

	public boolean swdProductspFinder() {		
			System.out.println("Validating pFinder section..");
			JavaScriptUtils.highLightElement(driver, driver.findElement(otherpFinderHeading));
			JavaScriptUtils.highLightElement(driver, driver.findElement(pFinderSWDProducts));
			JavaScriptUtils.highLightElement(driver, driver.findElement(locateProductInfo));
			JavaScriptUtils.highLightElement(driver, driver.findElement(watchAVideo));
			System.out.println("Pass: Validate pFinder section of swd products page");
			return true;		
	}

	public boolean swdProductsCarousel() {		
			System.out.println("Validating carousel..");
			JavaScriptUtils.highLightElement(driver, driver.findElement(carousel));
			System.out.println("Pass: Validate carousel of swd products page");
			return true;		
	}

	private void productsRow() {
		JavaScriptUtils.highLightElement(driver, driver.findElement(pritnerTile));
		JavaScriptUtils.highLightElement(driver, driver.findElement(laptopTile));
		JavaScriptUtils.highLightElement(driver, driver.findElement(desktopTile));
		JavaScriptUtils.highLightElement(driver, driver.findElement(otherTile));
		System.out.println("Checking presenece of poly tile..");
		JavaScriptUtils.highLightElement(driver, driver.findElement(polyTile));
	}

	public boolean swdProductsProductsRowAnonymous() {		
			System.out.println("Validating products row..");
			JavaScriptUtils.highLightElement(driver, driver.findElement(selectyourProductHeading));
			productsRow();
			System.out.println("Pass: Validate products row of swd products page");
			return true;		
	}

	public boolean swdProductsProductsRowSignedIn() {		
			System.out.println("Validating products row..");
			JavaScriptUtils.highLightElement(driver, driver.findElement(headingSearchADifferentProduct));
			productsRow();
			System.out.println("Pass: Validate products row of swd products page after signed in");
			return true;		
	}
}
