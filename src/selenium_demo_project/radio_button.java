package selenium_demo_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio_button {
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.amazon.in/?ext_vrnc=hi&tag=googhydrabk-21&ascsubtag=_k_Cj0KCQiAqdP9BRDVARIsAGSZ8An6T4aOSuKry3biDchioniPk5CStMiEeI91_moAj8MkuQaOVbu8qBwaAtVTEALw_wcB_k_&ext_vrnc=hi&gclid=Cj0KCQiAqdP9BRDVARIsAGSZ8An6T4aOSuKry3biDchioniPk5CStMiEeI91_moAj8MkuQaOVbu8qBwaAtVTEALw_wcB");
		 driver.manage().window().maximize();
		 
		 driver.switchTo().frame("//*[@id='navFooter']/div[2]");
		
		 
		 	}

}
