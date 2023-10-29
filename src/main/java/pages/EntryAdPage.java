package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Base64;

public class EntryAdPage {
    WebDriver driver;
    WebDriverWait wait;

    public EntryAdPage (WebDriver driver){
        this.driver = driver;
    }

    private final By ThisisAModelWindow = By.cssSelector(".modal .modal-title");

    private final By CloseButtonOfModal = By.xpath("//*[@id='modal']/div[2]/div[3]/p");

    private final By ClickHereLink = By.id("restart-ad");


    public void closeTheModalWindow(){
        wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(ThisisAModelWindow)));
        driver.findElement(CloseButtonOfModal).click();
    }

    public void retryToClickHere(){
        driver.findElement(ClickHereLink).click();
        try {
            wait= new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(ThisisAModelWindow)));
            driver.findElement(CloseButtonOfModal).click();
        }
       catch (org.openqa.selenium.NoSuchFrameException e){
           driver.findElement(ClickHereLink).click();
           wait= new WebDriverWait(driver, Duration.ofSeconds(10));
           wait.until(ExpectedConditions.visibilityOf(driver.findElement(ThisisAModelWindow)));
           driver.findElement(CloseButtonOfModal).click();
       }

    }

}
