package org.example.selenium;

import org.example.utilities.waitManager.WaitManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class SeleniumDemo {

    public static void  main(String[] args) throws MalformedURLException {

       ChromeOptions chromeOptions = new ChromeOptions();
       WebDriver driver = new RemoteWebDriver(new URL("http://192.168.68.109:4444"), chromeOptions);
       driver.get("https://demo.evershop.io/account/login");

       WaitManager w = new WaitManager(driver);

       //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); -> Implicit wait

        w.implicitWait(10);
        w.explicitWait(5,By.xpath("//button[@class='button primary']"));
        w.fluentWait(10,5, By.xpath("//button[@class='button primary']"));

        //Explicit wait

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button primary']")));
//
        //Fluent Wait

           Wait fluentWait = new FluentWait(driver)
                   .withTimeout(Duration.ofSeconds(10))
                           .pollingEvery(Duration.ofSeconds(5))
                                   .ignoring(NoSuchElementException.class);

           fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button primary']")));


       driver.findElement(By.xpath("//input[@id='field-email']")).sendKeys("ragadijavi@gmail.com");
       driver.findElement(By.xpath("//input[@id='field-password']")).sendKeys("Password");
       driver.findElement(By.xpath("//button[@class='button primary']")).click();

    }
}
