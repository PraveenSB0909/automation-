package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A01FbClassNa {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement fb = driver.findElement(By.className("inputtext"));
		fb.sendKeys("praveensb0909@gmail.com");
		WebElement pass = driver.findElement(By.className("_6lux"));
		pass.sendKeys("praveensb0909");
		WebElement butt = driver.findElement(By.className("login"));
         butt.click();
driver.close();
	}

}
