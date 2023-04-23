package testing.as;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "Hello World!" );
        
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\chromedriver_win32 (1)\\chromedriver.exe");
        
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        
        WebDriver driver = new ChromeDriver(chromeOptions);
        
        driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
        
        
        driver.get("http://54.237.242.213:8081/addressbook-2.0/");
        driver.findElement(By.className("v-button")).click();
        driver.findElement(By.id("gwt-uid-5")).sendKeys("rakesh");
        driver.findElement(By.id("gwt-uid-7")).sendKeys("G");
        driver.findElement(By.id("gwt-uid-9")).sendKeys("12212121");
        driver.findElement(By.id("gwt-uid-11")).sendKeys("h@1");
        driver.findElement(By.id("gwt-uid-13")).sendKeys("12/12/1,");
        driver.findElement(By.className("v-button primary")).click();
        
        Thread.sleep(10000);
        driver.quit();
        
        
        
    }
}
