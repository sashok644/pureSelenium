package java.google;

import org.junit.Test;

import java.config.TestData;
import java.helepers.BaseTest;
import java.pages.GmailPage;
import java.pages.MailsPage;
import java.pages.NavigationPage;
import java.util.Random;


/**
 * Created by 64 on 06.04.2016.
 */
public class GmailTest extends BaseTest {

    GmailPage gmail = new GmailPage(driver);
    MailsPage mails = new MailsPage(driver);
    NavigationPage navigation = new NavigationPage(driver);

    @Test
    public void testSendAndSearch() {

        String subject = "subject" + (new Random()).nextInt();

        gmail.open();
        gmail.login(TestData.email, TestData.password);             // fill in required login and password for email in the ...config/Testada.java
        mails.send(TestData.email, subject);
        navigation.refresh();
        mails.assertMail(0, subject);

        navigation.openSent();
        mails.assertMail(0, subject);

        navigation.openInbox();
        mails.searchBySubject(subject);
        mails.assertMails(subject);
    }
}

