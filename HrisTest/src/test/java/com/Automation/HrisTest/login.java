package com.Automation.HrisTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {

	public login(WebDriver driver) {
		 driver.findElement(By.cssSelector("#demo-2 > div > div.tabbable.custom-tabs.tabs-left.tabs-animated.flat.flat-all.hide-label-980.shadow.track-url.auto-scroll > ul > li:nth-child(1) > a")).click();
	}
}
