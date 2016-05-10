package java.pages;

import helepers.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.helepers.BasePage;


/**
 * Created by 64 on 11.04.2016.
 */
public class MailsPage extends BasePage {

    public void send(String to, String subject) {
        $(By.partialLinkText("COMPOSE")).click();
        $(By.name("to")).sendKeys(to + Keys.ENTER);
        $(By.name("subjectbox")).sendKeys(subject + Keys.ENTER);
        $(By.partialLinkText("Send")).click();
    }

    public void assertMail(int index, String subject) {
        getWebDriver().By.listMails).get(index).shouldHave(text(subject));
    }

    public void assertMails(String... subjects) {
        $(listMails).shouldHave(texts(subjects));
    }


    public void searchBySubject(String subject) {
        $(By.name("q")).sendKeys("subject: " + subject + Keys.ENTER);
    }

    public MailsPage(WebDriver driver) {
        super(driver);
    }

    By listMails = by("[role = 'main'] .zA");

}


