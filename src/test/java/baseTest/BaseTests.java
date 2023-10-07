package baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTests {

protected WebDriver driver;

     @BeforeClass
     public void setup(){
         driver = new ChromeDriver();
         driver.manage().window().maximize();
     }

     @BeforeMethod
     public void getHome(){
         driver.get("https://the-internet.herokuapp.com/");
     }

     @AfterClass
    public void turnoff(){
         driver.quit();

     }







}
