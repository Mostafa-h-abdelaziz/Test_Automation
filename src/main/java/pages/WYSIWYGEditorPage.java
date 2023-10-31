package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage {

    WebDriver driver;
    public WYSIWYGEditorPage(WebDriver driver) {
        this.driver=driver;
    }

    private final By  increaseIndentButton = By.cssSelector("[aria-label= 'Increase indent']");

    private final By textArea = By.id("tinymce");

    private final String ifram = "mce_0_ifr";

    public void clickOnIncreseIndentButton(){
        driver.findElement(increaseIndentButton).click();
    }

    public void switchtoIfram(){
        driver.switchTo().frame(ifram);
    }

    public void switchToParent(){
        driver.switchTo().parentFrame();
    }

    public void inserttext(String Text){
        switchtoIfram();
        driver.findElement(textArea).sendKeys(Text);
        switchToParent();
    }

    public void clearText(){
        switchtoIfram();
        driver.findElement(textArea).clear();
        switchToParent();
    }





}
