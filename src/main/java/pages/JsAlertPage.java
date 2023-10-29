package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JsAlertPage {

    WebDriver  driver;
    public JsAlertPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By ClickForJsAlertButton = By.xpath("//button[contains(text(),'JS Alert')]");
    private final By getValidationMessage = By.xpath("//*[@id='result']");
    private final By ClickForJsConfirmButton = By.xpath("//*[@id='content']/div/ul/li[2]/button");
    private final By ClickForJsPromptmButton = By.xpath("//*[@id='content']/div/ul/li[3]/button");
    public void clickOnJsALertButton(){
        driver.findElement(ClickForJsAlertButton).click();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public String checkGetValidationMessage(){
       return driver.findElement(getValidationMessage).getText();
    }

    public void clickOnConfirmAlertButton(){
        driver.findElement(ClickForJsConfirmButton).click();
    }

    public void confirmAlert(){
        driver.switchTo().alert().dismiss();
    }

    public String GetvalidationMessageFordismiss(){
       return driver.findElement(getValidationMessage).getText();
    }

    public void oKFromConfirmButton(){
        driver.switchTo().alert().accept();
    }

    public void clickForJsPromptmButton(){
        driver.findElement(ClickForJsPromptmButton).click();
    }

    public void sendKyesAlert(){
        driver.switchTo().alert().sendKeys("mostafa");
    }

    public void okAfterSendKyesAlert(){
        driver.switchTo().alert().accept();
    }

    public String GetvalidationMessageForSendkyes(){
        return driver.findElement(getValidationMessage).getText();
    }



}
