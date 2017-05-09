import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BooksSite;
import pages.MainPage;

public class ITBooksTests {
    WebDriver webDriver;
    WebDriverWait waitWebDriver;
    BooksSite webSite;

    @Before
    public void setUp() {
        webDriver = new ChromeDriver();
        waitWebDriver = new WebDriverWait(webDriver, 30, 500);

        webSite = new BooksSite(webDriver);

        webDriver.get("http://it-ebooks.info/");


        System.out.println("Step 1: Switch to Search by Title");
        webSite.mainPage().switchSearchToTitle();

        System.out.println("Step 2: Fill out Search field with Text");
        webSite.mainPage().inputSearchText("Automation");

        System.out.println("Step 3: Click Search button");
        webSite.mainPage().clickSearchButton();

        System.out.println("Step 4: Wait For Search Results");
        webSite.searchResultsPage().waitForSearchResults();

    }

    @Test
    public void testSearchBooksURL() {
        System.out.println("Check URL");
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search/?q=Automation&type=title"));
    }

    @Test
    public void testBooksSearch() {
        System.out.println("Check search results");
        Assert.assertTrue(
                webDriver.findElement(By.className("top"))
                        .findElement(By.tagName("table"))
                        .findElements(By.tagName("tr")).size() == 10);
    }

    @Test
    public void testOpenBookInfoFromSearch() {
        System.out.println("Step 5: Open Book Info");
        webSite.searchResultsPage().openBookFromResultsBy("Home Automation with Intel Galileo");
        System.out.println("Step 6: Wait for Page Load ");
        waitWebDriver.until(ExpectedConditions.presenceOfElementLocated(By.className("h1[itemprop='name']")));

    }

    @After
    public void tearDown() {
        if (webDriver != null)
        webDriver.quit();
    }
}
