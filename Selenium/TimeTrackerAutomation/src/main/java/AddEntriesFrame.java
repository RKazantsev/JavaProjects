import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import java.util.HashMap;

class AddEntriesFrame {
    private WebDriver webDriver;
    private Select selectCategory;
    private Select selectStartTime;
    private Select selectEndTime;

    @FindBy(id = "ctl00__content_ddlCategories")
    WebElement categorySelect;

    @FindBy(id = "ctl00__content_ucStartTime_ddlHour")
    WebElement startTimeSelect;

    @FindBy(id = "ctl00__content_ucEndTime_ddlHour")
    WebElement endTimeSelect;

    @FindBy(id = "ctl00__content_tboxDescription")
    WebElement textboxDescription;

    @FindBy(id = "ctl00__content_lbtnAddEntry")
    WebElement buttonAddEntry;

    AddEntriesFrame(WebDriver driver) {
        webDriver = driver;
        PageFactory.initElements(webDriver, this);
        selectCategory = new Select(categorySelect);
        selectStartTime = new Select(startTimeSelect);
        selectEndTime = new Select(endTimeSelect);
    }

    void addEntries(Integer firstWorkingDay, Integer lastWorkingDay,
                    String startTimeWorkingDay, String endTimeWorkingDay,
                    HashMap nonWorkingDays,
                    Integer categoryByDefault, String descriptionByDefault) {

        Integer iteratorDay = firstWorkingDay;

        for (int weekNo = 2; weekNo < 8; weekNo++) {
            for (int dayNo = 2; dayNo < 7; dayNo++) {

                if (iteratorDay > lastWorkingDay) {
                    break;
                }

                WebElement processedDate = webDriver.
                        findElement(By.xpath(".//*[@id='ctl00__content_calDatesSelector']/tbody/tr["
                                + weekNo + "]/td[" + dayNo + "]/a"));

                if (iteratorDay.intValue() == Integer.valueOf(processedDate.getText())) {
                    clickDate(processedDate);
                    waiting();
                    if (nonWorkingDays.containsKey(iteratorDay)) {
                        if ("Vacation paid".equals(nonWorkingDays.get(iteratorDay))) {
                            selectCategory(26);
                        } else if ("Vacation non-paid".equals(nonWorkingDays.get(iteratorDay))) {
                            selectCategory(31);
                        } else if ("Sick".equals(nonWorkingDays.get(iteratorDay))) {
                            selectCategory(25);
                        } else { // Holidays
                            selectCategory(27);
                        }
                        addDescription(String.valueOf(nonWorkingDays.get(iteratorDay)));
                    } else {
                        selectCategory(categoryByDefault);
                        addDescription(descriptionByDefault);
                    }
                    // Set Working Time
                    setWorkingTime(startTimeWorkingDay, endTimeWorkingDay);

                    // Click Add Entry Button
                    clickAddEntryBtn();

                    // Checking that current day is friday.
                    iteratorDay += dayNo == 6 ? 3 : 1;
                    waiting();
                }
            }
        }
    }

    private void clickDate(WebElement processedDate) {processedDate.click();}

    private void selectCategory(Integer category) {
        selectCategory.selectByValue(String.valueOf(category));
    }

    private void addDescription(String description) {
        textboxDescription.clear();
        textboxDescription.sendKeys(description);
    }

    private void setWorkingTime(String startTimeWorkingDay, String endTimeWorkingDay) {
        selectStartTime.selectByValue(startTimeWorkingDay);
        selectEndTime.selectByValue(endTimeWorkingDay);
    }

    private void clickAddEntryBtn() {buttonAddEntry.click();}

    private void waiting() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}