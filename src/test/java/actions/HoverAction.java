package actions;

import HoverPage.HoverPage;
import baseTest.BaseTests;
import org.testng.annotations.Test;
import utiles.FigureCaption;

public class HoverAction extends BaseTests {

    @Test
    public void testHoverOverElement(){
        HoverPage hoverPage = homePage.clickOnHoverPageLink();
        FigureCaption figureCaption = hoverPage.hoverOverFigure(2);
        System.out.println(figureCaption.getUsername());
        System.out.println(figureCaption.getProfile());

    }
}
