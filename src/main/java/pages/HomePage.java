package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    private By formAuthenticationLink = By.linkText("Form Authentication");

    private By forgotPasswordLink = By.linkText("Forgot Password");


    public LoginPage clickOnFormAuthenticationLink(){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }

    public ForgetPasswordPage CLICKoNForgetPasswordPage(){
        driver.findElement(forgotPasswordLink).click();
        return new ForgetPasswordPage(driver);
    }

}
