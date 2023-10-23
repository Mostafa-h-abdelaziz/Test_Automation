package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
       // System.out.println();
          this.driver = driver;
    }
    private By formAuthenticationLink = By.linkText("Form Authentication");
    private By forgotPasswordLink = By.linkText("Forgot Password");
    private By checkboxsLink = By.xpath("//*[contains(text(),'Checkbox')]");
    private By uploadFileLink =  By.xpath("//*[contains(text(),'File Upload')]");
    //LoginPage
    public LoginPage clickOnFormAuthenticationLink(){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }

    //ForgetPassword
    public ForgetPasswordPage CLICKoNForgetPasswordPage(){
        driver.findElement(forgotPasswordLink).click();
        return new ForgetPasswordPage(driver);
    }

    //CheckBoxs
    public CheckboxPage ClickOnCheckBoxs(){
        driver.findElement(checkboxsLink).click();
        return new CheckboxPage(driver);
    }

    public UploadPage clickOnUploadPage(){
        driver.findElement(uploadFileLink).click();
        return new UploadPage(driver);
    }

    private By dynamicLoading = By.linkText("Dynamic Loading");

    public DynamicLoadingPage clickOnDynumicLoadingButton(){
        driver.findElement(dynamicLoading).click();
        return new DynamicLoadingPage(driver);
    }



}
