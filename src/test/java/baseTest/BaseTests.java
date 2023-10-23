package baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.time.Duration;

public class BaseTests {

protected WebDriver driver;

protected HomePage homePage;

     @BeforeClass
     public void setup(){

         //System.out.println();
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         homePage = new HomePage(driver);
        // (implicit wait) driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     }

     @BeforeMethod
     public void getHome(){
         driver.get("https://the-internet.herokuapp.com/");
     }

     @AfterClass
    public void turnoffTab(){
         driver.quit();

     }







}
