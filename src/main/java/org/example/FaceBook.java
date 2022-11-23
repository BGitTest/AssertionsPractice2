package org.example;

import org.openqa.selenium.By;

public class FaceBook extends Utils
{
    private By _clickOnFaceBookLogo = By.linkText("http://www.facebook.com/nopCommerce");


    public void faceBookButton()
    {
        clickOnElement(_clickOnFaceBookLogo);
    }

}
