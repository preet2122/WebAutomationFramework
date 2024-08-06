package base;

import Driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileNotFoundException;

public class CommonToAllTest {

    @BeforeMethod
    public void initdriver() throws FileNotFoundException {
        DriverManager.init();
    }


    @AfterMethod
    public void down(){
        DriverManager.down();
    }
}
