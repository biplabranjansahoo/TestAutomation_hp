package com.hp.qa.pages;

import org.openqa.selenium.WebDriver;
import com.hp.qa.util.ElementUtils;

public class ProductHome {
	
private WebDriver driver;
	
	
	public ProductHome(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public String getProductPageTitle() throws InterruptedException {
		ElementUtils.sleep();
		return driver.getTitle();
	}

}
