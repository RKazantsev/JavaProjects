package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InboxPage {

    private WebDriver webDriver;
    private WebDriverWait webDriverWait;

    public InboxPage(WebDriver driver) {

        webDriver = driver;
        webDriverWait = new WebDriverWait(webDriver, 30, 500);
        PageFactory.initElements(webDriver, this);
    }

    public void checkOpenInboxPage(){ webDriverWait.until(ExpectedConditions.titleContains("Inbox")); }

    public int getNumberOfUnreadEmails(String titleTab) {

        String str = webDriver.findElement(By.partialLinkText(titleTab)).getText();
        int numberUnreadEmails = 0;
        if (str.length() > titleTab.length()) {
            numberUnreadEmails = Integer.valueOf(str.substring(titleTab.length() + 2, str.length() - 1));
        }
        return numberUnreadEmails;
    }

    public void printNumberOfUnreadEmails(int numberUnreadEmails) {

        System.out.println("Number of unread emails: " + numberUnreadEmails);
    }
}
