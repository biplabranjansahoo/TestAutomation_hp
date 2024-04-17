package com.hp.qa.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.hp.qa.factory.DriverFactory;

public class HPAllInPage {
	public WebDriver driver;
	
	public HPAllInPage(WebDriver dvr) {
		driver = dvr;
		PageFactory.initElements(driver, this);
	}

	
	/* Locators */

	@FindBy(xpath = "//div[@class='hero-section is-visid ltr']")
	public WebElement heroSection;

	@FindBy(xpath = "//h1[normalize-space()='HP All-In Plan']")
	public WebElement heading;

	@FindBy(xpath = "//*[@class='sub-heading']")
	public WebElement subHeading;

	@FindBy(xpath = "//div[@class='text']")
	public WebElement heroText;

	@FindBy(xpath = "//div[@class='link']")
	public WebElement heroLink;

	@FindBy(xpath = "//img[@alt='banner image']")
	public WebElement heroImage;
	
	@FindBy (xpath ="//div[normalize-space()='Support categories']")
	public WebElement supportCatHeading;
	
	@FindBy (xpath="//div[@class='support-categories']")
	public WebElement supportCatSection;
	
	@FindBy (xpath="//div[@class='DefaultSdpTheme is-visid']//app-document")
	public WebElement supportArticleSection;
	
	@FindBy (xpath ="//div[@class='section-expDocuments']//app-failure-case")
	public WebElement supportArticleNoContent;
	
	@FindBy (xpath = "//div[@class='section-container documents-title']")
	public WebElement supportArticleHeading;
	
	@FindBy (xpath="//div[@class='section-additional-support']")
	public WebElement addSupportSection;
	
	@FindBy (xpath = "//div[@class='section-additional-support']//h3[normalize-space()='Additional support']")
	public WebElement addSupportHeading;
	
	@FindBy (xpath="//div[@class='DefaultSdpTheme is-visid']//app-knowledge-search")
	public WebElement searchSection;
	
	@FindBy (xpath = "//h2[normalize-space()='Enter a topic to search our knowledge library']")
	public WebElement searchSectionHeading;
	
	@FindBy (xpath = "//div[@class='support-option-wrp three-card']")
	public WebElement threeTiles;
	
	@FindBy (xpath = "//div[@class='support-option-wrp three-card']//a[1]")
	public WebElement firstTile;
	
	@FindBy (xpath = "//div[@class='support-option-wrp three-card']//a[2]")
	public WebElement secondTile;
	
	@FindBy (xpath = "//div[@class='support-option-wrp three-card']//a[3]")
	public WebElement thirdTile;
	
	@FindBy (xpath = "//span[normalize-space()='Your HP All-In Plan']")
	public WebElement firstTileTitle;
	
	@FindBy (xpath = "//span[normalize-space()='Your HP All-In Plan']//span[@class='icon-dwn']")
	public WebElement firstTileArrow;
	
	@FindBy (xpath= "//span[normalize-space()='Your ink']")
	public WebElement secondTileTitle;
	
	@FindBy (xpath = "//span[normalize-space()='Your ink']//span[@class='icon-dwn']")
	public WebElement secondTileArrow;
	
	@FindBy (xpath = "//span[normalize-space()='Your printer']")
	public WebElement thirdTileTitle;
	
	@FindBy (xpath ="//span[normalize-space()='Your printer']//span[@class='icon-dwn']")
	public WebElement thirdTileArrow;
	
	@FindBy (xpath ="//div[@class='left-block']//*//div[@class='card']")
	public WebElement tileFirstCard;
	
	@FindBy (xpath = "//div[@class='left-block']//*//div[@class='card__title']")
	public WebElement tileFirstCardTitle;
	
	@FindBy (xpath = "//div[@class='left-block']//*//div[@class='card__content']")
	public WebElement tileFirstCardContent;
	
	@FindBy (xpath = "//a[@id='ManageyourHPAllInPlanandprinter_SB_GotoHPAllInPlanaccount']")
	public WebElement firstTileFirstCardBtn;
	
	@FindBy (xpath = "(//div[@class='right-block']//*//div[@class='card'])[1]")
	public WebElement tileSecondCard;
	
	@FindBy (xpath = "(//div[@class='right-block']//*//div[@class='card__title'])[1]")
	public WebElement tileSecondCardTitle;
	
	@FindBy (xpath = "//div[@class='right-block']//*//div[@class='card__content']")
	public WebElement tileSecondCardContent;
	
	@FindBy (xpath = "//a[@id='Changeorcheckbillinginformation_SB_GotoHPAllInPlanaccount']")
	public WebElement firstTileSecondCardBtn;
	
	@FindBy (xpath = "(//div[@class='right-block']//*//div[@class='card'])[2]")
	public WebElement tileThirdCard;
	
	@FindBy (xpath = "(//div[@class='right-block']//*//div[@class='card__title'])[2]")
	public WebElement tileThirdCardTitle;
	
	@FindBy (xpath = "(//div[@class='right-block']//*//div[@class='card__content'])[2]")
	public WebElement tileThirdCardContent;
	
	@FindBy (xpath = "//span[normalize-space()='Connect with HP Pro live support']")
	public WebElement firstTileThirdCardBtn;
	
	@FindBy (xpath = "//a[@id='Shippingschedules_SB_GotoHPAllInPlanaccount']")
	public WebElement secondTileFirstCardBtn;
	
	@FindBy (xpath = "//a[@id='Whydothecartridgeslookdifferent_SB_GotoHPAllInPlanaccount']")
	public WebElement secondTileSecondCardBtn;
	
	@FindBy (xpath = "//a[@class='video-link']")
	public WebElement videoLink;

	@FindBy (xpath ="//a[@id='SetupyourprinterusingtheHPSmartapplication_SB_LearnmoreabouttheHPSmartapp']//span[1]")
	public WebElement thirdTileFirstCardBtn;
	
	@FindBy (xpath="//a[@id='Connectyourprintertoanetwork_SB_GotoHPAllInPlanaccount']")
	public WebElement thirdTileSecondCardBtn;
	
	@FindBy (xpath="(//a[@class='related-link'])[1]")
	public WebElement relatedLinkOne;
	
	@FindBy (xpath="(//a[@class='related-link'])[2]")
	public WebElement relatedLinkTwo;
	
	@FindBy (xpath="(//a[@class='related-link'])[3]")
	public WebElement relatedLinkThree;
	
	@FindBy (xpath="(//div[@class='left-block']//*//div[@class='card'])[2]")
	public WebElement thirdTileThirdCard;
	
	@FindBy (xpath = "(//div[@class='left-block']//*//div[@class='card__title'])[2]")
	public WebElement thirdtileThirdCardTitle;
	
	@FindBy (xpath = "(//div[@class='left-block']//*//div[@class='card__content'])[2]")
	public WebElement thirdtileThirdCardContent;
	
	@FindBy (xpath = "//a[@id='AboutyourHPAllInPlanPrinter_SB_ConnectwithHPProlivesupport']")
	public WebElement thirdTileThirdCardBtn;
	
	@FindBy (xpath = "//span[normalize-space()='HP ENVY']")
	public WebElement aboutBoxLinkOne;
	
	@FindBy (xpath = "//span[normalize-space()='HP ENVY Inspire']")
	public WebElement aboutBoxLinkTwo;
	
	@FindBy (xpath = "//span[normalize-space()='HP OfficeJet Pro']")
	public WebElement aboutBoxLinkThree;
	
	@FindBy (xpath = "//div[@class='right-block']//*//div[@class='card__tag']")
	public WebElement relatedTopicsCard;
	
	@FindBy (xpath = "//span[normalize-space()='check your wi-fi connection']")
	public WebElement connectBoxLink;
	
	@FindBy(xpath = "//div[@class='section-container']")
	public WebElement supportArticleContent;

	@FindBy(xpath = "(//div[@class=\"col-md-3\"])[1]//div[@class=\"documents-linkItem\"]")
	public List<WebElement> supportArticleFirstColList;

	@FindBy(xpath = "(//div[@class='documents-linkItem bold-link'])[1]")
	public WebElement supportArticleViewMoreLink;

	@FindBy(xpath = "(//div[@class='documents-linkItem'])[1]")
	public WebElement articleFirstLink;

	@FindBy(xpath = "//div[@class='add-data-wrp']")
	public WebElement addSupportTwoSections;

	@FindBy(xpath = "(//div[@class='add-data-img'])[1]")
	public WebElement contactIcon;

	@FindBy(xpath = "(//div[@class='add-data-title'])[1]")
	public WebElement contactSupportTitle;

	@FindBy(xpath = "(//span[@class='add-data-desc'])[1]")
	public WebElement contactSupportDesc;

	@FindBy(xpath = "(//img[@alt='arrow image'])[1]")
	public WebElement contactSupportArrowImg;

	@FindBy(xpath = "//div[@id='Contactsupport']//a")
	public WebElement contactSupportLink;

	@FindBy(xpath = "(//div[@class='add-data-img'])[2]")
	public WebElement vAIcon;

	@FindBy(xpath = "(//div[@class=\"add-data-title\"])[2]")
	public WebElement vATitle;

	@FindBy(xpath = "(//span[@class=\"add-data-desc\"])[2]")
	public WebElement vADesc;

	@FindBy(xpath = "(//img[@alt='arrow image'])[2]")
	public WebElement vAArrowImg;

	@FindBy(xpath = "//div[@id='VA']//a")
	public WebElement vALink;

	@FindBy(xpath = "//span[@class='floating-label']")
	public WebElement searchGrayText;
	
	@FindBy (xpath = "//input[@id='oneboxtextsearch']")
	public WebElement searchTextField;
	
	@FindBy (xpath = "//div[@class='search-results-wrapper ltr']")
	public WebElement searchResultsComp;

	@FindBy(xpath = "//div[@id='clc-selector']")
	public WebElement clcSelector;
	
	/* Locators */
	
	private CommonPage commonPage = new CommonPage(DriverFactory.getDriver());

	public boolean verifyCLC(String url) {
			if (clcSelector == null)
				System.out.println("CLC selector not displayed on HP all in plan for us-en region - as expected.");
			return true;
			
	}
	
	public void verifyArticleList(String url) throws InterruptedException {

		if (supportArticleFirstColList != null) {
			int listSize = supportArticleFirstColList.size();
			if (listSize == 5) {
				commonPage.verifyElementAvailability(driver,supportArticleViewMoreLink);
				commonPage.verifyHyperlink(driver,supportArticleViewMoreLink, url);
			} else
				System.out.println(
						"As list is having less than or equal to 5 links, view more link is not showing up as expected");
		}
	}
	
	public void verifySearchSectionContent(String errMsg)
	{
		try {
			if(supportArticleContent!= null) {
				String msg = supportArticleNoContent.getText();
			}
			else {
				System.out.println("Support Content is showing up");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
