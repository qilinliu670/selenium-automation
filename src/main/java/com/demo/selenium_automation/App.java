package com.demo.selenium_automation;

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
    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("http://facebook.com");
        driver.findElement(By.id("email")).sendKeys("myEmail");
        //driver.findElement(By.id("pass")).sendKeys("myPassword");
        //driver.findElement(By.id("u_0_5_nH")).click();
        driver.close();
    }
}
