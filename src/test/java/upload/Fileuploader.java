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
        driver.findElement(By.cssSelector("#file-upload")).click();


        // upload button
        driver.findElement(By.cssSelector("#file-submit")).click();

        // report
        String expectedResult = "mostafa.jpeg";
        String actualResult = driver.findElement(By.xpath("//*[@id=,'uploaded-files')]")).getText();
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
