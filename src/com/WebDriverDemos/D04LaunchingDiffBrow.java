package com.WebDriverDemos;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class D04LaunchingDiffBrow {

	public static void main(String[] args) {
		WebDriver driver = null;
		Scanner scn = new Scanner(System.in);
		int ch;
		
		System.out.println("Select your Browser\n1. Chrome\n2. Edge\n3. Firefox\nEnter Choice: ");
//      System.out.println("Enter which Browser : /n1, Chrome ,/n2 edge, /n3 firefoxe");
		
		
 ch= scn.nextInt();
 
 
 switch(ch) 
 {
 case 1:
	 driver = new ChromeDriver();
 break;
 case 2:
	 driver = new EdgeDriver();
 break;
 case 3:
	 driver = new FirefoxDriver();
 break;
 }
	driver.manage().window().maximize();
	String title = driver.getTitle();
	System.out.println("Title: " + title );
	
	driver.get("https://www.facebook.com");
	WebElement emailId = driver.findElement(By.name("email"));
	emailId.sendKeys("praveensb0909@gmail.com");
	WebElement password = driver.findElement(By.name("pass"));
	password.sendKeys("praveensb090");
	WebElement loginBtn = driver.findElement(By.name("login"));
	loginBtn.click();

	String msg = driver.findElement(By.xpath("//div[@class=\"_9ay7\"]")).getText();
	System.out.println(msg);
	driver.close();
		
	}

}
