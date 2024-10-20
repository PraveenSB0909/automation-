package assignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(1000);
		Alert a = driver.switchTo().alert();
		a.accept();
		WebElement ele = driver.findElement(By.name("url"));
		Select dd = new Select(ele);
		System.out.println("Is Dropdown supports multiple selection : "+dd.isMultiple());
		
		dd.selectByIndex(3);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"journeyClass\"]/div/div[3]/span")).click();
		dd.deselectByVisibleText("AC First Class (A1)");

	}

}
