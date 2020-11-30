package selenium_demo_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium_pracitse {
	 WebDriver driver;
     @BeforeTest
     public void launch_browser() {
          System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
          driver = new ChromeDriver();
	     }
	     @Test(priority=1, enabled=true)
	     public void login() throws Exception {
	          driver.get("https://www.amazon.in/");
	          driver.manage().window().maximize();
	          WebElement sign= driver.findElement(By.id("nav-link-accountList"));
	          Actions act = new Actions(driver);
	          act.moveToElement(sign).perform();
	          WebElement starthere= driver.findElement(By.xpath("//*[@id='nav-flyout-ya-newCust']/a"));
	          Actions act1=new Actions(driver);
	          act1.moveToElement(starthere).doubleClick().perform();
	          //driver.findElement(By.xpath("//*[@id='nav-flyout-ya-newCust']/a")).click();
	          driver.findElement(By.xpath("//*[@id='ap_customer_name']")).sendKeys("Vidya");
	          driver.findElement(By.xpath("//*[@id='auth-country-picker-container']/span/span")).click();
	          driver.findElement(By.xpath("//*[@id='a-popover-1']/div/div/ul/li[3]")).click();
	          driver.findElement(By.id("ap_phone_number")).sendKeys("9876543210");
	          driver.findElement(By.name("secondaryLoginClaim")).sendKeys("vidya26@gamil.com");
	          driver.findElement(By.id("ap_password")).sendKeys("amazon987");
	          
	          
	          
	         
     }

}
