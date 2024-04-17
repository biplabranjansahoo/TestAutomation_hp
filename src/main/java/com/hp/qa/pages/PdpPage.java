package com.hp.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hp.qa.util.ElementUtils;

public class PdpPage {

	private WebDriver driver;

	// 1.create By locators
	private By serialNumber = By.xpath("//div[text()='Serial number:']/following-sibling::div");
	private By productNumber = By .xpath("//div[text()='Product number:']/following-sibling::div");
	private By pdpTitle = By.xpath("//div[contains(text(),'Welcome to the product support page!')]");

	// 2.constructor of the page
	public PdpPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String pdpSerialNumberCheck()   {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(serialNumber));
		String slnumber = driver.findElement(serialNumber).getText();
		return slnumber;
	}
	
	public String pdpProductNumberCheck()   {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(productNumber));
		String pdNumber = driver.findElement(productNumber).getText();
		return pdNumber;
	}

	public String getPdpPageTitle() throws InterruptedException {
		ElementUtils.expliciteWait(driver, pdpTitle);
		String producttypeSWDText = driver.findElement(pdpTitle).getText();
		return producttypeSWDText;
	}

}
