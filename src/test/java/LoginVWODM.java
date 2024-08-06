import PageObjectModel.LoginPage;
import base.CommonToAllTest;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import Base.CommonToAllPage;
import utils.PropertyReader;

import java.io.FileNotFoundException;

import static Driver.DriverManager.driver;


public class LoginVWODM  extends CommonToAllTest {

    private static final Logger logger = LogManager.getLogger(LoginVWODM.class);

    @Test
    public void invalidlogin() throws InterruptedException, FileNotFoundException {
        logger.info("Starting Test");
        LoginPage login = new LoginPage(driver);
        logger.info("Opening the URL");
        LoginPage.openurl();
        String errormessage = login.invalidCredentail(PropertyReader.readkey("invalid_username"), PropertyReader.readkey("invalid_password"));
        logger.info("Verifying the Result");
        Assert.assertEquals(errormessage, "Your email, password, IP address or location did not match");
        driver.quit();



    }
}
