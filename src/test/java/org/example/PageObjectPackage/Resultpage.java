package org.example.PageObjectPackage;

import org.example.BaseClassPackage.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Resultpage extends DriverFactory {

    @FindBy(xpath = "//span[contains(text(),'Running')]")
    WebElement runningbutton;

public void runningFilter() throws InterruptedException {
    Thread.sleep(5000);
    runningbutton.click();
}


}
//Testing Pull Practice
