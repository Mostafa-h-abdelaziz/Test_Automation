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

    private final By invalidMessage = By.xpath("//*[contains(text(),'Internal Server Error')]");

    public String getinvalidMessage(){
        return driver.findElement(invalidMessage).getText();
    }
}
