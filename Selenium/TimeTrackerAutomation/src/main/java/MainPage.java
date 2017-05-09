import org.openqa.selenium.WebDriver;

class MainPage {
    private WebDriver webDriver;

    MainPage(WebDriver driver) {
        webDriver = driver;
    }

    CalendarFrame getCalendarFrame() { return new CalendarFrame(webDriver); }
    TimeSheetFrame getTimeSheetFrame() { return new TimeSheetFrame(webDriver); }
    AddEntriesFrame getAddEntriesFrame() { return new AddEntriesFrame(webDriver); }
}