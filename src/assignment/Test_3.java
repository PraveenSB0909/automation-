package assignment;

import org.openqa.selenium.By;

public class Test_3 extends Test_2 {

   
    public void enterUsername(String username) {
        driver.findElement(By.id("userName")).sendKeys(username);
    }

   
    public void enterPassword(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }

   
    public void clickLogin() {
        driver.findElement(By.id("login")).click();
    }
    
    public void logout() {
    	driver.findElement
    	(By.xpath("//button[@id=\"submit\"]")).click();
    }
    
    
    
    
}
