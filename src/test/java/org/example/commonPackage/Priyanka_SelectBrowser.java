package org.example.commonPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Priyanka_SelectBrowser {
    public static WebDriver startBrowser(String browserName, String ApplicationURL) {

        WebDriver driver =null;

        if(browserName.equalsIgnoreCase("Chrome") || browserName.equalsIgnoreCase("GC") || browserName.equalsIgnoreCase("Google Chrome"))
        {
            driver = new ChromeDriver();
        }

        else if(browserName.equalsIgnoreCase("Edge")|| browserName.equalsIgnoreCase("Microsoft Edge"))
        {
            driver = new EdgeDriver();
        }

        else if(browserName.equalsIgnoreCase("Firefox")|| browserName.equalsIgnoreCase("FF"))
        {
            driver = new FirefoxDriver();
        }
        else
        {
            System.out.println("sorry we do not support :"+ browserName + "Browser");
        }
        driver.manage().window().maximize();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));

        driver.get(ApplicationURL);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        return driver;

    }
}
