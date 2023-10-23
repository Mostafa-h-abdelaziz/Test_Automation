package dropdownList;

import baseTest.BaseTests;
import org.testng.annotations.Test;
import pages.CheckboxPage;
import pages.DropDownPage;

public class DropdownList extends BaseTests {

    @Test
    public void Dropdown(){
        DropDownPage dropDownPage = homePage.clickOnDropdownLink();
        dropDownPage.clickOnDropdown("Option 1");
        dropDownPage.clickOnDropdown("Option 2");

    }
}
