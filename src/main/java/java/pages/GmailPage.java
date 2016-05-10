package java.pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.helepers.BasePage;

/**
 * Created by 64 on 11.04.2016.
 */
public class GmailPage extends BasePage {

    public void open() {
        open("http://gmail.com");
    }

    public void login(String email, String password) {
        $("#Email").sendKeys(email + Keys.ENTER);
        $("#Passwd").sendKeys(password + Keys.ENTER);
    }

    public GmailPage(WebDriver driver) {
        super(driver);
    }

}
