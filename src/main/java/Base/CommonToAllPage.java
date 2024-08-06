package Base;

import Driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.PropertyReader;

import java.io.FileNotFoundException;
import java.time.Duration;

import static Driver.DriverManager.getDriver;

public class CommonToAllPage {

    // If you want to call something before every Page Object Class call, Put your Code here")
//
// Open File, Open Data Base Connection You can write code here



    public static void openurl() throws FileNotFoundException {

        getDriver().get(PropertyReader.readkey("url"));

    }

    public void clickElement(By element){
        getDriver().findElement(element).click();

    }

    public void enterinput(By element, String key){
        getDriver().findElement(element).sendKeys(key);

    }


    //waits

    public WebElement presenceofElement(By element){
        return new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(element));

    }
     public WebElement visibilityOfElement(By element){
        return new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(element));


     }



}
