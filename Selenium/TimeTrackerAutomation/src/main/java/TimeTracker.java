import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TimeTracker {

    private WebDriver webDriver;
    private MainPage mainPage;
    private String webPage;
    private String chromeWebDriverHost;
    private Integer firstWorkingDay;
    private Integer lastWorkingDay;
    private String startTimeWorkingDay;
    private String endTimeWorkingDay;
    private Integer categoryByDefault;
    private String descriptionByDefault;
    private HashMap<Integer, String> nonWorkingDays;

    @BeforeTest
    public void setUp() {

        FileInputStream configFile;
        Properties property = new Properties();
        nonWorkingDays = new HashMap<Integer, String>();

        try {
            configFile = new FileInputStream("src/main/resources/config.properties");
            property.load(configFile);
            chromeWebDriverHost = property.getProperty("chromeWebDriverHost");
            webPage = property.getProperty("webPage");
            firstWorkingDay = Integer.valueOf(property.getProperty("firstWorkingDay"));
            lastWorkingDay = Integer.valueOf(property.getProperty("lastWorkingDay"));
            startTimeWorkingDay = property.getProperty("startTimeWorkingDay");
            endTimeWorkingDay = property.getProperty("endTimeWorkingDay");
            categoryByDefault = Integer.valueOf(property.getProperty("categoryByDefault"));
            descriptionByDefault = property.getProperty("descriptionByDefault");
            for (int i = 1; i <= 31; i++) {
                if (property.containsKey(String.valueOf(i))) {
                    nonWorkingDays.put(i, property.getProperty(String.valueOf(i)));
                }
            }
        } catch (IOException e) {
            System.err.println("Error: File config.properties not found.");
        }

        System.setProperty("webdriver.chrome.driver", chromeWebDriverHost);
        webDriver = new ChromeDriver();
        mainPage = new MainPage(webDriver);
        webDriver.get(webPage);
    }

    @Test
    public void FillOutTimeTracker(){

        System.out.println("Step 1 : Select Current Month.");
        mainPage.getCalendarFrame().selectCurrentMonth();

        System.out.println("Step 2 : Select Current Year.");
        mainPage.getCalendarFrame().selectCurrentYear();

        System.out.println("Step 3 : Clear TimeSheetFrame.");
        mainPage.getCalendarFrame().clickWholeMonthBtn();
        mainPage.getTimeSheetFrame().deleteEntries();

        System.out.println("Step 4 : Filling Out Entries.");
        mainPage.getAddEntriesFrame()
                .addEntries(firstWorkingDay, lastWorkingDay, startTimeWorkingDay, endTimeWorkingDay, nonWorkingDays,
                        categoryByDefault, descriptionByDefault);
    }

    @AfterTest
    public void tearDown() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}