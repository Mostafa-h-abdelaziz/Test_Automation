package alertTest;

import baseTest.BaseTests;
import org.testng.annotations.Test;
import pages.EntryAdPage;
import pages.WYSIWYGEditorPage;

public class Ifram extends BaseTests {

    @Test
    public void editandClearIfram() throws InterruptedException{
        WYSIWYGEditorPage wysiwygEditorPage = homePage.clickOnWYSIWYGEditorLink();
        wysiwygEditorPage.clearText();
        wysiwygEditorPage.inserttext("mostafa");
        wysiwygEditorPage.clickOnIncreseIndentButton();

    }
}
