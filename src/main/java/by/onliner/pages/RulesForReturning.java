package by.onliner.pages;

import by.onliner.singleton.Singleton;
import org.openqa.selenium.WebDriver;

public class RulesForReturning {
    private WebDriver driver;

    public RulesForReturning(WebDriver driver) {
        this.driver = Singleton.getDriver();
    }
}
