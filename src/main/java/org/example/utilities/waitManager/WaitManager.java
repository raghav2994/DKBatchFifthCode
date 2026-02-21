package org.example.utilities.waitManager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitManager {

    public WebDriver driver2;

    WebDriverWait wait;
    Wait fluentWait;
    public WaitManager(WebDriver wd){
        this.driver2 = wd;
    }

    public void implicitWait(int timeoutInSecond){
        driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeoutInSecond));
    }

    public void explicitWait(int timeoutInSecond, By locator){
        wait = new WebDriverWait(driver2, Duration.ofSeconds(timeoutInSecond));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void fluentWait(int timeoutInSecond, int pollTime, By locator){
        fluentWait = new FluentWait(driver2)
                .withTimeout(Duration.ofSeconds(timeoutInSecond))
                .pollingEvery(Duration.ofSeconds(pollTime))
                .ignoring(NoSuchElementException.class);
        fluentWait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }
}
