package java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.helepers.BasePage;


/**
 * Created by 64 on 11.04.2016.
 */
public class NavigationPage extends BasePage {

    public void openSent() {
        $(By.partialLinkText("Sent Mail")).click();
    }

    public void openInbox() {
        $(By.partialLinkText("Inbox")).click();
    }

    public void refresh() {
        $(".asf").click();
    }

    public NavigationPage(WebDriver driver) {
        super(driver);
    }

}
