package org.example.demoEverTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

public class LoginFlowTest {

    ChromeOptions chromeOptions;
    FirefoxOptions firefoxOptions;
    WebDriver driver;

    @Parameters({"browser"})
    @BeforeMethod
    public void afterMethod(String browserName) throws MalformedURLException {
        System.out.println("We are executing it on " + browserName);

        switch (browserName) {
            case "Chrome":
                chromeOptions = new ChromeOptions();
                driver = new RemoteWebDriver(new URL("http://192.168.68.101:4444"), chromeOptions);
                driver.get("https://demo.evershop.io/account/login");
                break;

            case "Firefox":
                firefoxOptions = new FirefoxOptions();
                driver = new RemoteWebDriver(new URL("http://192.168.68.101:4444"), firefoxOptions);
                driver.get("https://demo.evershop.io/account/login");
                break;
        }
    }

    @Test
    public void unsuccessLogin() throws MalformedURLException {
        driver.findElement(By.xpath("//input[@id='field-email']")).sendKeys("ragadijavi@gmail.com");
        driver.findElement(By.xpath("//input[@id='field-password']")).sendKeys("Password1");
        driver.findElement(By.xpath("//button[@class='button primary']")).click();
    }

    @Test
    public void successLogin() throws MalformedURLException {
        driver.findElement(By.xpath("//input[@id='field-email']")).sendKeys("ragadijavi@gmail.com");
        driver.findElement(By.xpath("//input[@id='field-password']")).sendKeys("Password");
        driver.findElement(By.xpath("//button[@class='button primary']")).click();
    }

    @AfterMethod
    public void afterMethod(){
        driver.quit();
    }

}
