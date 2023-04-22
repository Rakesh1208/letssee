package integration.j;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, InterruptedException
    {
        System.out.println( "Hello World!" );
        
System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
        
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--disabel-dev-shm-usage");
        chromeOptions.addArguments("--remote-allow-origins=*");
        
        WebDriver driver = new ChromeDriver(chromeOptions);
        
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        
        
        driver.get("http://54.236.177.21:8081/addressbook-2.0/");
        driver.findElement(By.className("v-button")).click();
        driver.findElement(By.id("gwt-uid-5")).sendKeys("rakesh");
        driver.findElement(By.id("gwt-uid-7")).sendKeys("G");
        driver.findElement(By.id("gwt-uid-9")).sendKeys("12212121");
        driver.findElement(By.id("gwt-uid-11")).sendKeys("h@1");
        driver.findElement(By.id("gwt-uid-13")).sendKeys("12/12/1,");
        driver.findElement(By.className("v-button-primary")).click();
        
        Thread.sleep(10);
        TakesScreenshot scrShot = ((TakesScreenshot)driver);
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File destFile = new File("C://reports//test-report.jpg");
        FileUtils.copyFile(srcFile, destFile);
        
        
        driver.quit();
        
    }
}
