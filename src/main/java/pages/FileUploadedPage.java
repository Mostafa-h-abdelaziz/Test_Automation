package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadedPage {

    WebDriver driver;

    public FileUploadedPage(WebDriver driver){
        this.driver = driver;
    }

    private final By validationMessageUploaded = By.id("uploaded-files");

    public String getValidationMessageUploaded(){
        return driver.findElement(validationMessageUploaded).getText();
    }
}
