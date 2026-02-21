package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public class LoginModelClass {

    WebDriver driver;

    public LoginModelClass(WebDriver wd){
        driver = wd;
    }

    By password_field = By.xpath("//input[@id='field-password']");
    By username_field = By.xpath("//input[@id='field-email']");
    By submitButton_field = By.xpath("//button[normalize-space()='Sign In']");

    public LoginModelClass enterUserName(String userName) throws MalformedURLException {
        driver.findElement(username_field).sendKeys(userName);
        return this;
    }

    public LoginModelClass enterPassword(String password) throws MalformedURLException {
        driver.findElement(password_field).sendKeys(password);
        return this;
    }

    public LoginModelClass  clickOnSubmitButton() throws MalformedURLException {
        driver.findElement(submitButton_field).click();
        return this;
    }

    public Boolean userNameFieldIsDisplayed(){
        Boolean isDisplayed = driver.findElement(username_field).isDisplayed();
        return isDisplayed;
    }
}
