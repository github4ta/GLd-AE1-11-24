package by.onliner.pages;

import by.onliner.singleton.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final By INPUT_SEARCH_LOCATOR = By.xpath("//input[@name='query']");
    private final By BUTTON_LOGIN_LOCATOR = By.xpath("//div[@class='auth-bar__item auth-bar__item--text']");
    private final By TEXT_COPYRIGHT_LOCATOR = By.xpath("//div[@class='footer-style__copy']");

    private final String URL = "https://www.onliner.by/";

    private WebDriver driver;

    public HomePage() {
        this.driver = Singleton.getDriver();
    }

    public String getTextCopyright() {
        return driver.findElement(TEXT_COPYRIGHT_LOCATOR).getText();
    }

    public void clickButtonLogin() {
        driver.findElement(BUTTON_LOGIN_LOCATOR).click();
    }

    public void fillInputSearch(String q) {
        driver.findElement(INPUT_SEARCH_LOCATOR).sendKeys(q);
    }

    public void open() {
        driver.get(URL);
    }
}
