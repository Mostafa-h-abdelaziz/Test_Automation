package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    WebDriver driver;
    public DynamicLoadingPage(WebDriver driver) {
        this.driver=driver;
    }

    private final By example1 = By.partialLinkText("Example 1:");

    private final By example2 = By.partialLinkText("Example 2:");

    public OnePage clickOnExample1(){
        driver.findElement(example1).click();
        return new OnePage(driver);
    }

    public SecondPage clickOnExample2(){
        driver.findElement(example2).click();
        return  new SecondPage(driver);

    }

}
