package dragdrop;

import baseTest.BaseTests;
import org.testng.annotations.Test;
import pages.DragAndDropPage;

public class DragNDrop extends BaseTests {

    @Test
    public void testDragDrop(){
        DragAndDropPage dragAndDropPage = homePage.clickOnDragAndDropPageLink();
        dragAndDropPage.dragAndDrop1();
        dragAndDropPage.dragAndDrop2();
    }
}
