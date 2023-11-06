package com.demo.selenium_automation;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void insureMeTest() throws InterruptedException {
    	ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("http://54.177.205.97:8082/contact.html");
        driver.findElement(By.id("inputName")).sendKeys("Qilin Liu");
        driver.findElement(By.id("inputNumber")).sendKeys("4086200006");
        driver.findElement(By.id("inputMail")).sendKeys("qilin.liu@tcs.com");
        driver.findElement(By.id("inputMessage")).sendKeys("message");
        driver.findElement(By.id("my-button")).click();
        assertTrue(driver.findElement(By.id("response")).getText().equals("Message Sent"));
        driver.close();
    }
}
