package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D08LocateByCssSele {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://facebook.com");

	WebElement emailId = driver.findElement(By.cssSelector("input[type=\"text\"]"));
	emailId.sendKeys("praveensb0909@gmail.com");
	WebElement password =driver.findElement(By.cssSelector("input[type=\"password\"][class=\"inputtext _55r1 _6luy _9npi\"]"));
	password.sendKeys("12345667");
	
	
	WebElement loginBtn = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
	loginBtn.click();
	}

}
