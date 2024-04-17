package com.hp.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.hp.qa.util.ElementUtils;

public class SoftwareDriver {
	
	private WebDriver driver;
	
	private By productTypeSWDText= By.xpath("//h1[text()='Welcome to HP Software and Drivers']");
	private By productTypeSwd = By.xpath("//app-tile-options/div/div/a/div");
	
	public SoftwareDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	public int getSWDProductTypeCount() {
		return driver.findElements(productTypeSwd).size();
	}
	
	public List<String> getSWDProductTypeList() {
		
		List<String> productList = new ArrayList<>();
		List<WebElement> productTypeList = driver.findElements(productTypeSwd);
		
		for(WebElement  e :productTypeList) {
			String text = e.getText();
			System.out.println(text);
			productList.add(text);
		}
		return productList;
	}
	
	public String getSWDPageTitle() throws InterruptedException {
		ElementUtils.expliciteWait(driver, productTypeSWDText);
		String producttypeSWDText = driver.findElement(productTypeSWDText).getText();
		return producttypeSWDText;
	}


}
