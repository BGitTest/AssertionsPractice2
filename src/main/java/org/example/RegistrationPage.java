package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationPage extends Utils {
    private By genderFemale = By.id("gender-female");

    private By firstName = By.id("FirstName");

    private By lastName = By.id("LastName");

    private By dateOfBirthDay = By.name("DateOfBirthDay");

    private By dateOfBirthMonth = By.name("DateOfBirthMonth");

    private By dateOfBirthYear = By.name("DateOfBirthYear");

    private By email = By.id("Email");

    private By companyName = By.id("Company");

    private By newsLetter = By.id("Newsletter");

    private By passWord = By.id("Password");

    private By confirmPassWord = By.id("ConfirmPassword");

    private By registerButton = By.id("register-button");

    public void verifyUserIsOnRegistrationPage() {
        waitForUrlToBe("https://demo.nopcommerce.com/register?returnUrl=%2F", 10);
        Assert.assertTrue(driver.getCurrentUrl().contains("register"));
    }

    public void verifyUserIsAbleToClickOnFemaleButton() {
        clickOnElement(genderFemale);
    }

    public void verifyUserIsAbleToInputFirstName() {
        typeText(firstName, "Save");
    }

    public void verifyUserIsAbleToInputLastName() {
        typeText(lastName, "Soil");
    }

    public void verifyUserIsAbleToSelectDate() {
        selectFromDropDownByValue(dateOfBirthDay, "12");
    }

    public void verifyUserIsAbleToSelectMonth() {
        selectFromDropDownByVisibleText(dateOfBirthMonth, "April");
    }

    public void verifyUserIsAbleToSelectYear() {
        selectFromDropDownByValue(dateOfBirthYear, "1988");
    }

    public void verifyUserIsAbleToTypeEmailAddress() {
        typeText(email, "savesoil" + getTimeStamp() + "@gmail.com");
    }

    public void verifyUserIsAbleToTypeCompanyName() {
        typeText(companyName, "SaveFutureGeneration");
    }

    public void verifyUserIsAbleToTickNewsletterOnCheckBox() {
        clickOnElement(newsLetter);
    }

    public void verifyUserIsAbleToTypePassword() {
        typeText(passWord, "123456");
    }

    public void verifyUserIsAbleToReTypePassword() {
        typeText(confirmPassWord, "123456");
    }

    public void verifyUserIsAbleToClickOnRegisterButton() {
        clickOnElement(registerButton);
    }
}

