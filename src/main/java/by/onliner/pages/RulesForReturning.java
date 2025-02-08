package by.onliner.pages;

import by.onliner.singleton.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RulesForReturning {
    private WebDriver driver;

    private final By HEADER_RULES=By.xpath("//div[@class='news-header__title']//h1");

    public RulesForReturning(WebDriver driver) {
        this.driver = Singleton.getDriver();
    }
}
