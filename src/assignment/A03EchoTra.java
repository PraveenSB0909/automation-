package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A03EchoTra {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
WebElement echo = driver.findElement(By.id("txtCustomerID"));
echo.sendKeys("Praveen Biradar");
WebElement pass  = driver.findElement(By.id("txtPassword"));
pass.sendKeys("Password");
WebElement button  = driver.findElement(By.id("Butsub"));
button.click();
driver.close();
	}

}
