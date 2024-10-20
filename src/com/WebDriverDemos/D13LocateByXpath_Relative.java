package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D13LocateByXpath_Relative {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("praveensb0909@gmail.com");
driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("1234567");
driver.findElement(By.xpath("//button[@value=\"1\"]")).click();
String msg = driver.findElement(By.xpath("//div[@class=\"_9ay7\"]")).getText();
System.out.println(msg);
	}

}
