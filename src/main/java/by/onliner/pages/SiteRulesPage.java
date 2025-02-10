package by.onliner.pages;

import by.onliner.singleton.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SiteRulesPage {
    private final By NEWS_TITLE = By.className("news-header__title");
    private WebDriver driver;

    public SiteRulesPage() {
        driver = Singleton.getDriver();
    }

    public String getNewsTitleText() {
        return driver.findElement(NEWS_TITLE).getText();
    }
}
