package forgetpassword;

import baseTest.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SendForgetEmail extends BaseTests {

    @Test(priority = 2)
    public void Forget() {

        //from link
        driver.findElement(By.xpath("//*[contains(text(),'Forgot Password')]")).click();

        // find username and pass
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("mostafa.hassan@mailinator.com");

        // login button
        driver.findElement(By.xpath("//*[contains(@class,'icon-2x icon-signin')]")).click();

        // report
        String expectedResult = "Internal Server Error";
        String actualResult = driver.findElement(By.xpath("//*[contains(text(),'Internal Server Error')]")).getText();
        assertTrue(actualResult.contains(expectedResult));

    }
}
