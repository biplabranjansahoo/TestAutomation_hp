package com.hp.qa.pages;

import org.openqa.selenium.WebDriver;
import com.hp.qa.util.ElementUtils;

public class Dashboard {

	
private WebDriver driver;
	
	
	public Dashboard(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getDashboardPageTitle() throws InterruptedException {
		ElementUtils.sleep();
		return driver.getTitle();
	}
}
