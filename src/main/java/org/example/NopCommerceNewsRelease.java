package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NopCommerceNewsRelease extends Utils
{
   // private By _nopCommerceNewReleaseDetails  = By.className("buttons");
    private By _titleFieldOfNews_Details = By.id("AddNewComment_CommentTitle");

    private  By _commentTextOfNews_Details = By.id("AddNewComment_CommentText");

    private By _newCommentButton =By.xpath("//button[@name=\"add-comment\"]");

    private By _commentMessage = By.className("result");

    public void enterYourComment(){
        typeText(_titleFieldOfNews_Details,"Weather");

        typeText(_commentTextOfNews_Details,"Roll no is 6");

        clickOnElement(_newCommentButton);
    }
    public void verifyDisplayedMsgWithEnteredMsg()
    {
        //putting the text value of the string in variable commentMsg with its locator by using user defined method getTextFromElement();
        String commentMsg = getTextFromElement(_commentMessage);
        //putting the expected string value to the variable
        String displayedCommentMessage = "News comment is successfully added.";

        //assert to verify actual comment message = expected comment message
        Assert.assertEquals(commentMsg,displayedCommentMessage);

        //printing the value of the variable commentMsg
        System.out.println(commentMsg);}
}


//    {
//        //Navigates to 'Title' field with its locator by id using user defined method 'enterText' and adding Title
//        typeText(_commentTitle,"Computer Review26");
//
//        //Navigates to 'Comment' field with its locator by id using user defined method 'enterText' and adding Comment
//        typeText(_writeComment,"It is working really well");
//
//        //Navigates to the 'NEW COMMENT' button with its locator by xpath using user defined method 'clickOnElement'  and performing click action
//        clickOnElement(_newCommentButton);



//    public void userIsOnNopCommerceNewsReleaseDetailsPage()
//    {
//        waitForUrlToBe("https://demo.nopcommerce.com/nopcommerce-new-release", 10);
//        Assert.assertTrue(driver.getCurrentUrl().contains("button-1 news-item-add-comment-button"));
//    }
//
//    public void clickOnNewsButtonDetailsWithTitle()
//    {
//       clickOnElement(_nopCommerceNewReleaseDetails);
//       typeText(_titleFieldOfNews_Details, "Weather" );
//    }
//    public void enterComments()
//    {
//        clickOnElement(_commentTextOfNews_Details);
//        typeText(_commentTextOfNews_Details,"Roll no.6");
//    }

//    public void verifyUserIsAbleToClickOnNewCommentButton() {
//        clickOnElement(_newComment);
//    }

    //public void verifyUserIsAbleToClickOnRegisterButton() {
      //  clickOnElement(registerButton);
    //}








//    public void addComment()
//    {
//        //Navigates to 'Title' field with its locator by id using user defined method 'enterText' and adding Title
//        typeText(_commentTitle,"Computer Review26");
//
//        //Navigates to 'Comment' field with its locator by id using user defined method 'enterText' and adding Comment
//        typeText(_writeComment,"It is working really well");
//
//        //Navigates to the 'NEW COMMENT' button with its locator by xpath using user defined method 'clickOnElement'  and performing click action
//        clickOnElement(_newCommentButton);
//
//    }

//    public void verifyActualCommentMessageIsEqualToExpectedCommentMessage()
//    {
//        //putting the text value of the string in variable commentMsg with its locator by using user defined method getTextFromElement();
//        String actualCommentMsg = getTextFromElement(_commentMessage);
//        //putting the expected string value to the variable
//        String expectedCommentMessage = "News comment is successfully added.";
//
//        //assert to verify actual comment message = expected comment message
//        Assert.assertEquals(actualCommentMsg,expectedCommentMessage);
//
//        //printing the value of the variable commentMsg
//        System.out.println(actualCommentMsg);
//    }
//
