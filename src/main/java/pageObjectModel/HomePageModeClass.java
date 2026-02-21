package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageModeClass {

    WebDriver driver;

    public HomePageModeClass(WebDriver wd){
        driver = wd;
    }

    private String itemTextLinkXPathLocator = "//div[@class='product__list__item product__list__item__grid']/..//h3[contains(text(),'Raghav')]";

    public void clickItem(String itemName){
        String itemTextLinkLocator = itemTextLinkXPathLocator.replace("Raghav", itemName);
        By itemTextLink = By.xpath(itemTextLinkLocator);
        WebElement itemElement = driver.findElement(itemTextLink);
        itemElement.click();
    }

}
