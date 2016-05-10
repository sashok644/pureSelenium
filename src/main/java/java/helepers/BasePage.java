package java.helepers;

import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.support.PageFactory.initElements;

/**
 * Created by MFM on 10.05.2016.
 */
public class BasePage extends ConsizeAPI{

    @Override
    public WebDriver getWebDriver(){
        return null;
    }

    public BasePage(WebDriver driver) {
        this.driver = driver;
        initElements(driver, this);
    }

    public void open (String url){
        driver.get(url);
    }

    private WebDriver driver;

}
