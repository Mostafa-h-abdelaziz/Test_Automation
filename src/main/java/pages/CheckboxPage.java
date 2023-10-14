package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxPage {

    WebDriver driver;
    public CheckboxPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By checkBox1 = By.xpath("//input[@type='checkbox'][1]");
    private final By checkBox2 = By.xpath("//input[@type='checkbox'][2]");

    public void clickCheck1(){
        driver.findElement(checkBox1).click();
    }

    public void clickCheck2(){
        driver.findElement(checkBox2).click();
    }
}
