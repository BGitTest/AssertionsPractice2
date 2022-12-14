package org.example;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

public class TestSuit extends BaseTest {

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    NopCommerceNewsRelease nopCommerceNewsRelease = new NopCommerceNewsRelease();
    // NewCommentPage newCommentPage = new NewCommentPage();
    FaceBook faceBook = new FaceBook();


    @Test
    public void registrationPage() {
        homePage.verifyRegisterButtonIsPresent();
        homePage.clickOnRegisterButton();

        registrationPage.verifyUserIsOnRegistrationPage();
        registrationPage.verifyUserIsAbleToClickOnRegisterButton();
    }

    @Test
    public void newsReleaseComment() {
        homePage.clickOnNopCommerceNewReleaseDetailsButton();
        nopCommerceNewsRelease.enterYourComment();
        nopCommerceNewsRelease.verifyDisplayedMsgWithEnteredMsg();

    }

    @Test
    public void faceBookVerifyURLOpenInNextPage() {

        homePage.clickOnFacebookLogo();
        faceBook.switchToChildWindowToParent();
    }

    @Test
    public void voteButtonHandlePopUpAlert() {
        homePage.acceptIfPopUpAlertIsPresent();
    }
}
