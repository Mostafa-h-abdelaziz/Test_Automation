package alertTest;

import baseTest.BaseTests;
import org.testng.annotations.Test;
import pages.JsAlertPage;

import java.security.PublicKey;

import static org.testng.Assert.assertEquals;

public class JsAlertTest extends BaseTests {

    @Test(priority = 1)
    public void AcceptTC() {
        JsAlertPage jsAlertPage = homePage.clickOnJsAlertLink();
        jsAlertPage.clickOnJsALertButton();
        jsAlertPage.acceptAlert();
        String expectedResult = "You successfully clicked an alert";
        String actualResult = jsAlertPage.checkGetValidationMessage();
        assertEquals(actualResult, expectedResult);
    }

   @Test(priority = 2)
    public void DismissTC(){
        JsAlertPage jsAlertPage = homePage.clickOnJsAlertLink();
        jsAlertPage.clickOnConfirmAlertButton();
        jsAlertPage.confirmAlert();
        String expectedResult = "You clicked: Cancel";
        String actualResult = jsAlertPage.GetvalidationMessageFordismiss();
       assertEquals(actualResult, expectedResult);
   }

   @Test(priority = 3)
    public void AcceptFromDismiss(){
       JsAlertPage jsAlertPage = homePage.clickOnJsAlertLink();
       jsAlertPage.clickOnConfirmAlertButton();
       jsAlertPage.oKFromConfirmButton();
       String expectedResult = "You clicked: Ok";
       String actualResult = jsAlertPage.GetvalidationMessageFordismiss();
       assertEquals(actualResult, expectedResult);
   }

    @Test(priority = 4)
    public void PromptTC(){
        JsAlertPage jsAlertPage = homePage.clickOnJsAlertLink();
        jsAlertPage.clickForJsPromptmButton();
        jsAlertPage.sendKyesAlert();
        jsAlertPage.okAfterSendKyesAlert();
        String expectedResult = "You entered: mostafa";
        String actualResult = jsAlertPage.GetvalidationMessageForSendkyes();
        assertEquals(actualResult, expectedResult);
    }

}
