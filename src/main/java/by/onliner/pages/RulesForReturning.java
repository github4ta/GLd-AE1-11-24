package by.onliner.pages;

import by.onliner.singleton.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RulesForReturning {
    private WebDriver driver;

    private final By HEADER_RULES = By.xpath("//div[@class='news-header__title']//h1");
    private final String URL = "https://blog.onliner.by/pravila-vozvrata-tovarov-i-deneg";

    public RulesForReturning(WebDriver driver) {
        this.driver = Singleton.getDriver();
    }

    public String getHeaderText() {
        return driver.findElement(HEADER_RULES).getText();
    }

    public RulesForReturning open() {
        driver.get(URL);
        return this;
    }
}
