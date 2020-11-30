package selenium_demo_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoCart {
	WebDriver driver;
@Test
	public void LaunchApp() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://demo.opencart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		SoftAssert sa=new SoftAssert();
		System.out.println("Title is "+driver.getTitle());
		driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[1]/a")).click();
		String s1 =driver.findElementByXPath("//*[@id='content']/h1").getText();
		String s2="Register Account";
		sa.assertEquals(s1,s2);
		
		driver.findElementByXPath("//*[@id='content']/form/div/div/input[2]").click();
		String actual=driver.findElementByXPath("//*[@id='account-register']/div[1]").getText();
		String war=" Warning: You must agree to the Privacy Policy!";
		sa.assertEquals(actual,war);
	}
@Test(priority=1)
public void PersonalData() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","E:\\drivers\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.navigate().to("https://demo.opencart.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	SoftAssert sa=new SoftAssert();
	System.out.println("Title is "+driver.getTitle());
	driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/a")).click();
	driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[1]/a")).click();
	driver.findElement(By.name("firstname"));//.sendKeys("Vidyadwefwfwwwrvfvaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
	
	
	
	
}

}
