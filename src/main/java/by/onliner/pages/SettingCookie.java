package by.onliner.pages;

import by.onliner.singleton.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SettingCookie {

    public static By TEXT_TITLE = By.xpath("//div[text()='Мы используем cookie, чтобы сделать сайт удобнее']");

    private WebDriver driver;

    public SettingCookie() {
        this.driver = Singleton.getDriver();
    }

    public String getTextCookieTitle() {
        return driver.findElement(TEXT_TITLE).getText();
    }
}
