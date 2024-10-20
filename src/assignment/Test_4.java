package assignment;

import org.testng.annotations.Test;

public class Test_4 extends Test_3 {

    @Test
    public void testLogin() throws InterruptedException {
        
    	System.out.println("This is Before loginPage Title:"+driver.getTitle());
        enterUsername("Praveen");
        enterPassword("Praveen@123");
        clickLogin();
        Thread.sleep(2000);
        System.out.println("This is After loginPage Title:"+driver.getTitle());
 

       
    }
}
