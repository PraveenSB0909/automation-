package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//4. Implement a test case using WebDriver to validate the functionality of a registration form
public class Assignment_4{
	public static void main(String[] args) throws Throwable {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Praveen");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Biradar");
	//	driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();

		WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		WebElement gender = driver.findElement(By.xpath("//label[normalize-space()='Male']"));
        gender.click();
		
		Select selectDate = new Select(date);
		System.out.println("Is Dropdown Supports multiple Selection : "+selectDate.isMultiple());

		selectDate.selectByValue("9");
		Select selMonth = new Select(month);
		selMonth.selectByValue("9"); 
		Select selYear = new Select(year);
		selYear.selectByVisibleText("1995");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label=\"Mobile number or email address\"]")).sendKeys("praveensb0909@gmail.com");
		driver.findElement(By.xpath("//input[@data-type=\"password\"]")).sendKeys("praveensb0909");

		//driver.close();
	}

}
