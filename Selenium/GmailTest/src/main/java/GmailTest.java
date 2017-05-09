import WebPages.GmailSite;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class GmailTest {

    private WebDriver webDriver;
    private GmailSite gmailSite;
    private String webPage;
    private String chromeWebDriverHost;
    private String login;
    private String password;
    private String titleTab;

    @Before
    public void setUp() throws FileNotFoundException {

        FileInputStream configFile;
        Properties property = new Properties();

        try {
            configFile = new FileInputStream("src/main/resources/config.properties");
            property.load(configFile);
            chromeWebDriverHost = property.getProperty("chromeWebDriverHost");
            webPage = property.getProperty("webPage");
            login = property.getProperty("login");
            password = property.getProperty("password");
            titleTab = property.getProperty("titleTab");

        } catch (IOException e) {
            System.err.println("Error: File config.properties not found.");
        }

        System.setProperty("webdriver.chrome.driver", chromeWebDriverHost);
        webDriver = new ChromeDriver();
        gmailSite = new GmailSite(webDriver);
        webDriver.manage().window().maximize();
        webDriver.get(webPage);
    }

    @Test
    public void testGetUnreadEmails() throws InterruptedException {

        System.out.println("Step 1: Enter login");
        gmailSite.loginPage().inputLogin(login);

        System.out.println("Step 2: Click Next button");
        gmailSite.loginPage().clickNextBtn();

        System.out.println("Step 3: Check Login validity");
        gmailSite.loginPage().checkLoginIsValid();

        System.out.println("Step 4: Enter password");
        gmailSite.loginPage().inputPassword(password);

        System.out.println("Step 5: Click SignIn button");
        gmailSite.loginPage().clickSignInBtn();

        System.out.println("Step 6: Check Inbox opening");
        gmailSite.inboxPage().checkOpenInboxPage();

        System.out.println("Step 7: Get a number of unread emails");
        gmailSite.inboxPage().printNumberOfUnreadEmails(gmailSite.inboxPage().getNumberOfUnreadEmails(titleTab));
    }

    @After
    public void tearDown() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}
