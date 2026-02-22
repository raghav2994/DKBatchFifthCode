package org.example.commonPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Priyanka_SelectValFromList {

    public static void
    selectValFromList(WebDriver driver,String xpathValue, String ElementToSearch) {

        List<WebElement> allValue =driver.findElements(By.xpath(xpathValue));

        for(WebElement ele : allValue) {

            if(ele.getText().contains(ElementToSearch)) {
                ele.click();
                break;
            }
            System.out.println("Element does not found");
        }
    }
    }





}
}


