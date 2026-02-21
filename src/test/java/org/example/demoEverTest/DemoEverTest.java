package org.example.demoEverTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


import java.net.MalformedURLException;
import java.net.URL;

public class DemoEverTest {

    public static void successLogin() throws MalformedURLException {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.68.108:4444"), chromeOptions);
        driver.get("https://demo.evershop.io/account/login");
        driver.findElement(By.xpath("//input[@id='field-email']")).sendKeys("ragadijavi@gmail.com");
        driver.findElement(By.xpath("//input[@id='field-password']")).sendKeys("Password");
        driver.findElement(By.xpath("//button[@class='button primary']")).click();
        driver.close();
    }

    @Test
    public static void unsuccessLogin() throws MalformedURLException {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.68.108:4444"), chromeOptions);
        driver.get("https://demo.evershop.io/account/login");
        driver.findElement(By.xpath("//input[@id='field-email']")).sendKeys("ragadijavi@gmail.com");
        driver.findElement(By.xpath("//input[@id='field-password']")).sendKeys("Password1");
        driver.findElement(By.xpath("//button[@class='button primary']")).click();
    }
}
