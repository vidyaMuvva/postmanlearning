package selenium_demo_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class data_provider {
WebDriver driver;
     
     @DataProvider(name = "Authentication99")
   
     public static Object[][] credentials() {
   
           return new Object[][] {
     
        	  { "suriya", "Hello04" },
        	  { "jalaja", "password123" },
            { "haritha", "password456" },
            { "kafeel", "password567" },
            { "suriya", "Hello09" },
           
            };
   
     }
     
   
//Here we are calling the Data Provider object with its Name
   
@Test(dataProvider = "Authentication99")
   
     public void test99(String Username, String Password) {
   
         System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");

            //Create Browser object
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
       
            driver.manage().window().maximize();
           
         

       driver.findElement(By.name("login")).sendKeys(Username);
       driver.findElement(By.name("passwd")).sendKeys(Password);
            driver.findElement(By.name("proceed")).click();
            String str2=  driver.getTitle();
            System.out.println(str2);
     }
   
}