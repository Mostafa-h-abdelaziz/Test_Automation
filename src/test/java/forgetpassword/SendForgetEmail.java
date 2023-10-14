package forgetpassword;

import baseTest.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.ForgetPasswordPage;
import pages.InternalServerError;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertTrue;

public class SendForgetEmail extends BaseTests {

    @Test(priority = 1)
    public void Forget() {

        //from link
        //driver.findElement(By.xpath("//*[contains(text(),'Forgot Password')]")).click();

        // enter email
        //driver.findElement(By.xpath("//*[@id='email']")).sendKeys("mostafa.hassan@mailinator.com");

        // forget button
        //driver.findElement(By.xpath("//*[contains(@class,'icon-2x icon-signin')]")).click();

        // report
        //String expectedResult = "Internal Server Error";
        //String actualResult = driver.findElement(By.xpath("//*[contains(text(),'Internal Server Error')]")).getText();
        //assertTrue(actualResult.contains(expectedResult));

        ForgetPasswordPage ForgetPasswordPage = homePage.CLICKoNForgetPasswordPage();
        ForgetPasswordPage.insertEmailField("tomsmith");
        InternalServerError internalServerError = ForgetPasswordPage.clickRetrivePasswordButton();
        internalServerError.getMessage();
        String actualResult = internalServerError.getMessage();
        String expectedResult = "Internal Server Error";
        assertTrue(actualResult.contains(expectedResult));

    }
}
