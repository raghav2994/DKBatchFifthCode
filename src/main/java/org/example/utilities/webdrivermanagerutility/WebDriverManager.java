package org.example.utilities.webdrivermanagerutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class WebDriverManager {

    private static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();

    public static void setWebDriver(WebDriver driver){
        threadLocalDriver.set(driver);
    }

    public static WebDriver getWebDriver(){
        return threadLocalDriver.get();
    }
}
