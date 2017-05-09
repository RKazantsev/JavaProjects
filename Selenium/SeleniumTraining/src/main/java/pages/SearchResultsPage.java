package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SearchResultsPage {
    WebDriver webDriver;
    WebDriverWait waitWebDriver;

    public SearchResultsPage(WebDriver driver) {
        webDriver = driver;
        waitWebDriver = new WebDriverWait(webDriver, 30, 500);
    }

    public void waitForSearchResults() {
        waitWebDriver.until(ExpectedConditions.presenceOfElementLocated(By.className("top")));
    }

    public void openBookFromResultsBy(String bookTitle) {

        List<WebElement> books = webDriver.findElement(By.className("top"))
                .findElements(By.tagName("tr"));

        for (WebElement book: books
             ) {
            WebElement bookLink = book.findElement(By.tagName("a"));
            if (bookLink.getAttribute("title").contains(bookTitle)) {
                bookLink.click();
                break;
            }
        }

    }


}
