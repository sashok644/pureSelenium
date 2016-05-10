package java.helepers;

import com.google.common.base.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;


/**
 * Created by MFM on 10.05.2016.
 */
public abstract class ConsizeAPI {


    public abstract WebDriver getWebDriver();

    public By byCss (String cssSelector){
        return By.cssSelector(cssSelector);
    }
    public By by (String cssSelector){
        return byCss(cssSelector);
    }

    public WebElement $(By locator) {
        return assertThat(visibilityOfElementLocated(locator));
    }

    public WebElement $(String cssSelector) {
        return $(By.cssSelector(cssSelector));
    }

    public List<WebElement> $$(By by) {
        return getWebDriver().findElements(by);
    }

    public List<WebElement> $$(String byCssSelector) {
        return $$(By.cssSelector(byCssSelector));
    }

    public  <V> V assertThat(Function<? super WebDriver, V> condition) {
      return (new WebDriverWait(getWebDriver(), 4)).until(condition);
    }

//    public waitUntil(<V> V waitUntil(Function<? super WebDriver, V> condition) {, int timeout) {
//        return (new WebDriverWait(getWebDriver(), timeout)).until(condition);
//
//    }
}
