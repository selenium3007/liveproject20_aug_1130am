package com.durgasoft.selenium.test;

import org.testng.annotations.Test;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class BBC_MoreDD {

	public WebDriver driver;

	@Test
	public void f() {
		driver.findElement(By.linkText("More")).click();
		WebElement table = driver.findElement(By.id("orb-panel-more"));
		List<WebElement> links = table.findElements(By.tagName("a"));
		System.out.println("Available links:" + links.size());
		for (int i = 0; i < links.size(); i++) {
			System.out.println(links.get(i).getText());
			if (links.get(i).getText().equalsIgnoreCase("Music")) {
				links.get(i).click();
			}
		}
	}

	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
		driver.get("http://bbc.com");
		driver.manage().window().maximize();
	}

}
