package by.onliner.pages;

import by.onliner.singleton.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    private final By INPUT_NICK_LOCATOR = By.xpath("//input[@placeholder='Ник или e-mail']");
    private final By INPUT_PASSWORD_LOCATOR = By.xpath("//input[@type='password']");
    private final By BUTTON_ENTER_LOCATOR = By.xpath("//button[@type='submit']");
    private final By TITLE_LOCATOR = By.xpath("//div[@class='auth-form__title auth-form__title_big auth-form__title_condensed-default']");

    private WebDriver driver;

    public LoginPage() {
        this.driver = Singleton.getDriver();
    }

    public String getTitleText() {
        return driver.findElement(TITLE_LOCATOR).getText();
    }

    public void fillInputNick(String nick) {
        driver.findElement(INPUT_NICK_LOCATOR).sendKeys(nick);
    }

    public void fillInputPassword(String password) {
        driver.findElement(INPUT_PASSWORD_LOCATOR).sendKeys(password);
    }

    public void clickButtonEnter() {
        driver.findElement(BUTTON_ENTER_LOCATOR).click();
    }
}
