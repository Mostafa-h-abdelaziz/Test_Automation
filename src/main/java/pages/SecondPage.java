package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SecondPage {

    WebDriver driver;
    WebDriverWait wait;
    public SecondPage(WebDriver driver) {
        this.driver=driver;
    }

    private final By startButton = By.cssSelector("#start > button");

    private final By validationWaitMessage2 = By.id("finish");

    private final By loader = By.id("loading");

    public void  clickOnStartButton2(){
        driver.findElement(startButton).click();
    }

    public String getvalidationWaitMessage2(){
        wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(validationWaitMessage2)));
        return driver.findElement(validationWaitMessage2).getText();

    }

    public String invisibleloading(){
        wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loader)));
        return String.valueOf(driver.findElement(loader).isDisplayed());
    }
}
