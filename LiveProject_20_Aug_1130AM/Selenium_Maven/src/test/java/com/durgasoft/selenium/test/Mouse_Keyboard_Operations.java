package com.durgasoft.selenium.test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class Mouse_Keyboard_Operations {

	public WebDriver driver;
	public Actions a;
	
	

	@Test(enabled = false)
	public void dragNdrop() {
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		// a.dragAndDrop(drag, drop).perform();
		a.clickAndHold(drag).moveToElement(drop).release().build().perform();
	}

	@Test(enabled=false)
	public void resizeobject() {
		driver.switchTo().frame(0);
		WebElement drag=driver.findElement(By.cssSelector(
				"div.ui-resizable-handle.ui-resizable-se.ui-icon.ui-icon-gripsmall-diagonal-se"));
		//a.dragAndDropBy(drag, 200, 500).perform();
		a.clickAndHold(drag).moveByOffset(300, 50).release().build().perform();
	}
	
	@Test(enabled=false)
	public void rightClickOnElement() {
		WebElement element = driver.findElement(By.linkText("Draggable"));
		a.contextClick(element).perform();
	}
	
	@Test
	public void slider() {
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.cssSelector("span.ui-slider-handle.ui-corner-all.ui-state-default"));
		//a.clickAndHold(drag).moveByOffset(200, 0).release().build().perform();
		a.dragAndDropBy(drag, 200, 0).perform();
	}

	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
		a = new Actions(driver);
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
	}

}
