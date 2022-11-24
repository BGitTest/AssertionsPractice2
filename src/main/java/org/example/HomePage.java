package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class HomePage extends Utils {

    private By _registrationButton = By.className("ico-register");

    private By _detailsButton = By.xpath("//div[@class=\"news-items\"]/div[2]/div[3]/a");

    private By _faceBookLogoButton = By.xpath("//ul[@class=\"networks\"]/li[1]/a");

    private By _voteButton = By.id("vote-poll-1");

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

    public void clickOnNopCommerceNewReleaseDetailsButton() {
        //clicking on details button
        clickOnElement(_detailsButton);
    }

    public void clickOnFacebookLogo() {
        clickOnElement(_faceBookLogoButton);
    }

    public void acceptIfPopUpAlertIsPresent() {
        clickOnElement(_voteButton);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            //waiting for alert and also checking if alert is present
            wait.until(ExpectedConditions.alertIsPresent());

            //switch to alert
            Alert alert = driver.switchTo().alert();

            //accept alert
            alert.accept();

        }
        //catching exception if alert is not present
        catch (Exception e) {
            System.out.println("No alert");
        }

    }

}


