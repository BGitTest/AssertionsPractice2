package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationResultPage extends Utils {

    static String expectedMessage = "Your registration completed";
    private By _resultMessage = By.className("result");

    public void verifyRegisteredMessageIsDisplayed() {
        waitForUrlToBe("https://demo.nopcommerce.com/registerresult/1?returnUrl=/", 10);
        // String registerResulMessage =  getTextFromElement(_resultMessage);
        //System.out.println(expectedMessage);

        String registeredMessage = getTextFromElement(_resultMessage);
        System.out.println(registeredMessage);
        Assert.assertEquals(registeredMessage, expectedMessage);
    }
}


