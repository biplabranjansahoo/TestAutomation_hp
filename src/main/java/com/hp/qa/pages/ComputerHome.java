package com.hp.qa.pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.hp.qa.util.ElementUtils;

public class ComputerHome {
	
	private WebDriver driver;
	
	private By helpSection = By.xpath("//app-primary-options/div/div/div/div/div/div/div");
	private By computerTile = By.xpath("//app-promo-tiles/div/div/div/div[3]/div/a");
	private By computerHomeTitle = By.xpath("//h1[text()='HP Computer Support']");
	
	public ComputerHome(WebDriver driver) {
		this.driver = driver;
	}
	
	public int getComputerhelpSectionCount() {
		return driver.findElements(helpSection).size();
	}
	
	public List<String> getComputerhelpSectionList() {
		
		List<String> helpList = new ArrayList<>();
		List<WebElement> computerhelpList = driver.findElements(helpSection);
		
		for(WebElement  e :computerhelpList) {
			String text = e.getText();
			System.out.println(text);
			helpList.add(text);
		}
		
		return helpList;
	}
	
	public void computerTileClick() throws InterruptedException {
		driver.findElement(computerTile).click();
		Thread.sleep(4000);
	}
	
	public String getComputerPageTitle() throws InterruptedException {
		ElementUtils.expliciteWait(driver, computerHomeTitle);
		String computerTitle = driver.findElement(computerHomeTitle).getText();
		return computerTitle;
	}

}
