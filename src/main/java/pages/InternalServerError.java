package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InternalServerError {

    WebDriver driver;
    public InternalServerError(WebDriver driver) {
        this.driver = driver;
    }

    private final By message = By.xpath("//*[contains(text(),'Internal Server Error')]");

    public String getMessage(){
        return driver.findElement(message).getText();
    }
}
