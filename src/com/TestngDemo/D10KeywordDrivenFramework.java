package com.TestngDemo;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D10KeywordDrivenFramework {
	WebDriver driver ;
	File file;
	FileInputStream fis;
	Properties prop;
  @Test
  public void f() {
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver =new ChromeDriver();
	  file = new File("");
	  fis = new FileInputStream(file);
	  prop = new Properties();
	  prop.load(fis); 
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get(prop);
	  System.out.println(prop.getProperty("url"));
  }

  @AfterTest
  public void afterTest() {
  }

}
