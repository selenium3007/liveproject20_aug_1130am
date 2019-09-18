package com.durgasoft.selenium.test;

import org.testng.annotations.Test;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class BBC_DynamicLinks {

	public WebDriver driver;

	@Test
	public void f() throws Exception {
		WebElement table = driver.findElement(By.xpath("//div[@class='most-popular']"));
		List<WebElement> links = table.findElements(By.tagName("a"));
		System.out.println("Available links are:" + links.size());
		for (int i = 0; i < links.size(); i++) {
			System.out.println(links.get(i).getText());
			links.get(i).click();
			Thread.sleep(5000);
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			Thread.sleep(5000);
			table = driver.findElement(By.xpath("//div[@class='most-popular']"));
			links = table.findElements(By.tagName("a"));
		}
	}

	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
		driver.get("https://bbc.com");
		driver.manage().window().maximize();
	}

}
