package com.demo.selenium_automation;

import java.time.Duration;

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
    	ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("http://54.177.205.97:8082/contact.html");
        driver.findElement(By.id("inputName")).sendKeys("Qilin Liu");
        driver.findElement(By.id("inputNumber")).sendKeys("4086200006");
        driver.findElement(By.id("inputMail")).sendKeys("qilin.liu@tcs.com");
        driver.findElement(By.id("inputMessage")).sendKeys("message");
        driver.findElement(By.id("my-button")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        System.out.println(driver.findElement(By.id("response")).getText().equals("Message Sent"));
        driver.close();
    }
}
