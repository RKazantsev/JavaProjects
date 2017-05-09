package WebPages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private WebDriver webDriver;
    private WebDriverWait webDriverWait;

    @FindBy(id = "Email")
    WebElement loginTextField;

    @FindBy(id = "errormsg_0_Email")
    WebElement loginErrorMsg;

    @FindBy(id = "Passwd")
    WebElement passwordTextField;

    @FindBy(id = "next")
    WebElement nextBtn;

    @FindBy(id = "signIn")
    WebElement signInBtn;

    public LoginPage(WebDriver driver) {
        webDriver = driver;
        webDriverWait = new WebDriverWait(webDriver,5, 500);
        PageFactory.initElements(webDriver, this);
    }

    public void inputLogin(String login) throws InterruptedException {
        webDriverWait.until(ExpectedConditions.visibilityOf(loginTextField));
        loginTextField.clear();
        loginTextField.sendKeys(login);
    }

    public void inputPassword(String password) throws InterruptedException {
        webDriverWait.until(ExpectedConditions.visibilityOf(passwordTextField));
        passwordTextField.clear();
        passwordTextField.sendKeys(password);
    }

    public void clickNextBtn() {
        nextBtn.click();
    }

    public void checkLoginIsValid() throws InterruptedException {
        //webDriverWait.until(ExpectedConditions.visibilityOf(signInBtn));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        Assert.assertTrue("Google doesn't recognize that email!", loginErrorMsg.getText().length() == 0);
    }

    public void clickSignInBtn() {
        signInBtn.click();
    }
}
