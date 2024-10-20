package assignment;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_5 {
//	5. Write a WebDriver script to capture a screenshot of a webpage and save it to a specific location
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.meesho.com/");
        
        Random rand = new Random();
        int rand_int1 = rand.nextInt(1000);  // Generating a random number for the filename
        
        // Taking screenshot
        TakesScreenshot ts = (TakesScreenshot) driver;
        File temp = ts.getScreenshotAs(OutputType.FILE);
        
        // Destination for the screenshot
        File des = new File("./image" + rand_int1 + ".png");
        
        try {
            // Copying the file using java.nio.file.Files
            Files.copy(temp.toPath(), des.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Screenshot saved: " + des.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error saving screenshot: " + e.getMessage());
        }
        
        driver.quit();  // Close the browser
    }

}
