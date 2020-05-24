package org.example.PageObjectPackage;

import org.example.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Filterpage extends DriverFactory {
    @FindBy(xpath = "//a[contains(text(),'Nike Lean Armbands')]")
    WebElement choiceProduct;

    @FindBy(xpath = "//div[@class='search-title']")
    WebElement runningTitle;

    @FindBy(xpath = "//h1[@class='h2 product-name-main']//span[contains(text(),'Nike Lean Armbands')]")
    WebElement armBand;

    public void armBandAssert(){
        String actualarmband = armBand.getText();
        Assert.assertThat(actualarmband,Matchers.containsString("Armbands"));
    }

    public void runningTitleAssert(){
        String actualrunningTitle = runningTitle.getText();
        Assert.assertThat(actualrunningTitle, Matchers.containsString("Running"));
    }

    public void product (){

        choiceProduct.click();
    }
}
