package com.durgasoft.selenium.test;

import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class FaceBook_Login_JSE {

	public WebDriver driver;

	@Test
	public void f() {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("document.getElementById('email').value='Mahesh'");
		js.executeScript("document.getElementById('pass').value='abc@1234'");
		js.executeScript("document.getElementById('u_0_a').click()");
	}

	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
	}

}
