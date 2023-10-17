package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPasswordPage {

    WebDriver driver;

    public ForgetPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By emailField = By.xpath("//*[@id='email']");

    private final By retrivePasswordButton = By.xpath("//*[contains(@class,'icon-2x icon-signin')]");



    public void insertEmailField(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public InternalServerErrorPage clickRetrivePasswordButton(){
        driver.findElement(retrivePasswordButton).click();
        return new InternalServerErrorPage(driver);
    }


}
