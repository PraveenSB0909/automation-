package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D06LocateById {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.facebook.com");
	     WebElement emailId = driver.findElement(By.id("email"));
	     emailId.sendKeys("praveensb0909@gmail.com");
	     WebElement password = driver.findElement(By.id("pass"));
	     password.sendKeys("praveensb090");
	     WebElement loginBtn = driver.findElement(By.id("u_0_5_Ea"));
	     loginBtn.click();
	     driver.close();

	}

}