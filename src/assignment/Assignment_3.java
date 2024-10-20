package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_3 {
//3. Write a WebDriver script to handle a dropdown and select an option based on specific criteria.		
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://en-gb.facebook.com/");
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	
	Select selectDate = new Select(date);
	System.out.println("Is Dropdown Supports multiple Selection : "+selectDate.isMultiple());

	selectDate.selectByValue("9");
	Select selMonth = new Select(month);
	selMonth.selectByValue("9");
	Select selYear = new Select(year);
	selYear.selectByVisibleText("1995");
	Thread.sleep(2000);
	//driver.close();
}
}
