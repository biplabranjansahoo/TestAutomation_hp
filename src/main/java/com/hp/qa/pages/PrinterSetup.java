package com.hp.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.hp.qa.util.ElementUtils;

public class PrinterSetup {

private WebDriver driver;
	
	private By printersetUpTitle = By .xpath("//h1[contains(text(),'here to help you set up your HP printer')]");
	
	public PrinterSetup(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getPrinterSetupPageTitle() throws InterruptedException {
		ElementUtils.sleep();
		return driver.getTitle();
	}
	
	public String getPrinterSetUpPageTitle() throws InterruptedException {
		ElementUtils.expliciteWait(driver, printersetUpTitle);
		String printersetupTitle = driver.findElement(printersetUpTitle).getText();
		return printersetupTitle;
	}
}
