package general_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Material\\drivers\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
    driver.get("https://www.facebook.com");	
    driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
    driver.findElement(By.name("firstname")).sendKeys("Sachin");
    driver.findElement(By.name("lastname")).sendKeys("Dhumale");
    driver.findElement(By.name("reg_email__")).sendKeys("902817737");    
    driver.findElement(By.xpath("//*[@id=\"password_step_input\"]")).sendKeys("sun03moon04isequalto7");

	}

}
