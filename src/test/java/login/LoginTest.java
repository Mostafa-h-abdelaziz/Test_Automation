package login;

import baseTest.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTests {


  @Test(priority = 2)
    public void InvalidUser() {

  //from link
  driver.findElement(By.xpath("//*[contains(text(),'Form Authentication')]")).click();

  // find username and pass
  driver.findElement(By.xpath("//*[@id='username']")).sendKeys("tomsmxith");
  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");

  // login button
  driver.findElement(By.xpath("//*[contains(@class,'fa fa-2x fa-sign-in')]")).click();

  // report
  String expectedResult = "Your username is invalid!";
  String actualResult = driver.findElement(By.id("flash")).getText();
  assertTrue(actualResult.contains(expectedResult));

 }


    @Test(priority = 3)
    public void InvalidPassword() {

     //from link
     driver.findElement(By.xpath("//*[contains(text(),'Form Auth')]")).click(); // number 5 in xpath

     // find username and pass
     driver.findElement(By.cssSelector("#username")).sendKeys("tomsmith");
     driver.findElement(By.cssSelector("#password")).sendKeys("SupmmerSecretPassword!");

     // login button
     driver.findElement(By.cssSelector("button[type='submit']")).click();

     // report
     String expectedResult = "Your password is invalid!";
     String actualResult = driver.findElement(By.id("flash")).getText();
     assertTrue(actualResult.contains(expectedResult));
    }


     @Test(priority = 1)
     public void EmptyLogin(){

     //from link
      driver.findElement(By.xpath("//*[contains(text(),'Form Authentication')]")).click();

      //user and pass
      driver.findElement(By.cssSelector("#username")).sendKeys(" ");
      driver.findElement(By.cssSelector("#password")).sendKeys(" ");

      //login button
      driver.findElement(By.cssSelector("button[type='submit']")).click();

      //report
      String expectedResult = "Your username is invalid!";
      String actualResult = driver.findElement(By.id("flash")).getText();
      assertTrue(actualResult.contains(expectedResult));


     }


     @Test(priority = 4)
     public void ValidLogin(){

      //from link
      driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[21]/a")).click();

     // find username and pass
     driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("tomsmith");
     driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("SuperSecretPassword!");

     // login button
     driver.findElement(By.xpath("//*[@id=\"login\"]/button/i")).click();

     // report
     String expectedResult = "You logged into a secure area!";
     String actualResult = driver.findElement(By.id("flash")).getText();
     assertTrue(actualResult.contains(expectedResult));
 }

}
