package org.example.demoEverTest;

import org.example.utilities.ExcelUtilities.ExcelDataUtils;
import org.example.utilities.webdrivermanagerutility.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjectModel.HomePageModeClass;
import pageObjectModel.LoginModelClass;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class DemoEverPOMTest {



    @Parameters({"browser"})
    @BeforeMethod
    public void setUp(String browserName) throws MalformedURLException {
        System.out.println("We are executing it on " + browserName);

        WebDriver driver;

        switch (browserName) {
            case "Chrome":
                driver = new RemoteWebDriver(
                        new URL("http://192.168.68.106:4444"),
                        new ChromeOptions()
                );
                break;

            case "Firefox":
                driver = new RemoteWebDriver(
                        new URL("http://192.168.68.106:4444"),
                        new FirefoxOptions()
                );
                break;

            default:
                throw new IllegalArgumentException("Invalid browser: " + browserName);
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        driver.manage().window().maximize();

        WebDriverManager.setWebDriver(driver);
        driver.get("https://demo.evershop.io/account/login");
    }

    @DataProvider(name = "loginData")
    public static Object[][] getLoginData() throws IOException {
        return ExcelDataUtils.getLoginTestData(
                "src/main/resources/DataDriven.xlsx",
                "LoginData"
        );
    }

    @Test(dataProvider = "loginData")
    public void loginSuccess(String UN, String PW) throws MalformedURLException {
        WebDriver driver = WebDriverManager.getWebDriver();
        LoginModelClass loginPage = new LoginModelClass(driver);

        loginPage.enterUserName(UN).
                enterPassword(PW).
                clickOnSubmitButton();
    }

//    @Test
//    public void addToCart() throws MalformedURLException, InterruptedException {
//        WebDriver driver = WebDriverManager.getWebDriver();
//
//        LoginModelClass loginPage = new LoginModelClass(driver);
//
//        loginPage.enterUserName("ragadijavi@gmail.com").
//                enterPassword("Password").
//                clickOnSubmitButton();
////        Thread.sleep(5000);
////        h.clickItem("Ceramic Candy Bowl - Black");
//    }

}
