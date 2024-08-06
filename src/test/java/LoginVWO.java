import Base.CommonToAllPage;
import PageObjectModel.LoginPage;
import base.CommonToAllTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginVWO {


    @Test

    public void invalidlogin() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        LoginPage login = new LoginPage(driver);
        String errormessage = login.invalidCredentail("admin", "admin");
        Assert.assertEquals(errormessage, "Your email, password, IP address or location did not match");
        driver.quit();



    }

@Test
    public void invalidlogin2() throws InterruptedException {
    WebDriver driver = new EdgeDriver();
        LoginPage login = new LoginPage(driver);
        String errormessage = login.invalidCredentail("preeti", "arora");
        Assert.assertEquals(errormessage, "Your email, password, IP address or location did not match");
        driver.quit();
    }
}
