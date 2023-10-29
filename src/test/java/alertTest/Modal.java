package alertTest;

import baseTest.BaseTests;
import org.testng.annotations.Test;
import pages.EntryAdPage;

public class Modal extends BaseTests {

    @Test
    public void closeTheModal(){
        EntryAdPage entryAdPage = homePage.clickOnEntryPageLink();
        entryAdPage.closeTheModalWindow();
        entryAdPage.retryToClickHere();
    }
}
