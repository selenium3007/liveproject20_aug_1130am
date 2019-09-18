package com.durgasoft.selenium.test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class FaceBook_DD {

	public WebDriver driver;

	@Test
	public void ffacebookDD()throws Exception {
		driver.findElement(By.id("month")).sendKeys("Jul");
		Thread.sleep(3000);
		/*new Select(driver.findElement(By.id("month"))).selectByIndex(3);
		Thread.sleep(3000);
		new Select(driver.findElement(By.id("month"))).selectByValue("9");
		Thread.sleep(3000);
		new Select(driver.findElement(By.id("month"))).selectByVisibleText("Dec");*/
		WebElement monthDD = driver.findElement(By.id("month"));
		Select ddMonth = new Select(monthDD);
		ddMonth.selectByIndex(3);
		Thread.sleep(3000);
		ddMonth.selectByValue("7");
		Thread.sleep(3000);
		ddMonth.selectByVisibleText("Dec");
	}

	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
	}

}
