package upload;

import baseTest.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Fileuploader extends BaseTests {

    @Test(priority = 1)
    public void Forget1() {

        //from link
        driver.findElement(By.xpath("//*[contains(text(),'File Upload')]")).click();

        //choose file
        driver.findElement(By.cssSelector("#file-upload"));

        // upload button
        driver.findElement(By.cssSelector("#file-submit")).click();

        // report
        String expectedResult = "Internal Server Error";
        String actualResult = driver.findElement(By.xpath("//*[contains(text(),'Internal Server Error')]")).getText();
        assertTrue(actualResult.contains(expectedResult));

    }


    @Test(priority = 2)
    public void Forget2() {

        //from link
        driver.findElement(By.xpath("//*[contains(text(),'File Upload')]")).click();

        //click on the card
        driver.findElement(By.cssSelector("#file-upload"));



    }
}
