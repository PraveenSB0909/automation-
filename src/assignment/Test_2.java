package assignment;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//2. Implement a Page Object Model for a login page using WebDriver
public class Test_2 {
    protected WebDriver driver; 

    @BeforeTest
    public void setUp() {
       
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demoqa.com/login");
    }

    @AfterTest
    public void tearDown() {
        
        if (driver != null) {
            driver.quit();
        }
    }
}
