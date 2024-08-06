package PageObjectModel;

import Base.CommonToAllPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginPage extends CommonToAllPage {

    public  LoginPage(WebDriver driver){
        this.driver = driver;
    }

//Page locators
    private By username = By.id("login-username");
    private By password = By.id("login-password");
    private By SignButton =  By.id("js-login-btn");
    private By errormessage = By.className("notification-box-description");
    WebDriver driver;



//Page Actions
 public String invalidCredentail(String user, String pass) throws InterruptedException {

     //driver.get("https://app.vwo.com/#/login");
     //driver.findElement(username).sendKeys(user);
     //driver.findElement(password).sendKeys(pass);
     //driver.findElement(SignButton).click();

     enterinput(username, user);
     enterinput(password, pass);
     clickElement(SignButton);
     Thread.sleep(5000);

     WebElement error = driver.findElement(errormessage);
     String errormessagetext = error.getText();
     return errormessagetext;


 }









}
