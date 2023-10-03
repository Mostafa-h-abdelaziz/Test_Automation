package mostafa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javax.xml.xpath.XPathExpression;

import static org.testng.Assert.assertListContains;
import static org.testng.Assert.assertTrue;

public class M {

 //invalid username
 @Test
    public void t1() {
  WebDriver driver = new ChromeDriver();
  driver.get("https://the-internet.herokuapp.com/");

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
  driver.quit();

 }

    //invalid password
    @Test
    public void t2() {
     WebDriver driver = new ChromeDriver();
     driver.get("https://the-internet.herokuapp.com/");

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
     driver.quit();
    }

     // empty fields
     @Test
     public void t3(){
     WebDriver driver = new ChromeDriver();
     driver.get("https://the-internet.herokuapp.com/");

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

      driver.quit();

     }



     //valid login
     @Test
     public void t4(){
      WebDriver driver = new ChromeDriver();
      driver.get("https://the-internet.herokuapp.com/");

      //from link
      driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[21]/a")).click();
     // find username and pass
     driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("tomsmith");
     driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("SuperSecretPassword!");

     // login button
     driver.findElement(By.xpath("//*[@id=\"login\"]/button/i")).click();

     // report
     String expectedResult = "You Logged into a secure area!";
     String actualResult = driver.findElement(By.id("flash")).getText();
     assertTrue(actualResult.contains(expectedResult));
     driver.quit();
 }

}
