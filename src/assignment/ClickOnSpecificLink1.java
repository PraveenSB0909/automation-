package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnSpecificLink1 {
//1.. Write a WebDriver script to navigate to a website and click on a specific link.
	public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();

driver.get("https://www.meesho.com/?srsltid=AfmBOopbMVZdjnhHwu6738MhDRPqgL8jzmLo_1AW-YaBGjWNTrUfTvnql");
System.out.println("Title of Page 1: "+driver.getTitle());
driver.navigate().to("https://www.Ajio.com");
System.out.println("Title of Page 1: "+driver.getTitle());
//Clicking on specific link -MEn
driver.findElement(By.xpath("//span[@aria-label=\"MEN\"]")).click();
driver.close();
	}

}
