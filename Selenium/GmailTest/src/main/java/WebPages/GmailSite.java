package WebPages;

import org.openqa.selenium.WebDriver;

public class GmailSite {

    private WebDriver webDriver;

    public GmailSite(WebDriver driver) {
        webDriver = driver;
    }

    public LoginPage loginPage() { return new LoginPage(webDriver);}

    public InboxPage inboxPage() { return new InboxPage(webDriver);}
}
