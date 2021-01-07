package general_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abc 
{

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Material\\drivers\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
    	driver.get("https://www.google.co.in");
    	driver.findElement(By.name("q")).sendKeys("Sachin Dhumale");
    	driver.findElement(By.name("btnK")).click();
    	driver.findElement(By.xpath("//*[@id=\"rso\"]/div[5]/div/div[1]/a/h3")).click();
    	
	}

}
