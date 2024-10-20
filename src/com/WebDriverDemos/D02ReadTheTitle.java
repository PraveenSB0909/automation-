package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D02ReadTheTitle {

	public static void main(String[] args) {
		String expTitle = "Google", actTitle;
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
driver.get("https://www.google.com/");


 actTitle = driver.getTitle();
System.out.println("This is the title: "+ actTitle);
if(expTitle.equals(actTitle))
	System.out.println("opened Google\n Test case pass");
else
	System.out.println("Not opened Google\n Test case Fail");
driver.close();
	}

}
