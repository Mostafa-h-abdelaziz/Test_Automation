package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadPage {

    WebDriver driver;

    public UploadPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By upload = By.cssSelector("#file-upload");
    private final By fileSubmit = By.cssSelector("#file-submit");



    public void Upload (){
        driver.findElement(upload).sendKeys("D:/SWS/Automation/Test_AUtomation/src/test/java/uploadImage/mostafa hassan.jpg");
    }

    public FileUploadedPage clickOnFileSubmit(){
        driver.findElement(fileSubmit).click();
        return new FileUploadedPage(driver);
    }

  }
