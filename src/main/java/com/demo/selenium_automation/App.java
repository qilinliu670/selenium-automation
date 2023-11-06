package com.demo.selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	WebDriverManager.chromedriver().setup();
    	ChromeOptions chromeOptions = new ChromeOptions();
    	chromeOptions.addArguments("--no-sandbox");
    	chromeOptions.addArguments("--disable-dev-shm-usage");
    	chromeOptions.addArguments("--headless");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("http://54.177.205.97:8082/contact.html");
        driver.findElement(By.id("inputName")).sendKeys("Qilin Liu");
        driver.findElement(By.id("inputNumber")).sendKeys("4086200006");
        driver.findElement(By.id("inputMail")).sendKeys("qilin.liu@tcs.com");
        driver.findElement(By.id("inputMessage")).sendKeys("message");
        driver.findElement(By.id("my-button")).click();
        System.out.println(driver.findElement(By.id("response")).getText().equals("Message Sent"));
        driver.close();
    }
}
