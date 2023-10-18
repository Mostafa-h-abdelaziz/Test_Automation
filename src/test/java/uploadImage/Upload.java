package uploadImage;

import baseTest.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.CheckboxPage;
import pages.FileUploadedPage;
import pages.SecureAreaPage;
import pages.UploadPage;

import static org.testng.Assert.assertTrue;

public class Upload extends BaseTests {

    @Test(priority = 1)
    public void VaildUpload1() {

        //from link
        //driver.findElement(By.xpath("//*[contains(text(),'File Upload')]")).click();

        //choose file
        //driver.findElement(By.cssSelector("#file-upload")).sendKeys("D:/SWS/Automation/Test_AUtomation/src/test/java/uploadImage/mostafa hassan.jpg");


        // upload button
        //driver.findElement(By.cssSelector("#file-submit")).click();

        // report
        //String expectedResult = "mostafa hassan.jpg";
        //String actualResult = driver.findElement(By.id("uploaded-files")).getText();
        //assertTrue(actualResult.contains(expectedResult));


        UploadPage UploadPage = homePage.clickOnUploadPage();
        UploadPage.Upload();
        FileUploadedPage fileUploadedPage = UploadPage.clickOnFileSubmit();
        fileUploadedPage.getValidationMessageUploaded();
        String actualResult = fileUploadedPage.getValidationMessageUploaded();
        String expectedResult = "mostafa hassan.jpg";
        assertTrue(actualResult.contains(expectedResult));


    }

    @Test(priority = 2)
    public void InVaildUpload() {

        //from link
        driver.findElement(By.xpath("//*[contains(text(),'File Upload')]")).click();

        //no uploaded file

        // upload button
        driver.findElement(By.cssSelector("#file-submit")).click();

        // report
        String expectedResult = "Internal Server Error";
        String actualResult = driver.findElement(By.xpath("//*[contains(text(),'Internal Server Error')]")).getText();
        assertTrue(actualResult.contains(expectedResult));

    }

    @Test(priority = 3)
    public void VaildUpload3() {

        //from link
        driver.findElement(By.xpath("//*[contains(text(),'File Upload')]")).click();

        //from red box
        // why ???!!
        driver.findElement(By.cssSelector("#drag-drop-upload")).sendKeys("D:/SWS/Automation/Test_AUtomation/src/test/java/uploadImage/mostafa hassan.jpg");


        // upload button
        driver.findElement(By.cssSelector("#file-submit")).click();

        // report
        String expectedResult = "mostafa hassan.jpg";
        String actualResult = driver.findElement(By.id("uploaded-files")).getText();
        assertTrue(actualResult.contains(expectedResult));

    }
}
