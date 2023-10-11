package checkBoxes;

import baseTest.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Checks extends BaseTests{

    @Test
     public void CheckBox(){
        // open the module
        driver.findElement(By.xpath("//*[contains(text(),'Checkbox')]")).click();
        // check the box 1
        driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
        // check the box 2
        driver.findElement(By.xpath("//input[@type='checkbox'][2]")).click();
    }


}
