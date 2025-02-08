package by.onliner.pages;

import by.onliner.singleton.Singleton;
import org.openqa.selenium.WebDriver;

public class Аdvertising {
    private WebDriver driver;

    public Аdvertising(WebDriver driver) {
        this.driver = Singleton.getDriver();
    }
}
