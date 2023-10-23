package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage {

    WebDriver driver;
    Select select;
    public DropDownPage(WebDriver driver) {
        this.driver=driver;
    }

    private final By dropdown = By.id("dropdown");

    public void clickOnDropdown(String visibleText){
        select = new Select(driver.findElement(dropdown));
        select.selectByVisibleText(visibleText);
    }

}
