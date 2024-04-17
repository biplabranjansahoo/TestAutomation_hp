package com.hp.qa.pages;


import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.hp.qa.util.ElementUtils;
import com.hp.qa.util.JavaScriptUtils;

public class SearchResultPage {
	
	private WebDriver driver;	
	
	/* ***** Locators ****** */
	private By productNameValidation = By.xpath("//a[contains(@title,'HP PCs and Printers')]");
	private By seriesNameValidation = By.xpath("//a[contains(@title,'Troubleshooting')]");
	private By searchSupportText = By.xpath("//a[@id='opt-support']/span");
	private By recommendedSolution=By.xpath("//div[text()='Recommended solutions ']");
	private By recommendedSolutionRight=By.xpath("//span[@class='content-right']");
	private By pfinderSNSearch = By.xpath("//*[@id='searchQueryField']");
	private By pfinderPNSearch = By.xpath("//*[@id='productNumberField']");
	private By submitButton = By.xpath("//*[@id='FindMyProduct']");
	private By pdpWelcomeText = By.xpath("//*[contains(text(),'Welcome to the product support')]");
	private By searchVideoLink = By.xpath("//div[@class='videos-wrapper container']/a");
	private By watchVideoText = By.xpath("//h3[contains(text(), 'Watch a video')]");
	private By closeButton = By.xpath("//span[text()='Close']");
	private By videoDescription = By.id("video-body-description");
	private By paginationText = By.xpath("//*[@class='pagination-text']");	
	private By rightArrow = By.xpath("//*[@class='arrow icon-dwn right-arrow']");	
	private By leftArrow = By.xpath("//*[@class='arrow icon-dwn left-arrow']");	
	private By guidesAndDocumentText = By.id("anrIdGuides");
	private By videosLink = By.id("anrIdVideos");	
	private By searchResultsFeedback = By.xpath("//div[@id='searchResultsFeedback']");	
	private By helpSection = By.xpath("//div[@class='help-section-container']");
	
	public String oneBoxSeachseriesNameCheck()   {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(seriesNameValidation));
		String sltxt = driver.findElement(seriesNameValidation).getText();
		return sltxt;
	}
	
	public String oneBoxSeachproductNameCheck()   {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(productNameValidation));
		String sltxt = driver.findElement(productNameValidation).getText();
		return sltxt;
	}
	
	public String searchPageSupportTab()   {
		ElementUtils.expliciteWait(driver, searchSupportText);
		String supportTabText = driver.findElement(searchSupportText).getText();
		return supportTabText;
	}
	
	public void searchNonUniqueSN(String SN, WebDriver driver) throws InterruptedException {
		ElementUtils.sleep();
		driver.findElement(pfinderSNSearch).sendKeys(SN);
		driver.findElement(submitButton).click();
	}
	
	public void EnterPN(String PN, WebDriver driver) {
		driver.findElement(pfinderPNSearch).sendKeys(PN);
		driver.findElement(submitButton).click();
	}
	
	public String validatePDPWelcomePage(WebDriver driver) throws InterruptedException {
		ElementUtils.expliciteWait(driver, pdpWelcomeText);
		String actualTxt = driver.findElement(pdpWelcomeText).getText();//pdpWelcomeText.getText();
		JavaScriptUtils.highLightElement(driver, driver.findElement(pdpWelcomeText));
		ElementUtils.sleep();
		return actualTxt;
	}
	
	public boolean validateVideoText(WebDriver driver) throws InterruptedException {
		clickVideosLink(driver);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
	    executor.executeScript("arguments[0].click();", driver.findElement(searchVideoLink));
		//searchVideoLink.click();
	    ElementUtils.sleep();
	    boolean validateVideoText=driver.findElement(watchVideoText).isDisplayed();
		return validateVideoText;
	}
	public boolean validateCloseButton(WebDriver driver) {
		boolean validateCloseButton=driver.findElement(closeButton).isDisplayed();
		return validateCloseButton;
	}
	public boolean validateVideoDescription(WebDriver driver, String expectedText) {
		System.out.println("text --- "+driver.findElement(videoDescription).getText());
		boolean validateVideoDescription=driver.findElement(videoDescription).getText().contains(expectedText);
		driver.findElement(closeButton).click();
		return validateVideoDescription;
	}
	
	public String validateURL(WebDriver driver) {
		String currentURL = driver.getCurrentUrl();
		return currentURL;
	}
	
	public List<String> validateSupportTab(WebDriver driver) {
		JavaScriptUtils.scrollInToView(driver,driver.findElement(By.xpath("(//*[@class='navigation']/div//span)[1]")));
		List<WebElement> listWebElements = driver.findElements(By.xpath("//*[@class='navigation']/div//span"));
		List<String> listSupportTab = new ArrayList<String>();
		for (WebElement element:listWebElements){
			JavaScriptUtils.highLightElement(driver,element);
			listSupportTab.add(element.getText());
		}
		return listSupportTab;
	}
	
	public List<String> validateContentSelectorTab(WebDriver driver) {
		JavaScriptUtils.scrollInToView(driver,driver.findElement(By.xpath("//*[@class='nav mob-hide']/li/a")));
		List<WebElement> listWebElements = driver.findElements(By.xpath("//*[@class='nav mob-hide']/li/a"));
		List<String> listSupportTab = new ArrayList<String>();
		for (WebElement element:listWebElements){
			listSupportTab.add(element.getText());
			JavaScriptUtils.highLightElement(driver,element);
		}
		return listSupportTab;
	}
	
	public boolean validatePagination(WebDriver driver) throws InterruptedException {
		boolean paginationFlag=driver.findElement(paginationText).isDisplayed();
		
		if (driver.findElement(paginationText).isDisplayed()){
			JavaScriptUtils.highLightElement(driver,driver.findElement(rightArrow));
			boolean validateRIghtArrow=driver.findElement(rightArrow).isEnabled();
			driver.findElement(rightArrow).click();
			ElementUtils.sleep();
			JavaScriptUtils.highLightElement(driver,driver.findElement(leftArrow));
			boolean validateLeftArrow=driver.findElement(leftArrow).isEnabled();
			driver.findElement(leftArrow).click();
			ElementUtils.sleep();
		}
		return paginationFlag;
	}
	
	public void clickGuidesAndDocumentLink(WebDriver driver) throws InterruptedException {
		JavaScriptUtils.scrollInToView(driver,driver.findElement(guidesAndDocumentText));
		JavaScriptUtils.highLightElement(driver,driver.findElement(guidesAndDocumentText));
		driver.findElement(guidesAndDocumentText).click();
		ElementUtils.sleep();
	}
	
	public void clickVideosLink(WebDriver driver) throws InterruptedException {
		JavaScriptUtils.scrollInToView(driver,driver.findElement(videosLink));
		JavaScriptUtils.highLightElement(driver,driver.findElement(videosLink));
		driver.findElement(videosLink).click();
		ElementUtils.sleep();
	}
	
	public boolean verifyMedalliaServey(WebDriver driver) throws InterruptedException {
		ElementUtils.sleep();
		JavaScriptUtils.scrollInToView(driver,driver.findElement(searchResultsFeedback));
		JavaScriptUtils.highLightElement(driver,driver.findElement(searchResultsFeedback));
		boolean searchResultFeedback=driver.findElement(searchResultsFeedback).isDisplayed();
		return searchResultFeedback;
		
	}
	
	public boolean verifyHelpSection(WebDriver driver) throws InterruptedException {
		ElementUtils.sleep();
		JavaScriptUtils.scrollInToView(driver,driver.findElement(helpSection));
		JavaScriptUtils.highLightElement(driver,driver.findElement(helpSection));
		boolean helpSectionFlag=driver.findElement(helpSection).isDisplayed();
		return helpSectionFlag;
	}
	
	public List<WebElement> validateSearchResultPageKeyword(WebDriver driver) throws InterruptedException {
		ElementUtils.sleep();
	    List<WebElement> titleElement = driver.findElements(By.xpath("//a[@class='title']/span/strong"));
	    JavaScriptUtils.scrollInToView(driver,driver.findElement(By.xpath("//a[@class='title']/span/strong")));
	    return titleElement;
	}

	public boolean validateReccommendedSolution(WebDriver driver) {
		JavaScriptUtils.scrollInToView(driver,driver.findElement(recommendedSolution));
		JavaScriptUtils.highLightElement(driver,driver.findElement(recommendedSolution));
		JavaScriptUtils.highLightElement(driver,driver.findElement(recommendedSolutionRight));
		boolean displayRecommendedSolution = driver.findElement(recommendedSolution).isDisplayed();
		return displayRecommendedSolution;
		
	}

}
