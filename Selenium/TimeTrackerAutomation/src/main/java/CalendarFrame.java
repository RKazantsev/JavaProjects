import org.joda.time.DateTime;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

class CalendarFrame {
    private WebDriver webDriver;
    private WebDriverWait webDriverWait;
    private Select currentMonth;
    private Select currentYear;

    @FindBy(id = "ctl00__content_lblCalendar")
    WebElement calendarLbl;

    @FindBy(id = "ctl00__content_ddlMonths")
    WebElement monthSelect;

    @FindBy(id = "ctl00__content_ddlYears")
    WebElement yearSelect;

    @FindBy(css = ".ms-vb2>a")
    WebElement wholeMonthBtn;

    CalendarFrame(WebDriver driver) {
        webDriver = driver;
        webDriverWait = new WebDriverWait(webDriver,5);
        PageFactory.initElements(webDriver, this);
        currentMonth = new Select(monthSelect);
        currentYear = new Select(yearSelect);
    }

    void selectCurrentMonth() {
        webDriverWait.until(ExpectedConditions.visibilityOf(calendarLbl));
        currentMonth.selectByValue(String.valueOf(new DateTime().getMonthOfYear()));
    }

    void selectCurrentYear() {
            webDriverWait.until(ExpectedConditions.visibilityOf(calendarLbl));
            currentYear.selectByValue(String.valueOf(new DateTime().getYear()));
    }

    void clickWholeMonthBtn() { wholeMonthBtn.click();}
}