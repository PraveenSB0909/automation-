package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1name {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
WebElement use = driver.findElement(By.name("txtCustomerID"));
use.sendKeys("Praveen Biradar");
WebElement user = driver.findElement(By.name("txtPassword"));
user.sendKeys("Praveen Biradar1");
WebElement user1 = driver.findElement(By.name("Butsub"));
Thread.sleep(2000);
user1.click();
driver.close();

	}

}
