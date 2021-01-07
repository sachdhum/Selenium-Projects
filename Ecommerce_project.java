package general_programs;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ecommerce_project {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Material\\drivers\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    	driver.get("http://live.demoguru99.com/index.php/");
    	String Actual = driver.getTitle();
        String Expected = "Home page";
        if (Actual.equals(Expected)) 
     {
        	
            System.out.println("Test Passed!");
     } 
        else 
 		{
            System.out.println("Test Failed");
 		}
       
        driver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[1]/a")).click();
        String Act = driver.getTitle();
        String Exp = "Mobile";
        if (Act.equals(Exp)) 
     {
        	
            System.out.println("Title is verified");
     } 
        else 
 		{
            System.out.println("Title is not verified");
 		}
        WebElement element=driver.findElement(By.xpath("//select[@title='Sort By']"));
     Select se =new Select( element);
     se.selectByIndex(1);      
					
	}
		
}

