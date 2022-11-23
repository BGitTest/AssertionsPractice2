package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends Utils {

    private By _registrationButton = By.className("ico-register");

    private By _detailsButton = By.xpath("//div[@class=\"news-items\"]/div[2]/div[3]/a");

   // private By _electronicsCategory = By.linkText("Electronics ");


    public void verifyRegisterButtonIsPresent() {
        //driver is waiting for URL
        waitForUrlToBe("https://demo.nopcommerce.com/", 10);

        //verifying Register Button Is Present
        Assert.assertEquals(getTextFromElement(By.className("ico-register")), "Register", "Register Button is not present");
    }

    //clicking on register button on homepage
    public void clickOnRegisterButton() {
        clickOnElement(_registrationButton);
    }

//    public void clickOnElectronics()
//    {
//     clickOnElement(_electronicsCategory);
//    }

    public  void clickOnNopCommerceNewReleaseDetailsButton()
    {
        //clicking on details button
        clickOnElement(_detailsButton);}
}

