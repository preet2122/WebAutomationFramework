package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.Browser;
import utils.PropertyReader;

import java.io.FileNotFoundException;

public class DriverManager {

    public static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        DriverManager.driver = driver;
    }

    public static void init() throws FileNotFoundException {

        String Browser = PropertyReader.readkey("browser");
        if (driver == null) {

            switch (Browser) {

                case "edge":
                    EdgeOptions options = new EdgeOptions();
                    options.addArguments("--start-maximized");
                    options.addArguments("--guest");
                    driver = new EdgeDriver();
                    break;

                case "chrome":
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("--start-maximized");
                    chromeOptions.addArguments("--guest");
                    driver = new ChromeDriver();
                    break;
                default:
                    System.out.println("Not browser Found!!");

            }
        }


    }

    public static void down() {
        driver.quit();
        driver = null;
    }
}





