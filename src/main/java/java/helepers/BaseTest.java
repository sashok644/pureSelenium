package java.helepers;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by MFM on 10.05.2016.
 */
public class BaseTest extends ConsizeAPI {

    static WebDriver driver = new FirefoxDriver();

    @AfterClass
    public static void teardown() {
        driver.quit();
    }

    @Override
    public WebDriver getWebDriver(){
        return driver;
    }
}
