package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D07LocateByClassName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.Google.com");
WebElement ele = driver.findElement(By.id("input"));
ele.sendKeys("Automation Testing Jobs");
ele.sendKeys(Keys.ENTER);
	}
}