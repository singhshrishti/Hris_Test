package com.Automation.HrisTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IncorrectCredentials {
	
	public void IncorrectCredentials(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.findElement(By.cssSelector("#txtUserName")).sendKeys(" ");
		WebElement element = driver.findElement(By.cssSelector("#txtPassword"));
		element.sendKeys(" ");
		element.submit();
		driver.findElement(By.cssSelector("#demo-2 > div > div.tabbable.custom-tabs.tabs-left.tabs-animated.flat.flat-all.hide-label-980.shadow.track-url.auto-scroll > ul > li:nth-child(1) > a")).click();
	}
     
	public String CheckAssertion(WebDriver driver) {
		return driver.findElement(By.cssSelector("#login > form > div.loginTxt.txtHideDiv.alert.alert-error > div")).getText();
}

	
}