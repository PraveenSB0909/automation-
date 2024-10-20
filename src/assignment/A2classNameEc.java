package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2classNameEc {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
List<WebElement> use = driver.findElements(By.className("form-control"));
((WebElement) use).sendKeys("Praveen Biradar");
List<WebElement> user = driver.findElements(By.className("form-control"));
((WebElement) user).sendKeys("Praveen Biradar1");
WebElement user1 = driver.findElement(By.className("btn btn-lg btn-block btn-primary"));
Thread.sleep(2000);
user1.click();
driver.close();

	}

}
 