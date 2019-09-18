package com.durgasoft.selenium.test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class MouseOver_WD {

	public WebDriver driver;

	@Test
	public void f() throws Exception {
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.linkText("FAQ’S"))).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Selenium FAQ’s")).click();
		a.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		Thread.sleep(5000);
		a.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
	}

	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
		driver.get("http://seleniumbymahesh.com");
		driver.manage().window().maximize();
	}
}
