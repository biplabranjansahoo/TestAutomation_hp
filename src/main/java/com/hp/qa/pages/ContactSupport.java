package com.hp.qa.pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.hp.qa.util.ElementUtils;
import com.hp.qa.util.JavaScriptUtils;

public class ContactSupport {

	private WebDriver driver;
	private By signinbtn = By.xpath("//span[@id='signin-profile-image']/../a");
	private By whyShouldISignin = By.xpath("//p[@class='p supplementalinfotitle']");
	// private By welcomeMsg = By.xpath("//div[@class='signin-exp']/h1");
	private By welcomeText = By.xpath("//h1[@class='text-center anonymise']");
	private By contactWelcomeText = By.xpath("//div[@class='signin-exp']/h1");
	private By contactWelcomeTextNonsign = By.xpath("//h1[@class='title topictitle1']");
	private By quickLinkTilesText = By.xpath("//div[h3[text()='Quick links']]//a");
	private By createAccBtn = By.xpath("//a[@id='createaccount']");
	private By createAccountPageText = By.xpath("//h1[text()='Create account']");
	private By getstartedlink = By.xpath("//a[@id='getstarted']");
	private By username = By.xpath("//input[@id='username']");
	private By next = By.xpath("//button[@id='user-name-form-submit']");
	private By password = By.xpath("//input[@id='password']");
	private By submit = By.xpath("//button[@id='sign-in']");
	// Chose Products Page
	private By quickLinkText = By.xpath("//h3[text()='Quick links']");
	private By productSubHeading = By.xpath("//h2[contains(text(),'Choose from your saved')]");
	private By viewAllMyProductLink = By
			.xpath("//app-device-carousel/div/app-toggle/div/a[1]/span");
	private By addMyProductLink = By
			.xpath("//a[@id='addproduct']//span[@class='expand-text'][normalize-space()='Add a new product']");
	private By chooseProductsPageTitle = By.xpath("//h1[contains(text(),'Which')]");
	private By leftSwipperBtn = By
			.xpath("//div[@class='blue-nav-device-carousel']//a[@aria-label='go to previous slide']");
	private By rightSwipperBtn = By
			.xpath("//div[@class='blue-nav-device-carousel']//a[@aria-label='go to next slide']");
	private By sAsTile = By.xpath("//a[@title='Subscriptions, apps, and services']");
	private By sAsHeader = By.xpath("//div[@class='title']/h1");
	private By printerTile = By.xpath("//span[normalize-space()='Printers']");
	private By printerPageHeader = By.xpath("//h1[normalize-space()='Which printer question can we help you with?']");
	private By laptopTile = By.xpath("//div[@id='Laptops']//a[@title='Laptops']");
	private By laptopPageHeader = By.xpath("//h1[normalize-space()='Which laptop question can we help you with?']");
	private By desktopTile = By.xpath("//div[@id='Desktops']//a[@title='Desktops']");
	private By desktopPageHeader = By.xpath("//h1[normalize-space()='Which desktop question can we help you with?']");
	private By monitorMiceHardwareTile = By.xpath("//span[normalize-space()='Monitors, mice and other hardware']");
	private By monitorMiceHardwareHeader = By
			.xpath("//h1[contains(text(),'Which monitor, mouse or other hardware question ca')]");
	private By polyTileHeader = By.xpath("//h1[contains(text(),'Choose from your saved products')]");
	private By polyTile = By.xpath("//a[@title='Poly products']");
	private By hpAllinPlanTile = By.xpath("//div[@id='Tile3_Hpone']//a[@title='HP All-In Plan']");
	private By hpInstantLink = By.xpath("//div[@id='Tile1_Instant_Ink']//a[@title='Instant Ink']");
	private By hpInstantInkHeader = By.xpath("//h1[normalize-space()='HP Instant Ink series']");
	private By hpPlusTile = By.xpath("//div[@id='Tile2_HP+']//a[@title='HP+']");
	private By hpPlusHeader = By.xpath("//h1[normalize-space()='Which product are you contacting us about?']");
	private By LearnMoreLink = By.xpath("//span[@class='instant-link']//a[@id='learnmoreinstantink']");
	private By serviceContainerBtn = By.xpath("//button[@id='apps_services']");
	private By Hp3rdSoftwareBtn = By.xpath("//button[@id='HP_3D_Software']");
	private By submitBtn = By.xpath("//span[@title='Submit']");
	private By differentProductLink = By.xpath("//a[@id='selectdiffproducttype']");
	private By printerSetupTile = By.xpath("//a[@id='Tile1_contact_topic_print_setup']");
	private By printerSetupClickEle = By.xpath("//a[@id='Tile1_contact_topic_print_setup']");
	private By printerSetupHeader = By.xpath("//h1[normalize-space()='Printer Setup:']");
	private By OtherTile = By.xpath("//a[@id='Tile9_contact_topic_print_other']");
	private By OtherTileEle = By.xpath("//a[contains(@id,\"contact_topic_print_other\")]/div");
	private By ChooseDiffLink = By.xpath("//a[@id='selectdiffproducttype']");
	private By BatteryProblemIssueTile = By.xpath("//a[@id='Tile1_contact_topic_battery_adapter']");
	private By BatteryProblemHeader = By.xpath("//h1[normalize-space()='Problem with battery or adapter:']");
	private By OtherIssueLaptopTile = By.xpath("//a[@id='Tile10_contact_topic_laptop_other']");
	private By OtherIssueLaptopPageHeader = By.xpath("//h1[normalize-space()='Other:']");
	private By storageIssueTile = By.xpath("//a[@title='Storage issue']");
	private By storageIssueHeader = By.xpath("//h1[normalize-space()='Storage issue:']");
	private By OtherIssuedesktopHeader = By.xpath("//h1[normalize-space()='Other:']");
	private By lcdIssueTile = By.xpath("//a[@title='LCD issue']");
	private By lcdIssueHeader = By.xpath("//h1[normalize-space()='LCD issue:']");
	
	
	public ContactSupport(WebDriver driver) {
		this.driver = driver;
	}

	public String getContactPageTitle() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, contactWelcomeText);
		JavaScriptUtils.highLightElement(driver, driver.findElement(contactWelcomeText));
		String pageTitle = driver.findElement(contactWelcomeText).getText();
		return pageTitle;
	}

	public String getNonSignedContactPageTitle() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, contactWelcomeTextNonsign);
		JavaScriptUtils.highLightElement(driver, driver.findElement(contactWelcomeTextNonsign));
		String pageTitle = driver.findElement(contactWelcomeTextNonsign).getText();
		return pageTitle;
	}

	public String getSignButtonText() throws InterruptedException {
		ElementUtils.sleep();
		return driver.findElement(signinbtn).getText();
	}

	public String whyShouldISignInLink() throws InterruptedException {
		ElementUtils.expliciteWait(driver, whyShouldISignin);
		JavaScriptUtils.highLightElement(driver, driver.findElement(whyShouldISignin));
		String whySingin = driver.findElement(whyShouldISignin).getText();
		return whySingin;
	}

	public String validateSigninBtn() throws InterruptedException {
		String signinBtn = "";
		try {
			if (signinbtn != null) {
				ElementUtils.expliciteWait(driver, signinbtn);
				JavaScriptUtils.highLightElement(driver, driver.findElement(signinbtn));
				String signinBtnTxt = driver.findElement(signinbtn).getText();
				signinBtn = signinBtn + signinBtnTxt;
			}
			return signinBtn;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public String welcomeTxt() throws InterruptedException {
		Thread.sleep(2000);
		ElementUtils.expliciteWait(driver, contactWelcomeText);
		JavaScriptUtils.highLightElement(driver, driver.findElement(contactWelcomeText));
		String welcomeTxt = driver.findElement(contactWelcomeText).getText();
		String[] welcomeText = welcomeTxt.split(",");
		return welcomeText[1].trim();
	}

	public void quickLinksTilesClick() throws InterruptedException {
		ElementUtils.sleep();
		List<WebElement> wel2 = driver.findElements(quickLinkTilesText);
		for (int i = 0; i < wel2.size(); i++) {
			WebElement element = driver.findElements(quickLinkTilesText).get(i);
			JavaScriptUtils.highLightElement(driver, element);
			JavaScriptUtils.clickElementByJS(driver, element);
			Thread.sleep(2000);
			driver.navigate().back();
		}
	}

	public String validateCreateAccountBtn() throws InterruptedException {

		String createAccountBtn = "";
		try {
			if (createAccBtn != null) {
				ElementUtils.expliciteWait(driver, createAccBtn);
				JavaScriptUtils.highLightElement(driver, driver.findElement(createAccBtn));
				String accBtn = driver.findElement(createAccBtn).getText();
				createAccountBtn = createAccountBtn + accBtn;
			}
			return createAccountBtn;
		} catch (Exception e) {
			return null;
		}
	}

	public void clickCreateAccBtn() {
		driver.findElement(createAccBtn).click();
	}

	public String getAccountPageTitle() throws InterruptedException {
		ElementUtils.expliciteWait(driver, createAccountPageText);
		String accountPageTitle = driver.findElement(createAccountPageText).getText();
		return accountPageTitle;
	}

	public String validateGetStartedlink() throws InterruptedException {

		String getStarted = "";
		try {
			if (getstartedlink != null) {
				ElementUtils.expliciteWait(driver, getstartedlink);
				JavaScriptUtils.highLightElement(driver, driver.findElement(getstartedlink));
				String getStartedTxt = driver.findElement(getstartedlink).getText();
				getStarted = getStarted + getStartedTxt;
			}
			return getStarted;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public void clickGetStartedBeforeSignin() {
		driver.findElement(getstartedlink).click();
	}

	public String chooseProdcuctsPageTitle() {
		ElementUtils.expliciteWait(driver, chooseProductsPageTitle);
		String chooseProductsTxt = driver.findElement(chooseProductsPageTitle).getText();
		return chooseProductsTxt;
	}

	public String quickLinksText() throws InterruptedException {
		ElementUtils.expliciteWait(driver, quickLinkText);
		JavaScriptUtils.highLightElement(driver, driver.findElement(quickLinkText));
		String quickLinkTxt = driver.findElement(quickLinkText).getText();
		return quickLinkTxt;
	}

	public String subHeadingText() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, productSubHeading);
		JavaScriptUtils.highLightElement(driver, driver.findElement(productSubHeading));
		ElementUtils.sleep();
		String productSubHeadingTxt = driver.findElement(productSubHeading).getText();
		return productSubHeadingTxt;
	}

	public void userCredentials(String user, String pwd) throws InterruptedException {
	        ElementUtils.expliciteWait(driver, signinbtn);
	        JavaScriptUtils.highLightElement(driver, driver.findElement(signinbtn));
	        driver.findElement(signinbtn).click();
	        ElementUtils.expliciteWait(driver, username);
	        JavaScriptUtils.highLightElement(driver, driver.findElement(username));
	        driver.findElement(username).sendKeys(user);
	        ElementUtils.expliciteWait(driver, next);
	        JavaScriptUtils.highLightElement(driver, driver.findElement(next));
	        driver.findElement(next).click();
	        ElementUtils.expliciteWait(driver, password);
	        JavaScriptUtils.highLightElement(driver, driver.findElement(password));
	        driver.findElement(password).sendKeys(pwd);
	        ElementUtils.expliciteWait(driver, submit);
	        JavaScriptUtils.highLightElement(driver, driver.findElement(submit));
	        driver.findElement(submit).click();
	        ElementUtils.sleep();
			    driver.navigate().refresh();
			    ElementUtils.sleep();
			    driver.navigate().refresh();
			    ElementUtils.sleep();
	}

	public String viewAllMyProductAvailbility() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, viewAllMyProductLink);
		JavaScriptUtils.highLightElement(driver, driver.findElement(viewAllMyProductLink));
		String viewAllMyProductLinkTxt = driver.findElement(viewAllMyProductLink).getText();
		return viewAllMyProductLinkTxt;
	}

	public void viewAllMyProductClick() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, viewAllMyProductLink);
		JavaScriptUtils.highLightElement(driver, driver.findElement(viewAllMyProductLink));
		driver.findElement(viewAllMyProductLink).click();
	}

	public String addNewProductLinkAvailibilty() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, addMyProductLink);
		JavaScriptUtils.highLightElement(driver, driver.findElement(addMyProductLink));
		String addNewProductLinkTxt = driver.findElement(addMyProductLink).getText();
		return addNewProductLinkTxt;
	}

	public void addNewProductLinkClick() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, addMyProductLink);
		JavaScriptUtils.highLightElement(driver, driver.findElement(addMyProductLink));
		driver.findElement(addMyProductLink).click();
	}

	public void leftCarousalBtnAvailibility() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, leftSwipperBtn);
		JavaScriptUtils.highLightElement(driver, driver.findElement(leftSwipperBtn));
	}

	public void rightCarousalBtnAvailibility() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, rightSwipperBtn);
		JavaScriptUtils.highLightElement(driver, driver.findElement(rightSwipperBtn));
	}

	public void leftCarousalBtnFunctionality() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, leftSwipperBtn);
		JavaScriptUtils.highLightElement(driver, driver.findElement(leftSwipperBtn));
		driver.findElement(leftSwipperBtn).click();
	}

	public void rightCarousalBtnFunctionality() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, rightSwipperBtn);
		JavaScriptUtils.highLightElement(driver, driver.findElement(rightSwipperBtn));
		driver.findElement(rightSwipperBtn).click();
	}

	public String sAsTileAvailibility() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, sAsTile);
		JavaScriptUtils.highLightElement(driver, driver.findElement(sAsTile));
		String sAsTileBtn = driver.findElement(sAsTile).getText();
		return sAsTileBtn;
	}

	public void sAsTileFunctionality() throws InterruptedException {
		ElementUtils.expliciteWait(driver, sAsTile);
		JavaScriptUtils.highLightElement(driver, driver.findElement(sAsTile));
		String sAsTileBtn = driver.findElement(sAsTile).getText();
		driver.findElement(sAsTile).click();
	}

	public String subscriptionHeaderCheck() throws InterruptedException {
		ElementUtils.expliciteWait(driver, sAsHeader);
		JavaScriptUtils.highLightElement(driver, driver.findElement(sAsHeader));
		String sasHeader = driver.findElement(sAsHeader).getText();
		return sasHeader;
	}

	public String printerTileAvailibility() throws InterruptedException {
		ElementUtils.expliciteWait(driver, printerTile);
		JavaScriptUtils.highLightElement(driver, driver.findElement(printerTile));
		String printerTileText = driver.findElement(printerTile).getText();
		return printerTileText;
	}

	public void printerTileFunctionality() throws InterruptedException {
		ElementUtils.expliciteWait(driver, printerTile);
		JavaScriptUtils.highLightElement(driver, driver.findElement(printerTile));
		driver.findElement(printerTile).click();
	}

	public String printerPageHeaderCheck() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, printerPageHeader);
		JavaScriptUtils.highLightElement(driver, driver.findElement(printerPageHeader));
		String printerPageHeaderText = driver.findElement(printerPageHeader).getText();
		return printerPageHeaderText;
	}

	public String laptopTileAvailibility() throws InterruptedException {
		ElementUtils.expliciteWait(driver, laptopTile);
		JavaScriptUtils.highLightElement(driver, driver.findElement(laptopTile));
		String laptopTileText = driver.findElement(laptopTile).getText();
		return laptopTileText;
	}

	public void laptopTileFunctionality() throws InterruptedException {
		ElementUtils.expliciteWait(driver, laptopTile);
		JavaScriptUtils.highLightElement(driver, driver.findElement(laptopTile));
		JavaScriptUtils.clickElementByJS(driver, driver.findElement(laptopTile));
	}

	public String laptopPageHeaderCheck() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, laptopPageHeader);
		JavaScriptUtils.highLightElement(driver, driver.findElement(laptopPageHeader));
		String printerPageHeaderText = driver.findElement(laptopPageHeader).getText();
		System.out.println(printerPageHeaderText);
		return printerPageHeaderText;
	}

	public String desktopTileAvailibility() throws InterruptedException {
		ElementUtils.expliciteWait(driver, desktopTile);
		JavaScriptUtils.highLightElement(driver, driver.findElement(desktopTile));
		JavaScriptUtils.scrollInToView(driver, driver.findElement(desktopTile));
		String desktopTileText = driver.findElement(desktopTile).getText();
		return desktopTileText;
	}

	public void desktopTileFunctionality() throws InterruptedException {
		ElementUtils.expliciteWait(driver, desktopTile);
		JavaScriptUtils.highLightElement(driver, driver.findElement(desktopTile));
		JavaScriptUtils.clickElementByJS(driver, driver.findElement(desktopTile));
	}

	public String desktopPageHeaderCheck() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, desktopPageHeader);
		JavaScriptUtils.highLightElement(driver, driver.findElement(desktopPageHeader));
		String desktopPageHeaderText = driver.findElement(desktopPageHeader).getText();
		return desktopPageHeaderText;
	}

	public String monitorMiceHardwareTileAvailibility() throws InterruptedException {
		ElementUtils.expliciteWait(driver, monitorMiceHardwareTile);
		JavaScriptUtils.highLightElement(driver, driver.findElement(monitorMiceHardwareTile));
		String monitorMiceHardwareTileText = driver.findElement(monitorMiceHardwareTile).getText();
		return monitorMiceHardwareTileText;
	}

	public void monitorMiceHardwareTileFunctionality() throws InterruptedException {
		ElementUtils.expliciteWait(driver, monitorMiceHardwareTile);
		JavaScriptUtils.highLightElement(driver, driver.findElement(monitorMiceHardwareTile));
		JavaScriptUtils.clickElementByJS(driver, driver.findElement(monitorMiceHardwareTile));
	}

	public String monitorMiceHardwarePageHeaderCheck() throws InterruptedException {
		ElementUtils.expliciteWait(driver, monitorMiceHardwareHeader);
		JavaScriptUtils.highLightElement(driver, driver.findElement(monitorMiceHardwareHeader));
		String monitorMiceHardwareHeaderPageHeaderText = driver.findElement(monitorMiceHardwareHeader).getText();
		return monitorMiceHardwareHeaderPageHeaderText;
	}

	public String polyTileAvailibility() throws InterruptedException {
		ElementUtils.expliciteWait(driver, polyTile);
		JavaScriptUtils.highLightElement(driver, driver.findElement(polyTile));
		String polyTileText = driver.findElement(polyTile).getText();
		return polyTileText;
	}

	public void polyTileFunctionality() throws InterruptedException {
		ElementUtils.expliciteWait(driver, polyTile);
		JavaScriptUtils.highLightElement(driver, driver.findElement(polyTile));
		JavaScriptUtils.clickElementByJS(driver, driver.findElement(polyTile));
	}

	public String polyPageHeaderCheck() throws InterruptedException {
		ElementUtils.expliciteWait(driver, polyTileHeader);
		JavaScriptUtils.highLightElement(driver, driver.findElement(polyTileHeader));
		String polyPageHeaderText = driver.findElement(polyTileHeader).getText();
		return polyPageHeaderText;
	}

	public String HpAllInPlanAvailibility() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, hpAllinPlanTile);
		JavaScriptUtils.highLightElement(driver, driver.findElement(hpAllinPlanTile));
		ElementUtils.sleep();
		String hpAllinPlanTileText = driver.findElement(hpAllinPlanTile).getText();
		System.out.println(hpAllinPlanTileText);
		return hpAllinPlanTileText;
	}

	public void hpAllInPlanFunctionality() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, hpAllinPlanTile);
		JavaScriptUtils.highLightElement(driver, driver.findElement(hpAllinPlanTile));
		ElementUtils.sleep();
		driver.findElement(hpAllinPlanTile).click();
	}

	public String HpInstantInkAvailibility() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, hpInstantLink);
		JavaScriptUtils.highLightElement(driver, driver.findElement(hpInstantLink));
		ElementUtils.sleep();
		String hpInstantInkText = driver.findElement(hpInstantLink).getText();
		System.out.print(hpInstantInkText);
		return hpInstantInkText;
	}

	public String HpInstant() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, hpInstantInkHeader);
		ElementUtils.sleep();
		JavaScriptUtils.highLightElement(driver, driver.findElement(hpInstantInkHeader));
		String hpInstant = driver.findElement(hpInstantInkHeader).getText();
		return hpInstant;
	}

	public void HpInstantInkClick() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, hpInstantLink);
		JavaScriptUtils.highLightElement(driver, driver.findElement(hpInstantLink));
		ElementUtils.sleep();
		driver.findElement(hpInstantLink).click();
	}

	public void HpPlusFunctionality() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, hpPlusTile);
		JavaScriptUtils.highLightElement(driver, driver.findElement(hpPlusTile));
		ElementUtils.sleep();
		driver.findElement(hpPlusTile).click();
	}

	public String HpPlusAvailibility() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, hpPlusTile);
		JavaScriptUtils.highLightElement(driver, driver.findElement(hpPlusTile));
		ElementUtils.sleep();
		String hpPlusTileText = driver.findElement(hpPlusTile).getText();
		System.out.println(hpPlusTileText);
		return hpPlusTileText;
	}

	public String HpPlusHeaderCheck() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, hpPlusHeader);
		JavaScriptUtils.highLightElement(driver, driver.findElement(hpPlusHeader));
		ElementUtils.sleep();
		String hpPlusHeaderText = driver.findElement(hpPlusHeader).getText();
		System.out.println(hpPlusHeaderText);
		return hpPlusHeaderText;
	}

	public String hpInstantInk() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, LearnMoreLink);
		ElementUtils.sleep();
		JavaScriptUtils.highLightElement(driver, driver.findElement(LearnMoreLink));
		String hpInstantInk = driver.findElement(LearnMoreLink).getText();
		return hpInstantInk;
	}

	public void HpInstantInkLinkClick() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, LearnMoreLink);
		JavaScriptUtils.highLightElement(driver, driver.findElement(LearnMoreLink));
		ElementUtils.sleep();
		driver.findElement(LearnMoreLink).click();
	}

	public void selectDropDown() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, serviceContainerBtn);
		ElementUtils.sleep();
		driver.findElement(serviceContainerBtn).click();
		driver.findElement(Hp3rdSoftwareBtn).click();
		driver.findElement(submitBtn).click();
	}

	public String submitBtnCheck() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, submitBtn);
		JavaScriptUtils.highLightElement(driver, driver.findElement(submitBtn));
		String SubmitBtnText = driver.findElement(submitBtn).getText();
		return SubmitBtnText;
	}

	public void submitBtnClick() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, submitBtn);
		ElementUtils.sleep();
		driver.findElement(serviceContainerBtn).click();
		ElementUtils.sleep();
		driver.findElement(Hp3rdSoftwareBtn).click();
		ElementUtils.sleep();
		driver.findElement(submitBtn).click();
	}

	public String chooseDifferentProductTypeCheck() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, differentProductLink);
		ElementUtils.sleep();
		JavaScriptUtils.highLightElement(driver, driver.findElement(differentProductLink));
		String diffProductLinkText = driver.findElement(differentProductLink).getText();
		return diffProductLinkText;
	}

	public void chooseDifferentProductTypeClick() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, differentProductLink);
		ElementUtils.sleep();
		driver.findElement(differentProductLink).click();
	}

	public String printerSetupTileAvailable() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, printerSetupTile);
		JavaScriptUtils.highLightElement(driver, driver.findElement(printerSetupTile));
		String printerTileText = driver.findElement(printerSetupTile).getText();
		return printerTileText;
	}

	public void printerSetupTileClick() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, printerSetupClickEle);
		ElementUtils.sleep();
		driver.findElement(printerSetupClickEle).click();
	}

	public String printerSetupHeaderCheck() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, printerSetupHeader);
		ElementUtils.sleep();
		JavaScriptUtils.highLightElement(driver, driver.findElement(printerSetupHeader));
		String printerHeaderText = driver.findElement(printerSetupHeader).getText();
		return printerHeaderText;
	}

	public String OtherTileVisible() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, OtherTile);
		ElementUtils.sleep();
		JavaScriptUtils.highLightElement(driver, driver.findElement(OtherTile));
		String OtherTileTxt = driver.findElement(OtherTile).getText();
		return OtherTileTxt;
	}

	public void OtherTileClick() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, OtherTileEle);
		JavaScriptUtils.highLightElement(driver, driver.findElement(OtherTileEle));
		ElementUtils.sleep();
		driver.findElement(OtherTileEle).click();
	}

	public String ChooseProductTypeAvailibility() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, ChooseDiffLink);
		ElementUtils.sleep();
		JavaScriptUtils.highLightElement(driver, driver.findElement(ChooseDiffLink));
		String ChooseDiffLinkTxt = driver.findElement(ChooseDiffLink).getText();
		return ChooseDiffLinkTxt;
	}

	public void ChooseProductTypeFunctionality() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, ChooseDiffLink);
		ElementUtils.sleep();
		driver.findElement(ChooseDiffLink).click();
	}

	public String BatteryIssuesAvailibility() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, BatteryProblemIssueTile);
		ElementUtils.sleep();
		JavaScriptUtils.highLightElement(driver, driver.findElement(BatteryProblemIssueTile));
		String BattertyIssueTileTxt = driver.findElement(BatteryProblemIssueTile).getText();
		return BattertyIssueTileTxt;
	}

	public void BatteryIssuesFunctionality() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, BatteryProblemIssueTile);
		ElementUtils.sleep();
		driver.findElement(BatteryProblemIssueTile).click();
	}

	public String BatteryIssueHeaderCheck() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, BatteryProblemHeader);
		ElementUtils.sleep();
		JavaScriptUtils.highLightElement(driver, driver.findElement(BatteryProblemHeader));
		String BatteryIssueHeaderText = driver.findElement(BatteryProblemHeader).getText();
		return BatteryIssueHeaderText;
	}

	public String OtherIssuesAvailibility() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, OtherIssueLaptopTile);
		ElementUtils.sleep();
		JavaScriptUtils.highLightElement(driver, driver.findElement(OtherIssueLaptopTile));
		String LaptopOtherTileTxt = driver.findElement(OtherIssueLaptopTile).getText();
		return LaptopOtherTileTxt;
	}

	public void OtherIssuesFunctionality() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, OtherIssueLaptopTile);
		ElementUtils.sleep();
		driver.findElement(OtherIssueLaptopTile).click();
	}

	public String OtherIssueHeaderCheck() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, OtherIssueLaptopPageHeader);
		ElementUtils.sleep();
		JavaScriptUtils.highLightElement(driver, driver.findElement(OtherIssueLaptopPageHeader));
		String BatteryIssueHeaderText = driver.findElement(OtherIssueLaptopPageHeader).getText();
		return BatteryIssueHeaderText;
	}

	public String storageIssuesAvailibility() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, storageIssueTile);
		ElementUtils.sleep();
		JavaScriptUtils.highLightElement(driver, driver.findElement(storageIssueTile));
		String StorageTileTxt = driver.findElement(storageIssueTile).getText();
		return StorageTileTxt;
	}

	public void storageIssuesFunctionality() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, storageIssueTile);
		ElementUtils.sleep();
		driver.findElement(storageIssueTile).click();
	}

	public String StorageIssueHeaderCheck() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, storageIssueHeader);
		ElementUtils.sleep();
		JavaScriptUtils.highLightElement(driver, driver.findElement(storageIssueHeader));
		String StorageIssueHeaderText = driver.findElement(storageIssueHeader).getText();
		return StorageIssueHeaderText;
	}

	public String OtherDesktopIssueHeaderCheck() throws InterruptedException {
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, OtherIssuedesktopHeader);
		ElementUtils.sleep();
		JavaScriptUtils.highLightElement(driver, driver.findElement(OtherIssuedesktopHeader));
		String desktopOtherIssueHeaderText = driver.findElement(OtherIssuedesktopHeader).getText();
		return desktopOtherIssueHeaderText;
	}
	
	public String lcdIssuesAvailibility() throws InterruptedException{
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, lcdIssueTile);
		ElementUtils.sleep();
		JavaScriptUtils.highLightElement(driver, driver.findElement(lcdIssueTile));
		String lcdIssueTileTxt = driver.findElement(lcdIssueTile).getText();
		return lcdIssueTileTxt;
	}
	
	public void lcdIssuesFunctionality() throws InterruptedException{
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, lcdIssueTile);
	    ElementUtils.sleep();
	    driver.findElement(lcdIssueTile).click();
	}
	
	public String lcdIssueHeaderCheck() throws InterruptedException{
		ElementUtils.sleep();
		ElementUtils.expliciteWait(driver, lcdIssueHeader);
	    ElementUtils.sleep();
	    JavaScriptUtils.highLightElement(driver, driver.findElement(lcdIssueHeader));
	    String lcdIssueHeaderText = driver.findElement(lcdIssueHeader).getText();
		return lcdIssueHeaderText;
	}

}
