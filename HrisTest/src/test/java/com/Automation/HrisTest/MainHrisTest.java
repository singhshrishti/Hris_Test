package com.Automation.HrisTest;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainHrisTest {
	
	WebDriver driver;
	
	
	public String baseUrl = "https://hris.qainfotech.com/login.php";
    String driverPath = "C:\\Users\\shrishtisingh\\Desktop\\chromedriver_win32\\chromedriver.exe";
	
  @Test(priority=1)
  public void click_Login() {
	login lo= new login(driver); 
  }
    
  @Test(priority=2)
  public void LoginINCorrectPassword() {	  
	LoginInCorrectPass Passwrd = new LoginInCorrectPass();
	  Passwrd.Incorrect(driver);
	  Assert.assertTrue(Passwrd.CheckAssertion(driver).contains("Invalid Login"));
}
  
  @Test(priority=3)
  public void LoginINCorrectCredentials() {	  
	  
	  IncorrectCredentials credentils = new IncorrectCredentials();
	 credentils.IncorrectCredentials(driver);
	 Assert.assertTrue(credentils.CheckAssertion(driver).contains("Invalid Login"));
}
 
  @Test(priority=4)
  public void LoginCorrectCredentials() {
	  
	driver.findElement(By.cssSelector("#txtUserName")).sendKeys("shrishtisingh");
	WebElement element = driver.findElement(By.cssSelector("#txtPassword"));
	element.sendKeys("Shrishti@321#");
	element.submit();
	String na=driver.findElement(By.cssSelector("#page > div > div.header > div.col-sm-3.col-md-2.col-xs-2 > ul > li > a > span")).getText();	
	Assert.assertTrue(na.contains("Shrishti"));
  }
    
  @Test(priority=5)
  public void LogOutCheck() throws InterruptedException
  {
	  driver.findElement(By.cssSelector("#page > div > div.header > div.col-sm-3.col-md-2.col-xs-2 > ul > li > a > span")).click();
	 Thread.sleep(2000);
	  driver.findElement(By.cssSelector(".fa.fa-sign-out")).click();
  }
  
 

@BeforeClass
  public void Launch_Browser() {
	  System.setProperty("webdriver.chrome.driver", driverPath);
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(baseUrl);
  }

 @AfterClass
  public void afterClass() {
	 driver.close();
  }

}
