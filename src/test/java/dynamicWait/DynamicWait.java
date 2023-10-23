package dynamicWait;


import baseTest.BaseTests;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;
import pages.OnePage;
import pages.SecondPage;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class DynamicWait extends BaseTests {

    @Test (priority = 1)
    // for one page
    public void dynamicWait1(){

    DynamicLoadingPage dynamicLoadingPage = homePage.clickOnDynumicLoadingButton();
    OnePage onePage = dynamicLoadingPage.clickOnExample1();
    onePage.clickOnStartButton();
    //Thread.sleep(5000);
    String actualResult = onePage.getvalidationWaitMessage();
    String expectedResult = "Hello World!";
    assertTrue(actualResult.contains(expectedResult));
    }

    @Test (priority = 2)
    // for second page

    public void dynamicWait2(){

        DynamicLoadingPage dynamicLoadingPage = homePage.clickOnDynumicLoadingButton();
        SecondPage secondPage = dynamicLoadingPage.clickOnExample2();
        secondPage.clickOnStartButton2();
        String actualResult = secondPage.getvalidationWaitMessage2();
        String expectedResult = "Hello World!";
        assertTrue(actualResult.contains(expectedResult));
    }

    @Test (priority = 3)
    // for second page invisible loader

    public void dynamicWait3(){

        DynamicLoadingPage dynamicLoadingPage = homePage.clickOnDynumicLoadingButton();
        SecondPage secondPage = dynamicLoadingPage.clickOnExample2();
        secondPage.clickOnStartButton2();
        String actualResult = secondPage.invisibleloading();
        String expectedResult = "Hello World!";
        assertFalse(actualResult.contains(expectedResult));
    }

}


