package selenium_demo_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practise_sel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		 driver.get("http://demo.guru99.com/test/newtours/");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.linkText("REGISTER")).click();
		 
		 driver.findElement(By.name("firstName")).sendKeys("Suriya");
		 driver.findElement(By.name("lastName")).sendKeys("Shivakumar");
		 driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input")).sendKeys("987654321");
		 driver.findElement(By.xpath("//*[@id='userName']")).sendKeys("Shivakumar@gmail.com");
		 driver.findElement(By.name("address1")).sendKeys("plot no. 2,phase 65");
		 driver.findElement(By.name("city")).sendKeys("Hima hills");
		 driver.findElement(By.name("state")).sendKeys("Banglore");
		 driver.findElement(By.name("postalCode")).sendKeys("589601");
		 
		 WebElement giveCountry = driver.findElement(By.name("country"));  
		 Select giveInp = new Select(giveCountry); 
		 giveInp.selectByIndex(50);  
		 Thread.sleep(3000);
		 giveInp.selectByVisibleText("ITALY");
		 Thread.sleep(3000);
		 giveInp.selectByValue("ANGOLA");
		 
		 driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Shivakumaruser@gmail.com");
		 driver.findElement(By.name("password")).sendKeys("Hello@123");
		 driver.findElement(By.name("confirmPassword")).sendKeys("He");
		 
		 driver.findElement(By.name("submit")).submit();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
