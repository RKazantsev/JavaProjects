import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

class TimeSheetFrame {
    private WebDriver webDriver;

    TimeSheetFrame(WebDriver driver) {
        webDriver = driver;
        PageFactory.initElements(webDriver, this);
    }

    void deleteEntries() {
        waiting();
        List<WebElement> listDeleteBtn = webDriver
                .findElements(By.id("ctl00__content_dgTimeEntry_ctl02_lbtnDeleteEntry"));
        while (!listDeleteBtn.isEmpty()) {
            listDeleteBtn.get(0).click();
            waiting();
            Alert confirmationAlert = webDriver.switchTo().alert();
            confirmationAlert.accept();
            waiting();
            listDeleteBtn = webDriver.findElements(By.id("ctl00__content_dgTimeEntry_ctl02_lbtnDeleteEntry"));
        }
    }

    private void waiting() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}